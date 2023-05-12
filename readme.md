# Welcome to JawwyTV test automation framework 
## Selenium- Java - Cucumber - TestNG 

## Steps To Run
1- you do not need to worry aboud any configuration the framework do this for you By using 
    WebdriverManager and all directories are dynamic        
2- in order to run this feature file you can directly run the testNG file called : websiteTestNG.xml        
3- you also cauld execute the below line but maven should be installed on your device             
> mvn clean install 



## prief about what is done in this project 
1- this project contains 1 feature file called JawwySubscription             
2- this framework uses Property files as data pool and there is a class to handle then          
3- i am using 2 design pattern in this project :        
   1- POM (page object Model)   
   2- Driver Singleton                  
4- most of clean code concepts are applied in this framework like : Single responsibility , readability , open close concept .... etc


## Reporting
this framework supports two types of reports  
1- Cucumber report and you will find it in file called reports from content root                
2- Extent report and you will find it under resources/reports           
   and i am logging each step with its status and description and screenshot 


## patterns used in this project 
1- POM                  
 you will find a directory called JawwyTV which contains Tests and pages        
in case of UI changes will just update the exist pages or add new screen 

2- Singlton pattern                         
i applied this pattern in WebdriverHandler class to make sure that it will be on driver during the run time 
and if i need it , it has only one entry point which is a getter from the class 


