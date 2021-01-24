
show databases;
CREATE DATABASE buycars;
use buycars;
SELECT * FROM buyers;

/*   private int seller_id;
     private String seller_name;
     private String seller_surname;
     private String email_address;
     private String mobile_contact; */

/* buyer_id, buyer_name, buyer_surname, emailaddress, mobile_contact, vehicle_id */

INSERT INTO buyers VALUES(1,'Tom','Hawkings','TommyH@gmail.com','0785419922');
INSERT INTO buyers VALUES(2,'Muzi','Mzolo','MrMzolo@gmail.com','0764429823');
INSERT INTO buyers VALUES(3,'Jerry','Manson','JerryM@yahoo.com','0796319921');
INSERT INTO buyers VALUES(4,'Nosipho','Mbatha','Nossy@gmail.com','0714219933');
INSERT INTO buyers VALUES(5,'Katlego','Maphanga','KatleeH@yahoo.com','0673244644');

 
use buycars;
SELECT * FROM sellers;

INSERT INTO sellers VALUES(1001,'Marry','Brooks','MarryBrooks@gmail.com','0667432881',202); /* Polo TSI */
INSERT INTO sellers VALUES(1002,'Mark','Manson','MarkManson@gmail.com','0763318312',212); /* Mazda 2 */
INSERT INTO sellers VALUES(1003,'Louis','Lampard','Louis@gmail.com','0685208810',204); /* Suzuki Swift */
INSERT INTO sellers VALUES(1004,'Mpho','Mohale','MandM@yahoo.com','0723108822', 218); /* Ford Mustand */
INSERT INTO sellers VALUES(1005,'Thabiso','Nkuna','Thabz@gmail.com','0662133535', 217); /* Nissan GTR */

INSERT INTO ourCars VALUES(202,'Volkswagen','Polo TSI',2011,1,1001);
INSERT INTO ourCars VALUES(212,'Mazda','Mazda 2',2013,null,1002);
INSERT INTO ourCars VALUES(204,'Suzuki','Swift',2016,3,1003);
INSERT INTO ourCars VALUES(218,'Ford','Mustang',2018,5,1004);
INSERT INTO ourCars VALUES(206,'Maserati','Grand Tourismo',2017,2,null);
INSERT INTO ourCars VALUES(221,'Ford','Fortuner',2012,null,null);
INSERT INTO ourCars VALUES(217,'Nissan','Skyline GT-R',2017,2,1005);

UPDATE ourCars SET seller_id = 1001 WHERE vehicle_id = 206;
UPDATE ourCars SET seller_id = 1005 WHERE vehicle_id = 221;

SELECT * FROM ourCars oc ;

CREATE TABLE sellers (seller_id int PRIMARY KEY, seller_name VARCHAR(30), seller_surname VARCHAR(30), 
email_address VARCHAR(30), mobile_contact VARCHAR(30), vehicle_id int, 
FOREIGN KEY vehicle_id REFERENCES ourCars(vehicle_id)); 


CREATE TABLE ourCars (vehicle_id int PRIMARY KEY, make VARCHAR(30), model make VARCHAR(30), year_of_make int, 
buyer_id int, seller_id int, FOREIGN KEY buyer_id REFERENCES buyers(buyer_id), 
FOREIGN KEY seller_id REFERENCES sellers(seller_id));

/* 
 * Price, Mileage?
 */






/*
 *   private int vehicle_id, make, model, yearOfMake, buyer_id(fk), seller_id(fk);
 */

