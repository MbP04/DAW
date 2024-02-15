@echo off
:contador
set /p archivo=Ingrese nombre Archivo =
set cuenta=0
for /f %%x in (%archivo%) do set /a cuenta=1+cuenta
set funcion=%cuenta%
echo %funcion%


:preguntar
set /p exit=quieres salir (si/no)?
if %exit% EQU no goto :contador 
if %exit% EQU si goto :salir
if %exit% NEQ si goto :preguntar
if %exit% NEQ no goto :preguntar

:salir
echo ADIOS!!

