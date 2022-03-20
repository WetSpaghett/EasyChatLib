# EasyChatLib
EasyChatLib is a library mod that adds an easy way to send chat messages without having to worry about ITextComponents.
<br>
It was originally part of my [poomod](https://www.github.com/wetspaghett/minecraft-poo-mod), but i decided to turn it into a library.

# How to use?
This mod is built for Minecraft 1.16.5
<br>
All you have to do is deobfuscate the jar file, then add it into the libs folder in your mod's root directory and add:
```
compileClassPath fileTree(dir: 'libs', include: ['*.jar'])
```
inside the dependencies part of your build.gradle file and add
```
[[dependencies.easychatlib]]
    modId="easychatlib"
    mandatory=true
# This version range declares a minimum of the current minecraft version up to but not including the next major version
    versionRange="[#.#.#,#.#)"
    ordering="NONE"
    side="BOTH"
```
into your mods.toml, replacing the hashes with the version number range.
<br><br>
I'd appreciate it if you provided a link to this GitHub where ever you post your mod.

# Documentation?
Documentation is in the form of a javadoc jar, released alongside other jars. You can look up how to import javadocs in your IDE of choice.