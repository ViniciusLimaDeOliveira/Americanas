package br.com.americanas.polotech.q1.objetcs;

import br.com.americanas.polotech.q1.interfaces.Foldermanagement;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FolderOrchestrator implements Foldermanagement {

    public void createFolders(List<String> Paths){
        for (String a:Paths) {
            createAFolder(a);
        }
    }

    public void removeFolders(List<String> Paths){
        for (String a:Paths) {
            createAFolder(a);
        }
    }

    @Override
    public void createAFolder(String path) {
        File directory = new File(path);
        if (directory.mkdirs()) {
            System.out.println("Directory created successfully");
        }
    }

    @Override
    public void removeAFolder(String path) {
        File directory = new File(path);
        remove(directory);
        System.out.println("Directory deleted successfully");
    }

    public void remove (File directory){
        if(directory.isDirectory()){
            File[] files = directory.listFiles();
            for (int i=0;i< files.length;i++){
                remove(files[i]);
            }
        }
        directory.delete();
    }


    @Override
    public void listAllFoldersCreated(String dir) {
        File directory = new File(dir);
        List a = Arrays.stream(directory.listFiles(File::isDirectory)).toList();
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
}
