/**
 * Created by MI on 2019/2/22.
 */
function hello() {
    window.location.href="hello";
}
function login() {
    window.location.href="login";
}
function register() {
    window.location.href="register";
}
$(document).ready(function () {
    $.ajax({
        success: function () {
            setTimeout(yes,2100);
        }
    })
});
function yes() {
    var str = '';
    str += '<h1 class="page-header"><small>加载完成<br>'
        + '<div class="progress">'
        + '<div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="45" aria-valuemin="100" aria-valuemax="100" style="width:100%">'
        + '<span class="sr-only"></span>'
        + '</div>'
        + '</div>'
        + '</small></h1>'
        + '<button onclick="login()" type="button" class="btn btn-primary btn-sm">确定</button>';
    $(tableBody).html(str);
}