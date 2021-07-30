package org.zerock.store;

import java.util.Scanner;

public class StoreUI {

    //여러 메서드들이 공유/상태
    private Scanner scanner;
    //협력자 - 의존성
    private StoreService storeService;

    public StoreUI(Scanner scanner, StoreService storeService) {
        this.scanner = scanner;
        this.storeService = storeService;
    }

    public void fnMenu() {
        System.out.println("원하시는 메뉴가 뭔가요?");

        String menuStr = this.scanner.nextLine();

        System.out.println(menuStr);

        StoreDTO storeDTO = this.storeService.findByMenuName(menuStr);

        System.out.println(storeDTO);

    }

}
