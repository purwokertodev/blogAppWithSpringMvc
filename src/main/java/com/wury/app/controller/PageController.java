/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ABYOR
 */
@Controller
public class PageController {
    
    @RequestMapping(value = "/")
    public ModelAndView mainPageAllUsers(){
        ModelAndView mav = new ModelAndView("all_user/home");
        return mav;
    }
    
    @RequestMapping(value = "/home")
    public ModelAndView indexAllUsers(){
        ModelAndView mav = new ModelAndView("all_user/home");
        return mav;
    }
    
}
