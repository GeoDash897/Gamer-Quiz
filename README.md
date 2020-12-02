[//]: # (Note!, for adding margin to images it goes- top margin, bottom margin, right margin, left margin)
<!-- omit in toc -->
# Hackathon Quiz Game
This is a quiz game based inspired by the video games we have played in our lives. 

It also was influenced by the [Impossible Quiz Series](https://impossible-quiz.fandom.com/wiki/Games)- especially [The Impossible Quiz Book: Chapter 2](https://impossible-quiz.fandom.com/wiki/The_Impossible_Quiz_Book#Chapter_2:_The_Phlovomite.27s_Guide_to_the_Galaxy).

![Java version](https://img.shields.io/badge/java%20ver-13-brightgreen)
![GitHub release (latest by date including pre-releases)](https://img.shields.io/github/v/release/GeoDash897/Hackathon-Quiz-Game?color=light&include_prereleases)
![GitHub commits since latest release (by date including pre-releases)](https://img.shields.io/github/commits-since/GeoDash897/Hackathon-Quiz-Game/latest?include_prereleases&logo=GitHub)
![GitHub repo size](https://img.shields.io/github/repo-size/GeoDash897/Hackathon-Quiz-Game?logo=GitHub)
<img src = "/GitHub Resources/Gameplay.gif" width = 1100 height = "500"/>

<!-- omit in toc -->
## Table of Contents
- [Things of Note](#things-of-note)
- [Installation](#installation)
  - [Things to Look Out For](#things-to-look-out-for)
- [Origins of Quiz](#origins-of-quiz)
- [Characteristics of Quiz](#characteristics-of-quiz)
- [Music](#music)
- [Era 1 (1970s-early 1980s)](#era-1-1970s-early-1980s)
  - [Boot Up Sequence](#boot-up-sequence)
  - [Scanlines](#scanlines)
  - [Command Line Typing](#command-line-typing)
- [Era 2 (1980s)](#era-2-1980s)
  - [Movement and Jumping](#movement-and-jumping)
  - [Hitting Blocks](#hitting-blocks)
- [Era 3 (1990s)](#era-3-1990s)
  - [Unique, Changing Backgrounds](#unique-changing-backgrounds)
  - [Custom Text](#custom-text)
- [Era 4 (2000s-Today)](#era-4-2000s-today)
  - [Minigame (Last Question of Quiz)](#minigame-last-question-of-quiz)
- [Controls](#controls)
    - [Era 1 Controls](#era-1-controls)
    - [Era 2 Controls](#era-2-controls)
    - [Era 3/4 Controls](#era-34-controls)
    - [Minigame (Last Question)](#minigame-last-question)
- [Collaborators](#collaborators)

## Things of Note 
While viewing this project, there is some context I would like to mention:
1. **This was the first Hackathon that my friends and I had attended**- this was an *entirely* new experience for us.
2. **This was the first project I led the development of**- I was the one that came up with the idea as well as the one who managed the project's development (I assigned each era of the quiz to one of my friends).
3. **Everyone in my friend group did not have the same OS to work on**- (mix of Chromebook, Windows, and Mac). This made it difficult to send files to each other and fix bugs.
4. **Not everyone in my friend group had a computer to work on**- Talha (having a Chromebook) had to wait to get a computer from the organizers of the event. This stalled initial progress on the project.
5. **The code to the project got accidently deleted during development**- During the later part of development, the code Era 2 got *deleted*- a fact that we found out about only a few hours before submission. We had to redo the entire section over quickly, causing bugs to be snuck in.

Note that if our group had done the project **more recently**, my friends and I would have done it in a much more **coherent way** (actually using the proper modifiers for variables, using classes, objects, etc). Keep this in mind as you view the project and its code.

## Installation
1. **Download** the zip, including the **exe** file in binaries.
2. **Unzip** the file.
3. Move the **exe** into the unzipped folder- it should be located in the same folder as the **src** folder

### Things to Look Out For
1. **The only files that you really need in order to play the game are the files in the src folder and the exe itself.** The other folders are just remnants of working on the project in NetBeans- so you can delete these files/folders if you want to.
2. **Make sure that the exe file is located in the same folder as the src folder**- this is so that the program can have access to correct images and sounds.
3. **Your anti-virus might flag the exe as being malware/a virus**- this is normal. If this happens, just accept the exe.

## Origins of Quiz
When I was in middle school, one of the things that I used to do during lunch was play games on the library’s computers.
I mainly played **flash games**- the *Run series*, *Ultimate Flash Sonic*, *Exit Path*, etc.

However, one game in particular stood out- **the Impossible Quiz**.<br />
**It was a quiz game centered around tricking the player** (trick answers, hiding the cursor, moving the screen).

Soon after beating the original game, I soon discovered its sequel **The Impossible Quiz Book**, a much larger quiz split into 3 chapters (each with their own theme).

In Chapter 2, the player has to help the main character escape from prison by updating a device (answering questions from the quiz).
I loved the how the aesthetic the quiz changed as the device was updated (moving from an early 80s computer terminal to 16 bit to even a modern HD flash animation style).

However, I felt that there were **more eras** that the game could have explored, so I decided to **create my own video-game themed quiz game.** While I never finished the project, I was proud about how I made each era unique. 

When the Hackathon arrived, my group and I realized that we had no idea in mind for a program. Remembering my previous experiences with the Impossible Book and my quiz, I proposed the idea of a video-game themed quiz. **This was the idea that stuck.**

**Going into the project, I had one goal in mind**- Make the quiz as best it could be.

Even though they are far from perfect, here are characteristics of the quiz:

## Characteristics of Quiz
## Music
Each era (part) of this quiz has its own **music theme** in order to better **characterize** that era.

## Era 1 (1970s-early 1980s)
The first part of the quiz takes place during the **1970s** and **1980s** at the dawn of the commercial PC boom. <br />
We decided to mimic an **IBM PC** from that time.

### Boot Up Sequence

<img src = "/GitHub Resources/Temp.gif" width = "1100" height = "500"/>

Many computers at the time had a standard boot up sequence, outlining various parts of the hardware being started.

In order to simulate this, we added a boot up sequence akin to what someone would have seen when booting up a computer from that era (Apple II/Apple III, IBM PC).

### Scanlines
During the 1970s and 1980s, many personal computer manufacturers remodeled already existing **CRT TVs** to use as monitors for their machines. This made it so that **scanlines** were visible when the monitor refreshed itself.

In order to simulate this, we programmed a transparent rectangle with lines that traveled down the screen to **simulate scanlines** one would have seen.

### Command Line Typing

<img src = "/GitHub Resources/Temp2.gif" width = "1100" height = "500"/>

Another characterisitic of computers at this time was the lack interactable GUIs. Computer owners had to master the **command line** in order to properly navigate and user their machine.

In order to simulate this, we allowed the player to **type** on a fake command line. They would have to type in the number of their choice and press **ENTER** to submit their choice.

## Era 2 (1980s)
The second part of the quiz takes place during the **1980s**. Unlike the first section, this part focuses on the **video game consoles** of the era (*Atari 2600*, *NES*).<br />
We decided to base this part around *Super Mario Bros*.

### Movement and Jumping

<img src = "/GitHub Resources/Mario Movement.gif" width = "1100" height = "500"/>

Upgrades to **8 bit** color, **8 bit** CPU architecture, and new sound cards allowed for new genres of games. One genre was the **platformer**.<br />
First brought forth by Atari 2600 classic *Pitfall* and then popularized further with NES hit *Super Mario Bros*, platformers dominated consoles during the 1980s.

In order to simulate that style of game, we made is so that the player could **move left**, **right**, as well as **jump**- controls of a typical platformer.

### Hitting Blocks

<img src = "/GitHub Resources/Hitting Blocks.gif" width = "1100" height = "500"/>

In *Super Mario Bros*, the player has the ability to **hit blocks** in the level around them, something crucial in obtaining power-ups and clearing paths.

In order to simulate this mechanic, we made it so that that player would have to **hit blocks** (the **answer choices**) in order to **select them**.

## Era 3 (1990s)
The third part of the quiz takes place during the **1990s** and focuses more-so on **consoles** during that era.<br />
This part is a bit different as we **didn’t** try to intimidate a **specific game** from that time.

### Unique, Changing Backgrounds

<img src = "/GitHub Resources/Backgrounds.gif" width = "1100" height = "500"/>

The 1990s was a time of **great change** for video games- PCs proving themselves to be places for gaming, SEGA’s effort to compete against the titan of Nintendo, creation of new companies, etc.<br />
One characteristic that was noticeable was the emergence of many **distinct types** of games- each one competing to be the **next big thing**.

In order to represent this **diversity**, we made each question have a **background** based on **different games** from that time (*Super Mario World*, *Metal Slug 3*, etc).

### Custom Text

<img src = "/GitHub Resources/Sonic Text.gif" width = "1100" height = "500"/>

One thing that helped encapsulate the diversity previously mentioned was the **use of fonts**. The creation of the **16-bit** colors allowed for fonts of varied **color palettes and styles**- shown by the likes of *Phantasy Star*, *Super Mario World*, *Secret of Mana*, *Chrono Trigger*, etc.

In order to represent this usage, we decided to display both the **questions** and **answers** using *Sonic the Hedgehog 3* **text sprites** rather than plain text.

## Era 4 (2000s-Today)
The last part of the quiz focuses more on **recent games** and shifts its focus on modern **computer** games.
Similarly to the last section, this part focuses on the general characteristics of the time rather than a specific game. 
We used *Minecraft* for the specific background of this part.

### Minigame (Last Question of Quiz)

<img src = "/GitHub Resources/Minigame.gif" width = "1100" height = "500">

One key characteristic of this era was the rise of **indie games**, video games being created from non Triple A companies. Due to their smaller size/scale, these games were able to explore **new topics/concepts** that more mainstream games could not/decided not to.

In order to represent this, we decided to make a **parody** of the final boss fight of *Undertale*, an indie RPG that obtained mass popularity in 2015. The player has to hit **Sans** with their attack in order to finish the game.

## Controls
While the controls are similar for the most part between eras, they have slight differences.
#### Era 1 Controls
* **1, 2, 3, 4 Number Keys** - Type out that respective number on CMD line.
* **Enter Key** - Submit current answer on CMD line.
#### Era 2 Controls
* **Left Key** - Move left.
* **Right Key** - Move right.
* **Space Key** - Jump.
* **Enter Key** - Submit current answer choice.
#### Era 3/4 Controls
* **Left Key** - Move select left answer choice.
* **Right Key** - Move select right answer choice.
* **Up Key** - Move select answer choice above.
* **Down Key** - Move select answer choice below.
* **Enter Key** - Submit current answer choice.
#### Minigame (Last Question)
* **Left Key** - Move left.
* **Right Key** - Move right.
* **Up Key** - Move up.
* **Down Key** - Move down.
* **Space Key** - Shoot projectile.

## Collaborators
I want to say thanks to all of my friends who helped with this project (and staying with me for 24 hours):
* [Hub-Omega](https://github.com/Hub-Omega)- lead developer of [Era 1](#era-1-1970s-early-1980s).
* [TalhaMasood-0](https://github.com/TalhaMasood-0)- lead developer of [Era 2](#era-2-1980s), the game's question bank, helped with era's code rewrite.
* [Rhinoguana](https://github.com/Rhinoguana)- lead developer of [Era 4](#era-4-2000s-today) and its Minigame.

I was the main developer of [Era 3](#era-3-1990s) and was in charge of combining the different parts of the project together.
