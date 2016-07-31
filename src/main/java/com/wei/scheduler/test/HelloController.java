package com.wei.scheduler.test;


import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import yahoofinance.Stock;
import yahoofinance.histquotes.HistoricalQuote;

@Controller
@RequestMapping(value="/hello")
public class HelloController {
    @RequestMapping(value="/world",method=RequestMethod.GET)
    public String hello(Model model) throws IOException{
        model.addAttribute("msg", "spring mvc!");
        
        Stock stock = new Stock("T");
        Calendar c = Calendar.getInstance();
        List<HistoricalQuote> list = stock.getHistory();
        model.addAttribute("alist", list);
        System.out.println(list);
        return "index";
    }
}
