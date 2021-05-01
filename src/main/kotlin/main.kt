import java.util.Random

data class Anime(
    val title: String,
    val studio: String,
    val year: Int
)

val recommendations = arrayListOf<Anime>()
val r = Random()

fun getRecommendation() : Anime {
    return recommendations[r.nextInt(recommendations.size)];
}

fun main(args: Array<String>) {
    println("Loading Recommendations!")
    recommendations.addAll(listOf(
        Anime("FLCL", "Gainax", 2000),
        Anime("Puella Magi Madoka Magica", "Shaft", 2011),
        Anime("Boku no Hero Academia", "Bones", 2016),
        Anime("Demon Slayer", "Ufotable", 2019)
    ))
    println("You should watch:\n" + getRecommendation())
}