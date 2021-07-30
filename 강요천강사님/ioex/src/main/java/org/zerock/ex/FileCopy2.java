package org.zerock.ex;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Path;

public class FileCopy2 {

    //bad code
    public static void main(String[] args) throws Exception {

        File file = new File("C:\\images\\tr.jpg");

        Path filePath = file.toPath();

        OutputStream out = new FileOutputStream("C:\\images\\copy2.jpg");

//        File.copy(filePath);

    }

}
