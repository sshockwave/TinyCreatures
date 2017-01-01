# TinyCreatures
_Tiny Creatures_ is a minecraft forge mod 
which adds diseases, microorganisms, and bio-engineering to the game.

For the introduction to the game, 
please visit the [Wiki](/sshockwave/TinyCreatures/wiki) page. 

## Development guide
1. Install necessary softwares:
    * [Java Development Kit](http://www.oracle.com/technetwork/cn/java/javase/downloads/index.html)
    * [Git](https://git-scm.com/)
    * [JetBrains IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/downloads/)
2. Open the command window, and run `git clone https://github.com/sshockwave/TinyCreatures.git` in your working directory. 
3. Once you have cloned the repository, browse into it and run `gradlew setupDecompWorkspace`.
4. After all that finished, you're left with a choice. 
    * For eclipse: 
        1. Run `gradlew eclipse`.
        2. open Eclipse and switch your workspace to `/eclipse/`.
    * For IntelliJ IDEA: 
        1. Open IDEA, and import project.
        2. Select your build.gradle file and have it import.
        3. Once it's finished you must __close IntelliJ__ and run `gradlew genIntellijRuns` & `gradlew idea`

If at any point you are missing libraries in your IDE, 
or you've run into problems you can run `gradlew --refresh-dependencies` to refresh the local cache. 
`gradlew clean` to reset everything (this does not effect your code) and then start the processs again. 

### Speeding up the process
Most of the resources needed during the installation is stored in servers outside China, 
which might cause a lot of troubles. 
It's highly recommended to setup with a good Internet condition, 
or access via a proxy abroad. 
#### Proxies
Through socks:
```
./gradlew setupDecompWorkspace -DsocksProxyHost=<host> -DsocksProxyPort=<port>
```
Through https:
```
./gradlew setupDecompWorkspace -Dhttps.proxyHost=<host> -Dhttps.proxyPort=<port>
```
Through http:
```
./gradlew setupDecompWorkspace -Dhttp.proxyHost=<host> -Dhttp.proxyPort=<port>
```
#### Pre-setup
I have downloaded the libraries at your convenience. 

Put the unzipped file into the following directory: 
"%USERPROFILE%/[.gradle](http://pan.baidu.com/s/1qYB7kFq)"