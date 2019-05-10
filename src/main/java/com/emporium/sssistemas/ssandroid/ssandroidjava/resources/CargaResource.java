package com.emporium.sssistemas.ssandroid.ssandroidjava.resources;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*")
@Api(value="API REST SSAndroid")
public class CargaResource {
	
	@GetMapping(value="/hello")
	@ApiOperation(value="Efetua o ping para verificar se a api esta UP.")
	public String hello() {
		return "hello";
	}

}
