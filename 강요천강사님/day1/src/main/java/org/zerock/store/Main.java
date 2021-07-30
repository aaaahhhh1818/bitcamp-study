package org.zerock.store;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         StoreDTO[] dtos = new StoreDTO[]{
                StoreDTO.builder().name("a").menu("a").lat(1).lng(1).score(1).build(),
                StoreDTO.builder().name("b").menu("b").lat(2).lng(2).score(1).build(),
                StoreDTO.builder().name("c").menu("c").lat(3).lng(3).score(1).build()
        };

        StoreService service = new StoreService(dtos);

        Scanner scanner = new Scanner(System.in);

        StoreUI storeUI = new StoreUI(scanner, service);

        storeUI.fnMenu();

    }
}
