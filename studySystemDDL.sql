drop database if exists studysystem;
create database studysystem;
use studysystem;


create table knowledgepoint
	(kp_id			int auto_increment,
	 content		varchar(255) not null,
	 chapter		varchar(32),
	 section		varchar(32),
	 primary key (kp_id)
	);

/* 问题父表 */
create table question
	(que_id int auto_increment,
 	 title 				varchar(255),
	 ans 					varchar(8),	 
	 primary key (que_id)
	);

/* 选择题 */
create table choicequestion
	(choice_queid int,
 	 title 				varchar(255),
	 ans 					varchar(8),	 
	 op_A					varchar(255),
	 op_B					varchar(255),
	 op_D					varchar(255),
	 op_4					varchar(255),
	 primary key (choice_queid)
	);

/* 判断题 */
create table judgequestion
	(judge_queid	int,
	 title 				varchar(255),
	 ans 					varchar(8),
	 op_A					varchar(255),
	 op_B					varchar(255),
	 primary key (judge_queid)
	);

create table student
	(stu_id		int auto_increment,
	 name 		varchar(22),
	 point		int,
	 grade    int,
	 primary key (stu_id)
	);

/* 知识点和试题的联系 */
create table knowledgepoint_question
	(kp_id	int,
	 que_id int,
	 primary key (kp_id, que_id),
	 foreign key (kp_id) references knowledgepoint(kp_id)
		on delete cascade,
	 foreign key (que_id) references question(que_id)
	  on delete cascade
	);

/* 学生做题 */
create table do_question
	(stu_id		int,
	 que_id		int,
	 record   int, /* 实际上是bool, 标识该题是否做对, 对1错0*/
	 primary key (stu_id,que_id),
	 foreign key (stu_id) references student(stu_id)
		on delete cascade,
	 foreign key (que_id) references question(que_id)
		on delete cascade
	);

/* 学生教题 */
create table solve_question
	(stu_id		int,
	 que_id		int,
	 success_time int,
	 fail_time int,
	 primary key (stu_id,que_id),
	 foreign key (stu_id) references student(stu_id)
		on delete cascade,
	 foreign key (que_id) references question(que_id)
		on delete cascade
	);





