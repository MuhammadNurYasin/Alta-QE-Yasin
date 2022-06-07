
class Segitiga{
    void luasSegitiga(int alas, int tinggi){
        double luas = 0.5 * alas * tinggi;
        System.out.println("Segitiga: " + luas);
    }
    void kelilingSegitiga(int a, int b, int c){
        double keliling = a + b + c;
        System.out.println("Segitiga: " + keliling);
    }

}

class Persegi{
    void luasPersegi (int sisi){
        double luas = sisi * sisi;
        System.out.println("Persegi: " + luas);
    }
    void kelilingPersegi (int sisi){
        double keliling = 4 * sisi;
        System.out.println("Persegi: " + keliling);
    }
}


class persegiPanjang{
    void luasPersegiPanjang (int panjang, int lebar){
        double luas = panjang * lebar;
        System.out.println("Persegi Panjang: " + luas);
    }
    void kelilingPersegiPanjang (int panjang, int lebar){
        double keliling = 2 * (panjang + lebar);
        System.out.println("Persegi Panjang: " + keliling);
    }
}

public class LuasdanKeliling {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        Persegi persegi = new Persegi();
        persegiPanjang persegipanjang = new persegiPanjang();

        System.out.println("Luas");

        segitiga.luasSegitiga(3,4);
        persegi.luasPersegi(4);
        persegipanjang.luasPersegiPanjang(7,8);

        System.out.println("");

        System.out.println("Keliling");
        segitiga.kelilingSegitiga(3,4,5);
        persegi.kelilingPersegi(4);
        persegipanjang.kelilingPersegiPanjang(7,8);
    }
}





