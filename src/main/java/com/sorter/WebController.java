package com.sorter;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;


@Controller
@RequestMapping("/")
public class WebController {

    @RequestMapping( method = RequestMethod.GET, value = "order" )
    public String getOrder(@RequestParam(value="items", required = false, defaultValue = "5" ) int itemCount, ModelMap model) {

        ArrayList<Product> items = new ArrayList<Product>(Order.order(itemCount));
        for (int i = 0; i < items.size(); i++ ) {
            model.addAttribute("orderItems", items.get(i));
            System.out.println(items.get(i));
        }

        return "order";
    }


    @RequestMapping( method = RequestMethod.GET, value = "sorter")
    @ResponseBody
    public ArrayList<Box> startSort(@RequestParam(value="orderItems", required=false, defaultValue= "5" ) int starter, ModelMap model) {
        model.addAttribute("order", Order.order(starter));
        return Sorter.sorter(starter);
	}

}