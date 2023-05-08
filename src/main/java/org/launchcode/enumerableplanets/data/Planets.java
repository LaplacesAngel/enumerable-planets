package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury", 88,"https://upload.wikimedia.org/wikipedia/commons/c/c5/Mercury.jpg"),
    VENUS("Venus",225,"https://upload.wikimedia.org/wikipedia/commons/8/85/Venus_globe.jpg"),
    EARTH("Earth",365, "https://www.nasa.gov/sites/default/files/thumbnails/image/01-eclipse.jpg"),
    MARS("Mars", 687,"https://upload.wikimedia.org/wikipedia/commons/0/02/OSIRIS_Mars_true_color.jpg"),
    JUPITER("Jupiter", 4333,"https://upload.wikimedia.org/wikipedia/commons/e/e2/Jupiter.jpg"),
    SATURN("Saturn", 10759,"https://upload.wikimedia.org/wikipedia/commons/e/e2/Jupiter.jpg"),
    URANUS("Uranus", 30687, "https://upload.wikimedia.org/wikipedia/commons/e/e2/Jupiter.jpg"),
    NEPTUNE("Neptune", 60200, "https://upload.wikimedia.org/wikipedia/commons/e/e2/Jupiter.jpg");

    private final String name;
    private final Integer yearLength;

    private final String imageLink;

    Planets(String name, Integer yearLength, String imageLink) {
        this.name = name;
        this.yearLength = yearLength;
        this.imageLink = imageLink;
    }

    public String getName() {
        return name;
    }

    public Integer getYearLength() {
        return yearLength;
    }

    public String getImageLink() {
        return imageLink;
    }
}
