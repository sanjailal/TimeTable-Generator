
public class CourseDetails {
	
		String course_name;
		String fac_name; // Not initialized yet
		int credits;
		String section;
		boolean isLab;
		int course_id;
		int occurence;
		public CourseDetails(String course_name, int course_id, int credits, String section, boolean isLab) {
			this.course_name  = course_name;
			this.course_id = course_id;
			this.credits = credits;
			this.section = section;
			this.isLab = isLab;
			if(isLab==true) {
				occurence = 1;
			}
			else {
				occurence = credits;
			}
		}
		
		public void showCourseDetails() {
			System.out.println("Course Name: " + this.course_name + "\nCourse ID:" + this.course_id + "\nCredits: " + this.credits + "\nSection:" + this.section + "\nLab:" + this.isLab + "\n");
		}
}
