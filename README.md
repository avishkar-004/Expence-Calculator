# Expense Calculator

A Java Swing desktop application for tracking personal expenses and income with visual analytics.

## Features

- Add income and expense transactions with categories
- View all transactions in a color-coded table (green for income, red for expenses)
- Summary panels showing total expenses, income, and balance
- Delete transactions with confirmation dialog
- Bar graph analytics showing monthly income vs expense trends
- Pie chart visualization for income/expense distribution
- Category-based filtering (14 expense categories, 10 income sources)

## Prerequisites

- Java JDK 8 or higher
- MySQL Server
- MySQL JDBC Connector (mysql-connector-java)

## Database Setup

1. Import the schema:
```bash
mysql -u root -p < schema.sql
```

## How to Run

### Compile
```bash
javac -cp .:mysql-connector-java-8.0.33.jar expense_calculator/*.java
```

### Run
```bash
java -cp .:mysql-connector-java-8.0.33.jar expense_calculator.Expense_Calculator
```

## Project Structure

```
Expence-Calculator/
├── expense_calculator/
│   ├── Expense_Calculator.java   # Main application window
│   ├── Expense_Calculator.form   # NetBeans form layout
│   ├── db.java                   # Database operations
│   ├── graph.java                # Bar graph analytics
│   ├── graph.form                # Graph form layout
│   ├── pie.java                  # Pie chart visualization
│   └── pie.form                  # Pie chart form layout
├── schema.sql                    # Database schema
└── README.md
```

## Tech Stack

- Java Swing (GUI)
- MySQL (Database)
- JDBC (Database connectivity)
- NetBeans IDE (Form designer)
