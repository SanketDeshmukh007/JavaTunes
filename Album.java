import java.util.ArrayList;
import java.util.LinkedList;

public class Album 
{
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) 
    {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean findSong(String title){

        for(Song song : songs)
        {
            if(song.getTitle().equals(title)) return true;
        }
        return false;
    }

    public boolean addSong(String title, double duration)
    {
        if(!findSong(title))
        {
            songs.add(new Song(title,duration));
            System.out.println(title + " successfully added to the list");
            return true;
        }
        else 
        {
            System.out.println("Song with name "+ title+ " already exist in the list");
            return false;
        }
    }

    public boolean addToPlayList(String title, LinkedList<Song> PlayList)
    {
        for(Song song : this.songs)
        {
            if (song.getTitle().equals(title))
            {
                PlayList.add(song);
                return true;
            }
        }
        System.out.println(title + " there is no such song in album");
        return false;
    }
}