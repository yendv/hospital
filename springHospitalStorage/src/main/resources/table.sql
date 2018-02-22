USE hospital;
CREATE TABLE gues_user (
	id_user INT(20) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    code_user varchar(30),
	first_name nvarchar(30),
	last_name nvarchar(30),
	email VARCHAR(50),
	register_date timestamp,
    phone VARCHAR(30),
    birthday_user timestamp DEFAULT CURRENT_TIMESTAMP,
    person_number VARCHAR(30) NOT NULL
);

CREATE TABLE hospital(
	id_hospital INT(20) UNSIGNED AUTO_INCREMENT PRIMARY KEY,gues_usergues_user
    code_hospital varchar(30),
    name_hospital VARCHAR(300) NOT NULL,
    confirm_api_link varchar(30)
);

CREATE TABLE register(
	id_register INT(20) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    gues_user_id varchar(20),
    hospital_id varchar(20),
    register_day TIMESTAMP,
    is_confirm boolean,
    message_details nvarchar(500)
);