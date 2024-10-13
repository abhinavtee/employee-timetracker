<html>
 <%@ include file="add-css.jsp" %>
 <body>
 <div class='dvv'>
   <label class='lah' style="text-decoration:underline;">Edit User Form</label>
  </div>
  <div class='container'>
   <div class='card col-md-10 mx-auto'>
    <div class='card-body'>
    <form action="update-record" method="post">
     <div class='row'>
      <div class='form-group col-md-5'>
      	<label for='userid' class='la'>User id</label><span> *</span>
      	<input class='form-control' type='text' value="${user.userid}" id='userid' name='userid' readonly="readonly">
      </div>
      <div class='form-group col-md-5'>
      	<label for='password' class='la'>Edit password</label><span> *</span>
      	<input class='form-control' type='password' value="${user.password}"  id='password' name='password' required>
      </div>
     </div>
     <div class='row'>
      <div class='form-group col-md-5'>
      	<label for='name' class='la'>Edit user name</label><span> *</span>
      	<input class='form-control' type='text' value="${user.name}"  id='name' name='name' required>
      </div>
      <div class='form-group col-md-5'>
      	<label for='phone' class='la'>Edit phone number</label><span> *</span>
      	<input class='form-control' type='text' value="${user.phone}"  id='phone' name='phone' required>
      </div>
     </div>
     <div class='row'>
      <div class='form-group col-md-10'>
       <button class='btn btn-primary'>Update Record</button>
       <input type="button"  class='btn btn-secondary'  onclick='history.back()' value="Cancel">
      </div>
     </div> 
     </form>
    </div>
   </div>
  </div>
 </body>
</html>