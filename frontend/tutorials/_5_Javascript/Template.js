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

// //sabit sayı
// console.log("PI:"+Math.PI);
// console.log("E:"+Math.E);

// //Math
// console.log("en küçüğü:"+Math.min(1,5,-55,96));
// console.log("en büyüğü:"+Math.max(1,5,-55,96));
// console.log("karekök:"+Math.sqrt(25));
// console.log("üslü:"+Math.pow(2,5));
// console.log("mutlak:"+Math.abs(-5));

// //yuvarlama
// console.log("üste yuvarla:"+Math.ceil(2.1));
// console.log("aşağı yuvarla:"+Math.floor(2.9));
// console.log("üste-aşağı yuvarla:"+Math.round(2.5));

//rastgele sayı ve iç ieç math
//console.log("rastgele:"+ Math.round(Math.random()*3+1)  );

//sinus cosinus tan cot
//console.log("sin:"+Math.sin(45));

// Math Ödev
// Kullanıcıda tarafından aldığımız 2 tane sayının
// s1-) Bu sayılardan en küçüğü nedir ?
// s2-) Bu sayılardan en büyüğü nedir ?
// s3-) Bu sayılardan en büyüğü karekökü nedir ?
// s4-) Bu sayılardan en büyüğü karekökünün üste yuvarlıyalım nedir ?
// s5-) Bu sayılardan en küçüğü mutlak değeri nedir ?
// s6-) Bu sayılardan en küçüğü alt taban en büyüğü üst taban şeklinde üstünü alalım
console.log()
////////////////////////////////////////////////////////////
//JavaScript : interpreter(Yorumlayıcı)
//SAYILAR
// let sayi1 = 5;
// sayi1=23.44;
// console.log( sayi1);

// //typeof: varible türünü belirtir.
// let sayi2 = 5;
// sayi1=23.44;
// console.log(typeof sayi2);

// //Bilimsel
// const bilimsel=12E-2; //E+2 ==> sayının 2 tane sağına sıfır ekle
// console.log(bilimsel)

// //CAST
// var sayi3=Number(prompt("Lütfen bir sayı giriniz"));

// //infinity
// let sayi4=14/0;
// console.log(sayi4);

// //NaN:Not A Number(Sayı değildir)
// let sayi5=14/"asd";
// console.log(sayi5);

// //isNaN:false dönerse sayıdır
// //it is Not A Number  ==> Bir sayı değildir
// console.log(isNaN(44)) //hayır(false) sayıdır

// //Sayı sistemleri
// //binary (2) => (0-1)
// //octal(8)    => (0-1-2-3-4-5-6-7)
// //decimal(10) => (0-1-2-3-4-5-6-7-8-9)
// //hexadecimal(16) =>(0-1-2-3-4-5-6-7-8-9-a-b-c-d-e-f)
// //2-8-16 tabandan yazılan sayıyı 10 tabana çevirmede

// //2'lik sayıyı 10 tabanda gösterimi
// let binary=0b0101010101;
// console.log(binary)

// //8'lik sayıyı 10 tabanda gösterimi
// let octal=0777;
// console.log(octal)

// //16'lik sayıyı 10 tabanda gösterimi
// //NOT: aA-bB-cC-dD-eE-fF yazabiliriz yani buna non-case sensitive
// let hexadecimal=0xABC;
// console.log(hexadecimal)

//console.log()
////////////////////////////////////////////////////////////
//METİNSEL
//boşluk bir karakterdir
// const metinsel = "Html5 Css3 Bootstrap~Responsive Html5 ";
// console.log("Harf sayısı: " + metinsel.length);
// console.log("Trim Harf sayısı: " + metinsel.trim().length);
// console.log("Hepsi Büyük Harf: " + metinsel.toUpperCase());
// console.log("Hepsi Küçük Harf: " + metinsel.toLowerCase());
// console.log("Başlamak: " + metinsel.startsWith("H"));
// console.log("Bitmek: " + metinsel.endsWith(" "));
// console.log(metinsel.concat("-sona ekle"));

// //substring: sıfırdan başlar
// console.log("parçala: " + metinsel.substring(1));
// console.log("parçala: " + metinsel.substring(0, 4)); //0<=X<=4-1

// //charAt(): sıfırdan başlar
// console.log("Harf: " + metinsel.charAt(1));

//indexOf-lastIndexOf: sıfırdan başlar
//indexOf:soldan arayarak istediğimizi bulursa indis sayısı döndürür
//lastIndexOf:sağdan arayarak istediğimizi bulursa indis sayısı döndürür
// console.log("indexof: " + metinsel.indexOf('Html5'));
// console.log("lastIndexof: " + metinsel.lastIndexOf('Html5'));

