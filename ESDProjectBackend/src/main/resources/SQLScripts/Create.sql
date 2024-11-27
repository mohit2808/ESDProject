CREATE TABLE Courses (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         course_code VARCHAR(255) NOT NULL UNIQUE,
                         name VARCHAR(255)
);

CREATE TABLE CourseSchedule (
                                id BIGINT PRIMARY KEY,
                                course_id BIGINT NOT NULL,
                                time VARCHAR(255),
                                day VARCHAR(255),
                                room VARCHAR(255),
                                building VARCHAR(255)
);

CREATE TABLE Faculty (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         first_name VARCHAR(255) NOT NULL,
                         last_name VARCHAR(255),
                         email VARCHAR(255) NOT NULL UNIQUE,
                         password VARCHAR(255) NOT NULL
);

CREATE TABLE FacultyCourses (
                                id BIGINT PRIMARY KEY,
                                faculty_id BIGINT NOT NULL,
                                course_id BIGINT NOT NULL
);

CREATE TABLE Students (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          roll_no VARCHAR(255) NOT NULL UNIQUE,
                          first_name VARCHAR(255) NOT NULL,
                          last_name VARCHAR(255),
                          email VARCHAR(255) NOT NULL UNIQUE,
                          password VARCHAR(255) NOT NULL
);

CREATE TABLE StudentCourses (
                                id BIGINT PRIMARY KEY,
                                student_id INT NOT NULL,
                                course_id BIGINT NOT NULL
);