package com.example.androidpemula;

import java.util.ArrayList;

public class InfoPresidenData {
    public static String[][] data = new String[][]{
            {"https://www.thesportsdb.com/images/media/player/thumb/3775d71510853007.jpg","Ainsley Cory Maitland-Niles (born 29 August 1997) is an English professional footballer who plays as a midfielder, winger or right back for Premier League club Arsenal", "1997-08-29", "Arsenal FC","1.77 m"},
            {"https://www.thesportsdb.com/images/media/player/thumb/f0i81c1510852903.jpg","Alexandre Lacazette (born 28 May 1991) is a French footballer who plays as a forward for English club Arsenal and the France national team", "28 May 1991", "Arsenal FC","1.75 m"},
            {"https://www.thesportsdb.com/images/media/player/thumb/shcmfk1533645517.jpg","Bernd Leno (born 4 March 1992) is a German professional footballer who plays as a goalkeeper for Premier League club Arsenal and the German national team.", "4 March 1992", "Arsenal FC","1.90 m"},
            {"https://www.thesportsdb.com/images/media/player/thumb/82uics1544986067.jpg","Daniel Nii Tackie Mensah \\\"Danny\\\" Welbeck (born 26 November 1990) is an English professional footballer who plays as a centre-forward for Arsenal and the England national team", "26 November 1990", "Arsenal FC","1.85 m"},
            {"https://www.thesportsdb.com/images/media/player/thumb/gmva7w1510860115.jpg","Granit Xhaka (born 27 September 1992) is a Swiss professional footballer who plays as a midfielder for English club Arsenal and the Switzerland national team", "27 September 1992", "Arsenal FC","1.85 m"},
            {"https://www.thesportsdb.com/images/media/player/thumb/agkw071510851996.jpg","Héctor Bellerín Moruno (born 19 March 1995) is a Spanish professional footballer who plays as a right back or wing back for Premier League club Arsenal and the Spain national team", "19 March 1995", "Arsenal FC","1.78 m"},
            {"https://www.thesportsdb.com/images/media/player/thumb/qvwcq31520755890.jpg","Henrikh Mkhitaryan  born 21 January 1989) is an Armenian professional footballer who plays as a midfielder for English club Arsenal, as well as captaining the Armenia national team", "21 January 1989", "Arsenal FC","1.78 m"}
    };

    public static ArrayList<InfoPresiden> getListData(){
        InfoPresiden president = null;
        ArrayList<InfoPresiden> list = new ArrayList<>();
        for (String[] aData : data) {
            president = new InfoPresiden();
            president.setFoto(aData[0]);
            president.setInfo(aData[1]);
            president.setLahir(aData[2]);
            president.setWafat(aData[3]);
            president.setTinggiBadan(aData[4]);

            list.add(president);
        }

        return list;
    }
}
