
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="template/js/jquery-3.4.1.min.js" type="text/javascript"></script>

    <link href="template/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="template/bootstrap/css/bootstrap-reboot.min.css" rel="stylesheet" type="text/css"/>
    <link href="template/bootstrap/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
    <title>JSP Page</title>
    <style>
        .a1{
            text-align: justify;
        }
        .container{
            background-color:  #c67d87 ;
            margin : 7rem ;
        }
        body{
            background-color:  #c66370;
        }
    </style>
</head>
<body>
<div class="container">
    <h1 style="margin: 3rem; text-align: center ; color: #7a545a ; ">HOŞGELDİNİZ</h1>
    <div class="row" style="background-color: #bfabae ;">
        <div class="col-5  col-sm-5 col-md-3 col-lg-3 col-xl-3" style="font-size:20px;">

            <jsp:useBean id="ilk" scope="session" class="veri.Kisi" />
            <jsp:setProperty name="ilk" property="isim"  />
            <jsp:setProperty name="ilk" property="sifre"  />
            Merhaba;

         
            
            <br>
            
            <jsp:getProperty name="ilk" property="isim"  />
            
            <jsp:getProperty name="ilk" property="sifre"  />
            
            <br>
            
            Sisteme hoşgeldin.</div>
            
        <div class="col-7 col-sm-7 col-md-9 col-lg-9 col-xl-9">

            <p id="a1">
                Bu kurs web tasarım konusuna merakı olan, bu konuda kendini geliştirmek isteyen bireylere eğitici bir çalışma kaynağı oluşturmak amacıyla hazırlanmıştır. 

                Konu anlatımı bütünden parçalara bölünerek videoların süreleri azaltılmış, konunun daha anlaşılır ve net olması hedeflenmiştir. Böylelikle aradığınız konuları kısa videolar içinde kolaylıkla bulabileceksiniz. 

                Kursumuzda sesli anlatımın yanı sıra altyazı seçenekleri de bulunmaktadır. Bazı sorunlardan dolayı sesi açamadığınızda ya da işitmede sorun yaşadığınızda altyazı seçeneğini açarak derslerimizi izleyebilirsiniz.

                Öğrenecekleriniz
                Bootstrap 4'ün tüm özelliklerini öğrenmiş olacaksınız.
                Ekran boyutuna duyarlı (Responsive) web sayfaları oluşturabileceksiniz.
                Tüm platformlarla ve güncel tarayıcılarla uyumlu web sayfaları oluşturabileceksiniz.
                Hayalinizdeki web sayfası tasarımını Bootstrap 4 ile hayata geçirebileceksiniz.
                Bootstrap 4'ü kendi ihtiyaçlarınıza göre özelleştirebileceksiniz.
                Kurs gereksinimleri veya ön koşulları var mı?
                Temel seviyede HTML, CSS ve JavaScript bilginizin olması önerilir.
                Bootstrap hakkında herhangi bir bilginizin olmasına gerek YOKTUR.
                Bu kurs kimler için uygun:
                Web tasarım alanında kendini geliştirmek isteyen, bu alana ilgi duyan ya da bu sektörde kariyer planlayan herkes
                Bootstrap 4'ü tüm hatlarıyla öğrenerek profesyonel web sayfaları oluşturmak isteyen herkes</p>
        </div>
    </div>
</div>
</body>
<script src="template/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="template/bootstrap/js/bootstrap.bundle.min.js" type="text/javascript"></script>
</html>
