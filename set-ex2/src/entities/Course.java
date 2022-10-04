package entities;

import java.util.Objects;

public class Course {

	private Integer studentCode;

	public Course(Integer studentCode) {
		this.studentCode = studentCode;
	}

	public Integer getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(Integer studentCode) {
		this.studentCode = studentCode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(studentCode, other.studentCode);
	}
}
