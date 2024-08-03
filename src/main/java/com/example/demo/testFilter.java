package com.example.demo;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

@Component
@Slf4j
public class testFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        final HttpServletRequest httpServletRequest= (HttpServletRequest) request;
        Collections.list(httpServletRequest.getHeaderNames()).forEach(header -> {
            log.info("Header: {}={}",header,httpServletRequest.getHeader(header));
        });
        filterChain.doFilter(httpServletRequest,response);
    }
}
