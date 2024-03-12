ALTER TABLE categories ADD COLUMN created_at TIMESTAMP DEFAULT current_timestamp;
ALTER TABLE categories ADD COLUMN updated_at TIMESTAMP DEFAULT current_timestamp;