// //replace
// const yeniMetinsel = "değiştirdim ";
// console.log("replace: " + metinsel.replace(metinsel,yeniMetinsel));


//ÖDEV
// kullanıcı tarafından girilen bir kelimenin
//S-1) Kaç karakterlidir ?
//S-2) boşluklar alınarak Kaç karakterlidir ?
//S-3) bütün kelimeyi küçük harfle göstermek ?
//S-4) bütün kelimeyi büyük harfle göstermek ?
//S-5) ilk harf nedir  ?
//S-6) girdiğiniz kelime java ile başlıyor mu  ?
//S-7) girdiğiniz kelimenin sonuna "-ben js öğreniyorum"   ?
//S-8) girdiğiniz 0 ile 4 arasındaki indexi ekranda gösterin   ?
//S-9) Kullanıcıdan alınan başka bir kelimeyle birinci olan kelimeyle yer değiştirmek ?

//CAST:
//let metin = String(44);

//JSON
// {"adı":"Hamit", "soyadı":"Mızrak"}
//Buradaki adı ve soyadını birleştirip ekranda gösterelim ? (subString)

//Örnek
/*
const jsonData ={
    "adı":"Hamit",
    "soyadı":"Mızrak"
  }

//1-) static  Gösterim
const staticData= "{\"adı\":\"Hamit\", \"soyadı\":\"Mızrak\"}";
const nameData=staticData.substring(8,13)
console.log(nameData)
const surnameData=staticData.substring(26,26+6)
console.log(surnameData)

console.log("************************")

//2-) static  Gösterim
const staticData2= "{\"adı\":\"Hamit\", \"soyadı\":\"Mızrak\"}";
const nameData2=staticData2.substring(staticData2.indexOf("Hamit"),13)
console.log(nameData2)
const surnameData2=staticData2.substring(staticData2.indexOf("Mızrak"),26+6)
console.log(surnameData2)

console.log("************************")

//3-) dinamic Gösterim
//JSON ==> String'e çevirmek
let dynamics=JSON.stringify(jsonData);
console.log(dynamics)

let parse=JSON.parse(JSON.stringify(jsonData));

const nameDynamic1=parse.adı;
console.log(nameDynamic1)

const nameDynamic2=parse.soyadı;
console.log(nameDynamic2)
*/


/////////////////////////////////////
//Function:
// sürekli aynı yazdımız kod tekrarını önlemek,
// clean code mantığında ilerlememize olanak sağlar.

//yazım şekli
//1-) retursuz Parametresiz Function
// function retursuzParametresiz() {
//   console.log("1-retursuz parametresiz function");
// }
// retursuzParametresiz();

// //2-) returnsuz Parametreli Function
// function retursuzParametreli(data) {
//   console.log("2-retursuz parametreli function " + data);
// }
// retursuzParametreli("Hamit");

// //3-) returnlu Parametresiz Function
// function returluParametresiz() {
//   return "3-returnlu parametresiz function";
// }
// let result3=returluParametresiz();
// console.log(result3)
// ///////////////////////////////////////////////////////////////////////
// //4-) returnlu Parametreli Function
// //Normal Function
// function returluParametreli(nameData,surnameData) {
//   return "4-returnlu parametreli function: "+nameData+" "+surnameData;
// }
// let result4=returluParametreli("Hamit","Mızrak");
// console.log(result4)

// //ES5 (Anonymous Function)
// let anonymousFunction = function (nameData, surnameData) {
//   return "5-anonymous fonksiyon : " + nameData + " " + surnameData;
// }
// let result5 = anonymousFunction("Hamit", "Mızrak");
// //console.log(result5)

// //ES6 Arrow Function
// let arrowFunction =  (nameData, surnameData)=> {
//   return "6-arrow function  : " + nameData + " " + surnameData;
// }
// let result6 = arrowFunction("Hamit", "Mızrak");
// //console.log(result6)

// //return olmayan function olmalıdır.
// //Immediate Function
// (function () {
//   console.log('7-Immediate Function Anonymous')
// })();

// //Immediate Function
// ( ()=> {
//   console.log('8-Immediate Function Arrow Function')
// })();

/////////////////////////////////////////////////////////
//JavaScript: Senkrondur (Aynı anda sadece 1 tane iş yapar) şeklinde çalışır Single Thread

