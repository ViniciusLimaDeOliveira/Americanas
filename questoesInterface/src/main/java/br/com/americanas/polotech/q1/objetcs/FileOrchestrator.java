package br.com.americanas.polotech.q1.objetcs;

import br.com.americanas.polotech.q1.enums.MFileAnnotationTypeEnum;
import br.com.americanas.polotech.q1.interfaces.FileDatabase;
import br.com.americanas.polotech.q1.interfaces.ImageFileDatabase;

public class FileOrchestrator extends FolderOrchestrator implements ImageFileDatabase, FileDatabase {
    @Override
    public void saveFile(String directory, String content, MFileAnnotationTypeEnum type, String nameFile) {

    }

    @Override
    public void recoveryFile(String directory, String nameFile) {

    }

    @Override
    public void removeFile(String directory, String nameFile, MFileAnnotationTypeEnum type) {

    }

    @Override
    public void listAllFiles(String directory) {

    }

    @Override
    public void saveImageFile(String directory, String content, String nameFile) {

    }

    @Override
    public void recoveryImageFile(String directory) {

    }

    @Override
    public void removeImageFile(String directory, String nameFile) {

    }

    @Override
    public void listAllImagesFiles(String directory) {

    }
}
