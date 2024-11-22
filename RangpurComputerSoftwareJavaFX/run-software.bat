@echo off
REM Check if Java is installed
java -version >nul 2>&1
IF ERRORLEVEL 1 (
    echo Java is not installed or not added to the PATH. Please install Java and try again.
    pause
    exit /b
)

REM Run the JAR file
java -jar "%~dp0RangpurComputerSoftwareJavaFX.jar"
pause
