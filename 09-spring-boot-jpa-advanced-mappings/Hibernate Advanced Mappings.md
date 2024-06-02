-One-to-One Mapping
	Instructor -> Instructor Detail

-One-to-Many
	An instructor can have many courses
	Instructor -> Course1 Course2 Course3
	Many-to-One
	Course1 Course2 Course3 -> Instructor

-Many-to-Many
	A course can have many students, a student can have many courses
	Course1 Course2 Course3 <-> Student1 Student2 Student3 Student4 Student5


-Primary Key: identify a unique row in a table
-Foreign Key: Link tables together. a field in one table that refers to primary key in another table.
![[Pasted image 20240602193209.png]]

-Cascade
	Apply the same operation to related entities 
	save Instructor -> Instructor Detail it does the same operation to Detail, saving.
	if we delete an Instructor we should also delete their instructor_detail. CASCADE DELETE
	depends on the use case. say we have courses and students, when we delete student probably we should not delete the course.

-Fetch Types: Eager vs Lazy Loading
When we retrieve/fetch data should we retrieve everything?
Eager will retrieve everything
Lazy will retrieve on request

-Uni-Directional
Instructor-> Instructor Detail
-Bi-Directional
Instructor<-> Instructor Detail
