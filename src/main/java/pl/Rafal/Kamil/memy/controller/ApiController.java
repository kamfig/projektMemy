package pl.Rafal.Kamil.memy.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.Rafal.Kamil.memy.dao.GifDao;
import pl.Rafal.Kamil.memy.model.Gif;
import pl.Rafal.Kamil.memy.model.GifStaticDao;

@RestController
@RequestMapping(path = "/api")
public class ApiController {

    @GetMapping("/gifs")
    public Iterable<Gif> all(){
        GifStaticDao gifStaticDao = new GifStaticDao();
        return gifStaticDao.findAll();
    }

}
