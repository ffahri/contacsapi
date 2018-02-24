Ana program ve api/vX diye ayırırsak (x Sürüm numarası) ;
ana programda tabloları belirttiğim domainler ve bu tablo işlemlerini gerçekleştiren repositoriesler bulunmakta.
dış dünya için api/v1 kısmını açıyorum burada yine tablolar bulunuyor ancak burada dış dünyaya vereceğim bilgiler olacağı için
tüm bilgileri vermiyorum. Örneğin kullanıcının password değişkenini tekrar göndermiyorum.
Service ve controller kısmı api/v1 bölümünü mapliyor buradaki isteklere göre "ana programdaki" repolardan gereğini
yapıyor.