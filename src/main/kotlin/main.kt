import java.util.Random

// a class to hold data
data class Anime(
    var title: String,
    var studio: String,
    var year: Int
)

// val in kotlin is "final", var can be reassigned
val recommendations = arrayListOf<Anime>()
val r = Random()

fun getRecommendation() : Anime {
    return recommendations[r.nextInt(recommendations.size)]
}

fun main(args: Array<String>) {
    println("Loading Recommendations!")
    recommendations.addAll(listOf(
        Anime("Evangelion", "Gainax", 1995),
        Anime("Puella Magi Madoka Magica", "Shaft", 2011),
        Anime("Boku no Hero Academia", "Bones", 2016),
        Anime("Demon Slayer", "Ufotable", 2019)
    ))
    // we can also mutate a data class with copy
    // recommendations[0] = recommendations[0].copy(title="Evangelion", year=1995)
    // if we use var in data class we can change it
    recommendations[0].title = "FLCL"
    recommendations[0].year += 5
    // kotlin destructuring argument
    val (title, studio, year) = getRecommendation()
    // kotlin println with variables
    println("You should watch: $title ($year)")
}