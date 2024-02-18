CREATE DATABASE IF NOT EXISTS expensecalculator;
USE expensecalculator;

CREATE TABLE IF NOT EXISTS expenses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Type VARCHAR(50) NOT NULL,
    Description VARCHAR(255),
    Amount DECIMAL(10,2) NOT NULL,
    date DATE NOT NULL,
    Category VARCHAR(100)
);

INSERT INTO expenses (Type, Description, Amount, date, Category) VALUES
('Income', 'Monthly Salary', 50000, '2024-01-01', 'Salary/Allowances'),
('Expense', 'Rent Payment', 15000, '2024-01-05', 'Housing'),
('Expense', 'Grocery Shopping', 3000, '2024-01-10', 'Groceries'),
('Income', 'Freelance Project', 10000, '2024-01-15', 'Business');
