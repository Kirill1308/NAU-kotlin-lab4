import org.w3c.dom.Document
import org.w3c.dom.Element
import java.io.File
import javax.xml.parsers.DocumentBuilderFactory

/**
 * ResourceManager - A utility class to load and manage Android-like resources
 * This demonstrates resource loading and localization concepts from Android
 */
class ResourceManager(private val locale: String = LOCALE_UKRAINIAN) {
    
    companion object {
        const val LOCALE_UKRAINIAN = "uk"
        const val LOCALE_ENGLISH = "en"
        private const val RESOURCES_PATH = "res"
    }
    
    private val strings = mutableMapOf<String, String>()
    private val colors = mutableMapOf<String, String>()
    
    init {
        loadStrings()
        loadColors()
    }
    
    /**
     * Load string resources based on locale
     */
    private fun loadStrings() {
        val stringsFile = when (locale) {
            LOCALE_ENGLISH -> File("$RESOURCES_PATH/values-en/strings.xml")
            else -> File("$RESOURCES_PATH/values/strings.xml")
        }
        
        if (stringsFile.exists()) {
            val doc = parseXml(stringsFile)
            val stringElements = doc.getElementsByTagName("string")
            
            for (i in 0 until stringElements.length) {
                val element = stringElements.item(i) as Element
                val name = element.getAttribute("name")
                val value = element.textContent
                strings[name] = value
            }
        }
    }
    
    /**
     * Load color resources
     */
    private fun loadColors() {
        val colorsFile = File("$RESOURCES_PATH/values/colors.xml")
        
        if (colorsFile.exists()) {
            val doc = parseXml(colorsFile)
            val colorElements = doc.getElementsByTagName("color")
            
            for (i in 0 until colorElements.length) {
                val element = colorElements.item(i) as Element
                val name = element.getAttribute("name")
                val value = element.textContent
                colors[name] = value
            }
        }
    }
    
    /**
     * Parse XML file
     */
    private fun parseXml(file: File): Document {
        return try {
            val factory = DocumentBuilderFactory.newInstance()
            val builder = factory.newDocumentBuilder()
            builder.parse(file)
        } catch (e: Exception) {
            throw IllegalStateException("Failed to parse XML file: ${file.name}", e)
        }
    }
    
    /**
     * Get string resource by name
     */
    fun getString(name: String): String {
        return strings[name] ?: "Resource not found: $name"
    }
    
    /**
     * Get color resource by name
     */
    fun getColor(name: String): String {
        return colors[name] ?: "#000000"
    }
    
    /**
     * Display all loaded resources
     */
    fun displayResources() {
        println("\n========================================")
        println("  ${getString("app_name")}")
        println("========================================\n")
        
        println("${getString("greeting")}!")
        println("${getString("surname")}")
        println("\n${getString("full_name")}")
        
        println("\n----------------------------------------")
        println("${getString("country")}")
        println("----------------------------------------")
        
        println("\n📍 ${getString("flag")}")
        println("   Colors: ${getColor("ukraine_blue")} (Blue), ${getColor("ukraine_yellow")} (Yellow)")
        
        println("\n🛡️  ${getString("coat_of_arms")}")
        println("   Represented by: coat_of_arms_shape.xml")
        
        println("\n----------------------------------------")
        println("Locale: ${if (locale == LOCALE_ENGLISH) "English" else "Українська"}")
        println("----------------------------------------\n")
    }
    
    /**
     * List available drawable resources
     */
    fun listDrawables() {
        println("Available Drawable Resources:")
        val drawableDir = File("$RESOURCES_PATH/drawable")
        if (drawableDir.exists()) {
            drawableDir.listFiles()?.forEach { file ->
                if (file.extension == "xml") {
                    println("  - ${file.nameWithoutExtension}")
                }
            }
        }
    }
}
