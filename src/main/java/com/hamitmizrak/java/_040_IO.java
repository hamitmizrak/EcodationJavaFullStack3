package com.hamitmizrak.java;

import lombok.extern.log4j.Log4j2;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//FileInputStream ==> 8 bitlik okuma
//FileReader        ==> 16 bit okuma
@Log4j2
public class _040_IO {

    //PATH
    public final static String PATH = "C:\\fileio\\deneme.txt";

    //Scanner
    private static Scanner klavye=new Scanner(System.in);

    //Formatter Date  //Pattern Date
    private static String userDateFormatter() {
        Locale locale = new Locale("tr", "TR");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("[dd - MMMM - yyyy] HH:mm:ss ==>", locale);
        Date date2 = new Date();
        String str = simpleDateFormat.format(date2);
        return str;
    }

    //Kullanıcıdan veri almak
    public static String writeUser() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("\nLutfen Birseyler yaziniz");
        String userData=klavye.nextLine();
        String allDateUserData=userDateFormatter().concat(" "+userData);
        return allDateUserData;
    }

    //fileWriter
    private static void fileWriter() throws _032_HamitMizrak {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH, true))) {
            bufferedWriter.write("\n" + writeUser());
            bufferedWriter.flush();
        } catch (IOException io) {
            io.printStackTrace();
        } catch (Exception e) {
            throw new _032_HamitMizrak(" IO Hatası: " + e);
        }
    }

    //fileReader
    private static void fileReader() throws _032_HamitMizrak {
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(PATH))){
            StringBuilder builder=new StringBuilder();
            String rows="";
            while( (rows=bufferedReader.readLine())!=null   ){
                builder.append(rows).append(" ");
            }
            String datatoString=builder.toString();
            log.info(datatoString);
        }catch (IOException io) {
            io.printStackTrace();
        } catch (Exception e) {
            throw new _032_HamitMizrak(" IO Hatası: " + e);
        }
    }

    public static void chooiseFile() throws _032_HamitMizrak {
        while(true){
            System.out.println("\nLutfen Seciminizi Yapiniz\n1-)Yazma\n2-)Okuma\n3-)Cikis");
            int chooise=klavye.nextInt();
            switch (chooise){
                case 1:
                    fileWriter();
                    break;

                case 2:
                    fileReader();
                    break;

                case 3:
                    System.out.println("Sistemden Çıkış yapılıyor");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lutfen doğru seçim yapınız");
                    break;
            }
        }
    }

    public static void main(String[] args) throws _032_HamitMizrak {
        chooiseFile();

    }
}