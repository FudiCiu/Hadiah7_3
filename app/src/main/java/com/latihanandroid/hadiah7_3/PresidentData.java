package com.latihanandroid.hadiah7_3;

import java.util.ArrayList;

public class PresidentData {
    public static String[][] data=new String[][]{
            {"Soekarno", "Presiden Pertama RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/220px-Presiden_Sukarno.jpg"},
            {"Soeharto", "Presiden Kedua RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/President_Suharto%2C_1993.jpg/200px-President_Suharto%2C_1993.jpg"},
            {"Bachruddin Jusuf Habibie", "Presiden Ketiga RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Foto_Presiden_Habibie_1998.jpg/220px-Foto_Presiden_Habibie_1998.jpg"},
            {"Abdurrahman Wahid", "Presiden Keempat RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/President_Abdurrahman_Wahid_-_Indonesia.jpg/220px-President_Abdurrahman_Wahid_-_Indonesia.jpg"},
            {"Megawati Soekarnoputri", "Presiden Kelima RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/President_Megawati_Sukarnoputri_-_Indonesia.jpg/440px-President_Megawati_Sukarnoputri_-_Indonesia.jpg"},
            {"Susilo Bambang Yudhoyono", "Presiden Keenam RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Presiden_Susilo_Bambang_Yudhoyono.png/220px-Presiden_Susilo_Bambang_Yudhoyono.png"},
            {"Joko Widodo", "Presiden Ketujuh RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/Joko_Widodo_2014_official_portrait.jpg/250px-Joko_Widodo_2014_official_portrait.jpg"}
    };
    public static ArrayList<President> getListPresident(){
        ArrayList<President> presidents= new ArrayList<>();
        for (int i=0;i<data.length;i++){
            presidents.add(new President(data[i][0],data[i][1],data[i][2]));
        }
        return presidents;
    }
}
