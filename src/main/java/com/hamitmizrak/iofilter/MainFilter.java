package com.hamitmizrak.iofilter;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.List;

//Class düzleminde filter yapmak
@Log4j2
public class MainFilter {

    // filterMethod
    private static void filterMethod() {
        //Instance
        ProductFilter filter1 = ProductFilter.builder().id(1L).name("ürün 1 ").price(100).build();
        ProductFilter filter2 = ProductFilter.builder().id(1L).name("ürün 2 ").price(200).build();
        ProductFilter filter3 = ProductFilter.builder().id(1L).name("ürün 3 ").price(300).build();
        ProductFilter filter4 = ProductFilter.builder().id(1L).name("ürün 4 ").price(400).build();

        //Arrays.asList()
        List<ProductFilter> filterList = Arrays.asList(filter1, filter2, filter3,filter4);
        int counterProduct=0;
        for( ProductFilter temp   : filterList){
            if(temp.getPrice()>=200){
                log.info(temp);
                counterProduct++;
            }
        }
        log.info(counterProduct+" Tane veri bulundu");
    } //end  filterMethod

    //PSVM
    public static void main(String[] args) {
        filterMethod();
    }

} //end MainFilter