//senkron: bir işlem biter diğerine geçer. Sırayla çalışır.
//Asenkron aynı anda birden fazla process(iş) demektir
//JavaScript Asenkron çalışabilmesi için şunları yapabiliriz.
//1-)basic Asenkron-Senkron
//2-)callBack function
//3-)setTimeOut() ==> function istediğimiz zaman aralığında çalışmasını sağlarız.
//4-)promise
//5-)async await

///////////////////////////////////
//Asenkron çözümümüz
//1-)basic Asenkron-Senkron :
//Kullanıcıdan alınan sayının karekökü
// function birinci(number) {
//   console.log("birinci function")
//   console.log(Math.sqrt(number))
// }

// function ikinci() {
//   const userData = Math.round(Math.abs(Number(prompt("Lütfen bir sayı giriniz"))));
//   console.log("ikinci function");
//   birinci(userData);
// }
// ikinci();

// ///////////////////////////////////

// //2-) CallBackFunction
// //Kullanıcıdan alınan sayının karekökü
// function birinci(number) {
//   console.log("birinci function")
//   console.log(Math.sqrt(number))
// }

// function ikinci(callback) {
//   const userData = Math.round(Math.abs(Number(prompt("Lütfen bir sayı giriniz"))));
//   console.log("ikinci function");
//   callback(userData);
// }
// ikinci(birinci);

// ////////////////////////////////////


// //2-)setTimeOut(Body,timerMS)
// //1000ms = 1sn
// //2.1-)Normal setTimeOut
// function setTimeOutFunction() {
//   console.log("Normal setTimeOut")
// }
// setTimeout(setTimeOutFunction, 3000);

// //2.2-)Anonymous function setTimeOut
// setTimeout(function () {
//   console.log("Anonymous function setTimeOut")
// }, 2000);

// //2.3-)Arrow function setTimeOut
// setTimeout(() => {
//   console.log("Arrow function setTimeOut")
// }, 3000);

///////////////////////////////////

//conditional (Karar mekanizması):
//if else (sadece 2 seçeneğimiz varsa)
// eğer veriler arasında karar vermek zorunda kalırsa yani birden fazla yol var ama hangisine gideceğini bilmiyorsam
// if (3 > 1) {
//   //Eğer şart doğruysa bu scope
// } else {
//   //Değilse  bu scope
// }

// //verdiğimiz String sayıya ve pozitif bir sayı olsun
// function stringToNumberPositive(number) {
//   return Math.abs(Number(number));
// }

// const number = stringToNumberPositive(16);
// //1.Gösterim
// if (number > 10) {
//   console.log(number + " sayısı 10'dan büyüktür")
// } else {
//   console.log(number + " sayısı 10'dan küçüktür")
// }

// //2.Gösterim
// if (number > 10)
//   console.log(number + " sayısı 10'dan büyüktür")
// else
//   console.log(number + " sayısı 10'dan küçüktür")

// //3.Gösterim (Ternary)
// let result = (number > 10) ? number + " sayısı 10'dan büyüktür" : number + " sayısı 10'dan küçüktür";
// console.log(result)
//////////////////////////////////////////////
//conditional (Karar mekanizması):
//if elseif() ... else (seçeneğimiz 2'den fazla ise)
// eğer veriler arasında karar vermek zorunda kalırsa yani birden fazla yol var ama hangisine gideceğini bilmiyorsam

// //if else if() else
// const hours = new Date().getHours();
// if (hours == 5) {
//   console.log("saat: 5")
// } else if (hours == 6) {
//   console.log("saat: 6")
// } else if (hours == 7) {
//   console.log("saat: 7")
// } else if (hours == 8) {
//   console.log("saat: 8")
// } else if (hours == 9) {
//   console.log("saat: 9")
// } else if (hours == 10) {
//   console.log("saat: 10")
// } else {
//   console.log("saat dışında bir rakam girildi")
// }

// //switch-case:okunabilirliği daha iyidir
// switch (hours) {
//   case 5:
//     console.log("saat: 5")
//     break;
//   case 6:
//     console.log("saat: 6")
//     break;
//   case 7:
//     console.log("saat: 7")
//     break;
//   case 8:
//     console.log("saat: 8")
//     break;
//   case 9:
//     console.log("saat: 9")
//     break;
//   case 10:
//     console.log("saat: 10")
//     break;

//   default:
//     console.log("saat dışında bir rakam girildi")
//     break;
// }

///////////////////////////////////////////////////////////////////
//Loop: Sürekli kendini tekrar eden verilerde kolaylıkla sağlaması için kullanılır.

