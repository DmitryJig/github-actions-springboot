DROP TABLE IF EXISTS products CASCADE;

CREATE TABLE categories
(
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE products
(
    id BIGSERIAL primary key,
    title VARCHAR(255) NOT NULL,
    price NUMERIC(12,2),
    description VARCHAR(10000),
    category_id BIGINT REFERENCES categories(id),
    created_at TIMESTAMP DEFAULT current_timestamp,
    updated_at TIMESTAMP DEFAULT current_timestamp
);

INSERT INTO categories (name)
    VALUES
        ('Сантехника'),
        ('Электротовары');

INSERT INTO products (title, price, description, category_id)
    VALUES
        ('Лампа светодиодная 20 Вт', 230.00, 'Надежная и долговечная светодиодная лампа', 2),
        ('Смеситель для ванны Accona', 4900.00, 'Смеситель с корпусом из латуни, в комплекте со шлангом и душевой лейкой', 1),
        ('Розетка 1 мест. СП БЗ', 100.00, 'Розетк одноместная скрытой проводки без заземления', 2);