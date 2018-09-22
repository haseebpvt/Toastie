# Toastie Android Library

It make a beep sound while showing Toast. I think it will be useful for debugging.

## Usage

1. Add to build.gradle (Project)
 
 ``` 
 allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 ```
 
 2. Add to build.gradle (Module:app)
  
 ``` 
dependencies {
	        implementation 'com.github.haseebpvt:Toastie:3.0'
	}
 ```
 
 3. Code
  
  `Toastie.show(getApplicationContext(), "Toast message here");`

## Other Info
Class: https://git.io/fAdEO
Audio file (Created using Audacity): https://git.io/fAdEL
