package co.grandcircus.FinalProject.helpers;
import co.grandcircus.FinalProject.entity.jsonEntity.Product;
import co.grandcircus.FinalProject.jpaEntity.Food;
public class ProductConverter {
    
    public Food convertFood(Product prod) {
        Food food = new Food();
        food.setName(prod.getFood_name());
        food.setQuantity((double) prod.getServing_qty());
        food.setQuantityUnit(prod.getServing_unit());
        food.setCalories(prod.getNf_calories());
        food.setCarbs(prod.getNf_total_carbohydrates());
        food.setProtein(prod.getNf_protein());
        food.setSugar(prod.getNf_sugars());
        food.setFat(prod.getNf_total_fat());
        return food;
        
    }
}





