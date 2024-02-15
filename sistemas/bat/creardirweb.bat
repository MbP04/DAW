@echo off

set /p nombre=Introduce nombre directorio:
MD "%nombre%"

:crearsub
set /p nombre2=Introduce nombre subdirectorio:
MD "%nombre%\%nombre2%" | goto :pregunta

:pregunta
set /p res=Quieres otro subdirectorio? (s/n):
if res EQU s (goto :crearsub) else (goto :subsub)

:subsub
set /p nombre3=Introduce nombre subsubdirectorio:
MD "%nombre%\%nombre2%\%nombre3%"