package com.dicoding.firstapp

object KpopsData {
    private val kpopNames = arrayOf(
        "Jeon Wonwoo",
        "Jeong Jaehyun",
        "Kim Mingyu",
        "Kim Namjoon",
        "Kim Taehyung",
        "Lee Heachan",
        "Lee Jeno",
        "Lee Seokmin",
        "Mark Lee",
        "Park Jeongwoo",
        "Park Jimin",
        "So Junghwan"
    )

    private val kpopMakanans = arrayOf(
        "Makanan kesukaan : ayam manis dan pedas. ",
        "Makanan kesukaan : daging babi, buah persik, dan es krim matcha. ",
        "Makanan kesukaan : makanan pedas dan daging. ",
        "Makanan kesukaan : bungeoppang",
        "Makanan kesukaan : japchae dan olahan daging serta sapi, dan waffle. ",
        "Makanan kesukaan : kimchi jigae. ",
        "Makanan kesukaan : jjampong dan sup rumput laut. ",
        "Makanan kesukaan : doenjang jjigae.  ",
        "Makanan kesukaan : bagels, cookies, dan es krim, ayam, kimchi, jajangmyeon. ",
        "Makanan kesukaan : tteokbokki. ",
        "Makanan kesukaan : kimchi jjigae, chahan, bibimbap, korean barbeque. ",
        "Makanan kesukaan : donat. "
    )

    private val kpopHobys = arrayOf(
        "Hobynya Wonwoo saat memiliki waktu luang ialah membaca buku dan bermain games. ",
        "Hobynya Jaehyun saat memiliki waktu luang ialah bermain piano dan juga berolahraga. ",
        "Hobynya Mingyu saat memiliki waktu luang ialah bermain sepakbola dan bahkan ia pernah menjuarai turnamen tingkat nasional. ",
        "Hobynya Namjoon saat memiliki waktu luang ialah membaca buku sehingga menemukan inspirasi untuk membuat lagu. ",
        "Hobynya Taehyung saat memiliki waktu luang ialah bermain video game, menonton film, bernyanyi, serta berolahraga. ",
        "Hobynya Haechan saat memiliki waktu luang ialah memotret member NCT yang lainnya. ",
        "Hobynya Jeno saat memiliki waktu luang ialah memotret dan membuat desain otomotif karena tertarik pada dunia otomotif. ",
        "Hobynya Seokmin saat memiliki waktu luang ialah beristirahat sembari menonton film dan bernyanyi. ",
        "Hobynya Mark saat memiliki waktu luang ialah mendengarkan musik sembari bernyanyi lagu-lagu favoritnya. ",
        "Hobynya Jeongwoo saat memiliki waktu luang ialah memakan es krim varian rasa coklat. ",
        "Hobynya Jimin saat memiliki waktu luang ialah mendengarkan musik, bermain game, menari, serta makan. ",
        "Hobynya Junghwansaat memiliki waktu luang ialah olahraga bela diri taekwondo"
    )

    private val kpopsImages = intArrayOf(
        R.drawable.jeon_wonwoo,
        R.drawable.jeong_jaehyun,
        R.drawable.kim_mingyu,
        R.drawable.kim_namjoon,
        R.drawable.kim_taehyung,
        R.drawable.lee_haechan,
        R.drawable.lee_jeno,
        R.drawable.lee_seokmin,
        R.drawable.mark_lee,
        R.drawable.park_jeongwoo,
        R.drawable.park_jimin,
        R.drawable.so_junghwan
    )

