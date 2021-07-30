package org.zerock.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceTests {

    private StoreService service;

    @Test
    public void Test1() {

        service = new StoreService();

        StoreDTO storeDTO = service.findByMenuName("a");

        System.out.println(storeDTO);

    }

}