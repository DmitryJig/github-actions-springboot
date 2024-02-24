create table products
(
    id bigserial primary key,
    title varchar(255),
    price numeric(12,2),
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp
);

insert into products (title, price)
    values
        ('milk', 80),
        ('Bread', 25),
        ('Cheese', 300);