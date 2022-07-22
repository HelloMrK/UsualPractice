package indi.likai.test;

public class FishSafeOrNot {
    public static void main(String[] args) {

        FishSafeOrNot f=new FishSafeOrNot();
        System.out.println(f.isDanger(14,1) );

    }
    static String isDanger(int s,int x){
        double odo=0;
        double speed=7.0;
        boolean isInDangerArea=false;
        while (true){
            odo+=speed;
            speed*=0.98;
            //into danger area
            if (odo>s-x){
                isInDangerArea=true;
            }
            if (isInDangerArea){
                //next sec,pass the danger area
                if (odo+speed*0.98>s+x){
                    return "n";
                }
                //next sec,still in danger area
                else {
                    return "y";
                }
            }
        }
    }
}
