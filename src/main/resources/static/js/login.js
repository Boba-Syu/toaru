/**
 * Created by MI on 2019/2/22.
 */
function register() { // 注册按钮功能设置
    window.location.href = "register"; // 跳转到注册界面
}
function back() { // 返回按钮功能设置
    window.location.href = "/toaru"; // 跳转到主界面
}
function yes2() { // 确定按钮功能设置
    if ($(id2).val() == "" || $(pwd2).val() == "") {
        window.alert("输入框内不能为空!");
    }
    else { //密码不为空
        $("#fm").serialize();
        var user = new Object(); // 打包数据
        user.name = $.trim($(id2).val());
        user.pwd = $.trim($(pwd2).val());
        //console.warn(user.name + " 1");
        $.ajax({ //传送数据到"toaru/userLogin"界面, 用于对数据库操作
            type: 'GET',
            url: "/toaru/userLogin",
            contentType: 'application/json',
            timeout: 1000,
            data: {ObjectUser: JSON.stringify(user)},
            dataType: 'text',
            success: function (result) { // 若操作成功则跳转到 "/toaru/magic"界面
                console.warn(user.name + " 2");
                if (result == "success") {
                    /*$.ajax({
                        type: 'get',
                        url: "magic",
                        async: true,
                        dataType: 'json',
                        error: "重新请求",
                        data: {'userName': user.name},
                        Success: function () {
                        },
                        Error: function () {
                        }
                    });
                    console.warn(user.name + " 3");*/
                    window.location.href = "magic";
                }
                else {
                    window.alert("登陆失败");
                }
            },
            error: function () {
                window.alert("登陆失败!");
            }
        })
    }
}

$(document).ready(function () { // 页面加载完成时
    $("input").keyup(function (event) { //当聚焦在输入框中时, 回车键功能设置
        if (event.keyCode == 108 || event.keyCode == 13) {
            yes2();
        }
    });
});
