fun main(args: Array<String>) {
 println("Enter option")
    var option:Int = readln()!!.toInt()

    when (option){
        0-> println("Sh20=1GB for 1hr")
        1-> println("Data Deals")
        2-> println("Daily Bundles")
        3-> println("Weekly Bundles")
        4-> println("GO Monthly")
        5-> println("No Expiry")
        6-> println("Video Bundles")
        7-> println("Okoa Bundles")
        8-> println("Lipa Mdogo")
        9-> println("Data Plus NEW")
        10-> println("Hot Minutes")

        else-> println("Invalid Option")
    }
}