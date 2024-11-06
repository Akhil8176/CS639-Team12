package example.myapp

class Aquarium {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100
}

package example.myapp

fun buildAquarium() {
    val myAquarium = Aquarium()
    // You can print the dimensions if you want to verify
    println("Aquarium dimensions: ${myAquarium.width} x ${myAquarium.height} x ${myAquarium.length}")
}

fun main() {
    buildAquarium()
}

package example.myapp

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}

fun main() {
    buildAquarium()
}
package example.myapp

class Aquarium {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}

OutPut

"C:\Program Files\Android\Android Studio\jbr\bin\java.exe" "-javaagent:C:\Program Files\Android\Android Studio\lib\idea_rt.jar=55730:C:\Program Files\Android\Android Studio\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\android.jar;C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\data\res;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\tmp\kotlin-classes\debug;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\intermediates\compile_and_runtime_not_namespaced_r_class_jar\debug\processDebugResources\R.jar;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\generated\res\resValues\debug;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk8\1.9.0\e000bd084353d84c9e888f6fb341dc1f5b79d948\kotlin-stdlib-jdk8-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib\1.9.0\8ee15ef0c67dc83d874f412d84378d7f0eb50b63\kotlin-stdlib-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-common\1.9.0\cd65c21cfd1eec4d44ef09f9f52b6d9f8a720636\kotlin-stdlib-common-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains\annotations\23.0.0\8cc20c07506ec18e0834947b84a864bfc094484e\annotations-23.0.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk7\1.9.0\f320478990d05e0cfaadd74f9619fd6027adbf37\kotlin-stdlib-jdk7-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.annotation\annotation-jvm\1.8.1\b8a16fe526014b7941c1debaccaf9c5153692dbb\annotation-jvm-1.8.1.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-android\1.7.3\38d9cad3a0b03a10453b56577984bdeb48edeed5\kotlinx-coroutines-android-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-core-jvm\1.7.3\2b09627576f0989a436a00a4a54b55fa5026fb86\kotlinx-coroutines-core-jvm-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.arch.core\core-common\2.2.0\5e1b8b81dfd5f52c56a8d53b18ca759c19a301f3\core-common-2.2.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.lifecycle\lifecycle-common-jvm\2.8.7\7174a594afb73a9ad9ac9074ce78b94af3cc52a7\lifecycle-common-jvm-2.8.7.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.collection\collection-jvm\1.4.2\bc60b5568a66d765a9fe8e266fd0c6c727e0b50b\collection-jvm-1.4.2.jar" example.myapp.MainKt
Width: 20 cm Length: 100 cm Height: 40 cm 
Width: 20 cm Length: 100 cm Height: 60 cm 

Process finished with exit code 0

3. Add class constructors

Step 1 Create a constructor

package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    fun printSize() {
        println("Width: $width cm Length: $length cm Height: $height cm")
    }
}


package example.myapp

fun buildAquarium() {
    val aquarium1 = Aquarium()
    aquarium1.printSize()

    // Aquarium with default height and length, custom width
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()

    // Aquarium with custom height and length, default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()

    // Aquarium with custom width, height, and length
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()
}

fun main() {
    buildAquarium()
}

OUTPUT

"C:\Program Files\Android\Android Studio\jbr\bin\java.exe" "-javaagent:C:\Program Files\Android\Android Studio\lib\idea_rt.jar=55835:C:\Program Files\Android\Android Studio\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\android.jar;C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\data\res;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\tmp\kotlin-classes\debug;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\intermediates\compile_and_runtime_not_namespaced_r_class_jar\debug\processDebugResources\R.jar;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\generated\res\resValues\debug;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk8\1.9.0\e000bd084353d84c9e888f6fb341dc1f5b79d948\kotlin-stdlib-jdk8-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib\1.9.0\8ee15ef0c67dc83d874f412d84378d7f0eb50b63\kotlin-stdlib-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-common\1.9.0\cd65c21cfd1eec4d44ef09f9f52b6d9f8a720636\kotlin-stdlib-common-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains\annotations\23.0.0\8cc20c07506ec18e0834947b84a864bfc094484e\annotations-23.0.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk7\1.9.0\f320478990d05e0cfaadd74f9619fd6027adbf37\kotlin-stdlib-jdk7-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.annotation\annotation-jvm\1.8.1\b8a16fe526014b7941c1debaccaf9c5153692dbb\annotation-jvm-1.8.1.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-android\1.7.3\38d9cad3a0b03a10453b56577984bdeb48edeed5\kotlinx-coroutines-android-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-core-jvm\1.7.3\2b09627576f0989a436a00a4a54b55fa5026fb86\kotlinx-coroutines-core-jvm-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.arch.core\core-common\2.2.0\5e1b8b81dfd5f52c56a8d53b18ca759c19a301f3\core-common-2.2.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.lifecycle\lifecycle-common-jvm\2.8.7\7174a594afb73a9ad9ac9074ce78b94af3cc52a7\lifecycle-common-jvm-2.8.7.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.collection\collection-jvm\1.4.2\bc60b5568a66d765a9fe8e266fd0c6c727e0b50b\collection-jvm-1.4.2.jar" example.myapp.MainKt
Width: 20 cm Length: 100 cm Height: 40 cm
Width: 25 cm Length: 100 cm Height: 40 cm
Width: 20 cm Length: 110 cm Height: 35 cm
Width: 25 cm Length: 110 cm Height: 35 cm

