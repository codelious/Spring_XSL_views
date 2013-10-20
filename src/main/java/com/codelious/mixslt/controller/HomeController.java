package com.codelious.mixslt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HomeController extends AbstractController {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Map mapa = new HashMap();
		List listaPalabras = new ArrayList();
		
		listaPalabras.add("Hola");
		listaPalabras.add("Universo");
		
		mapa.put("listaPalabras", listaPalabras);
		
		return new ModelAndView("home", mapa);
		
	}
	
}
