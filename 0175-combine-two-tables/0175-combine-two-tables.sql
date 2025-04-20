# Write your MySQL query statement below
select p.firstName,p.lastName,a.city,a.state
from Person as p 
Left join Address as a
on p.personID = a.personID;