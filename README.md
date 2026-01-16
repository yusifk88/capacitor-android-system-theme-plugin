# system-theme-color

A lightweight capacitor plugin to detect the dynamic color theme of android [**Material You**](https://m3.material.io/blog/announcing-material-you)

## Install

```bash
npm i system-theme-color
npx cap sync
```

```typescript
import {SystemThemeColor} from 'system-theme-color';

const colors = SystemThemeColor.getMaterialColors()

```
**Returns:** <code>Promise&lt;{ primary: string, secondary:string, tertiary:string }&gt;</code>

### Platform support

| Param   | version|
|---------|--------|
| Android | ✅ 12+ |
iOS       |❌      
Web       |❌

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------

</docgen-api>
