package com.example.shinelon.eat_app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Shinelon on 17/10/2019.
 */

public class Database {


    public static Food getFoodById(int foodID) {
        return foods.get(foodID);
    }

    public static ArrayList<Food> getAllFoods() {
        return new ArrayList<Food>((List) Arrays.asList(foods.values().toArray()));
    }

    private static final HashMap<Integer, Food> foods = new HashMap<>();


    static {
        foods.put(1, new Food(
                1,
                "Old School Cheese Burger",
                13,
                " Beef patty,American cheese,onion,mustard, pickles,  BBQ sauce and aioli.",

                R.drawable.download
        ));
        foods.put(2, new Food(
                2,
                "Chips",
                4,
                "Single Chips",
                R.drawable.chips
        ));
        foods.put(3, new Food(
                3,
                "Gilled Chicken Tenders Pack",
                11,
                "A 4-pack of lightly marinated 100%chicken breast tenders",
                R.drawable.grilled_chicken_tenders_pack
        ));
        foods.put(4, new Food(
                4,
                "Half Chicken",
                8,
                "Half succulent chicken, flame-grilled flat and brush-basted with your choice of sauce ",
                R.drawable.half_chicken
        ));
        foods.put(5, new Food(
                5,
                "Chicken Salad",
                12,
                "100% chicken tenders served on premium lettuce mix, fresh tomato and olives mayo",
                R.drawable.chicken_salad
        ));
        foods.put(6, new Food(
                6,
                "Pad See Eiw",
                13,
                "Flat rice noodle with black soy sauce egg and Chinese broccoli",
                R.drawable.pad_see_eiw
        ));
        foods.put(7, new Food(
                7,
                "Beef Noodle Soup",
                13,
                "Rare beef,tender beef briket , flat rice noodles in 24 hour slow cooked ,fresh chilli and bean sprouts",
                R.drawable.beef_noodels
        ));
        foods.put(8, new Food(
                8,
                "BBQ Chicken Biryani",
                17,
                "Mughlai style basmati rice cooked with bbq chicken and special spices",
                R.drawable.chicken_biryani
        ));
        foods.put(9, new Food(
                9,
                "Chips",
                6,
                "vwvrwv",
                R.drawable.chips
        ));
        foods.put(8, new Food(
                8,
                "BBQ Chicken Biryani",
                17,
                "Mughlai style basmati rice cooked with bbq chicken and special spices",
                R.drawable.chicken_biryani
        )); foods.put(8, new Food(
                8,
                "BBQ Chicken Biryani",
                17,
                "Mughlai style basmati rice cooked with bbq chicken and special spices",
                R.drawable.chicken_biryani
        )); foods.put(8, new Food(
                8,
                "BBQ Chicken Biryani",
                17,
                "Mughlai style basmati rice cooked with bbq chicken and special spices",
                R.drawable.chicken_biryani
        )); foods.put(8, new Food(
                8,
                "BBQ Chicken Biryani",
                17,
                "Mughlai style basmati rice cooked with bbq chicken and special spices",
                R.drawable.chicken_biryani
        )); foods.put(8, new Food(
                8,
                "BBQ Chicken Biryani",
                17,
                "Mughlai style basmati rice cooked with bbq chicken and special spices",
                R.drawable.chicken_biryani
        )); foods.put(8, new Food(
                8,
                "BBQ Chicken Biryani",
                17,
                "Mughlai style basmati rice cooked with bbq chicken and special spices",
                R.drawable.chicken_biryani
        ));
    }
}