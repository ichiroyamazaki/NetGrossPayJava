# NetGrossPayJava

A basic Java console application that demonstrates gross pay, payroll deductions, and net pay calculations. The program uses predefined employee information, a gross salary, and deduction rates to calculate the employee's take-home pay.

## Features

- Displays the employee's name.
- Defines a gross salary in Philippine pesos (PHP).
- Calculates withholding tax at 15% of gross pay.
- Calculates SSS contributions at 3.63% of gross pay.
- Calculates Medicare at 1.25% of gross pay.
- Applies a fixed Pag-IBIG contribution of PHP 100.
- Calculates and displays net pay after deductions.

## Technologies Used

- **Programming Language:** Java
- **Application Type:** Console application
- **Core Concepts:** Variables, arithmetic operations, and formatted console output

## Sample Payroll Configuration

| Item | Value |
|---|---:|
| Employee name | Ichiro Yamazaki |
| Gross pay | PHP 25,000.00 |
| Withholding tax rate | 15% |
| SSS rate | 3.63% |
| Medicare rate | 1.25% |
| Pag-IBIG contribution | PHP 100.00 |

These values are hardcoded examples in the source code and are not a statement of current statutory payroll rates.

## Calculation

The program calculates each percentage-based deduction by multiplying the gross pay by the corresponding rate.

**Withholding tax**

\[
25{,}000 \times 0.15 = 3{,}750
\]

**SSS contribution**

\[
25{,}000 \times 0.0363 = 907.50
\]

**Medicare**

\[
25{,}000 \times 0.0125 = 312.50
\]

**Total deductions**

\[
3{,}750 + 907.50 + 312.50 + 100 = 5{,}070
\]

**Net pay**

\[
25{,}000 - 5{,}070 = 19{,}930
\]

## Example Output

```text
Employee Name: Ichiro Yamazaki
Gross Pay: PHP 25000.0
________________________________________________
Deductions Amount
Withholding Tax PHP 3750.0
SSS Contribution: PHP 907.5
Medicare: PHP 312.5
Pag-IBIG Contribution: PHP 100.0
________________________________________________
Net Pay: PHP 19930.0
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- A Java-compatible IDE or terminal

### Compile and Run

1. Clone or download the repository.
2. Open a terminal in the directory containing `LabExerciseIchiroYamazakiOperators.java`.
3. Compile the program:

   ```bash
   javac LabExerciseIchiroYamazakiOperators.java
   ```

4. Run the application:

   ```bash
   java LabExerciseIchiroYamazakiOperators
   ```

The program calculates and displays the sample payroll information automatically.

## Project Structure

```text
NetGrossPayJava/
├── LabExerciseIchiroYamazakiOperators.java
└── README.md
```

## Limitations

- Employee information and gross pay are hardcoded.
- Deduction rates and contribution amounts cannot be changed at runtime.
- The calculation does not account for salary periods, contribution ceilings, exemptions, or other payroll factors.
- The program uses `double` for monetary calculations and does not apply consistent two-decimal-place formatting.
- The deduction labels and values should not be treated as verified current payroll requirements.
- There is no employee database, payslip generation, or payroll history.

## Possible Improvements

- Accept employee information and gross pay through console input.
- Format monetary values consistently using two decimal places.
- Make deduction rates configurable.
- Add input validation and error handling.
- Separate calculation logic into reusable methods.
- Verify applicable Philippine payroll rules before using the program for real salary calculations.
- Generate a detailed payslip with gross pay, individual deductions, total deductions, and net pay.

## Learning Objectives

This project demonstrates Java variables, the `double` data type, multiplication and subtraction, arithmetic expressions, and console output.

## Author

**Ichiro Yamazaki**

Repository: https://github.com/ichiroyamazaki/NetGrossPayJava
