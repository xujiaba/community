package com.zun.community.community.advice;

import com.alibaba.fastjson.JSON;
import com.zun.community.community.dto.ResultDTO;
import com.zun.community.community.exception.CustomizeErrorCode;
import com.zun.community.community.exception.CustomizeException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@ControllerAdvice
public class CustomizeExceptionHandler {

    @ExceptionHandler(Exception.class)
    ModelAndView handle(HttpServletRequest request, Throwable ex, Model model, HttpServletResponse response) {

        String contentType = request.getContentType();

        if ("application/json".equals(contentType)){
            // 放回JSON
            ResultDTO resultDTO;
            if(ex instanceof CustomizeException){
                resultDTO =  ResultDTO.errorOf((CustomizeException) ex);
            } else {
                resultDTO = ResultDTO.errorOf(CustomizeErrorCode.SYS_ERROR);
            }

            try {
                response.setCharacterEncoding("utf-8");
                response.setContentType("application/json");
                response.setStatus(200);
                PrintWriter writer = response.getWriter();
                writer.write(JSON.toJSONString(resultDTO));
                writer.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }

            return null;
        } else {
            // 错误页面跳转
            if(ex instanceof CustomizeException){
                model.addAttribute("message", ex.getMessage());
            } else {
                model.addAttribute("message", CustomizeErrorCode.SYS_ERROR.getMessage());
            }
            return new ModelAndView("error");
        }

    }

}

