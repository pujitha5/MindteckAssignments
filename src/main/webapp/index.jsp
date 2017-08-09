<html>
<head>
<script language="JavaScript" type="text/javascript">
var xmlHttpRequest = new XMLHttpRequest();
var url ="http://localhost:8080/RESTAJAXExample/rest/StudentResource/get";

function findStudent(){
	
	xmlHttpRequest.open('GET', url, true);
	xmlHttpRequest.send(null);
	xmlHttpRequest.onreadystatechange = getStudents;
	
}
 
function  getStudents(){
	var docEle =  document.getElementById("xx");
	docEle.innerHTML="List of Students";
	if(xmlHttpRequest.readyState == 4 ){
		var jsonObject = eval("("+xmlHttpRequest.responseText+")");
		var table = document.getElementById("targetTable");
		table.innerHTML=null;
		for (var value in jsonObject){
			var tablerow = document.createElement('tr');
		       var cell = document.createElement('td');
		       cell.innerText = jsonObject[value].name; 
		       tablerow.appendChild(cell);
		       table.appendChild(tablerow);
		     }
		
		
		
		
	}
}
</script>
</head>
<body>
<h2>Hello World!</h2>
<input type="text" id="name" size="60">
<button type="button" onClick='findStudent()'>Find</button>
<div id="xx"></div>

<table id="targetTable" ></table>
<div id="xx"></div>

</body>
</html>