Process finished with exit code 0

STEP 2 Add init blocks

package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    init {
        println("aquarium initializing")
    }

    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} liters")
    }

    fun printSize() {
        println("Width: $width cm Length: $length cm Height: $height cm")
    }
}

OUTPUT

"C:\Program Files\Android\Android Studio\jbr\bin\java.exe" "-javaagent:C:\Program Files\Android\Android Studio\lib\idea_rt.jar=55988:C:\Program Files\Android\Android Studio\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\android.jar;C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\data\res;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\tmp\kotlin-classes\debug;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\intermediates\compile_and_runtime_not_namespaced_r_class_jar\debug\processDebugResources\R.jar;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\generated\res\resValues\debug;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk8\1.9.0\e000bd084353d84c9e888f6fb341dc1f5b79d948\kotlin-stdlib-jdk8-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib\1.9.0\8ee15ef0c67dc83d874f412d84378d7f0eb50b63\kotlin-stdlib-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-common\1.9.0\cd65c21cfd1eec4d44ef09f9f52b6d9f8a720636\kotlin-stdlib-common-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains\annotations\23.0.0\8cc20c07506ec18e0834947b84a864bfc094484e\annotations-23.0.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk7\1.9.0\f320478990d05e0cfaadd74f9619fd6027adbf37\kotlin-stdlib-jdk7-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.annotation\annotation-jvm\1.8.1\b8a16fe526014b7941c1debaccaf9c5153692dbb\annotation-jvm-1.8.1.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-android\1.7.3\38d9cad3a0b03a10453b56577984bdeb48edeed5\kotlinx-coroutines-android-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-core-jvm\1.7.3\2b09627576f0989a436a00a4a54b55fa5026fb86\kotlinx-coroutines-core-jvm-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.arch.core\core-common\2.2.0\5e1b8b81dfd5f52c56a8d53b18ca759c19a301f3\core-common-2.2.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.lifecycle\lifecycle-common-jvm\2.8.7\7174a594afb73a9ad9ac9074ce78b94af3cc52a7\lifecycle-common-jvm-2.8.7.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.collection\collection-jvm\1.4.2\bc60b5568a66d765a9fe8e266fd0c6c727e0b50b\collection-jvm-1.4.2.jar" example.myapp.MainKt
aquarium initializing
Volume: 80 liters
Width: 20 cm Length: 100 cm Height: 40 cm
aquarium initializing
Volume: 100 liters
Width: 25 cm Length: 100 cm Height: 40 cm
aquarium initializing
Volume: 77 liters
Width: 20 cm Length: 110 cm Height: 35 cm
aquarium initializing
Volume: 96 liters
Width: 25 cm Length: 110 cm Height: 35 cm

Process finished with exit code 0

Step 3: Learn about secondary constructors

package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    init {
        println("aquarium initializing")
    }

    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} liters")
    }

    // Secondary constructor
    constructor(numberOfFish: Int) : this() {
        // Calculate the tank volume based on the number of fish
        val tank = numberOfFish * 2000 * 1.1
        // Calculate the required height based on the calculated tank volume
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println("Width: $width cm Length: $length cm Height: $height cm")
    }
}


package example.myapp

fun buildAquarium() {
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} liters")
}

fun main() {
    buildAquarium()
}


OUTPUT

"C:\Program Files\Android\Android Studio\jbr\bin\java.exe" "-javaagent:C:\Program Files\Android\Android Studio\lib\idea_rt.jar=56086:C:\Program Files\Android\Android Studio\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\android.jar;C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\data\res;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\tmp\kotlin-classes\debug;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\intermediates\compile_and_runtime_not_namespaced_r_class_jar\debug\processDebugResources\R.jar;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\generated\res\resValues\debug;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk8\1.9.0\e000bd084353d84c9e888f6fb341dc1f5b79d948\kotlin-stdlib-jdk8-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib\1.9.0\8ee15ef0c67dc83d874f412d84378d7f0eb50b63\kotlin-stdlib-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-common\1.9.0\cd65c21cfd1eec4d44ef09f9f52b6d9f8a720636\kotlin-stdlib-common-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains\annotations\23.0.0\8cc20c07506ec18e0834947b84a864bfc094484e\annotations-23.0.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk7\1.9.0\f320478990d05e0cfaadd74f9619fd6027adbf37\kotlin-stdlib-jdk7-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.annotation\annotation-jvm\1.8.1\b8a16fe526014b7941c1debaccaf9c5153692dbb\annotation-jvm-1.8.1.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-android\1.7.3\38d9cad3a0b03a10453b56577984bdeb48edeed5\kotlinx-coroutines-android-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-core-jvm\1.7.3\2b09627576f0989a436a00a4a54b55fa5026fb86\kotlinx-coroutines-core-jvm-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.arch.core\core-common\2.2.0\5e1b8b81dfd5f52c56a8d53b18ca759c19a301f3\core-common-2.2.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.lifecycle\lifecycle-common-jvm\2.8.7\7174a594afb73a9ad9ac9074ce78b94af3cc52a7\lifecycle-common-jvm-2.8.7.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.collection\collection-jvm\1.4.2\bc60b5568a66d765a9fe8e266fd0c6c727e0b50b\collection-jvm-1.4.2.jar" example.myapp.MainKt
aquarium initializing
Volume: 80 liters
Width: 20 cm Length: 100 cm Height: 31 cm
Volume: 62 liters

