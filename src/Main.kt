/**
 * Lab 4: Android Resources and Localization
 * Author: Попов Кирил Олександрович
 * 
 * This program demonstrates:
 * 1. Creating custom styles for text display
 * 2. Creating drawable XML resources with graphic figures
 * 3. Implementing localization (Ukrainian/English)
 * 4. Displaying national symbols (flag and coat of arms)
 */

fun main() {
    println("===========================================")
    println("Lab 4: Ресурси і Локалізація в Android")
    println("===========================================\n")
    
    // Demonstrate Ukrainian localization (default)
    println(">>> UKRAINIAN VERSION (Default)")
    val ukrainianResources = ResourceManager(ResourceManager.LOCALE_UKRAINIAN)
    ukrainianResources.displayResources()
    
    println("\n>>> DRAWABLE RESOURCES")
    ukrainianResources.listDrawables()
    
    // Demonstrate English localization
    println("\n\n>>> ENGLISH VERSION")
    val englishResources = ResourceManager(ResourceManager.LOCALE_ENGLISH)
    englishResources.displayResources()
    
    println("\n>>> DRAWABLE RESOURCES")
    englishResources.listDrawables()
    
    // Display information about styles
    println("\n\n>>> AVAILABLE STYLES (from styles.xml)")
    println("  1. SurnameTextStyle - For displaying surname")
    println("     - textSize: 24sp")
    println("     - textColor: primary_text (#212121)")
    println("     - textStyle: bold")
    println("     - padding: 16dp")
    println("     - gravity: center")
    
    println("\n  2. GreetingTextStyle - For greeting messages")
    println("     - textSize: 18sp")
    println("     - textColor: secondary_text (#757575)")
    println("     - textStyle: normal")
    println("     - padding: 8dp")
    
    println("\n  3. SymbolTextStyle - For flag/emblem descriptions")
    println("     - textSize: 16sp")
    println("     - textColor: accent_color (#FF4081)")
    println("     - textStyle: italic")
    println("     - padding: 12dp")
    
    println("\n===========================================")
    println("All requirements completed successfully!")
    println("===========================================")
}