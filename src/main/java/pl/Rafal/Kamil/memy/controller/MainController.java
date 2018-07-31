package pl.Rafal.Kamil.memy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.Rafal.Kamil.memy.model.GifStaticDao;

@Controller
public class MainController {
    @GetMapping("/")
    public String listGifs(ModelMap modelMap){
        GifStaticDao gifStaticDao = new GifStaticDao();
        modelMap.put("gifs",gifStaticDao.findAll());
        return "home";
    }

    @GetMapping("/favorites")
    public String listFavorites(ModelMap modelMap){
        GifStaticDao gifStaticDao = new GifStaticDao();
        modelMap.put("favorites",gifStaticDao.findAllFavorites());
        return "favorites";
    }


}
