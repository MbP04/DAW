@echo off
set /p nom=Nombre de la web:
set /p ubi=Ubicacion del directorio: 

if EXIST %ubi% (
	echo "La ruta existe"
	MD "%ubi%/%nom%/"
	MD "%ubi%/%nom%/aps"
	MD "%ubi%/%nom%/aps/privado"
	MD "%ubi%/%nom%/aps/publico"
	MD "%ubi%/%nom%/html"
	MD "%ubi%/%nom%/html/privado"
	MD "%ubi%/%nom%/html/publico"
	MD "%ubi%/%nom%/img"
	MD "%ubi%/%nom%/img/gif"
	MD "%ubi%/%nom%/img/jpg"
	MD "%ubi%/%nom%/img/png"
	MD "%ubi%/%nom%/otros"
	MD "%ubi%/%nom%/scripts"

) else (
	echo ("La ruta no existe")