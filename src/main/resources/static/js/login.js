/**
 * Created by MI on 2019/2/22.
 */
function register() {
    window.location.href="register";
}
function back() {
    window.location.href="/toaru";
}
function yes2() {
    if($(id2).val() == "" || $(pwd2).val() == "") {
        window.alert("输入框内不能为空!");
    }
    else {
        $("#fm").serialize();
        var user = new Object();
        user.name = $.trim($(id2).val());
        user.pwd = $.trim($(pwd2).val());
        $.ajax({
            type: 'GET',
            url: "/toaru/userLogin",
            contentType : 'application/json',
            timeout: 1000,
            data: {ObjectUser:JSON.stringify(user)},
            dataType: 'text',
            success: function(result) {
                if(result == "success"){
                    window.location.href="magic";
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
$(document).ready(function(){
    $("input").keyup(function (event) {
        if(event.keyCode == 108 || event.keyCode == 13) {
            yes2();
        }
    });
});