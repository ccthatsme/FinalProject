package co.grandcircus.FinalProject.helpers;

//import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import co.grandcircus.FinalProject.jpaEntity.AutoSubtraction;
import co.grandcircus.FinalProject.jpaEntity.Food;
import co.grandcircus.FinalProject.jpaEntity.Pantry;
import co.grandcircus.FinalProject.repository.AutoSubtractionRepository;
import co.grandcircus.FinalProject.repository.FoodRepository;

@Component
public class ScheduledSubtractHandler {
	
	//private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	//private ArrayList<AutoSubtraction> subList;
	
	@Autowired
	FoodRepository fRepo;
	
	@Autowired
	AutoSubtractionRepository aRepo;
	
	CookingUnitConverter converter = new CookingUnitConverter();
	
	public ScheduledSubtractHandler() {
		super();
		//ADD TESTING SUBTRACTION TO LIST. REOMVE LATER
	}

//	public ScheduledSubtractHandler(ArrayList<AutoSubtraction> subList) {
//		super();
//		this.subList = subList;
//		//ADD TESTING SUBTRACTION TO LIST. REMOVE LATER
//		AutoSubtraction a = aRepo.findAll().get(0);
//		subList.add(a);
//		System.out.println(a);
//	}

//	@Scheduled(fixedRate = 5000)
//    public void reportCurrentTime() {
//        System.out.println("The time is now " + dateFormat.format(new Date()));
//	}
	
	@Scheduled(fixedRate = 50000)
	public void handleAutoSubtractions() {
		ArrayList<AutoSubtraction> subList = (ArrayList<AutoSubtraction>) aRepo.findAll();
		for (AutoSubtraction sub : subList) {
			
			//get info on each autosubtraction in the list
			Food f = sub.getFood();
			
			String u = sub.getQuantityUnit();
			
			Pantry p = sub.getPantry();
			
			Double currentQuantity = f.getQuantity();
			
			double quantityToSubtract = sub.getQuantity();
			
			double convertedSubtraction = converter.convert(quantityToSubtract, u, f.getQuantityUnit());
			
			//generate how much the new quantity should be
			double newQuant = currentQuantity - convertedSubtraction;
			
			//check if the new value would be less than 0 and if it would, set it to 0
			if (newQuant <= 0) {
				newQuant = 0;
				//System.out.println("You're out of " + f.getName() + "!");
			}
			
			
			f.setQuantity(newQuant);
			
			//save the updated value to the database
			fRepo.save(f);
			
			System.out.println("Subtracted " + sub.getQuantity() + " " + u + " of " + f.getName() + " for a new total of " + f.getQuantity() + " " + f.getQuantityUnit());
		}
	}
	
}
