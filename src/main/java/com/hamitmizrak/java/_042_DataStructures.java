package com.hamitmizrak.java;

import com.fasterxml.jackson.databind.util.ArrayBuilders;

import java.util.*;

//1-List
class CollectionListData {
    public static void main(String[] args) {
        java.util.List<Integer> listem = new LinkedList<>();
//rastgele 1<=x<=10 arasında 5 tane sayı eklemek
        for (int i = 1; i <= 5; i++) {
            Random random = new Random();
            int number = random.nextInt(10) + 1;
            listem.add(number);
        }

        System.out.println("Birinci Eleman:" + listem.get(0));
        System.out.println("Eleman Sayısı:" + listem.size());
        System.out.println("indexOf: " + listem.indexOf(5));
        System.out.println("Boş mu  " + listem.isEmpty());

        //Iterative For
        System.out.println("****** Iterative For ********************");
        for (int i = 0; i < listem.size(); i++) {
            System.out.print(listem.get(i) + " ");
        }

        // listem.remove(0);
        // listem.clear();

        System.out.println("\n****** ForEach ********************");
        for (Integer temp : listem) {
            System.out.print(temp + " ");
        }

        System.out.println("\n****** Iterator ********************");
        java.util.Iterator<Integer> iterator = listem.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\n****** Java 8 ForEach ********************");
        listem.stream().forEach(System.out::println);

        System.out.println("\n****** Java 8 ForEach ********************");
        listem.forEach(System.out::println);
    }
}

//2-)SET
class CollectionSetData {
    public static void main(String[] args) {
        //HLT
        Set<Integer> listem = new HashSet<>();
//rastgele 1<=x<=10 arasında 5 tane sayı eklemek
        listem.add(1);
        listem.add(5);
        listem.add(3);
        listem.add(2);
        listem.add(2);
        listem.add(2);
        listem.add(2);
        //Iterative For
        System.out.println("\n****** Iterator ********************");
        java.util.Iterator<Integer> iterator = listem.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

//3-)MAP  HHLT
class CollectionMapData {
    public static void main(String[] args) {
        Map<String, Object> listem = new TreeMap<>();
//rastgele 1<=x<=10 arasında 5 tane sayı eklemek
        for (int i = 1; i <= 5; i++) {
            Random random = new Random();
            int number = random.nextInt(4) + 1;
            UUID key = UUID.randomUUID();
            listem.put(key.toString(), "value: " + i);
        }

        for (String key : listem.keySet()) {
            System.out.println(key + " ==> " + listem.get(key));
        }

    }
}

public class _042_DataStructures {
    public static void main(String[] args) {
        //CollectionListData listem=new CollectionListData();

        // CollectionSetData listem2=new CollectionSetData();

        CollectionMapData listem3 = new CollectionMapData();

        /*
        List,Set,Map kullanarak
        Random kullanarak
        methodlar kullararak bu programamızı yapalım.
         * Haftanın gününe rastgele gelecek şekilde ;
            Çorba,Ana Öğün, İçecekler ve tatlıyı rastgele seçim yapan program
            Örneğin: Pazartesi Çorba: Ezogelin, Ana Öğün: Kebab: tatlı güllaç Sıcak İçecek: Çay Meyve:Elma

            Çorba: yüksük çorbası,ezo gelin çorbası,mercimek çorbası
            ana öğün: kebab,kurufasülye,tandır kebabı,Çökertme,
            Soğuk icecekler: soda,ayran,fanta,kola
            meyve: elma,armut,erik,muz,kivi
            tatlı: güllaç,muhallebi,irmik tatlısı
            Sıcak icecekler: Çay,Kahve, Sahlep
         */

        /*
        Thread             : Asenkron
        Synchronization: Senkton çalışma;
        2 tane classımız olacak ve bu classlarda Kullanıcının verdiğim data kadar 5'er 5'er artarak devam etsin
        1.class 100'den başlarak  125kadar devam etsin
        2.class 10'dan başlarayarak 35 kadar devam etsin

        Örneğin: Thread
        1.class ==>100
        1.class ==>105
        2.class ==> 10
        2.class ==> 10
        2.class ==> 15
        2.class ==> 20
        2.class ==> 25
        1.class ==>110
        1.class ==>115
        1.class ==>120
        2.class ==> 25
        2.class ==> 30
        2.class ==> 35 BİTTİ
        1.class ==>125 BİTTİ

        Synchronization
        1.class ==>100
        1.class ==>110
        1.class ==>115
        1.class ==>120
        1.class ==>125 BİTTİ
        2.class ==>20
        2.class ==>25
        2.class ==>30
        2.class ==>35 BİTTİ
        */

        /* synchronized Reflection Annotation  */
        /*  Class  Object interface inheritance abstract polymorphism*/

        //Devops nedir ?
        //Kanban-Scrum arasındaki farklar ?
    }
}

