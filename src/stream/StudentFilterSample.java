package stream;

import java.util.ArrayList;
import java.util.List;

public class StudentFilterSample {
  public static void main(String[] args) {

    StudentFilterSample sample = new StudentFilterSample();
    List<StudentDTO> studentList = new ArrayList<>();

    studentList.add(new StudentDTO("요다", 43, 99, 70));
    studentList.add(new StudentDTO("만두", 30, 71, 85));
    studentList.add(new StudentDTO("건빵", 32, 81,99));

    sample.filterWithScoreForLoop(studentList, 80);
  }

  private void filterWithScoreForLoop(List<StudentDTO> studentList, int scoreCutLine) {
    for (StudentDTO student : studentList) {
      if (student.getScoreEnglish() > scoreCutLine) {
        System.out.println(student.getName());
      }
    }

    studentList.stream().filter(student -> student.scoreEnglish > scoreCutLine)
        .forEach(student -> System.out.println(student.getName()));
  }
}
