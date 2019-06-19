package com.example.androidpemula;

import java.util.ArrayList;

public class PresidentData {
    public static String[][] data = new String[][]{
            {"Ainsley Maitland-Niles", "Arsenal FC", "https://www.thesportsdb.com/images/media/player/thumb/3775d71510853007.jpg"},
            {"Alexandre Lacazette", "Arsenal FC", "https://www.thesportsdb.com/images/media/player/thumb/f0i81c1510852903.jpg"},
            {"Bernd Leno", "Arsenal FC", "https://www.thesportsdb.com/images/media/player/thumb/shcmfk1533645517.jpg"},
            {"Danny Welbeck", "Arsenal FC", "https://www.thesportsdb.com/images/media/player/thumb/82uics1544986067.jpg"},
            {"Granit Xhaka", "Arsenal FC", "https://www.thesportsdb.com/images/media/player/thumb/gmva7w1510860115.jpg"},
            {"Hector Bellerin", "Arsenal FC", "https://www.thesportsdb.com/images/media/player/thumb/agkw071510851996.jpg"},
            {"Henrikh Mkhitaryan", "Arsenal FC", "https://www.thesportsdb.com/images/media/player/thumb/qvwcq31520755890.jpg"}
    };

    public static ArrayList<President> getListData(){
        President president = null;
        ArrayList<President> list = new ArrayList<>();
        for (String[] aData : data) {
            president = new President();
            president.setName(aData[0]);
            president.setRemarks(aData[1]);
            president.setPhoto(aData[2]);

            list.add(president);
        }

        return list;
    }
}
