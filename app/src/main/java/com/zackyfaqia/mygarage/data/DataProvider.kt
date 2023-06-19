package com.zackyfaqia.mygarage.data

import com.zackyfaqia.mygarage.R

object DataProvider {
    val car =
        Car(
            1,
            "Nissan GTR-34",
            "Wheel: AWD | Power: 280HP | Top Speed: 249km/h",
            "Varian GT-R tiba pada tahun 1999 menggunakan measin RB26DETT",
            R.drawable.img_skyline
        )

    val carList = listOf(
        car,
        Car(
            2,
            "Toyota Supra",
            "Wheel: RWD | Power: 220HP | Top Speed: 241km/h",
            "Mesin yang digunakan adalah 2JZ-GE atau 2JZ-GTE turbo berkapasitas 3000 cc.",
            R.drawable.img_supra
        ),

        Car(
            3,
            "Mazda RX-7",
            "Wheel: RWD | Power: 236HP | Top Speed: 250km/h",
            "Dengan sistem twin-turbo, 1800rpm dan 4500rpm menghasilkan 8 psi boost.",
            R.drawable.img_rx7
        ),

        Car(
            4,
            "Dodge Charger",
            "Wheel: RWD | Power: 147HP | Top Speed: 241km/h",
            "Mesin V8 5.2 liter standar dan menawarkan mesin HEMI 375 HP atau 425 HP HEMI-",
            R.drawable.img_charger

        ),

        Car(
            5,
            "Subaru Impreza",
            "Wheel: AWD | Power: 280HP | Top Speed: 254km/h",
            "Versi Impreza WRX (World Rally Experimental).",
            R.drawable.img_subaru
        ),

        Car(
            6,
            "Shelby Mustang",
            "Wheel: RWD | Power: 533HP | Top Speed: 249km/h",
            "Dikenal dengan sebutan Cobra, yang cuma diproduksi 35 unit.",
            R.drawable.img_mustang
        ),

        Car(
            7,
            "BMW M3-GTR",
            "Wheel: RWD | Power: 444HP | Top Speed: 285km/h",
            "Merupakan M3 edisi spesial dan terbatas",
            R.drawable.img_m3gtr

        ),

        Car(
            8,
            "Acura NSX",
            "YWheel: RWD | Power: 270HP | Top Speed: 270km/h",
            "Merupakan mobil sport untuk melampaui Ferrari bermesin V8",
            R.drawable.img_nsx
        ),

        Car(
            9,
            "Ford GT",
            "Wheel: RWD | Power: 549HP | Top Speed: 330km/h",
            "Mobil ini dibuat untuk mengalahkan Ferrari di Le Mans 24.",
            R.drawable.img_fgt
        ),

        Car(
            10,
            "Mitsubishi Lancer Evo",
            "Wheel: RWD | Power: 280HP | Top Speed: 245km/h",
            "Dipersenjatai transmisi manual  berteknologi Twin Clutch SST gearbox",
            R.drawable.img_evo
        )
    )
}