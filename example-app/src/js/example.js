import { SystemThemeColor } from 'system-theme-color';

window.testEcho = () => {
    const inputValue = document.getElementById("echoInput").value;
    SystemThemeColor.echo({ value: inputValue })
}
