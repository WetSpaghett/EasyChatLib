# EasyChatLib
EasyChatLib is a library mod that adds an easy way to send chat messages without having to worry about ITextComponents.
<br>
It was originally part of my [poomod](https://www.github.com/wetspaghett/minecraft-poo-mod), but i decided to turn it into a library.

# How to use?
This mod is built for Minecraft 1.12.2
<br>
All you have to do is add the dev jar file into the libs folder in your mod's root directory and add:
```
compile fileTree(dir: 'libs', include: ['*.jar'])
```
inside the dependencies part of your build.gradle file and add
```
dependencies = "required-after:easychatlib@[v#.#.#,)"
```
into your @Mod interface in your main mod class, replacing the hashes with the version number.
<br>
Make sure to provide a link to this github so your mod's players can use the mod.
<br>
You may package this mod with yours if you provide credit.

# Documentation?
Documentation is hosted [here](https://wetspaghett.github.io/EasyChatLib/).