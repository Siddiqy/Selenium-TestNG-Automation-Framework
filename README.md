# Guide to creating automation framework with Selenium TestNG

## Download TestNG
Go to **Eclipse Marketplace** and download and install the **TestNG for Eclipse**.

## Create Maven Project
* Go to **File > New > Other > Maven > Maven Project** and click **Next** button
* Select **org.apache.maven.archetype**	--  **maven.archetype.quickstart**	--  **1.4** and click **Next** button
* Enter **Group Id, Artifact Id and Package** name and click **Next** button
* Delete the package file of **src/main/java** and **src/test/java**
* Copy and paste the code in **pom.xml** file `<dependencies> -- </dependencies>` and Save
```
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.4.0</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.6.1</version>
    <scope>test</scope>
</dependency>

<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.3.0</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.2.3</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.3</version>
</dependency>

<!-- https://mvnrepository.com/artifact/com.relevantcodes/extentreports -->
<dependency>
    <groupId>com.relevantcodes</groupId>
    <artifactId>extentreports</artifactId>
    <version>2.41.2</version>
</dependency>

<!-- SLF4j bridge to prevent SLFJ error message -->
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-slf4j-impl</artifactId>
    <version>2.19.0</version>
    <scope>test</scope>
</dependency>
```
* Press on `Alt + F5` from keyboard and click **OK** button to update the **Maven** project
* Now from **Run As** click on **Maven clean** and again click on **Maven test**

## Convert to TestNG
Right click on the newly created **Maven** project and from the **TestNG** menu click on 
**Convert to TestNG** sub-menu.
