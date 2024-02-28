# Assessment Task
Students are advised to review and adhere to the submission requirements documented after the assessment task. 

Congratulations! You have been hired to develop the Employee Administration software for Business Gnómes Ltd, a high-end lawn ornament retail company. For this task, you get to practice implementing software engineering methodologies whilst creating software that meets the following specifications:

## Part 1 		[50 marks]

(A)	Write the complete class, Employee, which has the following fields and methods:

Instance fields:
name, of type String
email, of type String
empNum, of type int

### Two Constructors: 
●	One constructor initializes the name and email instance fields with default values. 
●	The other constructor initializes these fields with values passed as parameters.

### Static field:
nextEmpNum, of type int and initialized to 1, which initializes empNum in the constructor.  Its value must then be incremented to give consecutive numbers to each newly created object. 

### Methods:
 - Accessor methods to return name, email and empNum values.
 - 	setEmail(String email) – to set the email field to a new value passed as a parameter.  The value must not be accepted if its length is 3 or less.
 - 	getNextEmpNum() - to return the current value of nextEmpNum.

(B)	Write another class, EmployeeTest, containing the main method, which

 - 	creates 3 Employee objects, with the following details

#### Name	Email
 - Joe Bloggs	jb@gmail.com 
 - Ann Banana	ab@gmail.com
 - Tom Thumb	tt@gmail.com

    - declares an array, called projectGroup, to store these 3 Employee objects and loads the array with the objects.

    - prints out the value of variable nextEmpNum to the terminal window. 

(C)	Write the code to search and display the name of each of the employees in the projectGroup array, who have an employee number above the value stored in a variable called m.

##### Challenge: Implement a check for a valid email address
 
## Part 2 		[50 marks]
(a)	The Company class stores information about employees.  It contains:

 - the field companyName for the name of the company  
 - an ArrayList, called staff, to hold a list of employee objects, whose class is described in Question 1 above.

- Write the default constructor for this class which initializes all fields.
- Write an overloaded constructor which accepts a name value as a parameter.
- Complete the implementation by writing the code for the following methods only: 

    - addNewStaff() adds a new employee to the staff arrayList (the employee is a parameter). 

    - getStaffNumber() returns the number of employees currently in the arrayList.

    -	listEmployees() uses an iterator object to find in the arrayList all employees above a given employee number value  (this value is a parameter for this method) and prints the names of these employees. 

b)	A particular employee has been designated a “manager”. They are considered a regular employee for all purposes, except that they also have a “username” and a “password” as fields, with corresponding getters and setters. 

c)	Create a Netbean-console menu system for the manager to log in, view current staff and add new staff. 

    - (username – “Gnomeo”; Password – “smurf”)


##### Challenges:
- Create a method in the Company class called removeStaff() that removes an employee from the staff arrayList (the employee’s empNum is a parameter).
- Allow the manager to remove employees from the menu

###### Bonus challenge:
Create a HashSet called staffSet that will not allow two employees with the same empNum to be elements



In addition to the above specifications, it is important for validation, security, and maintenance reasons that your program is well-structured and well-commented. This will be taken into consideration when assessing the project.

Consider the Employee Administration software for Business Gnómes Ltd. 
Notice that there is no front-end requirement or specification. This has been very purposely omitted, because, at this stage of the development, only the business logic is being explored.

##### Include a link to the GitHub repo as a comment above the “main” method.
