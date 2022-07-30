$(function () {
  $(document).keydown(function (tus) {
    //alert(tus);
    //console.log(tus);
    //document.writeln(tus.keyCode);
    tus.preventDefault();
    if (tus.ctrlKey) {
      if ((tus.keyCode == 66)) {
        alert("siz Ctrl+b bastınız");
      }
    }
  });
});
