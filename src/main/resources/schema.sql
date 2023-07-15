CREATE TABLE line_user (
  id INT PRIMARY KEY NOT NULL,
  email VARCHAR(64) NOT NULL,
  full_name VARCHAR(32) NOT NULL,
  car_number VARCHAR(16) NOT NULL,
  line_user_id VARCHAR(64) NOT NULL,
  PRIMARY KEY (id)
);

-- CREATE TABLE IF NOT EXISTS line_user(
--         id INT(10) NOT NULL,
--         email VARCHAR(64) NOT NULL,
--         car_number VARCHAR(16) NOT NULL,
--         line_user_id VARCHAR(64) NOT NULL
--         );

-- CREATE TABLE IF NOT EXISTS coupon_info(
--         id INT(10) AUTO_INCREMENT PRIMARY KEY NOT NULL,
--         client_code INT(10) NOT NULL,
--         area_code VARCHAR(50) NOT NULL ,
--         store_code VARCHAR(50) NOT NULL ,
--         content_type VARCHAR(32)
--         content_details VARCHAR(200)
--         );

-- CREATE TABLE IF NOT EXISTS coupon_user_relation(
--         id INT(10) AUTO_INCREMENT PRIMARY KEY NOT NULL,
--         line_user_id VARCHAR(64) NOT NULL,
--         coupon_info_id INT(10) NOT NULL,
--         usable_number INT,
--         use_number INT
--         );