
public class Pfive {
public static void main(String[] args){
	String[] studentNames=new String[10];
	studentNames[0]="Htet Lwin Aung";
	studentNames[1]="Hnin Yee Aye";
	studentNames[2]="Hnin Nandar Aung";
	studentNames[3]="Nan May Mi Zhue";
	studentNames[4]="Phyo Zin Mar";
	studentNames[5]="Phyo Ei San";
	studentNames[6]="Thae Nu San";
	studentNames[7]="Thike Non";
	studentNames[8]="Lwin Nadar Oo";
	studentNames[9]="Khin Thu Thu Ko";
	
	for(int i=0;i<studentNames.length;i++){
		if(studentNames[i]=="Nan May Mi Zhue"){
			System.out.println("I'm "+studentNames[i]);
			System.out.println("and my index is: " + i);
		}
	}
	
}
}