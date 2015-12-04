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
if exist Default\EventEtatNormal.class del Default\EventEtatNormal.class
if exist Default\EventEnvoieDonneesToServer.class del Default\EventEnvoieDonneesToServer.class
if exist Default\EventRecoitDonneesFromUser.class del Default\EventRecoitDonneesFromUser.class
if exist Default\EventFaitRequteServeur.class del Default\EventFaitRequteServeur.class
if exist Default\EventVoitIncident.class del Default\EventVoitIncident.class
if exist Default\BaseDeDonnee.class del Default\BaseDeDonnee.class
if exist Default\EventRecolteRenseignements.class del Default\EventRecolteRenseignements.class
if exist Default\EventFaitRequeeServeur.class del Default\EventFaitRequeeServeur.class
if exist Default\EventRecoieRequeteFromServer.class del Default\EventRecoieRequeteFromServer.class
if exist Default\IngenieurInformaticien.class del Default\IngenieurInformaticien.class
if exist Default\EventEnvoieDonneesToCentre.class del Default\EventEnvoieDonneesToCentre.class
if exist Default\EventRequeteAttente.class del Default\EventRequeteAttente.class
if exist Default\EventEnAttente.class del Default\EventEnAttente.class
if exist Default\EnvoieDonnees.class del Default\EnvoieDonnees.class
if exist MainDefaultComponent.class del MainDefaultComponent.class
if exist Default\EventRequeteBDD.class del Default\EventRequeteBDD.class
if exist Default\EventEnvoieRequeteToUser.class del Default\EventEnvoieRequeteToUser.class
if exist Default\EventRequeteExecute.class del Default\EventRequeteExecute.class
if exist Default\Utilisateur.class del Default\Utilisateur.class
if exist Default\EventRetourNormalServer.class del Default\EventRetourNormalServer.class
if exist Default\EventFaitRequeteServeur.class del Default\EventFaitRequeteServeur.class
if exist Default\EventRecoitRequete.class del Default\EventRecoitRequete.class
if exist Default\EventAnalyseDonnees.class del Default\EventAnalyseDonnees.class
if exist Default\EventAnalyseSituation.class del Default\EventAnalyseSituation.class
if exist Default\RecoitRequeteServeur.class del Default\RecoitRequeteServeur.class
if exist Default\Default_pkgClass.class del Default\Default_pkgClass.class
if exist Default\ServeurApplication.class del Default\ServeurApplication.class
if exist Default\EventRegroupeInformations.class del Default\EventRegroupeInformations.class
if exist Default\EventRecoitRequeteFromCentre.class del Default\EventRecoitRequeteFromCentre.class
if exist Default\EventRetourNormalUser.class del Default\EventRetourNormalUser.class

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


