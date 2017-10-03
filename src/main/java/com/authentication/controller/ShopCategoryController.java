package com.authentication.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.authentication.model.ShopCategory;
import com.authentication.service.ShopCategoryService;


@Controller
public class ShopCategoryController {
	@Autowired
	ShopCategoryService shopcategoryService;
	
	@RequestMapping(value="/createShopCategory",method=RequestMethod.POST)
	public ResponseEntity<ShopCategory> createShopCategory(@RequestBody ShopCategory shopCategory){
		
		try {
			shopcategoryService.save(shopCategory);
			return new ResponseEntity<ShopCategory>(shopCategory,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<ShopCategory>(HttpStatus.EXPECTATION_FAILED);
		}
		
	}
	
	@RequestMapping(value="/getShopCategory",method=RequestMethod.GET)
	public ResponseEntity<List<ShopCategory>> getShopCategory(){
		try {
			List<ShopCategory> list =shopcategoryService.getAll();
			return new ResponseEntity<List<ShopCategory>>(list,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<List<ShopCategory>>(HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	/*@RequestMapping("/exit")
    public void exit(HttpServletRequest request, HttpServletResponse response) {
        // token can be revoked here if needed
        new SecurityContextLogoutHandler().logout(request, null, null);
        try {
            //sending back to client app
            response.sendRedirect(request.getHeader("referer"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

}
