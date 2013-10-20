Spring_XSL_views
================

Este es un ejemplo simple de Spring MVC que muestra el uso de XSLT para desplegar las vistas.

XSLT es un lenguaje de transformación para XML y es popular como una tecnología de vistas con aplicaciones web. XSLT puede ser una buena elección como una tecnología de vista si tu aplicación naturalmente negocia con XML, o si tu modelo puede ser fácilmente convertido a XML. Este post muestra como producir un documento XML como modelo de datos y tenerlo transformado con XSLT en una aplicación Spring Web MVC.

Este ejemplo es una aplicación trivial de Spring que crea una lista de palabras en el Controlador y las agrega al mapa de modelo. El mapa es retornado junto con el nombre de vista de nuestra vista XSLT. La vista XSLT pondrá la lista de palabras en un documento simple XML listo para la transformación. 
