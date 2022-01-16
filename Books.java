
public class Books {
	String Btitle;
	String Bauthor;
	String Bnum_of_pages;
	String Bpublisher;
	
	public String getBtitle() {
		return Btitle;
	}
	public void setBtitle(String Btitle) {
		this.Btitle = Btitle;
	}
	public String getBauthor() {
		return Bauthor;
	}
	public void setBauthor(String Bauthor) {
		this.Bauthor = Bauthor;
	}
	public String getBnum_0f_pages() {
		return Bnum_of_pages;
	}
	public void setBnum_of_pages(String Bnum_of_pages) {
		this.Bnum_of_pages = Bnum_of_pages;
	}
	public String getBpublisher() {
		return Bpublisher;
	}
	public void setBpublisher(String Bpublisher) {
		this.Bpublisher = Bpublisher;
	}
	public static void main(String[]args) {
		Books B1 = new Books();
		
		B1.setBtitle("Matilda");
		B1.setBauthor("Roald Dahl");
		B1.setBnum_of_pages("232");
		B1.setBpublisher("Jonathan Cape");
		
		System.out.println(B1.getBtitle());
		System.out.println(B1.getBauthor());
		System.out.println(B1.getBnum_0f_pages());
		System.out.println(B1.getBpublisher());
     }
		
	}
  
	
