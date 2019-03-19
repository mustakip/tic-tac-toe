package com.tictactoe;

import java.util.Arrays;
import java.util.List;


public enum Combinations {
  HORTOP(Arrays.asList(1, 2, 3)),
  HORMID(Arrays.asList(4, 5, 6)),
  HORBOTTOM(Arrays.asList(7, 8, 9)),
  VERLEFT(Arrays.asList(1, 4, 7)),
  VERMID(Arrays.asList(2, 5, 8)),
  VERRIGHT(Arrays.asList(3, 6, 9)),
  BACKDAIGONAL(Arrays.asList(1, 5, 9)),
  FRONTDAIGONAL(Arrays.asList(3, 5, 7)),
  COMBINATIONS(
    Arrays.asList(
      HORTOP.getCombinations(),
      HORMID.getCombinations(),
      HORBOTTOM.getCombinations(),
      VERLEFT.getCombinations(),
      VERMID.getCombinations(),
      VERRIGHT.getCombinations(),
      BACKDAIGONAL.getCombinations(),
      FRONTDAIGONAL.getCombinations()));

  private List combinations;


  Combinations(List list) {
    this.combinations = list;
  }

  public List<Integer> getCombinations() {
    return combinations;
  }
}
