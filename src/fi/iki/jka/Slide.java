package fi.iki.jka;


public class Slide {
    JPhotoCollection photos;
    JPhotoList list;
    private ErrorInterface error;

    public Slide(JPhotoCollection photos, JPhotoList list, ErrorInterface error) {
        this.photos = photos;
        this.list = list;
        this.error = error;

    }

    void displaySlide() {
        if (photos.getSize() > 0) {
            JPhotoShow show = new JPhotoShow(photos, 5000, list);
            show.setVisible(true);
        } else
            error.displayError();
    }

}