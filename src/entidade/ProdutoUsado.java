package entidade;

import java.text.SimpleDateFormat;
import java.util.Date;
public class ProdutoUsado extends Produto{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;

	public ProdutoUsado(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return getName() 
				+ " (usado) $ " 
				+ String.format("%.2f", getPrice())
				+ " (Data de fabricacao: "
				+ sdf.format(manufactureDate)
				+ ")";
	}
}