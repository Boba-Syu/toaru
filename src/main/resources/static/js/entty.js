/**
 * Created by MI on 2019/3/2.
 * 对应entty.html的js文件
 */
//发送信息到后端, 实时连接
var socket;
if (!window.WebSocket) {
    window.WebSocket = window.MozWebSocket;
}
if (window.WebSocket) {
    socket = new WebSocket("ws://localhost:8888/websocket");
    socket.onmessage = function (event) {
        var ta = document.getElementById('responseText');
        ta.value = ta.value + event.data + '\n';
    };
    socket.onopen = function (event) {
        var ta = document.getElementById('responseText');
        ta.value = "[" + getdate() + "] [系统]  " + "连接开启!\n";
    };
    socket.onclose = function (event) {
        var ta = document.getElementById('responseText');
        ta.value = ta.value + "[" + getdate() + "] [系统]  " + "连接被关闭\n";
    };
} else {
    alert("你的浏览器不支持 WebSocket！\n");
}

function send(message) { // 发送按钮功能设置

    if (!window.WebSocket) {
        return;
    }
    if (socket.readyState == WebSocket.OPEN) {
        socket.send(message);
    } else {
        alert("连接没有开启.\n");
    }
}

function getdate() {
    var now = new Date(),
        y = now.getFullYear(),
        m = now.getMonth() + 1,
        d = now.getDate();
    return y + "-" + (m < 10 ? "0" + m : m) + "-" + (d < 10 ? "0" + d : d) + " " + now.toTimeString().substr(0, 8);
}

function refresh2() { // 刷新按钮功能设置
    javascript:document.getElementById('responseText').value = '';
}
    