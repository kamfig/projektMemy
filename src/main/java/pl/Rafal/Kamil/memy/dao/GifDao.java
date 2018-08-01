package pl.Rafal.Kamil.memy.dao;

import pl.Rafal.Kamil.memy.model.Gif;

import java.util.List;

public interface GifDao {
    List<Gif> findAll();
    List<Gif> findAllFavorites();

    Gif getGifById(int id);



}