import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {

    ArrayList<String> desertIslandPlaylist = new ArrayList<>();
    // Adding songs to my playlist
    desertIslandPlaylist.add("Night Changes");
    desertIslandPlaylist.add("Messed Up");
    desertIslandPlaylist.add("Nobody Else");
    desertIslandPlaylist.add("Stay");
    desertIslandPlaylist.add("Pretty Girl");
    desertIslandPlaylist.add("rocket science");
    System.out.println(desertIslandPlaylist);
    // Check the number of songs on my playlist
    System.out.println(desertIslandPlaylist.size());
    // Check the size of my playlist after removing a song
    desertIslandPlaylist.remove("Pretty Girl");
    System.out.println(desertIslandPlaylist.size());

    // Swap Songs
    int indexSong1 = desertIslandPlaylist.indexOf("Stay");
    int indexSong2 = desertIslandPlaylist.indexOf("Messed Up");
    desertIslandPlaylist.set(indexSong1, "Messed Up");
    desertIslandPlaylist.set(indexSong2, "Stay");
    System.out.println(desertIslandPlaylist);
  }
  
}