// console.log("********iterative for************")
// //1-) iterative for loop
// for (let i = 1; i <= 5; i++) {
//   console.log(i)
// }

// //sonsuz for döngüsü
// //for(;;){}
// console.log("********While************")

// //2-) while loop
// let k = 1;
// while (k <= 5) {
//   console.log(k)
//   k++;
// }
// //sonsuz while döngüsü
// //while(true){}

// console.log("********Do-While************")

// //3-) do-while loop: şart sağlansın yada sağlanmasın en az 1 kez çalışır.
// let m = 1;
// do {
//   console.log(m)
//   m++;
// }
// while (m <= 5);

///////////////////////////////////////////////////////////////////
//return  : metotun çalışmasını durdurur
//break   : döngünün çalışmasını durdurur
//continue: sadece 1 kereye mahsus durur sonra devam eder.

//SORU
//1 ile Kullanıcı tarafından alın bitiş sayısına kadar toplama yapan örneğimiz
// Örnek: 1<=user<=10 1+2+3+4+5+6+7+8+9+10
// Bu sayılardan 7 sayıyı varsa bunu toplayama dahil etmesin (continue)
// bu sayılar en fazla 15 kadar olabilir (break)
// bu sayılardan çift olanların kaç tane ve toplamları nedir ?
// bu sayılardan tek olanların kaç tane ve toplamları nedir ?
// secret-Key kullanıcı eğer 44 girerse hiç bir işlem yapmadan sistemden çıkış sağlansın onunda haricinde sürekli işlem yapsın
// Dikkat: fonksiyonlar ile yapalım (Clean code kuralları çercevesinde ) algoritma yapan program?

//user Data
let number = () => {
  const number = Math.abs(Number(prompt("Lütfen bitiş sayısı giriniz")));
  return number;
}

//result
const statementData = function (data) {
  let oddCounter = 0, oddSum = 0, evenCounter = 0, evenSum = 0;
  let sum = 0;
  for (let i = 1; i <= data; i++) {

    //15 üstünde çalışmasın
    if (i == 15)
      break;

    //7 dahil etme
    if (i == 7)
      continue;

    //tek çift sayı adeti toplamı
    if (i % 2 == 0) {
      evenCounter++;
      evenSum = evenSum + i;
    } else if (i % 2 == 1) {
      oddCounter++;
      oddSum += i;
    }
    sum += i;
  }
  console.log("toplam:" + sum);
  console.log("Çift sayı adedi:" + evenCounter);
  console.log("Çift sayı toplamı:" + evenSum);
  console.log("Tek sayı adedi:" + oddCounter);
  console.log("Tek sayı toplamı:" + oddSum);
}

//result
let result = () => {
  const data = number();
  if (data == 44) {
    console.log("secret-key girdiniz:" + data);
    return;
  } else {
    statementData(data);
  }
}
//result();

//////////////////////////////////////////////////////
//"use strict" //ES5 göre uyarlıyoruz.


//////////////////////////////////////////////////////

// Date: Tarih bilgisini verir.
// GET
let dateGetTutorials = () => {
  let tarih = new Date();
  //let tarih = new Date().getDay();
  console.log(tarih);
  console.log("GMT:" + tarih.toUTCString());
  console.log("String:" + tarih.toDateString());

  console.log("YIL:" + tarih.getFullYear());
  console.log("AY:" + tarih.getMonth());  //Aylar 0 başlar 
  console.log("Gün:" + tarih.getDay()); //Gün: pazar:0 başlar
  console.log("SAAT:" + tarih.getHours());
  console.log("DAKİKA:" + tarih.getMinutes());
  console.log("SANİYE:" + tarih.getSeconds());
  console.log("MİLİSANİYE:" + tarih.getMilliseconds());
}
//dateGetTutorials();

// SET
let dateSetTutorials = () => {
  //yıl ay gün saat dakika saniye milisaniye
  let tarih1 = new Date(2019, 5, 12, 10, 15, 30, 500);
  console.log("tarih 1: " + tarih1);

  //gün ay yıl
  let tarih2 = new Date("01 12 2015");
  console.log("Tarih 2: " + tarih2);

  //set
  let tarih3 = new Date();
  tarih3.setFullYear(1999);
  tarih3.setMonth(6);
  tarih3.setDate(0);
  tarih3.setHours(23);
  tarih3.setMinutes(59);
  tarih3.setSeconds(59);
  tarih3.setMilliseconds(999);
  console.log("Tarih 3: " + tarih3);

}
dateSetTutorials();