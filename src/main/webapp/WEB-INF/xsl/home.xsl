<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" omit-xml-declaration="yes" />

	<xsl:template match="/">
		<html>
			<head>
				<title>Hola!</title>
			</head>
			<body>
				<h1>Mis Primeras Palabras</h1>
				<xsl:apply-templates />
			</body>
		</html>
	</xsl:template>

	<xsl:template match="palabra">
		<xsl:value-of select="." />
	</xsl:template>
</xsl:stylesheet>