package com.jsp.chap04.service;

import com.jsp.entity.Dancer;
import com.jsp.repository.DancerRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ListService implements IDancerService {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<Dancer> dancerList = DancerRepository.findAll();
        request.setAttribute("dl", dancerList);
    }



}
