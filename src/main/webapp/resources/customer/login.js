$(document).ready(function() {
    //刷新验证码
    $('#kaptchaImage').click(function() {//生成验证码
        $(this).hide().attr('src', sys.rootPath + '/resources/images/image.jsp?' + new Date().getTime()).fadeIn();
    });
});