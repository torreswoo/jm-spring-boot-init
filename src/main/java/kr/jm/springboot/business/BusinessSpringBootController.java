package kr.jm.springboot.business;

import kr.jm.business.Bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessSpringBootController {

	@Autowired
	private Bussiness business;

}