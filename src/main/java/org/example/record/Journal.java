package org.example.record;

public record Journal(int id, String name) {

    /*
    public Journal{    //1
        id = id+1;
    }
     */

    public Journal(int id, String name){ //2
        this.id = id;
        this.name = name;
    }
}
