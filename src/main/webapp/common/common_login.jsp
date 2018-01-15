<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%-- jquery --%>
<script type="text/javascript" src="${ctx}/resources/jquery/jquery-3.2.1.min.js"></script>
<%-- bootstrap --%>
<link rel="stylesheet" href="${ctx}/resources/bootstrap/css/bootstrap.css"/>
<link rel="stylesheet" href="${ctx}/resources/bootstrap/css/bootstrap-theme.css"/>
<script type="text/javascript" src="${ctx}/resources/bootstrap/js/bootstrap.min.js"></script>


<%-- backgroundSlider --%>
<link rel="stylesheet" href="${ctx }/resources/backgroundSlider/backgroundSlider.css"/>
<script type="text/javascript" src="${ctx }/resources/backgroundSlider/backgroundSlider.min.js"></script>
<%-- 小图标 --%>
<link rel="stylesheet" href="${ctx}/resources/fonts/font-awesome.min.css" media="all"/>

<%-- 样式 --%>
<link rel="stylesheet" href="${ctx}/resources/ace/ace.min.css" class="ace-main-stylesheet" id="main-ace-style"/>

<script type="text/javascript" src="${ctx}/resources/customer/login.js"></script>

<script type="text/javascript" type="text/javascript">
    var sys = sys || {};
    sys.rootPath = "${ctx}";
    sys.pageNum = 10;
    sys.gridStyle = "Bootstrap";
</script>