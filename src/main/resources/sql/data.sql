drop table users if exists;
drop table teams if exists;
drop table tasks if exists;
drop table activities if exists;
drop table commentaries if exists;

create table users(
	user_id		serial primary key,
	team_id		integer,
	f_name		varchar(40) not null,
	last_name varchar(40) not null,
	m_name varchar(40),
	birth_date date not null,
	employment_date date not null
);

create table teams(
	team_id		serial unique,
	team_name	varchar(40) not null,
	description varchar(400) not null,
	team_lead_id integer
);

create table tasks(
	task_id serial primary key,
	team_id integer,
	initialized_by integer not null,
	current_user_id integer not null,
	start_date date,
	elapsed_time integer,
	estimate_time integer,
	status varchar(15),
	task_type varchar(15),
	task_header varchar(150),
	description varchar(2000)
);

create table activities(
	task_id integer,
	description varchar(400),
	elapsed_time integer,
	user_id integer
);

create table commentaries(
	task_id integer,
	description varchar(400),
	comment_date timestamp,
	user_id integer
);