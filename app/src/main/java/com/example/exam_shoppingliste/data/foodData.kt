package com.example.exam_shoppingliste.data

enum class FoodType {
    Alimentation,
    Boisson,
    Hygiene,
    Maison
}

class foodData  (intitule: String,type : FoodType, qte:Long){
    public var _Intitule: String = intitule;
    public var _Type:  FoodType = type;
    public var _Qte:  Long = qte;
}


var itemsFood: MutableList<foodData> = mutableListOf(
    foodData("Coca", FoodType.Boisson, 5),
    foodData("Jambon", FoodType.Alimentation, 15)
)

