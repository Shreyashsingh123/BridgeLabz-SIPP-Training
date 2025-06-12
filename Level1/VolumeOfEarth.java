class VolumeOfEarth {
public static void main(String[] args) {
double radius=6378;
double volumeinKm=(4.0/3)*3.14*Math.pow(radius, 3);
double volumeMiles=volumeinKm/Math.pow(1.6,3);
System.out.println("The volume of earth in cubic kilometers is " + volumeinKm + " and cubic miles is " + volumeMiles);
    }
}
