<%@ page pageEncoding="UTF-8"%>
<br/><h1>Nuestros Cines</h1><br/>

<% String[][] mcines = ( String [][] ) session.getAttribute("mCines");
	for (String[] acine : mcines ) { %>
	
<div class="contenido-cine">
     <img src="img/cine/<%= acine[0] %>.1.jpg" width="227" height="170">
     <div class="datos-cine">
   	  		<h4><%= acine[1] %></h4><br/>
   			<span><%= acine[4] %>- <%= acine[7] %><br/><br/>Teléfono: <%= acine[5] %></span>	
   		</div>
    	<br/>
    	<a href="SvlCine?idCine=<%= acine[0] %>">
       		<img src="img/varios/ico-info2.png" width="150" height="40">
     	</a>
</div>
<% } %>