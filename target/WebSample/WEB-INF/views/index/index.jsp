<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript">
    function my() {
        console.log("-------------");
        //创建XMLHttpRequest 请求的对象
        var request = new XMLHttpRequest();
        // 请求的方式
        var method = "GET";
        // 请求的连接地址
        var url = "http://localhost:8080/websample/index/send.action";
        // 初始化请求参数
        request.open(method, url,true);
        // 发送请求
        request.send(null);
        request.onreadystatechange = function(){
            // 如果响应请求
            if(request.readyState==4){
                // 如果请求成功
                if(request.status==200 || request.status==304){

                }
            }
        };
    }

</script>
<body>
<button id="btn" type="button" onclick="my()" class="btn btn-info btn-sm">
    <i class="fa fa-undo"></i>发送消息给客户端
</button>
</body>
</html>