Process finished with exit code 0


Step 4: Add a new property getter

package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    init {
        println("aquarium initializing")
    }

    // Define volume as a property with a custom getter
    val volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 liter

    // Secondary constructor
    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println("Width: $width cm Length: $length cm Height: $height cm")
        println("Volume: $volume liters")
    }
}


package example.myapp

fun buildAquarium() {
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
}

fun main() {
    buildAquarium()
}

OUTPUT

"C:\Program Files\Android\Android Studio\jbr\bin\java.exe" "-javaagent:C:\Program Files\Android\Android Studio\lib\idea_rt.jar=56158:C:\Program Files\Android\Android Studio\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\android.jar;C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\data\res;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\tmp\kotlin-classes\debug;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\intermediates\compile_and_runtime_not_namespaced_r_class_jar\debug\processDebugResources\R.jar;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\generated\res\resValues\debug;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk8\1.9.0\e000bd084353d84c9e888f6fb341dc1f5b79d948\kotlin-stdlib-jdk8-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib\1.9.0\8ee15ef0c67dc83d874f412d84378d7f0eb50b63\kotlin-stdlib-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-common\1.9.0\cd65c21cfd1eec4d44ef09f9f52b6d9f8a720636\kotlin-stdlib-common-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains\annotations\23.0.0\8cc20c07506ec18e0834947b84a864bfc094484e\annotations-23.0.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk7\1.9.0\f320478990d05e0cfaadd74f9619fd6027adbf37\kotlin-stdlib-jdk7-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.annotation\annotation-jvm\1.8.1\b8a16fe526014b7941c1debaccaf9c5153692dbb\annotation-jvm-1.8.1.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-android\1.7.3\38d9cad3a0b03a10453b56577984bdeb48edeed5\kotlinx-coroutines-android-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-core-jvm\1.7.3\2b09627576f0989a436a00a4a54b55fa5026fb86\kotlinx-coroutines-core-jvm-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.arch.core\core-common\2.2.0\5e1b8b81dfd5f52c56a8d53b18ca759c19a301f3\core-common-2.2.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.lifecycle\lifecycle-common-jvm\2.8.7\7174a594afb73a9ad9ac9074ce78b94af3cc52a7\lifecycle-common-jvm-2.8.7.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.collection\collection-jvm\1.4.2\bc60b5568a66d765a9fe8e266fd0c6c727e0b50b\collection-jvm-1.4.2.jar" example.myapp.MainKt
aquarium initializing
Width: 20 cm Length: 100 cm Height: 31 cm
Volume: 62 liters

Process finished with exit code 0


Step 5: Add a property setter

package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    init {
        println("aquarium initializing")
    }

    // Define volume as a var with a custom getter and setter
    var volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 liter
        set(value) {
            height = (value * 1000) / (width * length)
        }

    // Secondary constructor
    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println("Width: $width cm Length: $length cm Height: $height cm")
        println("Volume: $volume liters")
    }
}


package example.myapp

fun buildAquarium() {
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()
}

fun main() {
    buildAquarium()
}

OUTPUT

