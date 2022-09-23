public class recap1 {
    public static void main(String[] args) {

        int x=20;

        int y=80;

        int z=60;

        int enbüyüksayý=x;

        if(enbüyüksayý<y){
            enbüyüksayý=y;
        }

        if(enbüyüksayý<z){
            enbüyüksayý=z;
        }
        
        if(x<y && x<z){
            if (y>z){
                System.out.println(y+">"+z+">"+x);
            } else if (z>y) {
                System.out.println(z+">"+y+">"+x);
            }
        }

        if(y<x && y<z){
            if (x>z){
                System.out.println(x+">"+z+">"+y);
            } else if (z>y) {
                System.out.println(z+">"+x+">"+y);
            }
        }


        if(z<x && z<y){
            if (x>y){
                System.out.println(x+">"+y+">"+z);
            } else if (z>y) {
                System.out.println(z+">"+x+">"+y);
            }
        }

        System.out.println(enbüyüksayý);

        /*if(x>y && x>z){
            System.out.println(x);
        }else if(y>x&&y>z){
            System.out.println(y);
        }else {
            System.out.println(z);
        }*/
    }

}
