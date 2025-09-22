
import java.util.*;

public class StudentAttendanceTracker {

    public static Map<String, Integer> computeAttendance(List<List<String>> attendanceLists) {
        Map<String, Integer> attendanceMap = new HashMap<>();

        for (List<String> dailyList : attendanceLists) {
            for (String student : dailyList) {
                attendanceMap.put(student, attendanceMap.getOrDefault(student, 0) + 1);
            }
        }
        return attendanceMap;
    }

    public static void main(String[] args) {
        List<String> day1 = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> day2 = Arrays.asList("Alice", "David");
        List<String> day3 = Arrays.asList("Bob", "Charlie", "David");

        List<List<String>> attendanceLists = Arrays.asList(day1, day2, day3);

        Map<String, Integer> result = computeAttendance(attendanceLists);

        System.out.println("Student Attendance:");
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " attended " + entry.getValue() + " days");
        }
    }
}
