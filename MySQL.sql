SELECT * FROM actor;
SELECT first_name from actor;
SELECT last_name from actor;
select distinct first_name from actor;
select distinct first_name, last_name from customer;
SELECT address, postal_code from address where district = "England";
select * from film where rating="PG-13";
select * from film where replacement_cost>"11.99";
select * from film where length<60 or length>120;
select amount, payment_date from payment where payment_date >'2005-07-27 18:40:20' and amount <'4.99';
select title, description, length, rating from film where (length > 60 or length < 120) and rating="r";
Select * from film order by length asc;
select * from payment order by amount asc, payment_date desc;
select address from address where address is not null and postal_code is null;
select first_name from actor order by first_name limit 10;
select min(amount), max(amount) from payment;
select sum(amount) as suma, avg(amount) as średnia, min(amount) as minimum, max(amount) as maksimum from payment;
select avg(amount) as 'średnia wartość' from payment;
select count(*) from film where rating = 'G';
select count(*) from address where district = 'Buenos Aires' ;
select title, special_features from film where special_features like '%Trailers%' ;
select count(*) from film where length between 100 and 200;
select title from film where title like 'B_________';
select count(actor_id) from actor where last_name in ('Smith', 'Cage', 'Tracy');
select * from film where film_id limit 10;
select first_name, last_name from actor where last_name like 'Ber%';
select distinct first_name from actor where first_name like 'y%'; 
insert into customer (customer_id,store_id,first_name,last_name,email,address_id)
values (700,1,'Anna','Kwiat','annakwiat4@gmail.com',44);
insert into customer (customer_id,store_id,first_name,last_name,email,address_id)
values (701,2,'Barbara','Szmid','barbara.szmid@gmail.com',45);
delete from customer where customer_id = 701; delete from customer where customer_id = 701; 
update address set address2 = 'adres' where address_id = 1; 
select customer.first_name, customer.last_name,rental_date,return_date from customer 
right join rental on customer.customer_id=rental.customer_id;
select customer.first_name,customer.last_name,rental_date,return_date from customer
inner join  rental on customer.customer_id=rental.customer_id where rental.return_date is null;
select count(film_id) as films_number, release_year as film_premier, min(length) as min_film_length,
max(length) as max_film_length, avg(replacement_cost) as avg_film_replacement_cost from film group by release_year;