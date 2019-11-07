import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str = str2;
		boolean c= false;
		str=str.toLowerCase();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(str.charAt(i)==str.charAt(j)){
					c=true;
					break;
				}
			}
		}
		if(c==true){
			System.out.println(str2+" is not an isogram");
		}
		else{
			System.out.println(str2 + " is an isogram");
		}
	}
}