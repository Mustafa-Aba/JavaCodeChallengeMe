package j100_CodeChallange.P03_sanslıKullanıcı;

import java.time.LocalDateTime;

//task 1. stepp
public class Kullanici {//kullanıcı obj uretecek kalıphane class -> main olmaz

    String name;//obj de değer alacak inst. var.
    LocalDateTime kayitZamani;//obj de değer alacak inst. var.

    public Kullanici(String name, LocalDateTime kayitZamani) {//full p'li teleskopik cons.
        this.name = name;
        this.kayitZamani = kayitZamani;
    }

    @Override
    public String toString() {//bu class'dan olusturulan obj print etmek için obj datalarını string'e cevirir
        return "name='" + name + "', kayıtZamanı= " + kayitZamani;
    }
}
