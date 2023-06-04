CREATE DATABASE movie_ticket_management_system_CP;
use movie_ticket_management_system_CP;
CREATE TABLE signup(
 Name char(30) not null,
 email_id Char(50) not null,
 Contact_number integer(12) not null,
 prn_no integer(12),
 password Char(100) not null,
 confirmed_password char(100) not null
);
SELECT * FROM signup;

CREATE TABLE IF NOT EXISTS `table3` (
  `theatre` varchar(30) NOT NULL,
  `shows` varchar(30) NOT NULL,
  `tickets` int(5) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


select * from table3;
--
-- Dumping data for table `table3`
--

INSERT INTO `table3` (`theatre`, `shows`, `tickets`) VALUES
('Inox', '11:00AM', 250),
('Inox', '7:00AM', 296),
('City pride', '9:00PM', 250),
('Bund garden', '7:00AM', 250),
('PVR', '7:00AM', 255),
('Inox', '9:00PM', 300),
('Inox', '2:00PM', 260),
('Inox', '6:00PM', 250),
('City pride', '6:00PM', 350),
('City pride', '2:00PM', 241),
('City pride', '11:00AM', 300),
('Bund garden', '11:00AM', 300),
('Bund garden', '2:00PM', 250),
('Bund garden', '6:00PM', 350),
('Bund garden', '9:00PM', 250),
('City pride', '7:00AM', 260),
('PVR', '11:00AM', 300),
('PVR', '2:00PM', 250),
('PVR', '6:00PM', 350),
('PVR', '9:00PM', 250);

CREATE TABLE Suggestion(
 select_movie char(100) not null,
 des char(200)
);
SELECT * FROM Suggestion;

CREATE TABLE Contact(
Name char(30) not null,
Email_id char(50) not null,
Phone_no char(20) not null,
Message char(100)
);
SELECT * FROM Contact;

CREATE TABLE booked(
ID int not null Primary key auto_increment,
no_of_tickets char(20) not null,
theater char(100) not null,
movie char(100) not null,
date char(100) not null,
shows char(100) not null,
fare int(100) not null


);
SELECT * FROM booked;

