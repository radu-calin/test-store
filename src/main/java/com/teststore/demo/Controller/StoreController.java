package com.teststore.demo.Controller;

import com.teststore.demo.Entity.Store;
import com.teststore.demo.Service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

@Controller
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Store> getAllStores() {
        return storeService.getAllStores();
    }

}
