package fi.iki.jka;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JPhotoFrameTest {

    @Test
    public void testDisplaySlideWhenThereAreNoPhotos() throws Exception {

        JPhotoCollection photoCollection = new JPhotoCollection();
        ErrorFake fakeError = new ErrorFake();
        Slide slide = new Slide(photoCollection, new JPhotoList(photoCollection, 0), fakeError);
        slide.displaySlide();
        assertThat("It calls the method that displays an error when there are no photos.",true, is(fakeError.getCalled()));


    }



    class ErrorFake implements ErrorInterface {

        private boolean called = false;

        public void displayError() {
            this.setCalled(true);
        }

        public boolean getCalled() {
            return called;
        }

        public void setCalled(boolean called) {
            this.called = called;
        }
    }
}
