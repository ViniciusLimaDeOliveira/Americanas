package br.com.americanas.polotech.fabricaDeIphones;

import br.com.americanas.polotech.fabricaDeIphones.modelos.*;

public class IphoneFactory {
    public Iphone cadastrarIphone(TypeIphoneEnum typeIphone){
        switch (typeIphone){
            case IPHONE_9 -> {
                return new Iphone9();
            }
            case IPHONE_13_MINI -> {
                return new Iphone13Mini();
            }
            case IPHONE_X -> {
                return new IphoneX();
            }
            default -> {
                return null;
            }
        }
    }

}
