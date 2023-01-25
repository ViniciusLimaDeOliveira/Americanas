package br.com.americanas.polotech.fabricaDeIphones;

import br.com.americanas.polotech.fabricaDeIphones.modelos.Iphone;
import br.com.americanas.polotech.fabricaDeIphones.modelos.TypeIphoneEnum;

public class main3 {
    public static void main(String[] args) {
        IphoneFactory iphoneFactory = new IphoneFactory();

        for (TypeIphoneEnum a:TypeIphoneEnum.values()){
            System.out.println(iphoneFactory.cadastrarIphone(a));
        }
    }
}
