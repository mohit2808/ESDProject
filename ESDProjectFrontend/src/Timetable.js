import React, { useState } from "react";
import axios from "axios";

function Timetable({ email, token }) {
  const [timetable, setTimetable] = useState([]);
  const [students, setStudents] = useState([]);
  const [showStudents, setShowStudents] = useState(false);

  // Fetch timetable by email (email is sent in the URL)
  const fetchTimetable = async () => {
    try {
      const response = await axios.get(
        `http://localhost:8080/api/v1/faculty/${email}/timetable`,
        {
          headers: {
            Authorization: `Bearer ${token}`,
          },
        }
      );
      setTimetable(response.data);
      setShowStudents(false); // Reset student view
    } catch (error) {
      alert("Error fetching timetable: " + error.message);
    }
  };

  // Fetch students for a specific course (courseCode passed as parameter)
  const fetchStudents = async (courseCode) => {
    try {
      const response = await axios.get(
        `http://localhost:8080/api/v1/course/${courseCode}/studentsenrolled`,
        {
          headers: {
            Authorization: `Bearer ${token}`,
          },
        }
      );
      setStudents(response.data);
      setShowStudents(true);
    } catch (error) {
      alert("Error fetching students: " + error.message);
    }
  };

  return (
    <div>
      <h2>Welcome, {email}</h2>
      <button onClick={fetchTimetable}>View Timetable</button>

      <div>
        {timetable.length > 0 && !showStudents && (
          <table border="1">
            <thead>
              <tr>
                <th>Time</th>
                <th>Day</th>
                <th>Room</th>
                <th>Building</th>
                <th>Course Code</th>
                <th>Course Name</th>
              </tr>
            </thead>
            <tbody>
              {timetable.map((item, index) => (
                <tr key={index}>
                  <td>{item.time}</td>
                  <td>{item.day}</td>
                  <td>{item.room}</td>
                  <td>{item.building}</td>
                  <td>
                    <a href="#!" onClick={() => fetchStudents(item.course_code)}>
                      {item.course_code}
                    </a>
                  </td>
                  <td>{item.course_name}</td>
                </tr>
              ))}
            </tbody>
          </table>
        )}

        {showStudents && (
          <div>
            <h3>Student List</h3>
            <ol>
              {students.map((student, index) => (
                <li key={index}>
                  {student.first_name} {student.last_name}
                </li>
              ))}
            </ol>
          </div>
        )}
      </div>
    </div>
  );
}

export default Timetable;
