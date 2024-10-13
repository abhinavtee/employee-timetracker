<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head> 
  <script src="JS/script.js"></script> 
  <link href='CSS/style.css' rel='stylesheet'>
  <link href='CSS/bootstrap.min.css' rel='stylesheet'>
 </head>
 <body bgcolor='cyan'>
   <c:set var="url" value="/employee-timetracker/admin/"></c:set>
   <hr style='border:2px solid green'>
    <nav class='navbar navbar-expand navbar-light bg-light'>
     <ul class='nav nav-pills mx-auto'>
      <li><a id="home" class='nav-link lau' href='${url}'>Home</a>
      <li><a id="add" class='nav-link lau' href='${url}manage/employee/list'>Manage employee</a>
      <li><a id="out" class='nav-link lau' href='${url}manage/user/list'>Manage user</a>
      <li><a id="out" class='nav-link lau' href=''>Edit time out</a>
      <li><a id="out" class='nav-link lau' href=''>Edit time in</a>
      <li><a id="out" class='nav-link lau' href='${url}logout'>Logout</a>
     </ul>
    </nav>
   <hr style='border:2px solid green'>
 </body>
</html>