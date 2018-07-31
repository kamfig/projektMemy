package pl.Rafal.Kamil.memy.model;

public class Gif {
    private Integer id;
    private String name;

    private boolean favorite;

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    //    public Gif(){
//    }

    public Gif(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Gif(Integer id, String name, boolean favorite) {
        this.id = id;
        this.name = name;
        this.favorite = favorite;
    }

    public String getPath() {
        return "gifs/" + getName() + ".gif";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Gif{" +
                "name='" + name + '\'' +
                '}';
    }


}
