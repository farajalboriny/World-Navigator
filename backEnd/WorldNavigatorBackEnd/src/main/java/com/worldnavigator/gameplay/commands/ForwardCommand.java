package com.worldnavigator.gameplay.commands;

import com.worldnavigator.archeticture.map.DefaultRoom;
import com.worldnavigator.managers.PartsManager;
import com.worldnavigator.archeticture.parts.abstracts.RoomPart;
import com.worldnavigator.archeticture.parts.impl.NormalDoor;
import com.worldnavigator.managers.EntitiesManager;
import com.worldnavigator.managers.NonPlayerCharManager;
import com.worldnavigator.gameplay.Player;
import com.worldnavigator.gameplay.Printer;
import com.worldnavigator.gameplay.exceptions.IllegalCommandException;

import java.util.List;

public class ForwardCommand implements Command {
  private final Printer printer;

  public ForwardCommand(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void execute(Player player) throws IllegalCommandException {
    NonPlayerCharManager.tradeModeCheck(player);
    if (PartsManager.getParts(player).IsNextDoor(player)) {
      NormalDoor door = getForwardDoor(player);
      if (door.isOpen()) {
        DefaultRoom backwardRoom =
            EntitiesManager.getPreviousOrNextRoom(
                PartsManager.getParts(player).getNext(player), player);
        if (NavigationManager.checkFight(player, backwardRoom)) {
          printer.print("there is a fight in this room please wait");
          return;
        }
        player.setCurrentRoomId(PartsManager.getParts(player).getNext(player));
        player.resetOrientations();
        printer.print("you moved to another room");
        NavigationManager.checkFloor(player);
        NavigationManager.checkPresentPlayers(player);
        return;
      }
      throw new IllegalCommandException("you must open the door first");
    }

    throw new IllegalCommandException(
        "There is no room in backward direction,"
            + "if it is a winning door you must open it to win");
  }

  private NormalDoor getForwardDoor(Player player) throws IllegalCommandException {
    List<RoomPart> list = PartsManager.getAvailableParts(player);
    for (RoomPart roomPart : list) {
      if (roomPart instanceof NormalDoor) {
        return (NormalDoor) roomPart;
      }
    }
    throw new IllegalCommandException("There is no door to go through");
  }
}
