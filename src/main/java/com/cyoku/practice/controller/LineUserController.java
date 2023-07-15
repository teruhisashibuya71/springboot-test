package com.cyoku.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cyoku.practice.domain.model.LineUser;
import com.cyoku.practice.service.LineUserService;

@RestController
public class LineUserController {

    @Autowired
    private LineUserService lineUserService;

    /**
     * 全ユーザー情報を取得して画面に返却
     */
    @GetMapping("/users")
    public ModelAndView getLineUsers(){
        //LineUser情報を全て取得する
        List<LineUser> lineUserList = lineUserService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("lineUserList", lineUserList);
        modelAndView.addObject("pageTitle", "users.html");
        modelAndView.setViewName("users");
        return modelAndView;
    }

    /**
     * 1人のユーザー情報を取得して画面に返却
     */
    @GetMapping("/users/{id}")
    public ModelAndView getLineUserById(@PathVariable("id") int id){
        //LineUser情報を1件取得する
        LineUser lineUser = lineUserService.getLineUserById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("lineUser", lineUser);
        modelAndView.setViewName("users");
        return modelAndView;
    }


}
