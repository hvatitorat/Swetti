delete from user_role;
delete from usr;

insert into usr(id, username, password, active) values
(1, 'admin', '$2a$08$PntbYkU1CDbAm472WIYjBO0odkskGkx0ylywxKpCW2oifTqmpN1uK', true),
(2, 'defaultuser', '$2a$08$j43TpMS7wVNzt6PGu3BEH.A0xIfAOw1Kmj9HL8z.EqzYh9aA2sYme', true);

insert into user_role(user_id, roles) values
(1, 'ADMIN'), (1, 'USER'),
(2, 'USER');