"C:\Program Files\Android\Android Studio\jbr\bin\java.exe" "-javaagent:C:\Program Files\Android\Android Studio\lib\idea_rt.jar=56234:C:\Program Files\Android\Android Studio\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\android.jar;C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\data\res;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\tmp\kotlin-classes\debug;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\intermediates\compile_and_runtime_not_namespaced_r_class_jar\debug\processDebugResources\R.jar;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\generated\res\resValues\debug;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk8\1.9.0\e000bd084353d84c9e888f6fb341dc1f5b79d948\kotlin-stdlib-jdk8-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib\1.9.0\8ee15ef0c67dc83d874f412d84378d7f0eb50b63\kotlin-stdlib-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-common\1.9.0\cd65c21cfd1eec4d44ef09f9f52b6d9f8a720636\kotlin-stdlib-common-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains\annotations\23.0.0\8cc20c07506ec18e0834947b84a864bfc094484e\annotations-23.0.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk7\1.9.0\f320478990d05e0cfaadd74f9619fd6027adbf37\kotlin-stdlib-jdk7-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.annotation\annotation-jvm\1.8.1\b8a16fe526014b7941c1debaccaf9c5153692dbb\annotation-jvm-1.8.1.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-android\1.7.3\38d9cad3a0b03a10453b56577984bdeb48edeed5\kotlinx-coroutines-android-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-core-jvm\1.7.3\2b09627576f0989a436a00a4a54b55fa5026fb86\kotlinx-coroutines-core-jvm-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.arch.core\core-common\2.2.0\5e1b8b81dfd5f52c56a8d53b18ca759c19a301f3\core-common-2.2.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.lifecycle\lifecycle-common-jvm\2.8.7\7174a594afb73a9ad9ac9074ce78b94af3cc52a7\lifecycle-common-jvm-2.8.7.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.collection\collection-jvm\1.4.2\bc60b5568a66d765a9fe8e266fd0c6c727e0b50b\collection-jvm-1.4.2.jar" example.myapp.MainKt
aquarium initializing
Width: 20 cm Length: 100 cm Height: 31 cm
Volume: 62 liters
Width: 20 cm Length: 100 cm Height: 35 cm
Volume: 70 liters

Process finished with exit code 0

4. Learn about visibility modifiers

package example.myapp

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    init {
        println("aquarium initializing")
    }

    // Define volume with a public getter and a private setter
    var volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 liter
        private set(value) {
            height = (value * 1000) / (width * length)
        }

    // Secondary constructor
    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println("Width: $width cm Length: $length cm Height: $height cm")
        println("Volume: $volume liters")
    }
}


package example.myapp

fun buildAquarium() {
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    // aquarium6.volume = 70  // This line would now cause an error because the setter is private.
    aquarium6.printSize()
}

fun main() {
    buildAquarium()
}


"C:\Program Files\Android\Android Studio\jbr\bin\java.exe" "-javaagent:C:\Program Files\Android\Android Studio\lib\idea_rt.jar=56327:C:\Program Files\Android\Android Studio\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\android.jar;C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\data\res;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\tmp\kotlin-classes\debug;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\intermediates\compile_and_runtime_not_namespaced_r_class_jar\debug\processDebugResources\R.jar;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\generated\res\resValues\debug;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk8\1.9.0\e000bd084353d84c9e888f6fb341dc1f5b79d948\kotlin-stdlib-jdk8-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib\1.9.0\8ee15ef0c67dc83d874f412d84378d7f0eb50b63\kotlin-stdlib-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-common\1.9.0\cd65c21cfd1eec4d44ef09f9f52b6d9f8a720636\kotlin-stdlib-common-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains\annotations\23.0.0\8cc20c07506ec18e0834947b84a864bfc094484e\annotations-23.0.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk7\1.9.0\f320478990d05e0cfaadd74f9619fd6027adbf37\kotlin-stdlib-jdk7-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.annotation\annotation-jvm\1.8.1\b8a16fe526014b7941c1debaccaf9c5153692dbb\annotation-jvm-1.8.1.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-android\1.7.3\38d9cad3a0b03a10453b56577984bdeb48edeed5\kotlinx-coroutines-android-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-core-jvm\1.7.3\2b09627576f0989a436a00a4a54b55fa5026fb86\kotlinx-coroutines-core-jvm-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.arch.core\core-common\2.2.0\5e1b8b81dfd5f52c56a8d53b18ca759c19a301f3\core-common-2.2.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.lifecycle\lifecycle-common-jvm\2.8.7\7174a594afb73a9ad9ac9074ce78b94af3cc52a7\lifecycle-common-jvm-2.8.7.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.collection\collection-jvm\1.4.2\bc60b5568a66d765a9fe8e266fd0c6c727e0b50b\collection-jvm-1.4.2.jar" example.myapp.MainKt
aquarium initializing
Width: 20 cm Length: 100 cm Height: 31 cm
Volume: 62 liters
Width: 20 cm Length: 100 cm Height: 31 cm
Volume: 62 liters

Process finished with exit code 0


5. Learn about subclasses and inheritance

Step 1: Make the Aquarium class open

package example.myapp

open class Aquarium(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
    
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape: String = "rectangle"
    
    open var water: Double = 0.0
        get() = volume * 0.9

    fun printSize() {
        println(shape)
        println("Width: $width cm Length: $length cm Height: $height cm")
        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
    }
}


fun buildAquarium() {
    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()
}

fun main() {
    buildAquarium()
}

OUTPUT
aquarium initializing
rectangle
Width: 25 cm Length: 25 cm Height: 40 cm
Volume: 25 liters Water: 22.5 liters (90.0% full)

Step 2: Create a subclass

package example.myapp

import java.lang.Math.PI

// Aquarium class definition (from previous steps)

