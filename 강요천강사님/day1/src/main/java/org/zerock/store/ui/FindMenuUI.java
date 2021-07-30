package org.zerock.store.ui;

import org.zerock.store.StoreDTO;
import org.zerock.store.StoreService;

import java.util.Scanner;


public class FindMenuUI extends AbstractMenuUI {

    public FindMenuUI(Scanner scanner, StoreService storeService) {
        super(scanner, storeService);
    }

    @Override
    public void doJob() {
        String menuName = readLine("메뉴이름을 입력하세요");

        StoreDTO result = storeService.findByMenuName(menuName);

        System.out.println(result);

    }
}
