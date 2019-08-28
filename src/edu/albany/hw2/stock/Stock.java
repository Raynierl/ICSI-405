package edu.albany.hw2.stock;

enum symbol {
	
	MSFT("MICROSOFT"), APPL("APPLE"), GOGL("GOOGLE"), AMZN("AMAZON"), ATNT("AT&T");
	
	private String companyName;
	
	
	public String getCompanyName() {
		return companyName;
	}
	private symbol(String companyName) {
		this.companyName = companyName;
	}

	
}
public class Stock {
		
	private double currentPrice;
	private double previousClosingPrice;
	private symbol company;
	
	public Stock(String name) {
	
		company = symbol.valueOf(name);
		System.out.println(company.getCompanyName());
	 
	}
	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	public symbol getCompany() {
		return company;
	}
	public void changePercentage() {
		System.out.print("Most recent stock price change percentage: ");
		double temp = this.currentPrice - this.previousClosingPrice;
		System.out.printf("%.2f",(temp / this.previousClosingPrice * 100));
		System.out.println("%");
	}

	public static void main(String[] args) {
		
		Stock M = new Stock("MSFT");
		M.setPreviousClosingPrice(58.9);
		M.setCurrentPrice(59);
		M.changePercentage();
		
		Stock G = new Stock("GOGL");
		G.setPreviousClosingPrice(54.9);
		G.setCurrentPrice(92.6);
		G.changePercentage();
		
		
	}

}

