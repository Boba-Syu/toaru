/**
 * Created by MI on 2019/2/22.
 */
function insert() {
    $("#intable1").fadeToggle(200);
    $("#intable2").fadeToggle(200);
    $("#inbutton").fadeToggle(200);
    search();
}
function insertYes() {
    $("#fm").serialize();
    var ObjectUser = new Object();
    ObjectUser.cname = $.trim($(cname).val());
    ObjectUser.csex = $.trim($(csex).val());
    ObjectUser.clevel = $.trim($(clevel).val());
    ObjectUser.cpower = $.trim($(cpower).val());
    ObjectUser.cschool = $.trim($(cschool).val());
    ObjectUser.cgrade = $.trim($(cgrade).val());
    if ($.trim($(cname).val()) == '' || $.trim($(csex).val()) == '' || $.trim($(clevel).val()) == ''
        || $.trim($(cpower).val()) == '' || $.trim($(cschool).val()) == '' || $.trim($(cgrade).val()) == '') {
        window.alert("输入框内不能为空!");
    } else {
        $.ajax({
            type: 'GET',
            url: "/toaru/insert",
            contentType: 'application/json',
            timeout: 1000,
            data: {ObjectUser: JSON.stringify(ObjectUser)},
            dataType: 'text',
            success: function (result) {
                if (result == "success") {
                    window.alert("添加成功");
                    search();
                    $(intable1).html('');
                    $(intable2).html('');
                    $(inbutton).html('');
                } else {
                    window.alert("添加失败!");
                }
            },
            error: function () {
                window.alert("添加错误!");
            }
        })
    }
}
function back() {
    window.location.href = "/toaru";
}
function yes() {
    $.ajax({
        type: 'get',
        url: "/toaru/show2",
        timeout: 1000,
        data: {},
        dataType: 'json',
        success: function (data) {
            var str = '';
            for (var i = 0; i < data.length; i++) {
                str += '<tr>'
                    + '<td>' + data[i].cname + '</td>'
                    + '<td>' + data[i].csex + '</td>'
                    + '<td>' + data[i].cschool + '</td>'
                    + '<td>' + data[i].cpower + '</td>'
                    + '<td>' + data[i].clevel + '</td>'
                    + '<td>' + data[i].cgrade + '</td>'
                    + '</tr>';
            }
            $(tableBody).html(str);
            $("#id2").val("");
        },
        error: function () {
            window.alert("刷新错误!");
        }
    })
}
function search() {
    var user = new Object();
    user.cname = $.trim($(id2).val());
    $.ajax({
        type: 'get',
        url: "/toaru/search",
        timeout: 1000,
        data: {ObjectUser: JSON.stringify(user)},
        dataType: 'json',
        success: function (data) {
            var str = '';
            for (var i = 0; i < data.length; i++) {
                str += '<tr>'
                    + '<td>' + data[i].cname + '</td>'
                    + '<td>' + data[i].csex + '</td>'
                    + '<td>' + data[i].cschool + '</td>'
                    + '<td>' + data[i].cpower + '</td>'
                    + '<td>' + data[i].clevel + '</td>'
                    + '<td>' + data[i].cgrade + '</td>'
                    + '</tr>';
            }
            $(tableBody).html(str);
        },
        error: function () {
            window.alert("查找错误!");
        }
    })
}
$(document).ready(function () {
    $(id2).keyup(function () {
        search();
    });
    $("#intable1").fadeOut(1);
    $("#intable2").fadeOut(1);
    $("#inbutton").fadeOut(1);
    search();
});
function del() {
    var user = new Object();
    user.cname = $.trim($(id2).val());
    $.ajax({
        type: 'get',
        url: "/toaru/delete",
        timeout: 1000,
        data: {ObjectUser: JSON.stringify(user)},
        dataType: 'text',
        success: function (result) {
            if (result != "success") {
                window.alert("删除失败");
                yes();
            } else {
                window.alert("删除成功");
                yes();
            }
        },
        error: function () {
            window.alert("删除错误!");
        }
    })
}
