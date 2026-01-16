package com.chefpilot.plugin;

import android.os.Build;

import androidx.core.content.ContextCompat;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "SystemThemeColor")
public class SystemThemeColorPlugin extends Plugin {

     @PluginMethod
       public void getMaterialColors(PluginCall call) {
           if (Build.VERSION.SDK_INT < Build.VERSION_CODES.S) {
               call.reject("Material You is only available on Android 12+");
               return;
           }

           int primary = ContextCompat.getColor(
                   getContext(),
                   android.R.color.system_accent1_500
           );

           int secondary = ContextCompat.getColor(
                   getContext(),
                   android.R.color.system_accent2_500
           );

           int tertiary = ContextCompat.getColor(
                   getContext(),
                   android.R.color.system_accent3_500
           );

           JSObject result = new JSObject();
           result.put("primary", toHex(primary));
           result.put("secondary", toHex(secondary));
           result.put("tertiary", toHex(tertiary));

           call.resolve(result);
       }

       private String toHex(int color) {
           return String.format("#%06X", (0xFFFFFF & color));
       }

}
