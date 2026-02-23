# Java Fundamentals Exercise

## Prerequisites
- Java must be installed.
- Verify installation using the following commands:

```bash
    java -version
    javac -version
```

## Clone repository or Run in GitHub Codespaces
- Clone the repository:
```bash
    git clone https://github.com/jayani-athukorala/java-fundamentals-exercise.git
    cd java-fundamentals-exercise
```
- Open GitHub Codespaces in the repository:

Code → Open with Codespaces → New codespace


## Compile programs
- This will compile all .java files and create .class files in the same directory.
```bash
    javac *.java
```

## Run programs
- Run a specific program using following commands.
```bash
    java Q1
    java Q2 ...etc
```
### ...and so on

---

# Pseudocodes and Flowcharts

## 1. Print 'Hello' and name on screen (in separate lines)

### Pseudocode

```text
BEGIN
    SET name = "Jayani"
    PRINT "Hello,"
    PRINT name
END
```
### Flowchart
```mermaid
flowchart TD
    A(Start) --> B[/Input name/]
    B --> C[/Display "Hello,"/]
    C --> D[/Display name+"!"/]
    D --> E(Stop)
```
---

# 2. Print if a year (User input) is leap or not.
### Pseudocode
```text
BEGIN
    INPUT year
    IF year % 4 == 0 AND NOT(year % 100 == 0 AND NOT(year % 400 == 0)) THEN
        PRINT "A leap year"
    ELSE
        PRINT "Not a leap year"
    END IF
END
```

### Flowchart
```mermaid
flowchart TD
    A(Start) --> B[/Input year/]
    B --> C{"If<br>year % 4 == 0 AND NOT(year % 100 == 0 AND NOT(year % 400 == 0))"}
    C -- Yes --> D[/Display "A leap year"/]
    C -- No --> E[/Display "Not a leap year"/]
    D --> F(Stop)
    E --> F
```
---

# 3. Print the sum/multiplication/division and subtraction of two numbers
### Pseudocode
```text
BEGIN
    SET number1 = 120, number2 = 12
    addition = number1+number2
    subtraction = number1 - number2
    multiplication = number1 * number2
    division = number1 / number2
    PRINT addition, subtraction, multiplication, division
END
```
### Flowchart
```mermaid
flowchart TD
    A(Start) --> B[number1 = 120<br>number2 = 12]
    B --> C[addition=number1+number2<br>subtraction=number1-number2<br>multiplication=number1*number2<br>division=number1/number2]
    C --> D[/Display addition, subtraction, multiplication, division/]
    D --> E(Stop)
```
---

# 4. Prints the average of three numbers
### Pseudocode
```text
BEGIN
    SET count = 1, num_of_times = 3, sum = 0
    WHILE count <= num_of_times DO
        INPUT number
        sum = sum + number
        count = count + 1
    END WHILE
    average = sum / num_of_times
    PRINT average 
END
```

### Flowchart
```mermaid
flowchart TD
    A(Start) --> B[count = 1<br>num_of_times = 3<br>sum = 0]
    B --> C{While<br>count <= num_of_times}
    C -- Yes --> D[/Input Number/]
    D --> E[sum = sum + number]
    E --> F[count = count + 1]
    F --> C
    C -- No --> G[average = sum/num_of_times]
    G --> H[/Display Average/]
    H --> I(Stop)

```
---

# 5. Print ‘Hello username’ where username get as a user input.
### Pseudocode

```text
BEGIN
    INPUT name
    PRINT "Hello, " + name + "!"
END
```

### Flowchart
```mermaid
flowchart TD
    A(Start) --> B[/Input name/]
    B --> C[/Display "Hello, name,"!"/]
    C --> D(Stop)
```
---

# 6. Print the sum/multiplication/division and subtraction of given numbers (User inputs).
### Pseudocode
```text
BEGIN
    INPUT number1, number2
    addition = number1+number2
    subtraction = number1 - number2
    multiplication = number1 * number2
    division = number1 / number2
    PRINT addition, subtraction, multiplication, division
END
```
### Flowchart
```mermaid
flowchart TD
    A(Start) --> B[/Input number1, number2/]
    B --> C[addition=number1+number2<br>subtraction=number1-number2<br>multiplication=number1*number2<br>division=number1/number2]
    C --> D[/Display addition, subtraction, multiplication, division/]
    D --> E(Stop)
```
---

# 7. Convert seconds to hours, minutes and seconds
### Pseudocode
```text
BEGIN
    INPUT time_in_seconds
    hours = time_in_seconds/3600
    minues = time_in_seconds%3600/60
    seconds = time_in_seconds/3600%60
    PRINT hours:minutes:seconds
END
```

### Flowchart
```mermaid
flowchart TD
    A(Start) --> B[/Input time_in_seconds/]
    B --> C[hours=time_in_seconds/3600]
    C --> D[minues=time_in_seconds%3600/60]
    D --> E[seconds=time_in_seconds/3600%60]
    E --> F[/"Display hours:minutes:seconds"/]
    F --> G(Stop)
```
---

# 8. Generates a random number and let the user to guess the generated number.

### Pseudocode
```text
BEGIN
    GENERATE random_number
    SET count = 1
    REPEAT
        Input user_number

        IF userNumber < randNumber THEN
            PRINT "Your guess was too small!"
            count++
        ELSE IF userNumber > randNumber THEN
            PRINT "Your guess was too big!"
            count++
        END IF
    UNTIL userNumber == random_number
    PRINT "Your guess is Correct!"
    PRINT "You have made " + count + " number of guesses"
END
```

### Flowchart
```mermaid
flowchart TD
    A(Start) --> B[Generate random_number]
    B --> C[count = 1]
    C --> D[/Input user_number/]
    D --> E{Is<br>user_number < random_number?}
    E -- Yes --> F[/Display "Your guess was too small!"/]
    F --> G[count=count+1]
    G --> D
    E -- No --> H{Is<br>user_number > random_number?}
    H -- Yes --> I[/Display "Your guess was too big!"/]
    I --> J[count=count+1]
    J --> D
    I -- No --> K[/Display "Your guess is Correct!"/]
    K --> L[/Display "You have made " + count + " number of guesses"/]
    L --> M(Stop)
```

---