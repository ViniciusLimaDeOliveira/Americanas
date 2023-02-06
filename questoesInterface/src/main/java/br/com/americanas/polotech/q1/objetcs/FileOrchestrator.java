package br.com.americanas.polotech.q1.objetcs;

import br.com.americanas.polotech.q1.enums.MFileAnnotationTypeEnum;
import br.com.americanas.polotech.q1.interfaces.FileDatabase;
import br.com.americanas.polotech.q1.interfaces.ImageFileDatabase;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class FileOrchestrator extends FolderOrchestrator implements ImageFileDatabase, FileDatabase {
    @Override
    public void saveFile(String directory, String content, MFileAnnotationTypeEnum type, String nameFile) {
        String typeName = "";
        switch (type){
            case REMINDER -> {
                typeName= "reminders";
            }
            case IMPORTANT -> {
                typeName = "importants";
            }
            case IMAGE -> {
                typeName = "images";
            }
            default -> {
                typeName = "";
            }
        }
        createAFolder( directory + "\\"+typeName);
        String path = directory + "\\"+typeName+ "\\"+nameFile+".txt";
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path),"utf-8"))){
            writer.write(content);
            System.out.println("Arquivo criado e escrito.");
        } catch (IOException e) {
           e.printStackTrace();
           System.out.println("Erro generico de criação de arquivo e escrita.");
        }
    }

    @Override
    public void recoveryFile(String directory, String nameFile) {
        File reco = new File(directory+"\\"+nameFile+".txt");
        String dados="";
        try {
           dados = new String(Files.readAllBytes(reco.toPath()));
        } catch (IOException e) {
            System.out.println("Ocoreu um erro ao tentar ler o conteudo do arquivo");
        }
        System.out.println(dados);
    }

    @Override
    public void removeFile(String directory, String nameFile, MFileAnnotationTypeEnum type) {
        File dir;
        switch (type){
            case REMINDER -> {
                dir = new File(directory+"\\"+"reminders\\"+nameFile+".txt");
            }
            case IMPORTANT -> {
                dir = new File(directory+"\\"+"importants\\"+nameFile+".txt");
            }
            case IMAGE -> {
                dir = new File(directory+"\\"+"images\\"+nameFile+".jpeg");
            }
            default -> {
                dir = new File(directory+"\\"+nameFile+".txt");
            }
        }
        remove(dir);
    }

    @Override
    public void listAllFiles(String dir) {
        File directory = new File(dir);
        List a = Arrays.stream(directory.listFiles(File::isFile)).toList();
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }

    @Override
    public void saveImageFile(String directory, String content, String nameFile) {
        BufferedImage image;
        try {
            URL url = new URL(content);
            image = ImageIO.read(url);
            ImageIO.write(image,"jpeg",new File(directory+"\\"+nameFile+".jpeg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void recoveryImageFile(String directory,String nameFile) {
        BufferedImage image;
        try {
            String im = directory+"\\images\\"+nameFile+".jpeg";
            image = ImageIO.read(new File(im));
            ImageDisplayer displayer = new ImageDisplayer();
            displayer.displayImage(image);
        } catch (IOException e) {
            System.out.println("Ocoreu um erro ao temtar ler o conteudo do arquivo");
        }


    }

    @Override
    public void removeImageFile(String directory, String nameFile) {
        removeFile(directory,nameFile,MFileAnnotationTypeEnum.IMAGE);
    }

    @Override
    public void listAllImagesFiles(String dir) {
        File directory = new File(dir+"\\images");
        List a = Arrays.stream(directory.listFiles(File::isFile)).toList();
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }

    /*
    @Override
    public void listAllImagesFiles(String dir) {
        File directory = new File(dir+"\\image");
        List a = Arrays.stream(directory.listFiles(File::isFile)).toList();
        for(int i=0;i<a.size();i++){
            BufferedImage image;
            try {
                image = ImageIO.read(new File(String.valueOf(a.get(i))));
                ImageDisplayer displayer = new ImageDisplayer();
                displayer.displayImage(image);
            } catch (IOException e) {
                System.out.println("Ocoreu um erro ao temtar ler o conteudo do arquivo");
            }
        }
    }*/


}
