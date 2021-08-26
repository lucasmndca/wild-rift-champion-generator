/**
 * CREATING TABLES
 */

create table if not exists wild_rift_champion_generator.ability (
	id bigint not null,
	name varchar(64) not null,
	description varchar(255) not null,
	duration int not null,
	cooldown int not null,
	createdAt date not null,
	updatedAt date not null,
	primary key (id)
);

create table if not exists wild_rift_champion_generator.champion (
	id bigint not null,
	name varchar(64) not null,
	description varchar(255) not null,
	lanes varchar(100) not null,
	region varchar(64) not null,
	height int not null,
	weight int not null,
	gender varchar(1),
	color varchar(64),
	updatedAt date not null,
	primary key (id)
);

create table if not exists wild_rift_champion_generator.champion_v_ability (
	id bigint not null,
	id_champion bigint not null,
	id_ability bigint not null,
	primary key (id)
);

/**
 * CHECKING THEIR EXISTENCE
 */

select * from wild_rift_champion_generator.ability a 

select * from wild_rift_champion_generator.champion c 

select * from wild_rift_champion_generator.champion_v_ability cva 

/**
 * ADDING CONSTRAINTS
 */

alter table wild_rift_champion_generator.champion_v_ability
add foreign key(id_ability) references wild_rift_champion_generator.ability(id)
add foreign key(id_champion) references wild_rift_champion_generator.champion(id)
