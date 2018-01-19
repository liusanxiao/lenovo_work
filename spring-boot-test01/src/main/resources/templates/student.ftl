<html>
<head>
	<title>学生列表</title>	
</head>
<body>
	学生列表：<br/>
	<table border="1">
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
		</tr>
		<#list stuList as stu>
			<tr>
				<td>${stu.stuNo}</td>
				<td>${stu.name}</td>
				<td>${stu.age}</td>
				<td>${stu.sex}</td>
			</tr>
		</#list>
		
	</table>
</body>
</html>