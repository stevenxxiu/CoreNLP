package edu.stanford.nlp.process;

import junit.framework.TestCase;

public class AmericanizeTest extends TestCase {

  private String[] exBrEWords = new String[]{
    "colour", "encyclopaedia", "devour", "glamour", "armour",
    "haematophilia", "programme", "behaviours", "vapours", "travelling",
    "realise", "rumours", "detour", "Defence"
  };

  private String[] exAmEWords = new String[]{
    "color", "encyclopedia", "devour", "glamour", "armor",
    "hematophilia", "program", "behaviors", "vapors", "traveling",
    "realize", "rumors", "detour", "Defense"
  };

  public void testAmericanize() {
    Americanize am = new Americanize();
    assert(exBrEWords.length == exAmEWords.length);

    for (int i = 0; i < exBrEWords.length; i++) {
      assertEquals("Americanization failed to agree",
                   Americanize.americanize(exBrEWords[i]), exAmEWords[i]);
    }
  }

}
