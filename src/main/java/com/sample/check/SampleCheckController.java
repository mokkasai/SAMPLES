package com.sample.check;

import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.xml.ws.WebServiceClient;

@RestController
public class
SampleCheckController {


@PostMapping("/create")

    public ResponseEntity<Order> createOrder(@RequestBody Order order) {


    System.out.println(order.getOrdName()+" "+order.getOrdPrice());

           return ResponseEntity.ok(order);
    }


}
