package io.github.wanggit.antrpc.demo.telnet_consumer;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public class Test {

    private static final List<File> targets = new ArrayList<>();

    public static void main(String[] args) {
        File dir = new File("E://creative-tim/bootstrap-themes/demos.creative-tim.com");
        doDir(dir);
        System.out.println(targets);
        for (File target : targets) {
            String fileName = target.getName();
            System.out.println(fileName);
            String newFileName = fileName.replaceFirst("\\.js_v=.+$", ".js")
                    .replaceFirst("\\.css_v=.+$", ".css");
            File targetFile = new File(target.getParent() + "/" + newFileName);
            target.renameTo(targetFile);
        }
    }

    public static void doDir(File dir){
        File[] files = dir.listFiles();
        if (null == files){
            return;
        }
        for (File file : files) {
            if (file.isDirectory()){
                doDir(file);
            }else {
                String fileName = file.getName();
                if (fileName.contains(".js_v=") || fileName.contains(".css_v=")){
                    targets.add(file);
                }
            }
        }
    }


}
