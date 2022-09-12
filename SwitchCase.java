class SwitchCase {
	public static void main(String[] args) {
		byte x= 10;
		final int y=10;
		switch(x+1){
		    case 10:
		    System.out.println("Case -1");
		    break;
		    case 20:
		    System.out.println("Case -2");
		    break;
		    case 300:
		    System.out.println("Case -3");
		    break;
		    default:
		    System.out.println("default");
		    break;
		    }
	}
}