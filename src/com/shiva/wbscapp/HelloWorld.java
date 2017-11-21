package com.shiva.wbscapp;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.swing.text.Style;
@WebService  
@SOAPBinding(style = Style.RPC)
public class HelloWorld {
	  
	  //ok
	    @WebMethod String getHelloWorldAsString(String name) {
			return null;
		}  
	}  


