package com.hamitmizrak.java;

// 1 tane public class yazabilirsiniz (Inner Class Hariç)
// classlarda static olamaz (Inner Class Hariç)

import lombok.Getter;
import lombok.Setter;

public  class _038_Country {

    @Getter @Setter
    private String countryName;

    //inner class
   public  static  class City {

        @Getter @Setter
        private String cityName;
    }
}

//psvm
class MainClass{
    public static void main(String[] args) {
        _038_Country country=new _038_Country();
        country.setCountryName("Türkiye");

       _038_Country.City city=new _038_Country.City();
       city.setCityName("Ankara");


        System.out.println("Ülke Adı: "+country.getCountryName()+" Şehir Adı: "+city.getCityName());
    }
}