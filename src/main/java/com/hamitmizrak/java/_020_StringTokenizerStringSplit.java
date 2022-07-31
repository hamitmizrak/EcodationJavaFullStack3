package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.StringTokenizer;

@Log4j2
public class _020_StringTokenizerStringSplit {
    public static void main(String[] args) {
        //String parçalamak:
        String valueData="JavaSE&JavaEE+ JavaME~JSP-JSF_Spring";

        //1.YOL Parçalama
        String [] parcala1=valueData.split(" ");
        Arrays.asList(parcala1).forEach(System.out::println);

        //2.YOL-A: default boşluğa göre parçalama yapar
        StringTokenizer parcala2=new StringTokenizer(valueData);
        //nextToken(): parçalalanacak veri varsa
        while(parcala2.hasMoreTokens()){
           //log.info(parcala2.nextToken());
            System.out.println(parcala2.nextToken());
        }

        //2.YOL-B: default boşluğa göre parçalama yapar biz burada delimiter ekleyebiliriz
        StringTokenizer parcala3=new StringTokenizer(valueData,"&+~-_ ");
        while(parcala3.hasMoreTokens()){
            System.out.println(parcala3.nextToken());
        }
    }
}
