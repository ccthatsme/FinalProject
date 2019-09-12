package co.grandcircus.FinalProject.recipeApiEntity;

public class ConvertAmount {

	private Double sourceAmount;
	private String sourceUnit;
	private Double targetAmount;
	private String answer;
	
	public ConvertAmount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConvertAmount(Double sourceAmount, String sourceUnit, Double targetAmount, String answer) {
		super();
		this.sourceAmount = sourceAmount;
		this.sourceUnit = sourceUnit;
		this.targetAmount = targetAmount;
		this.answer = answer;
	}

	public Double getSourceAmount() {
		return sourceAmount;
	}

	public void setSourceAmount(Double sourceAmount) {
		this.sourceAmount = sourceAmount;
	}

	public String getSourceUnit() {
		return sourceUnit;
	}

	public void setSourceUnit(String sourceUnit) {
		this.sourceUnit = sourceUnit;
	}

	public Double getTargetAmount() {
		return targetAmount;
	}

	public void setTargetAmount(Double targetAmount) {
		this.targetAmount = targetAmount;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "ConvertAmount [sourceAmount=" + sourceAmount + ", sourceUnit=" + sourceUnit + ", targetAmount="
				+ targetAmount + ", answer=" + answer + "]";
	}
	
}

