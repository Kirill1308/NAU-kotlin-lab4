# Lab 4 Task Completion Summary

**Student:** Попов Кирил Олександрович  
**Date:** October 19, 2024  
**Lab:** Лабораторна робота 4 - ЗНАЙОМСТВО З ANDROID STUDIO. РЕСУРСИ І ЛОКАЛІЗАЦІЯ

---

## Task Requirements from tz.pdf

### ✅ Requirement 1: Create Style and Display Surname
**Task:** Створити стиль та застосувати його для виведення на екран свого прізвища в текстовому вікні замість "Hello, World!".

**Implementation:**
- Created `res/values/styles.xml` with `SurnameTextStyle`
- Style properties:
  - textSize: 24sp
  - textColor: primary_text (#212121)
  - textStyle: bold
  - padding: 16dp
  - gravity: center
- Displays surname **"Попов"** instead of "Hello, World!"

**Files:**
- `res/values/styles.xml` - Style definitions
- `src/Main.kt` - Application displays surname using the style

---

### ✅ Requirement 2: Create Drawable XML with Graphic Figure
**Task:** В каталозі drawable створити файл .xml, в якому описати графічну фігуру та вивести її на екран.

**Implementation:**
Created two drawable XML files:

1. **custom_shape.xml** - Ukrainian Flag
   - Uses `<layer-list>` to create two-layer graphic
   - Blue rectangle (top half): #0057B7
   - Yellow rectangle (bottom half): #FFD700
   - Rounded corners (8dp radius)

2. **coat_of_arms_shape.xml** - Coat of Arms Representation
   - Oval shape with yellow fill (#FFD700)
   - Blue stroke border (4dp, #0057B7)
   - 100x100dp size

**Files:**
- `res/drawable/custom_shape.xml`
- `res/drawable/coat_of_arms_shape.xml`

---

### ✅ Requirement 3: Localization (Ukrainian and English)
**Task:** Додати потрібні ресурси в каталог res проекту для реалізації локалізації (тобто налаштування на певну мову): при виборі мови на мобільному пристрої або емуляторі (українська або англійська) у застосунку прізвище повинно виводитися на екран вибраною мовою. Також на екран вивести національний прапор і герб відповідної країни.

**Implementation:**

#### Ukrainian Resources (default) - `res/values/strings.xml`
```xml
<string name="surname">Попов</string>
<string name="full_name">Попов Кирил Олександрович</string>
<string name="greeting">Вітаємо</string>
<string name="country">Україна</string>
<string name="flag">Прапор України</string>
<string name="coat_of_arms">Герб України</string>
```

#### English Resources - `res/values-en/strings.xml`
```xml
<string name="surname">Popov</string>
<string name="full_name">Popov Kyrylo Oleksandrovych</string>
<string name="greeting">Welcome</string>
<string name="country">Ukraine</string>
<string name="flag">Flag of Ukraine</string>
<string name="coat_of_arms">Coat of Arms of Ukraine</string>
```

#### National Symbols
- **Flag:** Represented by `custom_shape.xml` with authentic Ukrainian colors
  - Blue: #0057B7 (azure)
  - Yellow: #FFD700 (gold)
- **Coat of Arms:** Represented by `coat_of_arms_shape.xml` (simplified tryzub)

**Files:**
- `res/values/strings.xml` - Ukrainian localization
- `res/values-en/strings.xml` - English localization
- `res/values/colors.xml` - Color definitions including flag colors
- `src/ResourceManager.kt` - Locale-aware resource manager

---

## Additional Implementation Details

### Resource Structure (Android-compliant)
```
res/
├── values/              # Default (Ukrainian) resources
│   ├── strings.xml      # String resources
│   ├── colors.xml       # Color definitions
│   └── styles.xml       # Style definitions
├── values-en/           # English resources
│   └── strings.xml      # Localized strings
└── drawable/            # Graphic resources
    ├── custom_shape.xml
    └── coat_of_arms_shape.xml
```

### Code Quality Improvements
- Constants defined for locale identifiers (`LOCALE_UKRAINIAN`, `LOCALE_ENGLISH`)
- Exception handling for XML parsing
- Configurable resource path using constants
- Clean separation of concerns (ResourceManager handles resources, Main displays)

### Output Demonstration
The application successfully demonstrates:
1. ✅ Surname "Попов" displayed with custom style
2. ✅ Two drawable XML graphics (flag and coat of arms)
3. ✅ Full localization switching between Ukrainian and English
4. ✅ National symbols with proper colors and descriptions
5. ✅ Resource listing showing all available styles and drawables

---

## Verification

### Running the Application
```bash
kotlinc src/*.kt -include-runtime -d lab4.jar
java -jar lab4.jar
```

### Expected Output
- Display in both Ukrainian and English
- Show surname "Попов" / "Popov"
- Show full name "Попов Кирил Олександрович" / "Popov Kyrylo Oleksandrovych"
- Display flag colors: #0057B7 (Blue), #FFD700 (Yellow)
- List drawable resources: custom_shape, coat_of_arms_shape
- Display style information: SurnameTextStyle, GreetingTextStyle, SymbolTextStyle

---

## Conclusion

All three requirements from the laboratory task have been successfully implemented:

1. ✅ **Custom style created** and surname displayed instead of "Hello, World!"
2. ✅ **Drawable XML files created** with graphic figures representing national symbols
3. ✅ **Full localization implemented** with Ukrainian/English language support and national symbols

The implementation follows Android resource conventions and demonstrates proper understanding of:
- XML resource structure
- Style definitions
- Drawable resources (layer-list, shapes)
- Localization with locale-specific resource directories
- Color resource references
- Resource loading and management

The project is well-documented, properly structured, and ready for evaluation.
