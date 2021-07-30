package org.zerock.store.ui;

import lombok.AllArgsConstructor;
import org.zerock.store.StoreService;

import java.util.Scanner;

@AllArgsConstructor
//실제로 동작하지 X -> abstract
abstract class AbstractMenuUI {

    private Scanner scanner;
    protected StoreService storeService; //하위에서 마음대로 받기위해서

    protected String readLine(String str) {
        System.out.println(str);
        return scanner.nextLine();
    }

    protected int readInt(String str) {
        System.out.println(str);
        return Integer.parseInt(scanner.nextLine());
    }

    protected Double readDouble(String str) {
        System.out.println(str);
        return Double.parseDouble(scanner.nextLine());
    }

    //실제 몸체 X
    //오버라이드 하기 위해서 생성
    public abstract void doJob();

}
