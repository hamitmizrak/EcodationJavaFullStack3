package com.hamitmizrak.java;

public class _001_WhatIsJava {

    /*

    Java Nedir ?
    ------------------------------------------------------
    Yüksek Seviyeli Bir dildir.
    1999 yılında Sun şirketi tarafından James Gosling ve 13 kişilik takım arkadaşlarıyla "Green Team" ekibini kuruyorlar. Araştırmalara başlıyorlar.
    C/C++ dillerinden miraslar alıyorlar ve bu noktaya kadar geliyorlar
    Java Sürekli kendisini geliştiriyor.
    James Gosling
    Sun Microsystem şirketini olarak kuruldu şimdi Oracle satın aldı.
    Java'nın ilk adı OAK idi. sonrasında önceden böyle bir dil olduğu için değiştirmek zorunda kaldılar. JAva adasında dil ismini bulurken Java kahvesinde
    yudumlama alırken akıllara bu dilin adı Java olsun deniyor.
    Bean : Java Kahve Çekirdeği
    WORA = Write Once Run Anywhere
    Java hem compiler hem interpreter bir dildir.
    Nesne olarak C++ benziyor.
    Gramer(Syntax) olara C diline benziyor.
    C dilindeki pointer yapıların Javada karşılığı referans olarak görüyoruz.
    MultiThreading
    Derleme(compiler) sonra JVM(Java Virtual Machine) devreye giriyor.


    Java neden tercih ediliyor ?
    ------------------------------------------------------
    C++ bellek problemi bulunmuyor (Pointer,Garbarage Collection)
    Nesne Yönelimli bir dil olması (Object Oriented)
    Dinamik bir dildir.



    Java Nelerde kullanabiliriz.
    ------------------------------------------------------
    internet uygulamalarında (JAVA EE =Servlet,JSP,JSTL,JSF,SpringFrameWork, Spring BOOT, SpringMVC,SpringDATA,SpringREST,SpringSECURTIY,SpringCloud)
    Desktop uygulamalarından (Desktop = Applet,AWT,JavaFX)
    Mobil uygulamalarında    (Java SE = Android Studio Code idesiyle Android uygulamalar yapabilirsiniz)
    Embedded uygulamalarda   (Java ME )

    Java Özellikleri ?
    ------------------------------------------------------
    1-) Platformdan Bağımsız (JVM) = Birden fazla işlem sisteminde çalışabilir. Bir kere kod yazıp her işletim sisteminde
    kullanabiliriz.
    2-) Ücretsiz olması
    3-) Nesne Yönelimli bir dildir.
    4-) Esnek bir dildir.
    5-) MultiThreading (Çoklu Processler) aynı anda birden fazla iş yapabilme yeteneğine sahiptir.
    6-) JavaScript: Single Thread
        Java:       Multiple Threading

    7-) Zengin API , Libraries bulunmaktadır.
    8-) Open Source (Açık Kaynak kodludur)
    9-) Kullanılmayan nesneleri bizim yerimize bulup siler (Garbarage Collection ==> System.gc())
    10-) Ücresiz IDE'ler bulunmaktadır. Exam: Netbeans, Eclipse ,intellij IDEA(Community)
    11-) Sahibi şimdi Oracle (Mysql, Java)
    12-) Güvenli Bir dildir.
    13-) Geçmiş sürümlere yönelik kendisini kapatmaz.


        API nedir ?
    -----------------------------------------------------
    Application Programming Interface: uygulamalar arasında yetenek paylaşımı diyebiliriz.

    IDE nedir ?
    -----------------------------------------------------
    Integrated Development Environment Tümleşik Geliştirme Ortamı
    Kod yazarken hatalarımızı görebilmek ,
    hızlı kodlar yazabilmek,
    programlama yeteneğizi IDE ile hatasız kodlar yazmamıza olanak sağlar
    IDE'de zengin Tool yardımıyla (intellisense)

    Editor ile IDE arasındaki farklar ?
    -----------------------------------------------------

    Compiler(Çevirmen)
    -----------------------------------------------------
    Yüksek seviyeli bir dili makinenin anlayacağını alt dillere çevirmesi olayıdır.


    İnterpreter(Yorumlayıcı)
    -----------------------------------------------------
    Compiler sonucunda bir çıktı elde ederiz bu çıktı kaynak kod diyoruz. interpreter bu çıktıyı satır satır  yorumlayarak
    kodun çalışmasına olanak sağlıyor bunuda JVM dediğimiz bir teknolojiyle Cross-Paltform bir yapıya ulaştırıyor.

    BYTE CODE
    -----------------------------------------------------
    Java Kodlarımızı derledik ve derlenme sonrasında makine diline çevrildi bu makine dillerin anlayacğı kod yapılarına BYTE CODE denir.

    JVM
    -----------------------------------------------------
    Bu byte koldar java platformadan bağımsız olmasını sağlayan yapıya JVM denir


    JIT
    -----------------------------------------------------
    JVM içerinsde aslına küçük compiler diyebiliriz. Bu derleyici sadece çalıaşcak byte kodları çalıştırarak sistemin hızlı çalışmasına olanarak sağlar
    jit örneği: SP

    Javac
    -----------------------------------------------------
    java + compiler

    JVM= interpreter,compiler(jit)
    JRE=JVM+API+Libraries
    JDK=JRE+ Debug+Compiler
    JDK > JRE > JVM
    Java compiler edilmiş bir yapıyı sadece çalıştırmak için JVM yeterli.


    Hyphen       ==> Tire (-)
    underscore   ==> Alt Çizgi (_)
    camelCase    ==> ilk kelimenin ilk harfi küçük diğer kelimelerin harfleri büyüktür.
    PascalCase   ==> Bütün kelimlerin ilk harfleri büyüktür.

    API (Application Programming Interface)
    IDE (Integrated Development Environment)
    JIT (Just In Time)

    Java Common Rules
    ------------------------------------------------------
    paket isimleri küçük yazılmalıdır.  Exam: (com.java.product)
    Class isimleri: Pascal Case olarak yazıyoruz.
    Değişken isimleri: camelCase

    // single line comment
       multi line comment
    comment out: yorumalamaya almak
    comment in: yorumlamayı kapatmak

   jar     = Java Archives
   war     = web Archives
   ZIP/WAR = sıkıştırılır.

     */
}
