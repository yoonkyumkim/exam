package test;

public class test1 {
	public static void main(String[] args) {
		int size = 4;
		for(int y = 0; y<size+3;y++){
			for(int x = 0; x<(size*2)+1;x++){
				if(	x+y<size || x-y>size || 
					y>size && (size+2)-x >size || 
					y>size && (size*2)-1 < x+1 ){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
