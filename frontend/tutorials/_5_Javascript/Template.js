//alert("deneme") => single comment
/* 
multiple comment
*/

//variable(değişken)
//var dinamik bir değişkendir.
var kalem = "dijital kalem";
console.log(kalem)

//değişken tanımlamak
var x1 = 44;
var x2 = 16;
var x3 = x1 + x2;
console.log(x3)

//değişken tanımlamak (readibility)
var x4 = 44, x5 = 16, x6;
x6 = x4 + x5;
console.log(x6)

//variable information => white space
var temp = 55;
console.log(temp)

console.log("***************")
//whoisting: önce değeri yaz sonra veri türünü yaz
deneme=66+14;
var deneme;
console.log(deneme)

console.log("***************")

//variable data type
var kelime=44; //sayıdır
kelime="merhabalar"; //string
kelime=true; //boolean
console.log(kelime)

console.log("***************")

//variable typeof: türü ne ?
var kelime=44; //sayıdır
console.log(typeof kelime)
kelime="merhabalar"; //string
console.log(typeof kelime)
kelime=true; //boolean
console.log(typeof kelime)

console.log("***************")

//Çıktı
console.log("Console : console.log");
console.warn("Console : console.warn");
console.error("Console : console.error");
console.info("Console : console.info");

//alert
window.alert(" window.alert");
alert(" alert");

//prompt kullanıcıdan veri almak
var result = prompt("Kullanıdan veri almak için")
document.write(result + " document.write")

//variable declaration: değer atamadan sadece değişken oluşturma işlemine denir
var number;
console.log(number)

//variable initialization: ilk değer ataması yapmaya denir.
//toplama  etkisiz eleman: 0
//çarpmada etkisiz eleman: 1
var toplam=0;

//variable common rules (Syntax rules)
var degisken="Değişken merhabalar";
//değişkenlerde:
//Türkçe karakter olan: üğşçöıİ kullanmayalım 
//değişken isimlerini camelCase kullanalım.
var degiskenAdiKullanimi="camel case";

//sonuna sayı yazabiliriz.
degisken44="Değişken merhabalar";

//başına sayı yazamayız.
44degisken="Değişken merhabalar";

//başına $ ve _ yazabiliriz.
$degisken="Değişken merhabalar";
_degisken="Değişken merhabalar";

//başına $ ve _ haricinde özel simge yazamayız.
-+*/#degisken="Değişken merhabalar";


