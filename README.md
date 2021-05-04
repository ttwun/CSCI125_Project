# CSCI125_Project
### Introduction

Physics and math equations, if required several steps, are difficult to solve by hand in a fairly short time. However, with the help of computer programming, they can be solved easily within a split second. The idea of this Kinematic Equations Project was to solve the Kinematic Equations (displacement, velocity, acceleration, and time) using Java programming language. 

### Technologies Used

Programming Language: Java SE 8 

Integrated Development Environment (IDE): Eclipse IDE 

Object Oriented Programming (OOP) concepts: Object, Class, Inheritance, Polymorphism, Abstraction, Encapsulation 

Java Default packages: Java.util. Scanner; Java.util.Math

Java String methods .equalsIgnoreCase()

### **Kinematic Equations**

**Kinematic Equations** are a set of four equations that can be used to predict the unknown information about an object's motion using the given or known information. Each of the equation include four variables, with three knowns and usually one unknown. They can be used for any motions with either a constant velocity or a constant acceleration but not for the motions with a variable acceleration. 

Four types of kinematic equations are as follows: 

1. $d_f = d_0 + v_0 t + \frac 1 2 a t^2$
2. $v_f = v_0 + at$
3. $v_f^2 = v_0^2 + 2 a (d_f - d_0)$
4. $a = \text{ }$ $(v_f - v_0) \above {1pt} t$

where, $d_0$ = initial displacement

$d_f$  = final displacement  

$v_0$  = initial velocity 

$v_f$ = final velocity 

$a$  = acceleration 

$t$ = time 

### **Adapted Kinetic Equations used in this project**

For this project, I rearranged the kinematic equations for the purpose of finding the unknown in the specific situation. 

Since there are four different types of possible unknowns, there are four main categories for this program. 

1. Finding the displacement of the motion 
2. Finding the velocity of the motion 
3. Finding the acceleration of the motion 
4. Finding the time of the motion 

There are some sub-categories for each categories.

1. Displacement 
    - Calculating the displacement of the motion with KNOWN time value

    $d_f = d_0 + v_0 t +$  $\frac 1 2 at^2$ 

    ```java
    f_displacement = (i_displacement + i_velocity * time + 0.5 * acceleration* time * time);
    ```

    - Calculating the displacement of the motion with UNKNOWN time value

    $d_f =$  $v_f^2 - v_0^2 \above {1pt} 2a$

    ```java
    f_displacement = ((f_velocity * f_velocity) - (i_velocity * i_velocity)) / (2 * acceleration);
    ```

2. Velocity
    - Calculating the inital velocity of the motion
        - Calculating the initial velocity of the motion with KNOWN time value

        $v_0 = v_f - at$

        ```java
        i_velocity = f_velocity - (acceleration * time);
        ```

        - Calculating the initial velocity of the motion with UNKNOWN time value

        $v_0 = \sqrt{v_f^2 - 2 as}$

        ```java
        i_velocity = Math.sqrt((f_velocity * f_velocity) - (2 * acceleration * t_displacement));
        ```

    - Calculating the final velocity of the motion
        - Calculating the final velocity of the motion with KNOWN time value

        $v_f = v_0 + at$

        ```java
        f_velocity = i_velocity + (acceleration * time);
        ```

        - Calculating the final velocity of the motion with UNKNOWN time value

        $v_f = \sqrt{v_0^2 - 2 as}$

        ```java
        f_velocity = Math.sqrt(Math.pow(i_velocity, i_velocity) + (2 * acceleration * t_displacement)); // Math.sqrt = finding the square root of a number
        ```

3. Acceleration
    - Calculating the acceleration of the motion with KNOWN time value

    $a =  \text{ }$ $\text{2 (}d_f - d_0 - v_0 t) \above {1 pt} t^2$

    ```java
    acceleration = 2 * (f_displacement - i_displacement - i_velocity * time) / Math.pow(time,time);
    // Math.pow = squaring a number
    ```

    - Calculating the acceleration of the motion with UNKNOWN time value

    $a =$  $v_f^2 - v_0^2 \above {1 pt} \text {2 } \Delta t$

    ```java
    acceleration = (Math.pow(f_velocity, f_velocity) - Math.pow(i_velocity, i_velocity)) / (2 * t_displacement);
    ```

    - Calculating the acceleration with AVERAGE velocity using TIME value

    $a =$  $v_f - v_0 \above {1 pt} t$

    ```java
    acceleration = f_velocity - i_velocity / time;
    ```

