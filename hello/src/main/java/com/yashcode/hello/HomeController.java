package com.yashcode.hello;

// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
    abc a= new abc();
@RequestMapping("/{cardid}")   
public String Index(@PathVariable String cardid){
    a.Record(cardid);
    System.out.println(cardid);
    return "Oneplus ===> "+ cardid;
}

}


