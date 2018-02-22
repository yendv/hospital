/**
 * 
 */
package fpt.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fpt.frontend.gateway.RegisterGateway;

/**
 * @author YenDV
 *
 */
@RestController
@RequestMapping(value = "/api")
public class RegisterController {
/*	@Autowired
	RegisterGateway registerGateway;*/
	
	@RequestMapping(value = "/test" , method = RequestMethod.GET)
	public ResponseEntity<String> test(){
		return new ResponseEntity<String>("ahihi" ,HttpStatus.OK);
	}
}
