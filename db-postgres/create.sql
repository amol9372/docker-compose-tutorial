CREATE SCHEMA IF NOT EXISTS "public";

CREATE TABLE "public".employee (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    department VARCHAR(100),
    position VARCHAR(100),
    salary DECIMAL(10, 2),
    hire_date DATE
);

-- Insert sample records into the 'employee' table
INSERT INTO employee (first_name, last_name, email, department, position, salary, hire_date) 
VALUES 
('John', 'Doe', 'johndoe@example.com', 'Engineering', 'Software Developer', 75000.00, '2020-01-15'),
('Jane', 'Smith', 'janesmith@example.com', 'Marketing', 'Marketing Manager', 65000.00, '2019-08-01'),
('Emily', 'Jones', 'emilyjones@example.com', 'Human Resources', 'HR Coordinator', 55000.00, '2021-05-23');
