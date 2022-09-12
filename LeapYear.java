class LeapYear {
	public static void main(String[] args) {
		int y = sc.nextInt();
              String s= (y%400==0) || (y%4 ==0 && y%100 != 0) ?"Leap Year": "Not Leap Year";
              System.out.println(s);
	}
}