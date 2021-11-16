CREATE DATABASE IF NOT EXISTS pivtorak;
USE pivtorak; 

DROP TABLE IF EXISTS meteostation_info ;
DROP TABLE IF EXISTS service;
DROP TABLE IF EXISTS meteostation;
DROP TABLE IF EXISTS battary;
DROP TABLE IF EXISTS producer ;
DROP TABLE IF EXISTS location ;
DROP TABLE IF EXISTS city ;
DROP TABLE IF EXISTS `pivtorak`.`interval` ;
DROP TABLE IF EXISTS wind_info ;


CREATE TABLE IF NOT EXISTS wind_info (
	id INT NOT NULL AUTO_INCREMENT,
	direction VARCHAR(20) NOT NULL,
	speed VARCHAR(45) NOT NULL,
  PRIMARY KEY (id));



CREATE TABLE IF NOT EXISTS `pivtorak`.`interval` (
	id INT NOT NULL AUTO_INCREMENT,
	date DATE NOT NULL,
	time VARCHAR(45) NOT NULL,
  PRIMARY KEY (id));


CREATE TABLE IF NOT EXISTS city (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  PRIMARY KEY (id));




CREATE TABLE IF NOT EXISTS location (
  id INT NOT NULL AUTO_INCREMENT,
  coordinates VARCHAR(45) NOT NULL,
  adress VARCHAR(45) NOT NULL,
  city_id INT NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_location_city
    FOREIGN KEY (city_id)
    REFERENCES city (id));



CREATE TABLE IF NOT EXISTS producer (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  country VARCHAR(45) NOT NULL,
  PRIMARY KEY (id));



CREATE TABLE IF NOT EXISTS battary (
  id INT NOT NULL AUTO_INCREMENT,
  capasity VARCHAR(45) NOT NULL,
  producer_id INT NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_battary_producer
    FOREIGN KEY (producer_id)
    REFERENCES producer (id));

CREATE INDEX battary_capasity_idx ON battary (capasity ASC);


CREATE TABLE IF NOT EXISTS meteostation (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  instalation_date DATE NOT NULL,
  location_id INT NOT NULL,
  producer_id INT NOT NULL,
  battary_id INT NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_meteostation_location
    FOREIGN KEY (location_id)
    REFERENCES location (id),
  CONSTRAINT fk_meteostation_producer
    FOREIGN KEY (producer_id)
    REFERENCES producer (id),
  CONSTRAINT fk_meteostation_battary
    FOREIGN KEY (battary_id)
    REFERENCES battary (id));

CREATE INDEX meteostation_instalation_date_idx ON meteostation (instalation_date ASC);



CREATE TABLE IF NOT EXISTS service (
  id INT NOT NULL AUTO_INCREMENT,
  description VARCHAR(45) NOT NULL,
  date DATE NOT NULL,
  PRIMARY KEY (id));



CREATE TABLE IF NOT EXISTS meteostation_info (
  id INT NOT NULL AUTO_INCREMENT,
  temperature VARCHAR(45) NOT NULL,
  humidity VARCHAR(45) NOT NULL,
  wind_id INT NOT NULL,
  interval_id INT NOT NULL,
  meteostation_id INT NOT NULL,
  service_id INT NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT fk_meteostation_wind
    FOREIGN KEY (wind_id)
    REFERENCES wind_info (id),
  CONSTRAINT fk_meteostation_interval
    FOREIGN KEY (interval_id)
    REFERENCES `pivtorak`.`interval` (id),
  CONSTRAINT fk_meteostation_info_id
    FOREIGN KEY (meteostation_id)
    REFERENCES meteostation (id),
  CONSTRAINT fk_meteostation_info_service
    FOREIGN KEY (service_id)
    REFERENCES service (id));


CREATE INDEX meteostation_info_idx ON meteostation_info (meteostation_id ASC);


INSERT INTO wind_info (`id`, `direction`, `speed`) VALUES ('1', 'north', '2'),
 ('2', 'west', '12'),
 ('3', 'nrth-west', '15'),
 ('4', 'east', '21'),
 ('5', 'north', '9'),
 ('6', 'west-east', '4'),
 ('7', 'unknown', '5'),
 ('8', 'south', '7'),
 ('9', 'іsouth-east', '8'),
 ('10', 'west', '17');

