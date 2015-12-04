echo off

set RHAP_JARS_DIR=C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib
set FRAMEWORK_NONE_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\oxfInstMock.jar;
set FRAMEWORK_ANIM_JARS=C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\oxf.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\anim.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\animcom.jar;C:/ProgramData/IBM/Rational/Rhapsody/8.1.1/Share\LangJava\lib\oxfInst.jar;
set SOURCEPATH=%SOURCEPATH%
set CLASSPATH=%CLASSPATH%;.
set PATH=%RHAP_JARS_DIR%;%PATH%;
set INSTRUMENTATION=Animation   

set BUILDSET=Debug

if %INSTRUMENTATION%==Animation goto anim

:noanim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_NONE_JARS%
goto setEnv_end

:anim
set CLASSPATH=%CLASSPATH%;%FRAMEWORK_ANIM_JARS%

:setEnv_end

if "%1" == "" goto compile
if "%1" == "build" goto compile
if "%1" == "clean" goto clean
if "%1" == "rebuild" goto clean
if "%1" == "run" goto run

:clean
echo cleaning class files
if exist MainDefaultComponent.class del MainDefaultComponent.class
if exist Default\EventIntervention.class del Default\EventIntervention.class
if exist Default\Temoin.class del Default\Temoin.class
if exist Default\EventUrgenceRecu.class del Default\EventUrgenceRecu.class
if exist Default\EventMessageRelaye.class del Default\EventMessageRelaye.class
if exist Default\VaHopital.class del Default\VaHopital.class
if exist Default\EventCamionPompierArrive.class del Default\EventCamionPompierArrive.class
if exist Default\CentreGestionMessage.class del Default\CentreGestionMessage.class
if exist Default\EventDecouvreVictime.class del Default\EventDecouvreVictime.class
if exist Default\CentreTraitementUrgence.class del Default\CentreTraitementUrgence.class
if exist Default\EventVaHopital.class del Default\EventVaHopital.class
if exist Default\EventPasIntervention.class del Default\EventPasIntervention.class
if exist Default\EventMessageRecu.class del Default\EventMessageRecu.class
if exist Default\Pompier.class del Default\Pompier.class
if exist Default\Victime.class del Default\Victime.class
if exist Default\CamionPompier.class del Default\CamionPompier.class
if exist Default\EventEnvoieCamionPompier.class del Default\EventEnvoieCamionPompier.class
if exist Default\Default_pkgClass.class del Default\Default_pkgClass.class

if "%1" == "clean" goto end

:compile   
if %BUILDSET%==Debug goto compile_debug
echo compiling JAVA source files
javac  @files.lst
goto end

:compile_debug
echo compiling JAVA source files
javac -g  @files.lst
goto end

:run

java %2

:end


