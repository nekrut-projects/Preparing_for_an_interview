use cinema;
------------------------------------------------------------------------------------
-- ошибки в расписании (фильмы накладываются друг на друга), отсортированные по возрастанию времени. 
-- Выводить надо колонки «фильм 1», «время начала», «длительность», «фильм 2», «время начала», «длительность»; 
---------------------------------------------------------------------------------------------

select fs1.title as 'Название фильма', fs1.duration as 'Продолжительность', fs1.time as 'Начало сеанса',
	fs2.title as 'Название фильма', fs2.duration as 'Продолжительность', fs2.time as 'Начало сеанса' 
 from
(select fs.film_id, films.title, films.duration, show_time.time
	 from films_schedule as fs
		join films on fs.film_id = films.id 
		join show_time on fs.show_time_id = show_time.id
     where fs.id%2!=0) as fs1
inner join

(select fs.film_id, films.title, films.duration, show_time.time
	 from films_schedule as fs
		join films on fs.film_id = films.id 
		join show_time on fs.show_time_id = show_time.id
     where fs.id%2=0) as fs2
on fs1.time = fs2.time
order by fs1.time
;

-----------------------------------------------------------------------------------------------
-- Вывести перерывы 30 минут и более между фильмами — выводить по уменьшению длительности перерыва. 
-- Колонки «фильм 1», «время начала», «длительность», «время начала второго фильма», «длительность перерыва»; 
------------------------------------------------------------------------------

select film_1.title as 'Название фильма', film_1.time as 'Время начала фильма №1',
 film_1.duration 'Продолжительность', film_2.time as 'Время начала фильма №2', 
 film_2.time - film_1.time as 'Перерыв'
from
	(select fs.id, films.title, films.duration, show_time.time
	from films_schedule as fs
		join show_time on fs.show_time_id = show_time.id
		join films on fs.film_id = films.id
	where (fs.id % 2) != 0
	order by show_time.time) as film_1 
join
	(select fs.id, show_time.time
	from films_schedule as fs
		join show_time on fs.show_time_id = show_time.id		
	where (fs.id % 2) = 0
	order by show_time.time) as film_2
on film_1.id = (film_2.id + 1) and (film_2.time - film_1.time) > 0.5
order by (film_2.time - film_1.time) desc
;

--------------------------------------------------------------------------

-- Вывести число посетителей и кассовые сборы, сгруппированные по времени начала фильма: 
-- с 9 до 15, с 15 до 18, с 18 до 21, с 21 до 00:00 (сколько посетителей пришло с 9 до 15 часов и т.д.).

------------------------------------------------------------------------------------------------------

select count(s.id) as 'Количество посетителей', sum(s.price) as 'Кассовые сборы', '9-15' as 'Временной период'
	from sold_tickets as s
	join
		(select id
		from tickets
		where show_time_id <8) as morning
	on s.ticket_id = morning.id
Union
	select count(s.id), sum(s.price), '15-18'
	from sold_tickets as s
	join
		(select id
		from tickets
		where show_time_id > 6 and show_time_id <11) as afternoon
	on s.ticket_id = afternoon.id
Union
	select count(s.id), sum(s.price), '18-24'
	from sold_tickets as s
	join
		(select id
		from tickets
		where show_time_id > 9) as evening
	on s.ticket_id = evening.id
;
---------------------------------------------------------------------------------
