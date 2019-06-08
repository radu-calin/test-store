package com.teststore.demo.DAO;

import com.teststore.demo.Entity.Store;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StoreDAO {
    static {
        stores = new HashMap<>() {{
            put(1, new Store());
            put(2, new Store());
            put(3, new Store());
        }};
    }

    private static Map<Integer, Store> stores;

    public Collection<Store> getAllStores() {
        return stores.values();
    }
}
