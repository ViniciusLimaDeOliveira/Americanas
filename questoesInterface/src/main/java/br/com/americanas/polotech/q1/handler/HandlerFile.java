package br.com.americanas.polotech.q1.handler;

import br.com.americanas.polotech.q1.enums.MFileAnnotationTypeEnum;
import br.com.americanas.polotech.q1.interfaces.FileDatabase;
import br.com.americanas.polotech.q1.interfaces.Foldermanagement;
import br.com.americanas.polotech.q1.interfaces.ImageFileDatabase;
import br.com.americanas.polotech.q1.objetcs.FileOrchestrator;
import br.com.americanas.polotech.q1.objetcs.FolderOrchestrator;
import br.com.americanas.polotech.q1.objetcs.MFile;

public class HandlerFile {
    ImageFileDatabase imageFileOrchestrator = new FileOrchestrator();
    FileDatabase fileOrchestrator= new FileOrchestrator();
    Foldermanagement foldermanagement = new FileOrchestrator();
    public  void saveFileWithDirectory(MFile mFile){
        fileOrchestrator.saveFile(
                mFile.getPath(),
                mFile.getContent(),
                mFile.getType(),
                mFile.getNameFile()
        );
    }
    public void recoveryFileWhitName(String path,String fileName){
        fileOrchestrator.recoveryFile(path,fileName);
    }
    public void createFolderWithType(String path,MFileAnnotationTypeEnum type){
        String typeFolder="";
        switch (type){
            case REMINDER -> {
                typeFolder= "reminders\\";
            }
            case IMPORTANT -> {
                typeFolder = "importants\\";
            }
            case IMAGE -> {
                typeFolder = "images\\";
            }
            case SIMPLE -> {
                typeFolder = "";
            }
        }

        try {
            foldermanagement.createAFolder(path+"\\"+typeFolder);
        }catch (Exception e){}

    }
    public void createFolderWithName(String folderName,String path){
        try {
            foldermanagement.createAFolder(path+"\\"+folderName);
        }catch (Exception e){
            System.out.println("Não foi possivel criar uma pasta com nome: " + folderName);
        }

    }
    public void removeFileWithName(String directory, String nameFile, MFileAnnotationTypeEnum type){
        try {
         fileOrchestrator.removeFile(directory,nameFile,type);
        } catch (Exception e) {
            System.out.println("Não foi possivel remover o arquivo com nome: " + nameFile);
        }
    }
    public void removeAFolderWithName(String path,String folderName){
        try {
            foldermanagement.removeAFolder(path+"\\"+folderName);
        }catch (Exception e){
            System.out.println("Não foi possivel remover uma pasta com nome: " + folderName);
        }
    }
    public void listAllFolders(String path){
        foldermanagement.listAllFoldersCreated(path);
    }
    public void listAllFiles(String path){
        fileOrchestrator.listAllFiles(path);
    }

    public void  saveImageFile(MFile mFile){
        createFolderWithType(mFile.getPath(),MFileAnnotationTypeEnum.IMAGE);
        String path = mFile.getPath()+"\\images";
        imageFileOrchestrator.saveImageFile(path,mFile.getContent(),mFile.getNameFile());
    }
    public void removeImageWhitName(String path,String nameImage){
        imageFileOrchestrator.removeImageFile(path,nameImage);
    }
    public void retrieveImageWithName(String path,String nameImage){
        imageFileOrchestrator.recoveryImageFile(path,nameImage);
    }
    public void listAllImages(String path){
        imageFileOrchestrator.listAllImagesFiles(path);
    }
}
