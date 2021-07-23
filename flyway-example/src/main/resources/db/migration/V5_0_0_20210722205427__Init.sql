CREATE TABLE user
(
	username VARCHAR(255) NOT NULL,
	password VARCHAR(255) NULL,
	CONSTRAINT pk_user PRIMARY KEY (username)
);