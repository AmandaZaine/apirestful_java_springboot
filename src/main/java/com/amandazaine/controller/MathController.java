package com.amandazaine.controller;

import com.amandazaine.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @Autowired
    MathService mathService;

    @RequestMapping(value = "/sum/{n1}/{n2}", method = RequestMethod.GET)
    public Double soma(@PathVariable String n1, @PathVariable String n2) {
        return mathService.soma(n1, n2);
    }

    @RequestMapping(value = "/sub/{n1}/{n2}", method = RequestMethod.GET)
    public Double subtracao(@PathVariable String n1, @PathVariable String n2) {
        return mathService.subtracao(n1, n2);
    }

    @RequestMapping(value = "/mul/{n1}/{n2}", method = RequestMethod.GET)
    public Double multiplicacao(@PathVariable String n1, @PathVariable String n2) {
        return mathService.multiplicacao(n1, n2);
    }

    @RequestMapping(value = "/div/{n1}/{n2}", method = RequestMethod.GET)
    public Double divisao(@PathVariable String n1, @PathVariable String n2) {
        return mathService.divisao(n1, n2);
    }

    @RequestMapping(value = "/med/{n1}/{n2}", method = RequestMethod.GET)
    public Double media(@PathVariable String n1, @PathVariable String n2) {
        return mathService.media(n1,n2);
    }

    @RequestMapping(value = "/raiz/{n1}", method = RequestMethod.GET)
    public Double raizQuadrada(@PathVariable String n1) {
        return mathService.raizQuadrada(n1);
    }

}
