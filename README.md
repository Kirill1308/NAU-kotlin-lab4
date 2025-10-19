# Lab 4: Android Resources and Localization

**Author:** Попов Кирил Олександрович

## Overview

This laboratory work demonstrates understanding of Android resource management and localization concepts:

1. **Custom Styles** - Creating and applying styles for text display
2. **Drawable Resources** - XML-based graphic figures
3. **Localization** - Supporting Ukrainian and English languages
4. **National Symbols** - Displaying flag and coat of arms

## Project Structure

```
NAU-kotlin-lab4/
├── src/
│   ├── Main.kt              # Main application entry point
│   └── ResourceManager.kt   # Resource loading utility
├── res/
│   ├── values/              # Default resources (Ukrainian)
│   │   ├── strings.xml      # String resources (UA)
│   │   ├── colors.xml       # Color definitions
│   │   └── styles.xml       # Text styles
│   ├── values-en/           # English resources
│   │   └── strings.xml      # String resources (EN)
│   └── drawable/            # Drawable resources
│       ├── custom_shape.xml         # Ukrainian flag graphic
│       └── coat_of_arms_shape.xml   # Coat of arms graphic
└── resources/
    └── tz.pdf              # Task specification
```

## Resources Implemented

### 1. Styles (styles.xml)

Three custom styles for different text elements:

- **SurnameTextStyle**: Bold, 24sp, centered - for displaying surname "Попов"
- **GreetingTextStyle**: Normal, 18sp - for greeting messages
- **SymbolTextStyle**: Italic, 16sp - for national symbols descriptions

### 2. Colors (colors.xml)

Ukrainian national colors and app theme colors:

- `ukraine_blue`: #0057B7
- `ukraine_yellow`: #FFD700
- Primary, secondary, and accent colors for UI

### 3. Drawable Resources

- **custom_shape.xml**: Ukrainian flag representation (blue/yellow layered rectangle)
- **coat_of_arms_shape.xml**: Simplified coat of arms representation (oval with stroke)

### 4. Localization

#### Ukrainian (default - values/)
- App name: "Lab 4 - Ресурси і Локалізація"
- Surname: "Попов"
- Full name: "Попов Кирил Олександрович"
- Country: "Україна"
- Flag: "Прапор України"
- Coat of arms: "Герб України"

#### English (values-en/)
- App name: "Lab 4 - Resources and Localization"
- Surname: "Popov"
- Full name: "Popov Kyrylo Oleksandrovych"
- Country: "Ukraine"
- Flag: "Flag of Ukraine"
- Coat of arms: "Coat of Arms of Ukraine"

## How to Run

### Prerequisites
- Kotlin compiler installed
- JDK 8 or higher

### Compilation and Execution

```bash
# Compile
kotlinc src/*.kt -include-runtime -d lab4.jar

# Run
java -jar lab4.jar
```

## Task Requirements Fulfilled

✅ **Task 1**: Created custom style (SurnameTextStyle) and displayed surname "Попов" instead of "Hello, World!"

✅ **Task 2**: Created drawable XML files (custom_shape.xml, coat_of_arms_shape.xml) with graphic figures

✅ **Task 3**: Implemented localization for Ukrainian and English:
- String resources automatically load based on locale
- Surname displays in the selected language (Попов/Popov)
- National flag and coat of arms are represented with appropriate labels

## Key Concepts Demonstrated

1. **Resource Separation**: Resources are separated from code in XML files
2. **Localization**: Multiple language support using locale-specific resource directories
3. **Styles**: Reusable style definitions for consistent UI
4. **Drawable Resources**: Vector-like graphics defined in XML
5. **Resource References**: Colors and strings referenced using @color/ and @string/ notation

## Output Example

The application displays:
- Application title in selected language
- Greeting message
- Surname (Попов/Popov)
- Full name
- Country name
- National flag with colors
- National coat of arms reference
- List of available drawable resources
- List of available styles with their properties

## Notes

While this implementation demonstrates the concepts in a console application, the same principles and resource structure apply directly to Android Studio projects. The XML resource files are compatible with Android's resource system and can be directly used in Android applications.
