create table employee_info (
employee_id serial primary key not null,
employee_first_name varchar(20) not null,
employee_last_name varchar(20) not null,
phone_number numeric(10) not null,
email varchar(30) unique not null,
user_password varchar(20) not null
);

drop table employee_info;

create table account_type (
acc_id serial primary key not null,
type varchar(20) default 'Employee' not null,
constraint fk_accid_empinfo foreign key (acc_id) references employee_info (employee_id)
);

drop table account_type;

create table employee_reimbursements (
reimburse_id serial,
reimburse_amount numeric(14,2) not null,
submission_date DATE not null,
submission_time timestamp not null,
constraint fk_reimbid_empinfo foreign key (reimburse_id) references employee_info (employee_id)
);

drop table employee_reimbursements;