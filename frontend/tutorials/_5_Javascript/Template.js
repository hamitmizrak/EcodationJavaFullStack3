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


//variable common rules