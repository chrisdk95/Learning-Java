import java.util.ArrayList;
import java.util.*;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Wizkid");
    desertIslandPlaylist.add("Drake");
    desertIslandPlaylist.add("J Cole");
    desertIslandPlaylist.add("Lil Wayne");
    desertIslandPlaylist.add("Rihanna");
    desertIslandPlaylist.add("Kanye West");
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove("Kanye West");

    // Get the indices of the songs you want to swap.
    int indexA = desertIslandPlaylist.indexOf("Rihanna");
    int indexB = desertIslandPlaylist.indexOf("J Cole");

    //Create a temporary variable to store the value of song a. (We’ll call the songs a and b here.)
    String tempA =  "Rihanna";
    //Rewrite the value at the index of a to the value of b.
    desertIslandPlaylist.set(indexA, "J Cole");
    //Rewrite the value at the index of b to the value of the temporary variable.
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);
    //a method that shuffles the song order.
    Collections.shuffle(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist);
    //Reverse the song order.
    Collections.reverse(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist);
  
  }
  
}
