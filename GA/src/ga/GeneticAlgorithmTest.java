package ga;

/**  
*@Description:     
*/ 
 
public class GeneticAlgorithmTest extends GeneticAlgorithm{
	
	public static final int NUM = 1 << 22;//22位二进制

	public GeneticAlgorithmTest() {
		super(22);  
	}
	
	@Override
	public double changeX(Chromosome chro) {
		// TODO Auto-generated method stub  
		// -1≤X≤2
//		return ((1.0 * chro.getNum() / NUM) * 100) + 6;
		return ((1.0 * chro.getNum() / NUM) * 3) - 1;
	}

	@Override
	public double caculateY(double x) {
		// TODO Auto-generated method stub  
		//return 100 - Math.log(x);
		// y = xsin(10πx)+2
		return 2.0 + x * Math.sin(10 * (Math.PI) * x);
	}

	public static void main(String[] args) {
		GeneticAlgorithmTest test = new GeneticAlgorithmTest();
		test.caculte();
	}
}