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

console.log()
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
function retursuzParametresiz() {
  console.log("1-retursuz parametresiz function");
}
retursuzParametresiz();

//2-) returnsuz Parametreli Function
function retursuzParametreli(data) {
  console.log("2-retursuz parametreli function " + data);
}
retursuzParametreli("Hamit");

//3-) returnlu Parametresiz Function
function returluParametresiz() {
  return "3-returnlu parametresiz function";
}
let result3=returluParametresiz();
console.log(result3)

//4-) returnlu Parametreli Function
function returluParametreli(nameData,surnameData) {
  return "4-returnlu parametreli function: "+nameData+" "+surnameData;
}
let result4=returluParametreli("Hamit","Mızrak");
console.log(result4)

