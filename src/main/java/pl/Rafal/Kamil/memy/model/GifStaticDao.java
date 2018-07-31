package pl.Rafal.Kamil.memy.model;

import pl.Rafal.Kamil.memy.dao.GifDao;

import java.util.LinkedList;
import java.util.List;

public class GifStaticDao implements GifDao {
    private static List<Gif> gifs = new LinkedList<>();


    static {

        gifs.add( new Gif(1, "android-explosion"));
        gifs.add(new Gif (2, "ben-and-mike"));
        gifs.add(new Gif (3, "book-dominos"));
        gifs.add(new Gif (4, "compiler-bot"));
        gifs.add(new Gif (5, "cowboy-coder"));
        gifs.add(new Gif (6, "infinite-andrew"));

    }


    public List<Gif> findAll() {
        return gifs;
    }



}
