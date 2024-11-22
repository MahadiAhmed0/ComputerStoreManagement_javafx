@echo off
REM Relative path to JavaFX SDK lib directory
set JAVAFX_PATH="%~dp0javafx-sdk-23.0.1\lib"

REM Check if JavaFX SDK exists
if not exist %JAVAFX_PATH% (
    echo JavaFX SDK not found at %JAVAFX_PATH%. Please ensure the SDK is included.
    pause
    exit /b
)

REM Run the application with JavaFX modules
java --module-path %JAVAFX_PATH% --add-modules javafx.controls,javafx.fxml -jar "%~dp0RangpurComputerSoftwareJavaFX.jar"
pause
