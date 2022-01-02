# EasyChatLib
EasyChatLib is a library mod that adds an easy way to send chat messages
without having to worry about ITextComponents.
<br>
It was originally part of my
[poomod](https://www.github.com/wetspaghett/minecraft-poo-mod),
but i decided to turn it into a standalone mod.

# How to use?
All you have to do is add the jar file
(either compiled or downloaded from releases)
into the libs folder in your mod's root directory and add:
```
compile fileTree(dir: 'libs', include: ['*.jar'])
```
inside the dependencies part of your build.gradle file.