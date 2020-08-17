package io;

import java.io.File;
import java.io.IOException;

public class LearnFile {
    public static void main(String[] args) throws IOException {
        LearnFile lf = new LearnFile();
        File file = new File("test.txt");
        lf.create(file);
        lf.delete(file);
    }

    public void create(File file) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    public void delete(File file) throws IOException {
        if (file.exists()) {
            file.delete();
        }
    }
}
