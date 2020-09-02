Players will login to the website and play the game.
The map consists of 50 rooms and 5 winning doors.

Each room can be thought of as a logical square and has four walls, a wall can have a painting, a chest, a mirror, a door, a seller or is 
just a plain wall. The player starts at the <Start> room and is facing one of the four walls.

Commands:

Navigation commands: left, right, forward, backward, playerstatus (gives which direction the player is facing North, South, West, East
and the amount of gold and items that he has)

Forward and backward will only move through open doors and left and right will change the orientation of the player.

look: this command returns the following (Does not work if the room is dark):

Dark, if the room is not lit.

Door, if the room is lit and the player is facing a door.

Wall, if the room is lit and the player is facing an empty wall.

Chest, if the room is lit and the player is facing a chest.

Painting, if the room is lit and the player is facing a painting.

Seller, if the room is lit and the player is facing a Seller.

You See a silhouette of you if the room is lit and the player is facing a mirror.

Check: this command takes these arguments:

Mirror: will work only if facing a mirror, if a key is hidden behind the mirror will acquire the named key “The <name> key was acquired”.

Painting: will work only if facing a painting, if a key is hidden behind the painting will acquire the named key “The <name> key was acquired”.

Chest: will work only if facing a chest, if the chest is closed “chest closed <name> key is needed to unlock”, if it is open the items inside the 
chest are listed and looted/acquired and could contain (named key, flashlight, or N gold where N is either a random number or a specific number set by the map).

Door: will work only if facing a door, if the door is locked “Door is locked, <name> key is needed to unlock” and if it is open “Door is open”.

Open, will open a door if the player is facing a door and it is unlocked and if the door is open “nothing happens” or if locked “<named> key required to unlock”

Trade, will work only if the player is facing a seller, will list the seller’s available items (including possibly a flashlight and specifically
named keys with prices in gold, the items of the seller are specified by the map). The subcommands of Trade are:

Buy <item>: if enough gold is with the player will “<item> bought and acquired” otherwise, the seller will say “return when you have enough gold”

Sell <Item>: The seller will have a price list of any item type that can be on the map and will offer that amount for any item that you have.
You can buy back items at the same price.

List: will list seller items again.

Finish Trade, will exit the trade mode.

Use flashlight: will turn it on if it is off and vice versa and a dark room will become lit if the flashlight is on.

Use <name> Key: will open if a door/chest requires the <name> key to open and it is locked and will lock the door/chest if it is open.


SwitchLights, if the room has lights it will turn them on if they are off and vice versa, 
if the lights are on the room should not be dark and if they are off it must be dark.


No limit is put on the number of players. Also, all players have names that are shown on the screen.

Initiially, all players present in different rooms (selected randomly)

To ensure fairness, initially, all players  have the same amount of gold (i.e., 20 gold coins).
Furthermore, let all keys in the game worth the same amount ( 10 gold coins) and flashlights are worth 2 gold coins

Players play the game simultaneously 

During the game, If two players happen to meet, they must fight and the loser immediately exits the game

The fighting rules are simple: the player with the more gold wins ( 10 gold coins for each key and 2 gold coins for each flashlight). In a case of a tie, 
the two players play rock-paper-scissor to choose a winner. Furthermore, the winner player obtains all the items of the loser player. 
The game ends when a player exits a special door,  the game has only one winner.
A player may give up and exit the game at anytime. In such a case,
player who wants to give up throw all of his/her items on the floor.
Afterwards, another player who happened to walk in into this room will automatically obtain all the items on the floor.
The game ends automatically after a specific timeout (with no winner). 