open class Aquarium(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape: String = "rectangle"
    
    open var water: Double = 0.0
        get() = volume * 0.9

    fun printSize() {
        println(shape)
        println("Width: $width cm Length: $length cm Height: $height cm")
        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
    }
}

// TowerTank class definition (subclass of Aquarium)

class TowerTank(override var height: Int, var diameter: Int) : Aquarium(height = height, width = diameter, length = diameter) {
    
    // Override volume calculation to use the formula for a cylinder: π * r² * h
    override var volume: Int
        get() = ((width / 2) * (width / 2) * height * PI).toInt()  // π * r² * h
        set(value) {
            height = ((value * 1000 / PI) / ((width / 2) * (width / 2))).toInt()
        }

    // Override water property to be 80% of the volume
    override var water: Double = volume * 0.8

    // Override the shape property to indicate it's a cylinder
    override val shape: String = "cylinder"
}


fun buildAquarium() {
    // Create a rectangular aquarium
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()

    // Create a cylindrical tower tank
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun main() {
    buildAquarium()
}

OUTPUT

aquarium initializing
rectangle
Width: 25 cm Length: 25 cm Height: 40 cm 
Volume: 25 liters Water: 22.5 liters (90.0% full)
aquarium initializing
cylinder
Width: 25 cm Length: 25 cm Height: 40 cm 
Volume: 18 liters Water: 14.4 liters (80.0% full)

6. Compare abstract classes and interfaces

Step 1. Create an abstract class

package example.myapp

// Define the abstract class AquariumFish
abstract class AquariumFish {
    // Abstract property that must be implemented by subclasses
    abstract val color: String
}

// Shark subclass of AquariumFish
class Shark : AquariumFish() {
    // Implement the abstract property color
    override val color = "grey"
}

// Plecostomus subclass of AquariumFish
class Plecostomus : AquariumFish() {
    // Implement the abstract property color
    override val color = "gold"
}

package example.myapp

fun makeFish() {
    // Create instances of Shark and Plecostomus
    val shark = Shark()
    val pleco = Plecostomus()

    // Print the color of each fish
    println("Shark: ${shark.color}")
    println("Plecostomus: ${pleco.color}")
}

fun main() {
    // Call the makeFish function
    makeFish()
}

OUTPUT

"C:\Program Files\Android\Android Studio\jbr\bin\java.exe" "-javaagent:C:\Program Files\Android\Android Studio\lib\idea_rt.jar=56542:C:\Program Files\Android\Android Studio\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\android.jar;C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\data\res;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\tmp\kotlin-classes\debug;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\intermediates\compile_and_runtime_not_namespaced_r_class_jar\debug\processDebugResources\R.jar;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\generated\res\resValues\debug;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk8\1.9.0\e000bd084353d84c9e888f6fb341dc1f5b79d948\kotlin-stdlib-jdk8-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib\1.9.0\8ee15ef0c67dc83d874f412d84378d7f0eb50b63\kotlin-stdlib-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-common\1.9.0\cd65c21cfd1eec4d44ef09f9f52b6d9f8a720636\kotlin-stdlib-common-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains\annotations\23.0.0\8cc20c07506ec18e0834947b84a864bfc094484e\annotations-23.0.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk7\1.9.0\f320478990d05e0cfaadd74f9619fd6027adbf37\kotlin-stdlib-jdk7-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.annotation\annotation-jvm\1.8.1\b8a16fe526014b7941c1debaccaf9c5153692dbb\annotation-jvm-1.8.1.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-android\1.7.3\38d9cad3a0b03a10453b56577984bdeb48edeed5\kotlinx-coroutines-android-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-core-jvm\1.7.3\2b09627576f0989a436a00a4a54b55fa5026fb86\kotlinx-coroutines-core-jvm-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.arch.core\core-common\2.2.0\5e1b8b81dfd5f52c56a8d53b18ca759c19a301f3\core-common-2.2.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.lifecycle\lifecycle-common-jvm\2.8.7\7174a594afb73a9ad9ac9074ce78b94af3cc52a7\lifecycle-common-jvm-2.8.7.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.collection\collection-jvm\1.4.2\bc60b5568a66d765a9fe8e266fd0c6c727e0b50b\collection-jvm-1.4.2.jar" example.myapp.MainKt
Shark: grey
Plecostomus: gold

Process finished with exit code 0

Step 2. Create an interface

package example.myapp

// Define the FishAction interface with an abstract eat method
interface FishAction {
    fun eat()  // Abstract method to be implemented by the classes that use the interface
}

// Abstract class AquariumFish, implementing the FishAction interface
abstract class AquariumFish : FishAction {
    // Abstract property that must be implemented by subclasses
    abstract val color: String

    // Optional default implementation for eat
    override fun eat() {
        println("yum")  // A default behavior that can be overridden
    }
}

// Shark class implementing AquariumFish and FishAction
class Shark : AquariumFish() {
    override val color = "grey"

    // Implement the eat method specifically for Shark
    override fun eat() {
        println("hunt and eat fish")
    }
}

// Plecostomus class implementing AquariumFish and FishAction
class Plecostomus : AquariumFish() {
    override val color = "gold"

    // Implement the eat method specifically for Plecostomus
    override fun eat() {
        println("eat algae")
    }
}

package example.myapp

fun makeFish() {
    // Create instances of Shark and Plecostomus
    val shark = Shark()
    val pleco = Plecostomus()

    // Print their color and call the eat() method
    println("Shark: ${shark.color}")
    shark.eat()  // Shark-specific implementation of eat()

    println("Plecostomus: ${pleco.color}")
    pleco.eat()  // Plecostomus-specific implementation of eat()
}

fun main() {
    // Call the makeFish function
    makeFish()
}

OUTPUT

"C:\Program Files\Android\Android Studio\jbr\bin\java.exe" "-javaagent:C:\Program Files\Android\Android Studio\lib\idea_rt.jar=56597:C:\Program Files\Android\Android Studio\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\android.jar;C:\Users\SAI NUNNA\AppData\Local\Android\Sdk\platforms\android-34\data\res;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\tmp\kotlin-classes\debug;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\intermediates\compile_and_runtime_not_namespaced_r_class_jar\debug\processDebugResources\R.jar;C:\Users\SAI NUNNA\AndroidStudioProjects\HelloKotlin\app\build\generated\res\resValues\debug;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\89f1a8436d03984b568363fc6b151d8b\transformed\ui-tooling-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\58b80567ff3f1f3e5b3ea775a022e989\transformed\runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1d5afa7ac02180360fdb73db3ae8dec5\transformed\ui-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\6948b3fc6fbadf94d6241a869e506ce3\transformed\runtime-saveable-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\e65989a568c8b46b23b0777cf6ea1696\transformed\ui-geometry-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ba7102c6962ed8955c10c2975aebd9c6\transformed\ui-graphics-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaa8d047bb2e710ad805255ea83a809b\transformed\ui-unit-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\5796460981332bd322f11a172d1df03b\transformed\ui-text-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\eaed73013b7220ab250f6d43554aca1f\transformed\ui-util-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\de6e17a4e9c1477b6c5f03b5ce493768\transformed\ui-tooling-data-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8b26a85e049afd6707ec682601ad1e61\transformed\ui-tooling-preview-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\3f1f706f67abfd5e278b4ec4b74a26ea\transformed\ui-test-manifest-1.6.6\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d48d68b8b50d29021c1cb3adc8d7f9b4\transformed\activity-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\ee5448ab9eae9b097071cc5d7230339e\transformed\core-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\f9aeb2b7f545c55fff2478ee443d5b02\transformed\annotation-experimental-1.4.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\9f0e4f15d9ab5058466531dbe7e13882\transformed\lifecycle-runtime-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\598fd1a0f3ba2b1fb174a5246534215e\transformed\versionedparcelable-1.1.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\4b107ae0e75c16de65cb6064af9d44ed\transformed\lifecycle-viewmodel-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2906222d9322cdb6f10a2fae1f4c1c07\transformed\lifecycle-viewmodel-savedstate-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\14ef5a2a91249db7dba5b7f175488c64\transformed\core-ktx-1.15.0\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\cbeb76f6f067cdaf93e12526b38f9a2c\transformed\lifecycle-livedata-core-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\1e5d4b1ac479f4792c9a7709f97b2144\transformed\savedstate-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\d4e5299a3b1f10a06a786ce14ea144da\transformed\lifecycle-runtime-ktx-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\c8ed3b74eeb3d3d9814c7d9bffff9adb\transformed\activity-compose-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bafee98dd2e99ac487e6cfcc2a151a0f\transformed\activity-ktx-1.9.3\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\bcc8d5bd44fb4e986c454d14abc63c65\transformed\lifecycle-viewmodel-ktx-2.8.7\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8e6480717717248230747b510743e958\transformed\savedstate-ktx-1.2.1\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\740826d70a6163ba81930f0f7ba39ba3\transformed\material3-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\8c5d322048fc4b94b551010c6d0ae2df\transformed\foundation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\71120ff3c637331cd16523eaf2d28ed9\transformed\animation-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\39ac685c524b65105e4e0bbbf7276961\transformed\animation-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\645c3c73d4950a1ce2d076fbbef2c491\transformed\foundation-layout-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\2a4ca0555c594e29163ff25c6db9f6f1\transformed\material-icons-core-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\jars\classes.jar;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\res;C:\Users\SAI NUNNA\.gradle\caches\transforms-4\86411b7fe0d9231367168397eb75cd5a\transformed\material-ripple-release\AndroidManifest.xml;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk8\1.9.0\e000bd084353d84c9e888f6fb341dc1f5b79d948\kotlin-stdlib-jdk8-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib\1.9.0\8ee15ef0c67dc83d874f412d84378d7f0eb50b63\kotlin-stdlib-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-common\1.9.0\cd65c21cfd1eec4d44ef09f9f52b6d9f8a720636\kotlin-stdlib-common-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains\annotations\23.0.0\8cc20c07506ec18e0834947b84a864bfc094484e\annotations-23.0.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlin\kotlin-stdlib-jdk7\1.9.0\f320478990d05e0cfaadd74f9619fd6027adbf37\kotlin-stdlib-jdk7-1.9.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.annotation\annotation-jvm\1.8.1\b8a16fe526014b7941c1debaccaf9c5153692dbb\annotation-jvm-1.8.1.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-android\1.7.3\38d9cad3a0b03a10453b56577984bdeb48edeed5\kotlinx-coroutines-android-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\org.jetbrains.kotlinx\kotlinx-coroutines-core-jvm\1.7.3\2b09627576f0989a436a00a4a54b55fa5026fb86\kotlinx-coroutines-core-jvm-1.7.3.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.arch.core\core-common\2.2.0\5e1b8b81dfd5f52c56a8d53b18ca759c19a301f3\core-common-2.2.0.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.lifecycle\lifecycle-common-jvm\2.8.7\7174a594afb73a9ad9ac9074ce78b94af3cc52a7\lifecycle-common-jvm-2.8.7.jar;C:\Users\SAI NUNNA\.gradle\caches\modules-2\files-2.1\androidx.collection\collection-jvm\1.4.2\bc60b5568a66d765a9fe8e266fd0c6c727e0b50b\collection-jvm-1.4.2.jar" example.myapp.MainKt
Shark: grey
hunt and eat fish
Plecostomus: gold
eat algae

Process finished with exit code 0


7. Use interface delegation

Step 1: Make a new interface

package example.myapp

fun makeFish() {
    val pleco = Plecostomus()
    println("Plecostomus color: ${pleco.color}")
    pleco.eat()

    val shark = Shark()
    println("Shark color: ${shark.color}")
    shark.eat()
}

fun main() {
    makeFish()
}


// Helper class that implements both FishAction and FishColor interfaces
class FishHelper(override val color: String) : FishAction, FishColor {
    override fun eat() {
        println("eat generic food")
    }
}

// Shark class uses FishHelper for delegation
class Shark(fishHelper: FishHelper) : FishAction by fishHelper, FishColor by fishHelper {
    // Shark can delegate behavior to the FishHelper class
    // No need to override eat() and color anymore, they are delegated
}


OUTPUT

Plecostomus color: gold
eat algae
Shark color: grey
hunt and eat fish


Step 3: Add interface delegation for FishColor

package example.myapp

// Interface for eating action
interface FishAction {
    fun eat()
}

// Interface for fish color
interface FishColor {
    val color: String
}

// Singleton class for GoldColor
object GoldColor : FishColor {
    override val color = "gold"
}

// Helper class to implement FishAction behavior
class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

// Plecostomus class, delegating both FishAction and FishColor interfaces
class Plecostomus(fishColor: FishColor = GoldColor) :
    FishAction by PrintingFishAction("eat algae"),  // Delegate eat() method
    FishColor by fishColor  // Delegate color property

// Test the implementation
fun makeFish() {
    val pleco = Plecostomus()
    println("Plecostomus color: ${pleco.color}")
    pleco.eat()  // Calls the delegated eat() method
}

fun main() {
    makeFish()
}

OUTPUT

Plecostomus color: gold
eat algae

8. Create a data class

Step 1: Create a data class

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    // Comparing decorations
    println(decoration1.equals(decoration2))  // false
    println(decoration3.equals(decoration2))  // true
}


