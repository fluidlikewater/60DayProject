<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
         <head>
         <meta charset="utf-8">
         <meta http-equiv="X-UA-Compatible" content="IE=edge">
         <meta name="viewport" content="width=device-width, initial-scale=1">
         <title>Box Sorter 9000+ (The plus means better)</title>

         <!-- Bootstrap -->

         <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">

         </head>
         <body>
           <!-- jQuery (necessary for Bootstraps JavaScript plugins) -->
           <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
           <!-- Include all compiled plugins (below), or include individual files as needed -->
           <script src="<c:url value="/resources/bootstrap/js/bootstrap.js" />"></script>
           <div id="id01">
           <table class="table table-striped">
           <tbody id = "oldTable">
           <td>
           <tr>hi</tr>
           <tr>there</tr>
           </td>
           </tbody>
           </table>
           </div>
           <script>
           var item = ${json};
           var oldTable = document.getElementById("oldTable"),
               newTable = oldTable.cloneNode(true);
           for(var j = 0; j <= item.length; j++){
               obj = item[j];
               var tr = document.createElement('tr');
               for(var key in obj) {
                   if (obj.hasOwnProperty(key)) {
                        var td = document.createElement('td');
                        td.appendChild(document.createTextNode(obj[key]));
                        tr.appendChild(td);
                   }
               }
               newTable.appendChild(tr);
           }
           oldTable.parentNode.replaceChild(newTable, oldTable);
           </script>
    </body>
</html>