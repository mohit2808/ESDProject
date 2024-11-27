ALTER TABLE CourseSchedule
    ADD CONSTRAINT fk_course_schedule_course
        FOREIGN KEY (course_id) REFERENCES Courses(id);

-- FacultyCourses references Faculty
ALTER TABLE FacultyCourses
    ADD CONSTRAINT fk_faculty_courses_faculty
        FOREIGN KEY (faculty_id) REFERENCES Faculty(id);

-- FacultyCourses references Courses
ALTER TABLE FacultyCourses
    ADD CONSTRAINT fk_faculty_courses_course
        FOREIGN KEY (course_id) REFERENCES Courses(id);

-- StudentCourses references Students
ALTER TABLE StudentCourses
    ADD CONSTRAINT fk_student_courses_student
        FOREIGN KEY (student_id) REFERENCES Students(id);

-- StudentCourses references Courses
ALTER TABLE StudentCourses
    ADD CONSTRAINT fk_student_courses_course
        FOREIGN KEY (course_id) REFERENCES Courses(id);