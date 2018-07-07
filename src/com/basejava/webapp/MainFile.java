package com.basejava.webapp;

import java.io.*;

public class MainFile {
    public static void findFiles(File file, FileFilter filter, PrintStream output) throws IOException {
        if(file.isDirectory()) {
            File[] list = file.listFiles();
            for(int i = list.length; --i >= 0; ) {
                findFiles(list[i], filter, output);
            }
        } else {
            if(filter.accept(file)) output.println("\t" + file.getCanonicalPath());
        }
    }

    public static void main(String[] args) {
        class NameFilter implements FileFilter {
            private String mask;

            NameFilter(String mask) {
                this.mask = mask;
            }

            @Override
            public boolean accept(File file) {
                return file.getName().contains(mask);
            }
        }
        File pathFile = new File(".");
        String filterString = ".java";
        try {
            FileFilter filter = new NameFilter(filterString);
            findFiles(pathFile, filter, System.out);
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("work finished");
        System.out.println();

        String filePath = "./.gitignore";
        File file = new File(filePath);
        try {
            System.out.println(file.getCanonicalPath());
        } catch(IOException e) {
            throw new RuntimeException("Error", e);
        }
        File dir = new File("F:/GS/basejava/src/com/basejava/webapp");
        System.out.println(dir.isDirectory());
        String[] list = dir.list();
        if(list != null) {
            for(String name : list) {
                System.out.println(name);
            }
        }
        try(FileInputStream fis = new FileInputStream(filePath)) {
            System.out.println(fis.read());

        } catch(IOException e) {
            throw new RuntimeException("Error",e);
        }

    }
}
