
$(document).ready(function(){
  $(".color").click(function(){
    $(".color").removeClass("border");
    $(this).addClass("border");
  });
    
  $("#daire").click(function(){
    $("#daire").animate({
      left: '800px', 
      height: '200px',
      width: '200px'
    });
  });
  
  $("#kare").click(function(){
    $("#kare").animate({
      right: '200px', 
      height: '200px',
      width: '200px'
    });
  });
  
   $("#kare").dblclick(function(){
    $("#kare").animate({
     
      height: '150px',
      width: '150px'
    });
  });
   $("#daire").dblclick(function(){
    $("#daire").animate({
       
      height: '150px',
      width: '150px'
    });
  });
 
  var obje = null;
$(".color").click(function(){
  var renk = $(this).css("background-color");
  $("#" + obje).css("background-color", renk);
  $("#textbox").val(renk);
});

 $("#daire").click(function(){
    obje = $(this).attr("id");
    $("#aa").show(3000);
  });
  
  
$("#kare").click(function(){
     obje = $(this).attr("id");
    $("#aa").show(3000);
  });
  
 

   

});
 
 