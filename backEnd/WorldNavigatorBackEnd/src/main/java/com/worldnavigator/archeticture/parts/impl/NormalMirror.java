package com.worldnavigator.archeticture.parts.impl;

import com.worldnavigator.archeticture.constants.Item;
import com.worldnavigator.archeticture.constants.PartType;
import com.worldnavigator.archeticture.parts.abstracts.Mirror;

public class NormalMirror implements Mirror {
  private boolean hasKey;
  private Item key;
  private PartType type;
  public NormalMirror() {}

  public NormalMirror(boolean hasKey, Item key) {
    this.hasKey = hasKey;
    this.key = key;
  }

  @Override
  public PartType getType() {
    return this.type;
  }

  @Override
  public String toString() {
    return getType().toString();
  }

  public void setType(PartType type) {
    this.type = type;
  }

  @Override
  public boolean hasKey() {
    return hasKey;
  }

  @Override
  public Item getKey() {
    return this.key;
  }

  @Override
  public void removeKey() {
    hasKey = false;
  }

  public boolean isHasKey() {
    return hasKey;
  }

  public void setHasKey(boolean hasKey) {
    this.hasKey = hasKey;
  }

  public void setKey(Item key) {
    this.key = key;
  }
}
