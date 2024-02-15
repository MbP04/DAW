@echo off

:pregunta
set /p archivo=Ingrese nombre Archivo=
if %archivo%=="" (goto :error) else (goto :contador)

:error
echo No has introducido ningun parametro 
goto :pregunta

:contador
set cuenta=0
for /f %%x in (%archivo%) do set /a cuenta=1+cuenta
set funcion=%cuenta%
echo %funcion%

