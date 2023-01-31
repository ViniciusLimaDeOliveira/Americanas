package br.com.americanas.polotech.q1.interfaces;

public interface ImageFileDatabase {
    void saveImageFile (String directory,String content,String nameFile);
    void recoveryImageFile(String directory);
    void removeImageFile(String directory,String nameFile);
    void listAllImagesFiles(String directory);
}