package example.myapp.decor

data class Decoration(val rocks: String)

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    // Comparing decorations
    println(decoration1.equals(decoration2))  // false
    println(decoration3.equals(decoration2))  // true
}

fun main() {
    makeDecorations()
}

OUTPUT


Decoration(rocks=granite)
Decoration(rocks=slate)
Decoration(rocks=slate)
false
true


data class Decoration2(val rocks: String, val wood: String, val diver: String)

fun makeDecorations() {
    // Create a Decoration2 object
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)  // Prints: Decoration2(rocks=crystal, wood=wood, diver=diver)

    // Destructuring the object into variables
    val (rock, wood, diver) = d5
    println(rock)   // Prints: crystal
    println(wood)   // Prints: wood
    println(diver)  // Prints: diver

    // Skip the 'wood' property
    val (rock2, _, diver2) = d5
    println(rock2)   // Prints: crystal
    println(diver2)  // Prints: diver
}

fun main() {
    makeDecorations()
}

Step 2. Use destructuring

data class Decoration2(val rocks: String, val wood: String, val diver: String)

fun makeDecorations() {
    // Create a Decoration2 object
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)  // Prints: Decoration2(rocks=crystal, wood=wood, diver=diver)

    // Destructuring the object into variables
    val (rock, wood, diver) = d5
    println(rock)   // Prints: crystal
    println(wood)   // Prints: wood
    println(diver)  // Prints: diver

    // Skip the 'wood' property
    val (rock2, _, diver2) = d5
    println(rock2)   // Prints: crystal
    println(diver2)  // Prints: diver
}

