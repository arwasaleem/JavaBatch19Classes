package org.example.class19;

public class BrowserTester2 {
    public static void main(String[] args) {
        // Polymorphism
//        Chrome chrome=new Chrome();
//        FireFox fireFox=new FireFox();
//        Safari safari=new Safari();
//        Browser [] arr={chrome, fireFox, safari};
//        We are directly storing these in the line below

        Browser[] arr = {new Chrome(), new FireFox(), new Safari()};
        for (int i = 0; i < arr.length; i++) {
            Browser b = arr[i];
            b.openBrowser();
            b.openWebsite();
            b.performTesting();
            b.closeBrowser();
        }


    }
}
