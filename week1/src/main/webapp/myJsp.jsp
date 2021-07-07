<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="/WEB-INF/myTags.tld" prefix="week1-tags" %>
<head>


<%--    <%@ page language="java" contentType="text/html; charset=UTF-8"--%>
<%--             pageEncoding="UTF-8"%>--%>



    <title>My Home Page</title>
</head>
<body>
<div class="container-lg">
    <!-- Content here -->
    Hello,World 2021
</div>

<div>
    myTag print date：<week1-tags:print_date ></week1-tags:print_date>
</div>

<%
    List<String> drinks = new ArrayList<>();
    drinks.add("一点点");
    drinks.add("茶颜悦色");
    drinks.add("喜茶");
%>
<div>
    <label>得闲饮茶：</label><week1-tags:selectTag name="drink" size="1" options="<%= drinks%>"></week1-tags:selectTag>
</div>
</body>
