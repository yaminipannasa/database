# database
E-LEARNING MANAGEMENT SYSTEM

INTRODUCTION:
With the growing technology around the world, e-learning platform has become
so popular now-a-days that everyone is preferring to study on their interested or
required courses online.
Coursera is one of the online learning platforms which offers online courses and
degrees world-wide in different subjects, by working with many universities and
organizations. After our world is hit by a so called COVID pandemic from 2020, It
has become challenging for schools, colleges, and universities to conduct classes
in-person. Everything has become digital. But not all the educational
organizations were able to conduct online classes. Students are more in to these
online learning platforms. This leads to increase in the competition among these
platforms. Hence, we are designing a database for the e-learning platforms to
make revenue and maintain stability.

DATA REQUIREMENTS:

Course:
· Courses are offered by an organization and each course is offered by a single
organization.
· Every course is taught by a single instructor.
· Multiple users can enroll in to same course and each course is enrolled by
at least 1 user.
· Each course is categorized in to three levels as beginner level, intermediate
level and advanced level.
· Details to be captured: course title, unique course id, course level
(Beginner / Intermediate / Advanced), number of users enrolled for each
course.
· We need to know the source through which users found that particular
course. It can be one of the following: College events / Friends / Social
media / Google search). This helps us to know better about promotions and
advertisements.

User:
· Users enroll in to courses.
· Users can enroll in to any number of courses. Also, users can enroll in any
level of course at any time.
· Every user enrolls into at least 1 course.
· There are three types of users: Student, Employed, Unemployed.
· Data to be captured: unique user id, user name (contains First Name and
Last Name), address (city, zip code), email id, user type (Student / Employed
/ Unemployed), details such as date of enrolment (in DD-MM-YYYY format)
and reason for enrolment are captured (reason can be one of the following:
College prerequisite / For career growth / For career change / Out of own
interest.)

Organization:
· Organization can be either a University or Enterprise offering multiple
courses to users.
· There can be some organizations who do not provide any courses yet.
· Details to be captured: unique organization name which can be university
or enterprise.
· Details to be captured for university: unique university name, university ID,
university location.
· Details to be captured for enterprise: unique enterprise name, enterprise
ID, enterprise location.

Instructor:
· Instructor works for organization. Each Instructor works for only one
organization.
· Each Instructor works for at least 1 organization.
· Instructor teaches courses to users. Each instructor can teach multiple
courses.
· Details to be captured: unique instructor id, name, email id, salary, number of
courses instructor is teaching.

Quiz:
· Quiz is conducted by each course for a maximum of 100 marks.
· Each course conducts only 1 quiz.
· User can get minimum of 0 marks to maximum of 100 marks.
· Users take the quiz in order to obtain certificate for that particular course.
· Each user takes at least 1 quiz and a maximum of many quizzes depending
upon number of courses enrolled.
· Details to be captured: unique quiz id, marks obtained by each user.

Certificate:
· Certificate of completion is offered to users who got 80 and above out of
100 marks in the quiz.
· Every user receives at least one certificate.
· As we are taking small data for our design, for simplicity, we are
considering that all users are getting 80 and above marks and are receiving
certificate.
· Details to be captured: unique certificate number, certificate date.

Feedback:
 Users give feedback to instructor.
 Instructor receives multiple feedbacks from users.
 It is not necessary that every user gives feedback to instructor.
 Details to be captured: overall rating for instructor in each course (rating
varies from 1 to 5 where 1 represents least rating and 5 represents highest
rating), Average rating for each instructor.

Business Goals:
1. Name the top 5 courses and the corresponding organization that are more
preferred by users.
2. Which course levels are more enrolled by which user type. (Get the course
level, user type and the number of users of that type enrolling in each
course level.)
3. Which time of the year (month is considered), more courses are getting
enrolled and what are those courses.
4. List the ratings of each instructor, each organization and instructor
corresponding to organization.
5. List the total number of users enrolled in each course level, for each course
title and for each course individually.
6. For each user type and source through which they are aware of the course,
find the total number of users.
