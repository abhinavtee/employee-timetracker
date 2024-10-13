<html>
 <head> 
  <link href='/employee-timetracker/CSS/style.css' rel='stylesheet'>
 </head>
 <body>
  <div class='dvv'>
   <label class='lahu'>ADMIN LOGIN FORM</label>
  </div> 
  <form action="/employee-timetracker/admin/authenticate-user" method="post">
   <table class="ta" cellpadding="15px">
    <tr>
     <td>Enter your id:</td>
     <td><input type="text" name="adminid" value="${id}" class="tb" style="height:2.5vw" required></td>
    </tr>
    <tr>
     <td>Enter your password:</td>
     <td><input type="password" name="password" class="tb" style="height:2.5vw" required></td>
    </tr>
    <tr>
     <td colspan="2" align="right">
      <button class="btr" style="background-color:black">Submit</button>
     </td>
    </tr>
   </table>
  </form>
  <div class='dvv'>
   	<label class='la' style="color:red">${msg}</label>
  </div>
 </body>
</html>