    private val kpopDetails = arrayOf(
        "Wonwoo (원우) (lahir 17 Juli 1996) adalah seorang rapper Korea Selatan di bawah kontrak Pledis Entertainment. " +
                "Ia adalah anggota grup vokal laki-laki SEVENTEEN dan tim hip-hop. " +
                "Ia mempunyai beberapa nama panggilan yang diberikan oleh penggemarnya yakni " +
                "Mr. Beanie, Bag of Luck, Sloth, Gamer, Wonu, Palryong Dancing Machine, Dreamer, Wonugie, GAM3 BO1. " +
                "Di balik sosoknya yang terkesan misterius, tak bisa dipungkiri bahwa Wonwoo SEVENTEEN juga merupakan sosok yang bijaksana. " +
                "Wonwoo juga sering memberikan pesan bijak kepada carat (sebutan untuk fans SEVENTEEN). " +
                "Padahal, di awal kemunculannya, Wonwoo terkenal pendiam dan jarang bicara. " +
                "Wonwoo menyadari bakat yang dia miliki sejak sekolah menengah. " +
                "Dia kemudian memutuskan untuk meninggalkan rumahnya di Changwon untuk mengejar mimpi menjadi idola K-Pop. " +
                "Berkat bakat luar biasa yang dimilikinya, Wonwoo lolos audisi dan mulai menjalani masa training. " +
                "Meski mempunyai bakat luar biasanya, nyatanya Wonwoo tetap mengaku mengalami berbagai kesulitan semasa menjadi trainee. " +
                "Namun kesulitan-kesulitan itu akhirnya berhasil dihadapi Wonwoo. " +
                "Lebih lanjut, menjelaskan bahwa masa trainee menjadi lebih mudah setelah dia berusaha menyesuaikan diri dengan tinggal di asrama dan dengan anggotanya. ",

        "Jeong Yun-o (Hangul: 정윤오; lahir Jeong Jae-hyun (Hangul: 정재현); lahir 14 Februari 1997), " +
                "lebih dikenal dengan nama panggung Jaehyun, adalah penyanyi, penulis lagu, dan aktor asal Korea Selatan. " +
                "Ia paling dikenal sebagai anggota grup vokal pria Korea Selatan NCT dan sub-unitnya, NCT U dan NCT 127. " +
                "Jaehyun memulai debutnya pada April 2016 sebagai anggota unit rotasi NCT U dan menjadi anggota tetap unit NCT 127 pada Juli 2016. " +
                "Ia juga merupakan mantan pembawa acara Inkigayo sejak Oktober 2019 hingga Februari 2021. " +
                "Walaupun lahir dengan nama Jeong Jae-hyun (정재현), Ia kemudian mengganti namanya secara legal menjadi Jeong Yun-o (정윤오). " +
                "Ia pernah tinggal di Connecticut selama 4 tahun."  +
                "Ia menampilkan lagu MAMA oleh EXO saat audisi SM Entertainment. " +
                "Ia juga merupakan mantan pembawa acara Inkigayo sejak Oktober 2019 hingga Februari 2021. " +
                "Jaehyun lahir pada 14 Februari 1997 di Seoul, Korea Selatan. Walaupun lahir dengan nama Jeong Jae-hyun (정재현), Ia kemudian mengganti namanya secara legal menjadi Jeong Yun-o (정윤오). Ia pernah tinggal di Connecticut selama 4 tahun. " +
                "Pada 9 Desember 2013, ia diperkenalkan sebagai anggota pelatihan tim pradebut SMROOKIES. " +
                "Pada 2014, ia berpartisipasi dengan anggota NCT lainnya dalam acara Exo 90:2014, di mana mereka menampilkan beberapa lagu 90an. " +
                "Sejak 21 Januari hingga 1 Juli 2015, ia dan Doyoung menjadi pembawa acara Show Champion. " +
                "Pada Juli 2015, ia dan Ten berkompetisi di Hope Basketball All-Star. " +
                "Pada April 2016, Jaehyun secara resmi debut sebagai anggota NCT, dalam subunit pertama NCT U, dengan singel The 7th Sense dan Without You. " +
                "Pada 10 Juli, ia debut sebagai anggota subunit kedua, NCT 127, dengan album mini NCT#127. ",

        "Mingyu (민규) (lahir 6 April 1997) adalah seorang rapper Korea Selatan di bawah kontrak Pledis Entertainment. " +
                "Ia adalah anggota grup vokal laki-laki SEVENTEEN dan masuk dalam sub unit Hip-Hop. " +
                "Mingyu lahir di Anyang, Gyeonggi-do, Korea Selatan. " +
                "Member SEVENTEEN ini kemudian menempuh pendidikan di SMP Burim, lalu melanjutkannya ke SMA Broadcasting Seoul. " +
                "Mingyu dikenal sebagai salah satu siswa yang aktif di sekolah. " +
                "Ia memiliki hobi bermain sepak bola, dan bahkan pernah meraih juara dalam sebuah turnamen sepak bola tingkat nasional. " +
                "Saat SMA, Mingyu SEVENTEEN juga pernah bergabung dalam band semasa SMA. Kala itu ia berpedan sebagai pemain bass dalam band tersebut. " +
                "Mingyu SEVENTEEN rupanya telah mendapatkan peran sejak usia muda. " +
                "Ia pertama mendapat tawaran dari Pledis Entertainment saat masih duduk di bangku SMP. " +
                "Saat SMA, dirinya mulai menjadi trainee. " +
                "Pada tahun 2015, Mingyu resmi bergabung dengan boyband SEVENTEEN dan merilis single berjudul Adore U. " +
                "Lagu tersebut merupakan salah satu track dalam mini album SEVENTEEN yang berjudul 17 Carat. " +
                "Dalam grup band tersebut, Mingyu SEVENTEEN ditunjuk sebagai lead rapper dan visual dari boyband asuhan Pledis Entertainment. ",

        "Kim Nam-joon (Hangul: 김남준, lahir 12 September 1994)[3] atau lebih dikenal sebagai RM, adalah seorang penyanyi rap dan penulis lagu asal Korea Selatan. " +
                "Ia adalah pemimpin dan penyanyi rap utama dari grup vokal pria, BTS. " +
                "RM telah menulis 200 lagu sepanjang kariernya. " +
                "Karenanya, per September 2022, Korea Music Copyright Association (KOMCA) mendapuk RM sebagai penulis lagu termuda dan kedua dengan kredit terbanyak dalam sejarah asosiasi tersebut. " +
                "Lagu-lagu yang ditulisnya termasuk lagu untuk BTS, lagu-lagu kolaborasinya dengan artis lain, dan dua lagu untuk Glam. " +
                "Pada Desember 2020, RM memulai debutnya dan menempati posisi ketiga di Billboard Hot 100 Songwriters Chart, setelah enam lagu yang ia tulis untuk album BTS bertajuk BE secara bersamaan masuk ke chart Billboard Hot 100. " +
                "Ia memulai debutnya sebagai soloist dengan meluncurkan album solo berjudul Indigo pada tanggal 2 Desember 2022. " +
                "Indigo berisi 10 lagu dan berkolaborasi dengan sejumlah artis yaitu Erykah Badu, Kim Saweol, Paul Blanco, Mahalia, Jo Yujin, Park Jiyun, Colde, Tablo, HONNE dan Anderson.Paak. " +
                "RM menunjukkan ketertarikan yang besar terhadap seni. Pada September 2021, ia menyumbangkan 100 juta won kepada the Overseas Korean Cultural Heritage Foundation untuk hwarots, pakaian tradisional Korea yang biasa dipakai saat Dinasti Goryeo dan Joseon. Tahun 2022, RM menyumbangkan tambahan 100 juta won untuk membuat katalog yang memperkenalkan lukisan Korea. ",

        "Kim Tae-hyung (bahasa Korea: 김태형,[2] lahir 30 Desember 1995) atau lebih dikenal sebagai V adalah seorang penyanyi, penulis lagu, dan pemeran asal Korea Selatan. " +
                "Ia merupakan anggota dari grup vokal pria BTS, yang dikelola oleh Big Hit Music. " +
                "Ia anak tertua dari tiga bersaudara, memiliki dua orang saudara, adik laki-laki dan adik perempuan. " +
                "Pertama kali ingin menjadi penyanyi profesional saat dia mulai memasuki sekolah dasar dan pada sekolah menengah pertama dia bahkan mengikuti les saksofon untuk dapat mewujudkan impiannya. " +
                "V resmi menjadi trainee Big Hit Entertainment setelah berhasil lolos audisi di Daegu. " +
                "Setelah lulus dari Korean Arts High School di 2014, V melanjutkan pendidikannya di Global Cyber University. " +
                "Taehyung bergabung bersama Bangtan Boys pada tahun 2011, namun tidak diperkenalkan ke publik hingga tahun 2013. " +
                "Pada 13 Juni 2013, Taehyung debut sebagai anggota dari Bangtan Boys di Mnet M! Countdown membawakan lagu No More Dream dari album single debut mereka, 2 Cool 4 Skool. " +
                "Lagu pertama yang dia buat dimuat di album The Most Beautiful Moment In Life, Part 1, dia menulis dan memproduseri sendiri lagu berjudul Hold Me Tight. ",

        "Lee Dong-hyuck lebih dikenal dengan nama Haechan (lahir 6 Juni 2000), adalah penyanyi berkebangsaan Korea Selatan. " +
                "Ia merupakan anggota dari boy band asal Korea Selatan, NCT, serta ketiga sub-unitnya, NCT 127, NCT Dream, dan NCT U. " +
                "Haechan lahir pada 6 Juni 2000 di Seoul Ia tinggal di Seoul, Korea Selatan sampai berusia 7 tahun, kemudian pindah ke Jeju, Korea Selatan dan menetap di sana sekitar 5 tahun. " +
                "Lalu pindah ke Seoul, Korea Selatan untuk bergabung dengan SM Entertainment. Haechan melanjutkan pendidikannya di Seoul School of Performing Arts di Seoul. " +
                "7 Juli 2016: Haechan melakukan debut bersama 6 orang lainnya, yakni Taeil, Taeyong, Yuta, Jaehyun, Winwin, dan Mark yang tergabung dalam boyband bernama NCT 127. Mereka melakukan debut dengan lagu Firetruck. " +
                "24 Agustus 2016: Haechan kembali melakukan debut bersama dengan Mark, Renjun, Jeno, Jaemin, Chenle dan Jisung melalui grup NCT Dream. Mereka merilis single pertama mereka berjudul Chewing Gum. " +
                "4 Desember 2020: Haechan berpartisipasi dalam unit project NCT 2020 untuk lagu Resonance. ",

        "Lee Je-no (이제노, lahir 23 April 2000) adalah seorang penyanyi, rapper, penari, dan penulis lagu Korea Selatan yang berada di bawah kontrak SM Entertainment. " +
                "Ia adalah anggota grup vokal laki-laki NCT, sub-unit NCT Dream, serta debut di sub-unit NCT U melalui album NCT 2020 Resonance Pt. 1. " +
                "Jeno lahir di Incheon, Korea Selatan, pada 23 April 2000 dan kemudian besar di Ilsandong-gu, Goyang-si, Gyeonggi. " +
                "Sejak kecil, Jeno merupakan bintang iklan beberapa produk dan terbiasa tampil di televisi. " +
                "Jeno, bersama dengan Lee Tae-yong dan Kang Seul-gi, adalah anggota yang resmi diperkenalkan sebagai SM Rookies untuk pertama kali pada 3 Desember 2013. " +
                "Pada tahun 2014, ia kemudian tampil pada acara Exo 90:2014 bersama Hansol, Johnny, Taeyong, Yuta, Ten, Jaehyun, Mark, Haechan, Jaemin, Jisung. " +
                "Di tahun berikutnya, Jeno, Jaemin, Jisung, Mark, dan Haechan ambil bagian dalam The Mickey Mouse Club dari Disney Channel Korea. " +
                "Ia debut dengan NCT Dream pada tahun 2016 dengan lagu Chewing Gum. ",

        "Lee Seokmin (이석민) (lahir 18 Februari 1997)[1] atau yang lebih dikenal dengan DK atau Dokyeom (도겸) adalah seorang penyanyi Korea Selatan di bawah kontrak Pledis Entertainment. " +
                "Ia adalah anggota grup dan menjadi vokalis utama dalam grup SEVENTEEN, dan leader dari unit BSS bersama dengan Hoshi dan Seungkwan. " +
                "Ia telah menjalani masa trainee 2 tahun 7 bulan. " +
                "Pada 26 Mei 2015, DK debut sebagai idol dalam grup SEVENTEEN. " +
                "Pada 21 Maret 2018, DK menjadi anggota subunit SEVENTEEN bernama BooSeokSoon (BSS). " +
                "Tak sampai di situ, juga dikenal sebagai seorang aktor musikal. " +
                "Artinya, DK tak saja pandai menyanyi dan menari. " +
                "Idol yang berzodiak aquarius ini juga pandai dalam berakting. " +
                "Tahun lalu, DK sempat tampil dalam sebuah drama musikal pertamanya yang berjudul Xcalibur. " +
                "Tak tanggung-tanggung, DK berhasil memukau penontonnya dengan tampil sebagai slaah satu tokoh utama bernama Raja Arthur. ",

        "Mark Lee (lahir 2 Agustus 1999), lebih dikenal dengan nama Mark adalah rapper, dancer, dan penyanyi berkebangsaan Kanada. " +
                "Ia merupakan anggota dari boyband asal Korea Selatan, NCT. " +
                "Mark tergabung dalam 3 sub-unit NCT, yakni NCT U, NCT 127, dan NCT Dream. " +
                "Saat ini ia juga merupakan anggota dari super grup SuperM. " +
                "Mark lahir pada 2 Agustus 1999 di Toronto, Ontario, Kanada, dan tinggal di sana sampai berusia 7 tahun. " +
                "Ia kemudian pindah ke New York, Amerika Serikat dan menetap di sana selama 5 tahun. " +
                "Ia kemudian bersekolah di School of Performing Arts Seoul dan lulus pada tahun 2018. " +
                "Mark bergabung dengan S.M. Entertainment melalui audisi global di Kanada. " +
                "Ia diperkenalkan sebagai anggota SM Rookies pada 2013. " +
                "Pada 4 April 2016, Mark diperkenalkan sebagai anggota termuda dari sub unit pertama NCT, NCT U. " +
                "Pada 4 Juli 2016, ia diperkenalkan sebagai anggota keenam dari sub unit kedua NCT, NCT 127. " +
                "Ia kemudian kembali diperkenalkan sebagai anggota kelima dan pemimpin dari sub-unit ketiga dan termuda NCT, NCT Dream pada 20 Agustus 2016. ",

        "Park Jeong-woo (bahasa Korea: 박정우; lahir 28 September 2004) adalah penyanyi asal Korea Selatan dan juga anggota grup vokal pria Treasure, di bawah asuhan YG Entertainment. " +
                "Ia pertama kali dikenal publik sebagai trainee YG Entertainment melalui program survival YG Treasure Box pada tahun 2018. " +
                "Jeongwoo lahir bertepatan dengan Hari Raya Chuseok pada 28 September 2004 di Iksan, Provinsi Jeolla Utara, Korea Selatan. " +
                "Ia tinggal disana bersama orang tua dan kakak laki-lakinya, lalu pindah ke Seoul saat SMP, dia pindah sekolah dari SMP Iri Yeondeung ke SMP Sunsang. " +
                "Jeongwoo diketahui sebagai siswa yang aktif dan pernah mengikuti program pertukaran pelajar ke Australia. " +
                "Dia adalah seorang siswa di SOPA. Dia mendaftar audisi YG Entertainment saat baru dua hari mengikuti kelas vokal di IB Academy dan langsung diterima sebagai trainee. " +
                "Saat YG Entertainment mengumumkan program survival Treasure Box, Jeongwoo tergabung di Tim C karena usianya yang masih muda dan waktu pelatihannya yang masih singkat. " +
                "Setelah semua anggota TREASURE 7 diperkenalkan di Januari 2019, agensi mengumumkan bahwa mereka akan mengeluarkan grup lain dari hasil seleksi YG Treasure Box yang diberi nama MAGNUM 6, " +
                "beranggotakan 6 orang dengan 3 anggota asal Jepang di dalamnya. " +
                "Kedua grup akan aktif bersama dalam nama TREASURE 13. ",

        "Park Ji-min (bahasa Korea: 박지민,[1] lahir 13 Oktober 1995), atau singkatnya disebut Jimin, adalah seorang penyanyi asal Korea Selatan. " +
                "Ia merupakan anggota dari grup musik BTS, dengan posisi sebagai vokalis dan penari. " +
                "Jimin lahir di Geumsa-dong, Distrik Geumjeong, Busan. " +
                "Jimin lahir di Geumsa-dong, Distrik Geumjeong, Busan, Korea Selatan pada tanggal 13 Oktober 1995. " +
                "Ia merupakan anak pertama dari dua bersaudara. " +
                "Saat SMP, Jimin adalah siswa yang pintar dan selalu menjadi ketua kelas. " +
                "Saat SMA, Jimin masuk Busan Arts High School, mengambil jurusan tari modern dan balet kontemporer. " +
                " Jimin menjadi siswa terbaik karena bakat menari dan nilai akademik yang bagus." +
                "Guru Jimin menyarankan dia ikut audisi K-pop, dia menurutinya, sampai diterima di Big Hit Entertainment. " +
                "Jimin pindah dari Busan ke Seoul dan bersekolah di Korean Arts High School. Di sana ia bertemu Kim Tae-hyung alias V, yang kemudian menjadi teman satu grup di BTS. " +
                "Jimin menjalani masa pelatihan di Big Hit Entertainment kurang dari 1 tahun, sebelum debut dengan BTS pada 13 Juni 2013. " +
                "Jimin merupakan anggota terakhir yang masuk BTS. ",

        "So Jung-hwan (bahasa Korea: 소정환 lahir 18 Februari 2005 di Iksan, Korea Selatan) adalah penyanyi dan penari serta anggota termuda grup TREASURE yang terpilih sebagai anggota ketiga " +
                "dan mendapat posisi pertama dalam posisi tari melalui acara survival YG TREASURE BOX. " +
                "Sebelumnya dia diketahui sebagai aktor dan model cilik serta anggota kelompok taekwondo, K-TIGER. " +
                "Junghwan diperkenalkan pertama kali ke publik sebagai peserta dari Tim C di acara survival YG TREASURE BOX " +
                "dan berhasil masuk ke tim debut pada putaran awal acara setelah kerja kerasnya menarik perhatian Yang Hyun-suk. " +
                "Ia selamat dari eliminasi setelah mengalahkan Lee Inhong dengan membawakan lagu 'I Need a Girl' milik Taeyang. " +
                "Pada putaran final ia dengan mengejutkan diumumkan sebagai anggota ketiga yang akan debut bersama TREASURE berdasarkan posisi pertama dari tim dance. " +
                "So Junghwan debut bersama TREASURE sebagai vokalis dan juga penari utama pada 7 Agustus 2020 dengan lagu utama 'Boy' dari album The First Step: Chapter One. "
    )

    val listData: ArrayList<Kpop>
    get() {
        val list= arrayListOf<Kpop>()
        for (position in kpopNames.indices) {
            val kpop= Kpop()
            kpop.name= kpopNames[position]
            kpop.detail= kpopDetails[position]
            kpop.photo= kpopsImages[position]
            kpop.hoby= kpopHobys[position]
            kpop.makanan= kpopMakanans[position]
            list.add(kpop)
        }
        return list
    }
}