INSERT INTO `pivtorak`.`interval` (`id`, `date`, `time`) VALUES ('1', '2021-09-09', '12:00'),
('2', '2021-09-07', '13:00'),
('3', '2021-09-06', '13:45'),
('4', '2021-07-06', '13:55'),
('5', '2021-07-09', '7:00'),
('6', '2021-04-05', '00:20'),
('7', '2021-04-06', '00:45'),
('8', '2021-04-03', '7:45'),
('9', '2021-01-02', '8:15'),
('10', '2021-07-12', '8:25');

INSERT INTO city (`id`, `name`) VALUES ('1', 'Lviv'),
('2', 'Krakiv'),
('3', 'Obroshyno'),
('4', 'Lapaivka'),
('5', 'Ternopil'),
('6', 'Kyiv'),
('7', 'Odessa'),
('8', 'Kharkiv'),
('9', 'Kherson'),
('10', 'Zhytomyr');

INSERT INTO location (`id`, `coordinates`, `adress`, `city_id`) VALUES ('1', '123:00', 'vul.Veresneva', '1'),
('2', '1234:099', 'vul.Vesela', '3'),
('3', '1232:432', 'vul.Iot', '2'),
('4', '12342:431', 'vul.Dovzhenka', '4'),
('5', '12323:643', 'vul.Vladyslava', '6'),
('6', '1233:098', 'vul. Nekrasova', '2'),
('7', '123:098', 'vul.Shevchenka', '5'),
('8', '134:932', 'vul.Franka', '8'),
('9', '102:876', 'vul.Ukrainky', '5'),
('10', '120:764', 'vul.Kostenko', '9');

INSERT INTO producer (`id`, `name`, `country`) VALUES ('1', 'Atlanta', 'Poland'),
('2 ', 'KOMOLINE', 'England'),
('3', 'Dyacon', 'Poland'),
('4', 'Pulsonic', 'Ukraine'),
('5', 'Fairmount', 'Russia'),
('6', 'Cava', 'USA'),
('7', 'JDC', 'Switzerland'),
('8', 'Environtada', 'Australia'),
('9', 'Instrumex', 'India'),
('10', 'RainWise', 'USA');

INSERT INTO battary (`id`, `capasity`, `producer_id`) VALUES ('1', '123', '3'),
('2', '42', '2'),
('3', '21', '4'),
('4', '421', '5'),
('5', '543', '7'),
('6', '21', '1'),
('7', '532', '8'),
('8', '213', '1'),
('9', '213', '10'),
('10', '219', '8');

INSERT INTO meteostation (`id`, `name`, `instalation_date`, `location_id`, `producer_id`, `battary_id`) VALUES ('1', 'Astra', '2020-09-08', '1', '4', '2'),
('2', 'Asnda', '2020-06-18', '2', '3', '1'),
('3', 'Backed', '2019-04-03', '4', '7', '4'),
('4', 'Skold', '2019-07-03', '6', '2', '3'),
('5', 'Works', '2018-07-15', '8', '1', '10'),
('6', 'Pivts', '2019-03-12', '9', '5', '4'),
('7', 'Rout', '2018-04-16', '6', '3', '8'),
('8', 'Quater', '2016-08-18', '3', '8', '9'),
('9', 'Entre', '2019-10-10', '10', '10', '10'),
('10', 'Porte', '2020-11-11', '4', '9', '7');


INSERT INTO service (`id`, `description`, `date`) VALUES ('1', 'Lorem ipsum dolor sit ', '2021-09-15'),
('2', 'Everything ok', '2021-10-15'),
('3', 'Some issues', '2021-07-03'),
('4', 'Lorem ipsum dolor sit ', '2021-04-05'),
('5', 'Need to fix', '2021-11-04'),
('6', 'Lorem ipsum dolor sit ', '2021-03-14'),
('7', 'Not working', '2021-02-01'),
('8', 'Lorem ipsum dolor sit ', '2021-05-15'),
('9', 'Lorem ipsum dolor sit ', '2021-09-15'),
('10', 'Lorem ipsum dolor sit ', '2021-09-26');

INSERT INTO meteostation_info (`id`, `temperature`, `humidity`, `wind_id`, `interval_id`, `meteostation_id`, `service_id`) VALUES ('1', '21', '234', '1', '2', '2', '2'),
('2', '22', '214', '3', '5', '5', '4'),
('3', '14', '257', '2', '3', '3', '1'),
('4', '17', '207', '4', '7', '1', '5'),
('5', '18', '218', '5', '5', '7', '8'),
('6', '19', '209', '2', '9', '9', '4'),
('7', '26', '218', '5', '3', '2', '8'),
('8', '28', '227', '7', '8', '9', '4'),
('9', '21', '328', '8', '9', '1', '3'),
('10', '20', '220', '4', '10', '6', '2');
