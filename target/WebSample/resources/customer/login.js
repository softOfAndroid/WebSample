$(document).ready(function () {
    //刷新验证码
    $('#kaptchaImage').click(function () {//生成验证码
        $(this).hide().attr('src', sys.rootPath + '/resources/images/image.jsp?' + new Date().getTime()).fadeIn();
    });
});

function login() {
    if ($("#account").val() == "") {
        layer.alert('请输入账号！', {icon: 5, shift: 6, time: 0});
        $("#account").focus();
        return false;
    }
    if ($("#password").val() == "") {
        layer.alert('请输入密码', {icon: 5, shift: 6, time: 0});
        $("#password").focus();
        return false;
    }
    $("#loginform").submit();
}