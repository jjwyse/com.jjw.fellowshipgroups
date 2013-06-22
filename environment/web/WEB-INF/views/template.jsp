<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<html>
<link rel="shortcut icon" href="/fellowshipgroups/resources/images/favicon.ico">
<link rel="stylesheet" type="text/css" href="/fellowshipgroups/resources/css/fellowshipgroups.css">
<head>
<title>FDC: Fellowship Groups</title>
</head>
<body>
	<div id="container">
		<div id="header">
			<tiles:insertAttribute name="header" />
		</div>
		<div id="map_canvas">
			<tiles:insertAttribute name="body" />
		</div>
		<div id="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>
