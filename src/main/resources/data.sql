drop table students;
create table if not exists students (
                                        id SERIAL NOT NULL PRIMARY KEY,
                                        firstname varchar(25) not null,
                                        surname varchar(25) not null,
                                        patronymic varchar(25) not null,
                                        birthdate varchar(25) not null,
                                        student_group varchar(25) not null
);
INSERT INTO students (id,firstname,surname,patronymic,birthdate,student_group) VALUES
(1,'Anton','Pesak','Pesakovich','19.04.97','PPM-14-1'),
(2,'Artem','Sevastianov','Resakovich','30.11.98','PPM-14-1'),
(3,'Alexander','Ivanov','Ivanovich','19.04.98','SM-14-1'),
(4,'Anton','Pesak','Pesakovich','30.06.97','SM-14-1');
