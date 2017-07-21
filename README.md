# MySearchViewExample

The idea of this example is to show how to easily use the `SearchView` and be able to execute a search within the same `Activity`.

The example is very basic, screenshots below:

![Screenshot_1500656923.png](https://github.com/crlsndrsjmnz/MySearchViewExample/blob/master/screenshots/Screenshot_1500656923.png) ![Screenshot_1500656957.png](https://github.com/crlsndrsjmnz/MySearchViewExample/blob/master/screenshots/Screenshot_1500656957.png) ![Screenshot_1500656950.png](https://github.com/crlsndrsjmnz/MySearchViewExample/blob/master/screenshots/Screenshot_1500656950.png)

The main files to look on this project are:

* [MainActivity.java](https://github.com/crlsndrsjmnz/MySearchViewExample/blob/master/app/src/main/java/co/carlosandresjimenez/android/mysearchviewexample/MainActivity.java)

    In here you can setup the listener and execute the search process. After performing the search you can clear search bar, the focus and collapse the bar back to an icon.

* [menu_main.xml](https://github.com/crlsndrsjmnz/MySearchViewExample/blob/master/app/src/main/res/menu/menu_main.xml)

    In here you setup the collapsable `SearchView` as a menu item that stays collapsed until the user clicks and expands to be able to perform the search.

You can also find more information about the `SearchView` on the link below:

* [Search Overview](https://developer.android.com/guide/topics/search/index.html)
