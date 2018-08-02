package pl.Rafal.Kamil.memy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.Rafal.Kamil.memy.model.Gif;
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

//    @GetMapping("/search")
//    public String serchButton(@RequestParam String q,ModelMap modelMap){
//        GifStaticDao gifStaticDao = new GifStaticDao();
//        modelMap.put("gifs",gifStaticDao.szukaj(q));
//        return "home";
//    }

    @GetMapping("/search")
    public String search(ModelMap modelMap, String q) {
        GifStaticDao gifStaticDao = new GifStaticDao();
        modelMap.put("gifs", gifStaticDao.find(q));
        if (gifStaticDao.find(q).size() == 0) {
            modelMap.put("message", "EEEE Inne Errory");
        }
        return "home";
    }
//    @GetMapping("/gif/details")
//    public String tego(){
//        return "gif-details";
//    }

    @GetMapping("/gif/{id}")
    public String detales(@PathVariable Integer id, ModelMap modelMap){
        GifStaticDao gifStaticDao = new GifStaticDao();
        modelMap.addAttribute("gif",gifStaticDao.getGifById(id));
        return "gif-details";
    }
}
