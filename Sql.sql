#Create table
Create Table Cities(
    Id int Not Null,
    Name varchar Not Null,
    State Varchar Not Null,
    Primary key(id));

#insert values
Insert into Cities values(1, "Bengaluru","KA");
Insert into Cities values(2, "Mysore","KA");
Insert into Cities values(3, "Delhi","DL");
Insert into Cities values(4, "Mubai","MH");
Insert into Cities values(5, "Kolkata","WB");
Insert into Cities values(6, "Chennai","TN");

Write SQL query to list all the cities sorted by name in ascending order
 Select Name From Cities
 Order By Name;

 Write SQL query to get the below output (List of states with count of cities)

 Select State from Cities
 group by Statehaving count (*) >1;

 Mumbai MH
5 Kolkata WB
6 Chennai TN