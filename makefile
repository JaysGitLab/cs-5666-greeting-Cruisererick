JUNIT_JAR = /usr/share/java/junit-4.10.jar
HAMCREST_JAR = /usr/share/java/hamcrest/core-1.1.jar

default: 
	@echo "usage: make target"
	@echo "available targets: compile, test, clean"

compile: Hello.java HelloTest.java
	 javac -cp .:$(JUNIT_JAR)  HelloTest.java 
	 javac Hello.java

clean:
	rm -f Hello.class
	rm -f HelloTest.class

test: Hello.class
	java -cp .:$(JUNIT_JAR):$(HAMCREST_JAR) org.junit.runner.JUnitCore HelloTest


