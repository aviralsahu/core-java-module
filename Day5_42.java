 import java.util.Scanner;
class Tile{
    int edge;
    int area;

    Tile(){}

    Tile(int edge){
        this.edge = edge;
        this.area = edge*edge; 
    }
    
}

class Floor{
    int length;
    int width;
    int area;

    Floor(){}

    Floor(int length, int width){
        this.length = length;
        this.width = width;
        this.area = length*width;
    }
    int totalTiles(Tile t){
        int total = this.area/t.area;
        return total;
    }
     
}

public class tile_42 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 
	    Tile t = new Tile(10);
	    Floor f = new Floor(100, 500);
	    System.out.println("Total no of tiles required : "+f.totalTiles(t));
	}
}
