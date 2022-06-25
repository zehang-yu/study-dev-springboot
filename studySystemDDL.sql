drop database if exists studysystem;
create database studysystem;
use studysystem;


create table knowledgepoint
	(kp_id			int auto_increment not null,
	 content		varchar(255) not null,
	 chapter		varchar(32),
	 section		varchar(32),
	 primary key (kp_id)
	);

/* 问题父表 */
create table question
	(que_id 		int,
 	 title 			varchar(255),
	 ans 			varchar(8),	 
	 primary key (que_id)
	);

/* 选择题 */
create table choicequestion
	(choice_queid int,
 	 title 			varchar(255),
	 ans 			varchar(8),	 
	 op_A			varchar(255),
	 op_B			varchar(255),
	 op_C			varchar(255),
	 op_D			varchar(255),
	 primary key (choice_queid)
	);

/* 判断题 */
create table judgequestion
	(judge_queid	int,
	 title 			varchar(255),
	 ans 			varchar(8),
	 op_A			varchar(255),
	 op_B			varchar(255),
	 primary key (judge_queid)
	);

create table student
	(stu_id		int auto_increment not null,
	 name 		varchar(22),
	 point		int,  /*积分*/
	 grade    int,
	 account    varchar(22),
	 password   varchar(22),
	 primary key (stu_id)
	);

create table teacher
(teacher_id		int auto_increment not null,
 name 		varchar(22),
 account    varchar(22),
 password   varchar(22),
 primary key (teacher_id)
);

/*老师与学生的关系: 老师教学生*/
create table teach
(teacher_id		int,
 stu_id 		int,
 primary key (teacher_id, stu_id),
 foreign key (teacher_id) references teacher(teacher_id)
     on delete cascade,
 foreign key (stu_id) references student(stu_id)
     on delete cascade
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

/* 学生教学生 */
create table help_student
    (learn_stu_id		int,
     helper_stu_id		int,
     primary key (learn_stu_id,helper_stu_id),
     foreign key (learn_stu_id) references student(stu_id)
         on delete cascade,
     foreign key (helper_stu_id) references student(stu_id)
         on delete cascade
    );