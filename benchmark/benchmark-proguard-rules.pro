-dontobfuscate

-ignorewarnings

-keepattributes *Annotation*

-dontnote junit.framework.**
-dontnote junit.runner.**

-dontwarn androidx.test.**
-dontwarn org.junit.**
-dontwarn org.hamcrest.**
-dontwarn com.squareup.javawriter.JavaWriter

#noinspection ShrinkerUnresolvedReference
-keepclasseswithmembers @org.junit.runner.RunWith public class *