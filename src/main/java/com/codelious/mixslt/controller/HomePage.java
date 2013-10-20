package com.codelious.mixslt.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;

import org.springframework.web.servlet.view.xslt.AbstractXsltView;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

@SuppressWarnings("deprecation")
public class HomePage extends AbstractXsltView {

	@SuppressWarnings("rawtypes")
	protected Source createXsltSource(Map modelo, String nombreRaiz,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		Document documento = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
		Element raiz = documento.createElement(nombreRaiz);

		List palabras = (List) modelo.get("listaPalabras");
		for (Iterator it = palabras.iterator(); it.hasNext();) {
			String palabraSiguiente = (String) it.next();
			Element nodoPalabra = documento.createElement("palabra");
			Text nodoTexto = documento.createTextNode(palabraSiguiente);
			nodoPalabra.appendChild(nodoTexto);
			raiz.appendChild(nodoPalabra);
		}
		return new DOMSource(raiz);
	}
}
