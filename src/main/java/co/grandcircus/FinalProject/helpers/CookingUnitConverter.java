package co.grandcircus.FinalProject.helpers;

public class CookingUnitConverter {
	
	//conversions for tablespoon, teaspoon, cups, ounces
	
	public double teaspoonToTableSpoon(double teaSpoon) {
		double tableSpoon = teaSpoon / 3;
		return tableSpoon;
	}
	
	public double teaspoonToOunces(double teaSpoon) {
		double ounces = teaSpoon / 6;
		return ounces;
	}
	
	public double teaspoonToCups(double teaSpoon) {
		double cups = teaSpoon / 48;
		return cups;
	}
	
	public double tablespoonToTeaSpoon(double tablespoon) {
		double teaspoon = tablespoon * 3;
		return teaspoon;
	}
	
	public double tablespoonToOunces(double tablespoon) {
		double ounces = tablespoon / 2;
		return ounces;
	}
	
	public double tablespoonToCups(double tablespoon) {
		double cups = tablespoon / 16;
		return cups;
	}
	
	public double ouncesToCups(double ounces) {
		double cups = ounces / 8;
		return cups;
	}
	
	public double ouncesToTableSpoons(double ounces) {
		double tablespoons = ounces * 2;;
		return tablespoons;
	}
	
	public double ouncesToTeaSpoons(double ounces) {
		double teaspoons = ounces * 6;
		return teaspoons;
	}
	
	public double cupsToOunces(double cups) {
		double ounces = cups * 8;
		return ounces;
	}
	
	public double cupsToTeaSpoons(double cups) {
		double teaspoons = cups * 48;
		return teaspoons;
	}
	
	public double cupsToTableSpoons(double cups) {
		double tablespoons = cups * 16;
		return tablespoons;
	}

}
