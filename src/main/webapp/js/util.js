/**
 * Created by shuaidi on 16-10-7.
 */
function getXhr() {
    var xmlHttp;
    try {
        // Firefox, Opera 8.0+, Safari
        xmlHttp = new XMLHttpRequest();
    } catch (e) {
        try {
            xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
        } catch (e) {
            alert("您的浏览器不支持AJAX!");
            return null;
        }
    }
    return xmlHttp;
}
