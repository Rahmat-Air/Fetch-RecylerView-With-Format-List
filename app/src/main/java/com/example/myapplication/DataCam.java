package com.example.myapplication;

import android.os.Parcel;

import com.example.myapplication.model.Kamera;

import java.util.ArrayList;

public class DataCam {

    private static String[] nama_kamera = {
            "Kamera Saku",
            "Kamera Mirrorless",
            "Kamera Prosumer",
            "Kamera DSLR",
            "Kamera Bridge",
            "Kamera Boutique",
            "Kamera Polaroid",
            "Kamera Aksi",
            "Kamera SmarthPhone",
            "Kamera Medium"
    };

    private static String[] desk_kamera = {

            "Kamera jenis ini merupakan kamera digital paling simpel dan sederhana. Dengan ukurannya yang tidak terlalu besar dan pas di kantong atau biasa disebut kamera saku, menjadikan kamera ini banyak dipilih untuk pengguna yang membutuhkan kamera simpel sekedar untuk mendapatkan foto saja.",
            "Kamera mirrorless adalah kamera yang tidak memiliki cermin dari jendela bidik optic (viewfinder) seperti kamera DSLR, namun kualitas gambar yang dihasilkan setara karena image sensor yang digunakan sama besar.",
            "Kamera Prosumer adalah sebuah kamera hasil perpaduan dari kamera DSLR dan juga kamera saku. Perpaduan jenis-jenis kamera DSLR dan kamera pocket terdapat pada bentuk kamera Prosumer yang mirip DSLR namun lebih kecil.",
            "DSLR adalah singkatan dari Digital Single Lens Reflex. Dalam bahasa yang lebih sederhana dapat diartikan bahwa ini adalah jenis kamera lensa tunggal yang memanfaatkan cermin untuk mengarahkan cahaya dari lensa ke viewfinder. Viewfinder (jendela bidik) adalah lubang kecil dibelakang kamera tempat kita mengintip objek foto.",
            "Jenis kamera Digital Prosumer atau disebut juga Bridge CDC (Compact Digital Camera). Kamera ini disebut bridge karena memiliki fungsi untuk menjembatani pngguna kamera saku untuk mendapatkan fitur dan kualitas foto yang lebih baik. Kualitas kamera jenis ini berada diantara kamera pocket/kamera saku dengan kamera professional (DSLR).",
            "Jika kita lihat secara sekilas, Boutique Camera tidak lebih besar dari sebuah kamera. Jika ditelaah dan diperhatikan lebih dalam dan seksama, ternyata tidak salah jika kamera digital ini diembel-embeli kata butik di depannya mengingat tampilannya yang stylish dan elegant.",
            "Kamera polaroid ini menggunakan film khusus yang dinamakan sebagai film polaroid. Film polaroid yang dapat menghasilkan gambar berwarna dinamakan sebagai film polacolor.",
            "Kamera aksi ini biasanya lebih banyak digunakan untuk merekam video ketimbang foto. Dengan bentuknya yang portable, dan berukuran lebih kecil dari kamera saku membuatnya mudah dipasang dimana saja termasuk di atas kendaraan atau di atas helm.",
            "Kamera smartphone adalah kamera yang sudah ada saat kita membeli smartphone tersebut.Saat ini smartphone sudah memliki bermacam-macam pixel sesuai dengan spesifikasinya.",
            "Kamera medium format merupakan kamera yang menggunakan roll film. Besarnya format fil pada kamera ini ditentukan oleh panjang foto yang direkam diatas kamera."
    };



    private static int[] gambar_kamera = {
            R.drawable.kamera_saku,
            R.drawable.kamera_mirrorless,
            R.drawable.kamera_prosumer,
            R.drawable.kamera_dslr,
            R.drawable.kamera_bridge,
            R.drawable.kamera_boutique,
            R.drawable.kamera_polaroid,
            R.drawable.kamera_aksi,
            R.drawable.kamera_hp,
            R.drawable.kamera_medium
    };

    static ArrayList<Kamera> getListData() {
        ArrayList<Kamera> list = new ArrayList<>();
        for (int position = 0; position < nama_kamera.length ; position++) {
            Kamera kamera = new Kamera();
            kamera.setJenis(nama_kamera[position]);
            kamera.setDesk(desk_kamera[position]);
            kamera.setGambar(gambar_kamera[position]);
            list.add(kamera);
        }
        return list;
    }
}

