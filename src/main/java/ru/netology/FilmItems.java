package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class FilmItems {
    private int id;
    private String name;
    private int year;



 //    public FilmItems(int id, String name) {
   //     this.id = id;
    //    this.name = name;
   // }

    //public int getId() {
     //   return id;
   // }
}
