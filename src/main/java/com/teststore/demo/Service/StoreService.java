package com.teststore.demo.Service;

import com.teststore.demo.DAO.StoreDAO;
import com.teststore.demo.Entity.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StoreService {

    @Autowired
    private StoreDAO storeDAO;

    public Collection<Store> getAllStores() {
        return storeDAO.getAllStores();
    }
}
