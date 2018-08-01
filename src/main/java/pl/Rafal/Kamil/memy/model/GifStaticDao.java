package pl.Rafal.Kamil.memy.model;

import pl.Rafal.Kamil.memy.dao.GifDao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GifStaticDao implements GifDao {
    private static List<Gif> gifs = new LinkedList<>();
    private static List<Gif> favorites = new LinkedList<>();



    static {

        gifs.add(new Gif(1, "android-explosion",true));
        gifs.add(new Gif (2, "ben-and-mike"));
        gifs.add(new Gif (3, "book-dominos"));
        gifs.add(new Gif (4, "compiler-bot",true));
        gifs.add(new Gif (5, "cowboy-coder"));
        gifs.add(new Gif (6, "infinite-andrew",true));

    }


    public List<Gif> findAll() {
        return gifs;
    }

    public List<Gif> findAllFavorites(){

        favorites = new ArrayList<>();
        for (Gif gif : gifs){
            if ( gif.isFavorite()){
                favorites.add(gif);
            }
        }
        return favorites;
    }




}
