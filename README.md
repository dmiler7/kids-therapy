## kids-therapy project

application providing solution in health protection and education, which main goal is to facilitate
search of qualified specialists for children with development disorders such as:

- delay in speech development
- sensory processing disorders
- multi-specialized comprehensive rehabilitation


>It is crucial to have means to find quick and adequate help in order to get the best shot at
preparing children for an independent life in the community, apart from psychological assistance.

---------------------------------------------------------

To START the program:

2. Install maven
- ubuntu: (in terminal) sudo apt install mvn

1. Build project:
- go to projects directory, kids-therapy module representing console application
- follow location parallel to pom.xml file
- switch to root of the repository -> 'main' branch

3. Build the project:
- in terminal (f.in bash) enter:
  
   
   **mvn clean install -Pdefault-first,default-second,default-heavy**
     
(builds repository and runs Unit Tests in console-app module)
-execution of jar file from target directory
>package placed in local repository .m2/repository)
