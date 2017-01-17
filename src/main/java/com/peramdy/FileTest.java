package com.peramdy;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Peramdy on 2016/12/10.
 */
public class FileTest {

    /**
     * @param filePath
     * @return
     * @description read file to string
     */
    public static String readFileToString(String filePath) {
        File file = new File(filePath);
        try {
            return FileUtils.readFileToString(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String readFileByLine() {

        return null;
    }

}
