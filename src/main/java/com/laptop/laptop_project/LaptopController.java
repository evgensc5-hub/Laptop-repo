package com.laptop.laptop_project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class LaptopController {
        @Value("${laptop.brand}")
        private String laptopBrand;

        @Value("${laptop.model}")
        private String laptopModel;

        @Value("${laptop.ram}")
        private String laptopRam;

        @Value("${laptop.processor}")
        private String laptopProcessor;

        @GetMapping("/laptop")
        public String getlaptopInfo() {
            return "Laptop Brand: " + laptopBrand +
                    ", Model: " + laptopModel +
                    ", Ram: " + laptopRam +
                    ", Processor: " + laptopProcessor;
        }
    }
