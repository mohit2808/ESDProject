insert into students (id, email, first_name, last_name, password, roll_no
) values (1, "student1@gmail.com", "std1", "std1", "student1", 1);

insert into courses (id, course_code, name) values (1, "CS001", "Algorithm");

insert into students (id, email, first_name, last_name, password, roll_no)
values (2, "student2@gmail.com", "std2", "std2", "student2", 2),
       (3, "student3@gmail.com", "std3", "std3", "student3", 3),
       (4, "student4@gmail.com", "std4", "std4", "student4", 4),
       (5, "student5@gmail.com", "std5", "std5", "student5", 5),
       (6, "student6@gmail.com", "std6", "std6", "student6", 6),
       (7, "student7@gmail.com", "std7", "std7", "student7", 7);

insert into courses (id, course_code, name)
values (2, "CS002", "Software System"),
       (3, "CS003", "Machine Learning"),
       (4, "CS004", "Concrete Mathematics"),
       (5, "CS005", "Advanced Algorithm"),
       (6, "CS006", "Competetive Programming");

insert into faculty_courses (id, course_id, faculty_id)
values (1, 1, 202),
       (2, 5, 202),
       (3, 6, 202);

insert into student_courses (id, course_id, student_id)
values (1, 1, 1),
       (2, 1, 2),
       (3, 1, 3),
       (4, 1, 4),
       (5, 2, 1),
       (6, 2, 2),
       (7, 2, 3),
       (8, 2, 4),
       (9, 6, 1),
       (10, 6, 2),
       (11, 5, 5),
       (12, 5, 6),
       (13, 5, 7);

insert into course_schedule (id, building, day, room, time, course_id)
values (1, "Ramanujan", "Monday", "R103", "9:30", 1),
       (2, "Ramanujan", "Monday", "R203", "11:30", 5),
       (3, "Ramanujan", "Monday", "R203", "14:00", 6),
       (4, "Ramanujan", "Wednesday", "R103", "9:30", 1),
       (5, "Ramanujan", "Wednesday", "R203", "11:30", 5),
       (6, "Ramanujan", "Wednesday", "R203", "14:00", 6);
