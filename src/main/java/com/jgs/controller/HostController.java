package com.jgs.controller;

import com.jgs.uti.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class HostController {

    @Autowired
    @Qualifier("restTemplate")
    RestTemplate restTemplate;

    @RequestMapping(path = "/host", method = RequestMethod.GET)
    String home() {
        return "hello" + WebUtils.getIP();
    }

    @RequestMapping(path = "/host/aa", method = RequestMethod.GET)
    String home_aa() {
        return "hello-aa" + WebUtils.getIP();
    }

}
  