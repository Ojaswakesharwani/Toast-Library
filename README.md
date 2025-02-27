# Toast Library

A simple Android library for displaying toast messages easily in your application.

## Features
- Show toast messages with a single function call
- Lightweight and easy to use

## Installation

### Step 1: Add the JitPack Repository

Add the following repository to your root `settings.gradle.kts` file:

```kotlin
dependencyResolutionManagement {
    repositories {
        maven("https://jitpack.io")
    }
}
```

### Step 2: Add the Dependency

Add the dependency in your `app/build.gradle.kts` file:

```kotlin
dependencies {
    implementation("com.github.Ojaswakesharwani:Toast-Library:V.1.0.0")
}
```

## Usage

### Step 1: Import the Library

```kotlin
import com.example.librarytoast.ToastMessage
```

### Step 2: Show a Toast Message

Call the `showMessage` function in your activity or fragment:

```kotlin
ToastMessage.showMessage(this, "Զเधे Զเधे from Ojaswa Toast Library!")
```

## License
This project is licensed under the MIT License.

---

For more details, visit [GitHub Repository](https://github.com/Ojaswakesharwani/Toast-Library).