fun main() {
    makeDecorations()
}

OUTPUT


Decoration2(rocks=crystal, wood=wood, diver=diver)
crystal
wood
diver
crystal
diver


9. Learn about singletons and enums

object GoldColor : FishColor {
    override val color = "gold"
}


enum class Color(val rgb: Int) {
    RED(0xFF0000), 
    GREEN(0x00FF00), 
    BLUE(0x0000FF);
}

fun main() {
    println(Color.RED.rgb)  // Prints: 16711680 (Hex value of RED)
    println(Color.GREEN.name)  // Prints: GREEN
    println(Color.BLUE.ordinal)  // Prints: 2 (Index of BLUE in the enum)
}

enum class Direction(val degrees: Int) {
    NORTH(0), 
    SOUTH(180), 
    EAST(90), 
    WEST(270)
}

OUTPUT

EAST
2
90


Pairs/triples, collections, constants, and writing extension functions

1. Create a Companion Object

class Choice {
   companion object {
       var name: String = "lyric"
       fun showDescription(name:String) = println("My favorite $name")
   }
}

fun main() {
   println(Choice.name)
   Choice.showDescription("pick")
   Choice.showDescription("selection")
}

lyric
My favorite pick
My favorite selection


2. Learn about pairs and triples

val twoLists = fish.partition { isFreshWater(it) }
println("freshwater: ${twoLists.first}")
println("saltwater: ${twoLists.second}")

