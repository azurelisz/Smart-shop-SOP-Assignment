package com.sop.bakeryshop;


import facotry.Bakery;
import facotry.BakeryFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class BakeryShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(BakeryShopApplication.class, args);
    }
    @RequestMapping("/")
    public String index(){
        String a = "For all bakeries add \"/all-available-bakeries\" after url.\n\nFor all cakes we have in our shop add \"/all-cakes\" after url.\n\nFor all breads we have in our shop add \"/all-breads\" after url. ";
    return a;
    }

    @RequestMapping("/all-available-bakeries")
    public List<Bakery> getAllAvailableBakeries(){return BakeryFactory.getAllAvailableBakeries();}

    @RequestMapping("/all-cakes")
    public List<Bakery> getAllCake(){return BakeryFactory.getAllCake();}

    @RequestMapping("/all-breads")
    public List<Bakery> getAllBread(){return BakeryFactory.getAllBread();}

}
