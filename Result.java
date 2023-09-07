//Program for results
class History{
	int mark1;
	History(int mark1)
	{
		this.mark1=mark1;
	}
	void Histmark()
	{
		System.out.println("History = "+mark1);
	}
}

class Politics extends History{
	int mark2;
	Politics(int mark1,int mark2){
		super(mark1);
		this.mark2=mark2;
	}
	void Politicdisp()
	{	
		System.out.println("Politics = "+mark2);
	}
}

class Socialstudies extends Politics{
	int mark3;	
	int total;
	Socialstudies(int mark1,int mark2,int mark3){
		super(mark1,mark2);
		this.mark3=mark3;
		total= mark1+mark2+mark3;
	}
	void totaldisplay(){
		System.out.println("Geography = "+mark3);
		System.out.println("Total in Social Studies = "+total);
	}
}
public class Result {

	public static void main(String[] args) {
		Socialstudies res = new Socialstudies(40,10,48);
		res.Histmark();
		res.Politicdisp();
		res.totaldisplay();

	}

}
