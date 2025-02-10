# Adventure Game

This is a simple adventure game written in Java. The game involves a player progressing through levels, fighting enemies, collecting items, and earning experience points. The game is refactored to follow the SOLID principles to improve code maintainability and scalability.

## Game Overview

The game consists of the following elements:
- **Player**: The main character who progresses through the levels.
- **Enemies**: Different types of enemies (Zombie, Skeleton, Creeper) that the player fights.
- **Combat**: The combat system that handles fights between the player and enemies.
- **Items**: Collectible items that give the player benefits like healing or experience.
- **Levels**: The game progresses through levels with increasing difficulty.
- **Score**: The player's score is based on their experience points.

## How to Run

To run the game, simply compile and execute the `MainGame.java` file. Make sure all the other files are placed correctly in their respective directories as shown below.

```bash
📂 src
│   ├── 📂 player
│   │   ├── Player.java
│   ├── 📂 combat
│   │   ├── CombatManager.java
│   ├── 📂 enemies
│   │   ├── Enemy.java
│   │   ├── Skeleton.java
│   │   ├── Zombie.java
│   │   ├── Creeper.java
│   ├── 📂 items
│   │   ├── ItemManager.java
│   ├── 📂 level
│   │   ├── LevelManager.java
│   ├── 📂 score
│   │   ├── ScoreManager.java
│   ├── MainGame.java