4. Time 
    - Calculating the time of the motion with KNOWN displacement value

    $t = \text { }$$- v_0 \pm \sqrt{v_0^2 - 2 (d_0 - d_f)} \above {1pt} {a}$

    ```java
    double determinant = Math.pow(i_velocity, i_velocity) - (2 * acceleration * (i_displacement - f_displacement));
    				double sqrt = Math.sqrt(determinant); // quadratic equation 
    				if (sqrt> 0) {
    					first_root = (-i_velocity + sqrt) / acceleration;
    					second_root = (-i_velocity - sqrt) / acceleration;
    					if (first_root > 0) {
    						time = first_root;
    					}
    					else if (second_root > 0) {
    						time = second_root;
    					}
    					else if (first_root > 0 && second_root > 0) {
    						time = first_root;
    						time_2 = second_root;
    					}
    					else if (first_root == 0 && second_root == 0) {
    						time = 0;
    						time_2 = 0;
    					}
    ```

    - Calculating the time of the motion with UNKNOWN displacement value

    $t = \text{ }$ $v_f - v_0 \above {1 pt} a$

    ```java
    time = f_velocity - i_velocity / acceleration;
    ```

### Program Welcome Page

```java
----------------------------------------
Kinematic Calculator
----------------------------------------
1. Displacement Calculator
2. Velocity Calculator
3. Acceleration Calculator
4. Time Calculator
5. Program Exit
----------------------------------------
Please choose one of the options above.
Chosen option:
```

### Example 1: Problem Solving

```java
----------------------------------------
Kinematic Calculator
----------------------------------------
1. Displacement Calculator
2. Velocity Calculator
3. Acceleration Calculator
4. Time Calculator
5. Program Exit
----------------------------------------
Please choose one of the options above.
Chosen option: 1
----------------------------------------
Welcome to Displacement Calculator
----------------------------------------
Please choose one of the options below.
1. Displacement Calculator with KNOWN time value
2. Displacement Calculator with UNKNOWN time value
----------------------------------------
Chosen option: 1
----------------------------------------
Displacement Calculator with KNOWN time value

Please enter the initial displacement value: 0
Initial displacement = 0.0 m
Please enter the initial velocity value: 4
Initial velocity = 4.0 m/s
Please enter the acceleration value: 3
Acceleration = 3.0 m/s^2
Please enter the time value: 2
Time = 2.0 s

The final displacement value is 14.0 m.
----------------------------------------
Would you like to solve another problem?
Answer: no
----------------------------------------
We hope we solved your problem. Goodbye!
----------------------------------------
```

### Example 2: If option not available is chosen

```java
----------------------------------------
Kinematic Calculator
----------------------------------------
1. Displacement Calculator
2. Velocity Calculator
3. Acceleration Calculator
4. Time Calculator
5. Program Exit
----------------------------------------
Please choose one of the options above.
Chosen option: 4
----------------------------------------
Welcome to Time Calculator
----------------------------------------
Please choose one of the options below.
1. Time Calculator with KNOWN displacement value
2. Time Calculator with UNKNOWN displacement value
----------------------------------------
Chosen option: 7
----------------------------------------
Please choose one of the two options // error as option 7 is not available 
1. Time Calculator with KNOWN displacement value
2. Time Calculator with UNKNOWN displacement value
----------------------------------------
Chosen option: // repeat until the user chooses one of the available options 
```

### Example 3: Sample Problem Solving

```java
Ben Rushin is waiting at a stoplight. When it finally turns green, 
Ben accelerated from rest at a rate of a 6.00 m/s2 for a time of 4.10 
seconds. Determine the displacement of Ben's car during this time period.

// program run 
----------------------------------------
Kinematic Calculator
----------------------------------------
1. Displacement Calculator
2. Velocity Calculator
3. Acceleration Calculator
4. Time Calculator
5. Program Exit
----------------------------------------
Please choose one of the options above.
Chosen option: 1
----------------------------------------
Welcome to Displacement Calculator
----------------------------------------
Please choose one of the options below.
1. Displacement Calculator with KNOWN time value
2. Displacement Calculator with UNKNOWN time value
----------------------------------------
Chosen option: 1
----------------------------------------
Displacement Calculator with KNOWN time value

Please enter the initial displacement value: 0
Initial displacement = 0.0 m
Please enter the initial velocity value: 0 // starts from rest 
Initial velocity = 0.0 m/s
Please enter the acceleration value: 6
Acceleration = 6.0 m/s^2
Please enter the time value: 4.1
Time = 4.1 s

The final displacement value is 50.42999999999999 m.
----------------------------------------
Would you like to solve another problem?
Answer: no
----------------------------------------
We hope we solved your problem. Goodbye!
----------------------------------------

```

### Example 4: Sample Problem Solving

```java
A ball is thrown up into the air with an initial velocity of 12.0 m/s. 
How long will it be in air when it reaches to the max height?

```

### Conclusion

The objective of this project is to solve kinematic equations in an easy and precise way by implementing Java programming. In this project, I implemented several ways to solve for an unknown in kinematic equations: two ways each for final displacement, initial velocity, final velocity, and time as well as three ways for finding acceleration.
