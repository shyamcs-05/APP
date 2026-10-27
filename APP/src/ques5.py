% Facts: student(Name, PythonResult, DataStructuresResult).
student(arun, pass, pass).
student(bala, pass, fail).
student(charan, pass, pass).
student(divya, fail, pass).

% Rule: both Python and Data Structures must be passed.
eligible(Name) :-
student(Name, pass, pass).