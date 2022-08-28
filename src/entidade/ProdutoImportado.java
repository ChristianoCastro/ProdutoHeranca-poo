package entidade;


public class ProdutoImportado extends Produto {
    private Double customsFee;

	public ProdutoImportado(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Taxa de alfandega: $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	}
}