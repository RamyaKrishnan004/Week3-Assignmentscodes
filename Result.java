package week3.assignment;

public class Result extends Deaktop {
	
		public void softwareResources() {
			
			System.out.println("Software Resources ");
		}
		
		public void hardwareResources() {
			
			System.out.println("Hardware Resourses");
		}
		
		@Override
		 public void desktopModels() {
			
			 System.out.println("Abstract class methods");
		 }
		 
		 public static void main(String[] args) {
			Result obj = new Result();
			obj.hardwareResources();
			obj.softwareResources();
			obj.desktopModels();
		}
}
