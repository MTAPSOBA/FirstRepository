package comparatorInterface;

public class Student {

	private String fName;
	private String lName;
	private float testScore;
	private int highSchooolMathGrade;
	private int highSchoolEnglishScore;

	@Override
	public String toString() {
		return "Student [fName=" + fName + ", lName=" + lName + ", testScore=" + testScore + ", highSchooolMathGrade="
				+ highSchooolMathGrade + ", highSchoolEnglishScore=" + highSchoolEnglishScore + "]";
	}

	public Student(String fName, String lName, float testScore, int highSchooolMathGrade, int highSchoolEnglishScore) {

		this.fName = fName;
		this.lName = lName;
		this.testScore = testScore;
		this.highSchooolMathGrade = highSchooolMathGrade;
		this.highSchoolEnglishScore = highSchoolEnglishScore;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public float getTestScore() {
		return testScore;
	}

	public void setTestScore(float testScore) {
		this.testScore = testScore;
	}

	public int getHighSchooolMathGrade() {
		return highSchooolMathGrade;
	}

	public void setHighSchooolMathGrade(int highSchooolMathGrade) {
		this.highSchooolMathGrade = highSchooolMathGrade;
	}

	public int getHighSchoolEnglishScore() {
		return highSchoolEnglishScore;
	}

	public void setHighSchoolEnglishScore(int highSchoolEnglishScore) {
		this.highSchoolEnglishScore = highSchoolEnglishScore;
	}

}
