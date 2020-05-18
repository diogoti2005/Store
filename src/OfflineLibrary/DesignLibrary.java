package OfflineLibrary;

import java.util.List;

abstract public class  DesignLibrary {
private String[] arrBook = {};
private String[] arrVideo= {};
private String[] arrNewspaper = {};


    abstract void addAnItem(List element); // remove from list
    abstract void returnAnItem(Object o);

}