val equipment = "fish net" to "catching fish"
println("${equipment.first} used for ${equipment.second}")

fish net used for catching fish

val numbers = Triple(6, 9, 42)
 println(numbers.toString())
 println(numbers.toList())
(6, 9, 42)[6, 9, 42]


val equipment2 = ("fish net" to "catching fish") to "equipment"
 println("${equipment2.first} is ${equipment2.second}\n")
 println("${equipment2.first.second}")
 
(fish net, catching fish) is equipment
catching fish

val equipment = "fish net" to "catching fish"
 val (tool, use) = equipment
 println("$tool is used for $use")
  
fish net is used for catching fish

val numbers = Triple(6, 9, 42)
 val (n1, n2, n3) = numbers
 println("$n1 $n2 $n3")
 
6 9 42


3. Learn more about collections

val list = listOf(1, 5, 3, 4)
 println(list.sum())
13

val list2 = listOf("a", "bbb", "cc")
 println(list2.sum())
 error: none of the following functions can be called with the arguments supplied:
 
 val list2 = listOf("a", "bbb", "cc")
 println(list2.sumBy { it.length })
6

val list2 = listOf("a", "bbb", "cc")
 for (s in list2.listIterator()) {
     println("$s ")
 }
a bbb cc 

val scientific = hashMapOf("guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio" )

println (scientific.get("guppy"))
poecilia reticulata

println(scientific.get("zebra fish"))
danio rerio
 

println("scientific.get("swordtail"")
null


println(scientific.getOrDefault("swordtail", "sorry, I don't know"))
sorry, I don't know

println(scientific.getOrElse("swordtail") {"sorry, I don't know"})
sorry, I don't know


4. Organize and define constants

const val rocks = 3

val value1 = complexFunctionCall() // OK
const val CONSTANT1 = complexFunctionCall() // NOT ok

object Constants {
    const val CONSTANT2 = "object constant"
}
val foo = Constants.CONSTANT2


class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}


5. Understand extension functions

fun String.hasSpaces(): Boolean {
     val found = this.indexOf(' ')
     // also valid: this.indexOf(" ")
     // returns positive number index in String or -1 if not found
     return found != -1
 }

fun String.hasSpaces() = indexOf(" ") != -1

class AquariumPlant(val color: String, private val size: Int)
 
 fun AquariumPlant.isRed() = color == "red"    // OK
 fun AquariumPlant.isBig() = size > 50         // gives error
error: cannot access 'size': it is private in 'AquariumPlant'
fun AquariumPlant.isBig() = size > 50         // gives error
                            ^

open class AquariumPlant(val color: String, private val size: Int)
 
 class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)
 
 fun AquariumPlant.print() = println("AquariumPlant")
 fun GreenLeafyPlant.print() = println("GreenLeafyPlant")
 
 val plant = GreenLeafyPlant(size = 10)
 plant.print()
 println("\n")
 val aquariumPlant: AquariumPlant = plant
 aquariumPlant.print()  // what will it print?
GreenLeafyPlant
AquariumPlant

val AquariumPlant.isGreen: Boolean
     get() = color == "green"

aquariumPlant.isGreen
res22: kotlin.Boolean = true

fun AquariumPlant?.pull() {
     this?.apply {
         println("removing $this")
     }
 }
 
 val plant: AquariumPlant? = null
 plant.pull()
