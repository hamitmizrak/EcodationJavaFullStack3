//alert("deneme") => single comment
/* 
multiple comment
*/

//variable(değişken)
//var dinamik bir değişkendir.
// var kalem = "dijital kalem";
// console.log(kalem)

// //değişken tanımlamak
// var x1 = 44;
// var x2 = 16;
// var x3 = x1 + x2;
// console.log(x3)

// //değişken tanımlamak (readibility)
// var x4 = 44, x5 = 16, x6;
// x6 = x4 + x5;
// console.log(x6)

// //variable information => white space
// var temp = 55;
// console.log(temp)

// console.log("***************")
// //whoisting: önce değeri yaz sonra veri türünü yaz
// deneme=66+14;
// var deneme;
// console.log(deneme)

// console.log("***************")

// //variable data type
// var kelime=44; //sayıdır
// kelime="merhabalar"; //string
// kelime=true; //boolean
// console.log(kelime)

// console.log("***************")

// //variable typeof: türü ne ?
// var kelime=44; //sayıdır
// console.log(typeof kelime)
// kelime="merhabalar"; //string
// console.log(typeof kelime)
// kelime=true; //boolean
// console.log(typeof kelime)

// console.log("***************")


// //Çıktı
// console.log("Console : console.log");
// console.warn("Console : console.warn");
// console.error("Console : console.error");
// console.info("Console : console.info");

// //alert
// window.alert(" window.alert");
// alert(" alert");

// //prompt kullanıcıdan veri almak
// var result = prompt("Kullanıdan veri almak için")
// document.write(result + " document.write")

// //variable declaration: değer atamadan sadece değişken oluşturma işlemine denir
// var number;
// console.log(number)

// //variable initialization: ilk değer ataması yapmaya denir.
// //toplama  etkisiz eleman: 0
// //çarpmada etkisiz eleman: 1
// var toplam=0;

// //variable common rules (Syntax rules)
// var degisken="Değişken merhabalar";
// //değişkenlerde:
// //Türkçe karakter olan: üğşçöıİ kullanmayalım
// //değişken isimlerini camelCase kullanalım.
// var degiskenAdiKullanimi="camel case";

// //sonuna sayı yazabiliriz.
// degisken44="Değişken merhabalar";

// //başına sayı yazamayız.
// 44degisken="Değişken merhabalar";

// //başına $ ve _ yazabiliriz.
// $degisken="Değişken merhabalar";
// _degisken="Değişken merhabalar";

// //başına $ ve _ haricinde özel simge yazamayız.
// -+*/#degisken="Değişken merhabalar";

//Operator
// 8 bit = 1 byte
// 1 bit (0,1)

// +  ==> additional
// -  ==> substaction
// *  ==> multiplication
// ** ==> exponentiation(ES6)
// /  ==> division
// %  ==> modules
// ++ ==> increment
// -- ==> deincrement

// logic operator(Mantıksal Operatörler)           ==> &=VE |=VEYA
// mathematics operator (matematiksel operatörler) ==> x**y=x üzerine y,  + - * /=bölüm %=bölümünden kalan
// comparation  operator                           ==> (> >= < <= ! == ===)
// postfix increment                               ==> X++
// postfix deincrement                             ==> X--
// pre increment                                   ==> ++X
// pre deincrement                                 ==> --X

// ! = değil 

// =    ==> ATAMA
// ==   ==> EŞİT (Türe bakmıyor sadece eşitliğe   bakıyor) ==> 4="4" ==> SONUÇ EŞİT
// ===  ==> EŞİT (Türe bakıyor  ve     eşitliğede bakıyor) ==> 4="4" ==> SONUÇ EŞİTDEĞİL

//CAST String() Number()
// var sayi1 = "12";
// console.log(typeof sayi1);
// var sayi2 = 18;
// console.log(typeof sayi2);
// console.log(Number(sayi1) + String(sayi2));

// //kullanıcıdan alınan bir sayının 2 üssü 4^2=16 (prompt, x**2)
// //not: prompt'tan string gelir
// var data1 = Number(prompt("Lütfen bir sayı giriniz"));
// var result = data1 ** 2;
// console.log(result)

//kullanıcıdan alına 2 sayıyı dört işlem yapan algoritma yazınız ?

//undefined
//tanımsız anlamına gelir ve eğer değişkene başlangıç değer vermezsek 
// var result;
// console.log(result)

// //NaN: Not A Number
// // bir sayıyı string'e böldüğümde
// var sayi1 = 14 / "asd";
// console.log(sayi1);

// //infinity:
// //Bir sayıyı sıfıra bölemezsin ve sonsuzdur
// var sayi2 = 12 / 0;
// console.log(sayi2)

// new : hafızdan bir yer açar bizim için
// null: olan hafızayı boşaltır
// zero: sıfır null ile aynı değildir zero hafızda bir yere sahip ancak değeri sıfırdır

//escape character simgesi ==>  \ (back slash)
// single quote ==> Tek Tırnak
// double quote ==> Çift Tırnak
// \t ==> backspace
// \n=new 
//console.log("\"\n\tdeneme")

////////////////////////////////////////////////////////////
//Math: önceden yazılmış matematiksel problemler için kullanıyoruz.

//sabit sayı
console.log("PI:"+Math.PI);
console.log("E:"+Math.E);

//MAth
console.log("en küçüğü:"+Math.min(1,5,-55,96));
console.log("en büyüğü:"+Math.max(1,5,-55,96));
console.log("karekök:"+Math.sqrt(25));
console.log("üslü:"+Math.pow(2,5));
console.log("mutlak:"+Math.abs(-5));

//yuvarlama
console.log("üste yuvarla:"+Math.ceil(2.1));
console.log("aşağı yuvarla:"+Math.floor(2.9));
console.log("üste-aşağı yuvarla:"+Math.round(2.5));

//rastgele sayı ve iç ieç math
console.log("rastgele:"+ Math.round(Math.random()*3+1)  );

//sinus cosinus tan cot
console.log("sin:"+Math.sin(45));
