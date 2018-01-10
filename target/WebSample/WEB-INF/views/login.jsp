<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <%@include file="../../common/common_login.jsp" %>
    <title>登录</title>
    <script type="text/javascript">
        $(document).ready(function () {
            $('#backgroundSlider').backgroundSlider({
                direction: 'slide', //场景动画类型：【in】:拉近;【out】:拉远;【slide】:幻灯片
                speed: 5000
            });
            //错误提示信息
            if ("${error}" != "") {

            }
        });
    </script>
</head>
<body class="login-layout">
<!-- background -->
<div id="backgroundSlider">
    <img src="${ctx}/resources/images/background/1.jpg" name="1"/>
    <img src="${ctx}/resources/images/background/2.jpg" name="2"/>
    <img src="${ctx}/resources/images/background/3.jpg" name="3"/>
    <img src="${ctx}/resources/images/background/4.jpg" name="4"/>
</div>
</body>
</html>

