set CLASSPATH="./module/*;./lib/*"
set MAIN_CLASS=com.su.gitmesage.GitmesageApplication
set DEBUG_PORT=9000
set DEBUG_OPTS="-Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=%DEBUG_PORT%"
java -Xbootclasspath/a:./conf -cp %CLASSPATH% %MAIN_CLASS%
pause