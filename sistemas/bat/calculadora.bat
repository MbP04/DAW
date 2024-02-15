@echo off



echo BIENVENIDO A LA CALCULADORA
 
echo 1    2    3
echo 4    5    6
echo 7    8    9

set /p num1= Elije numero: 

echo ====== OPERACIONES ========
echo 1 multiplicaicon
echo 2 division 
echo 3 sumar 
echo 4 restar
set /p ope= Que operacion quieres hacer ? : 

set /p num2= Elije el segundo numero: 

if ope EQU 1 goto :multi
if ope EQU 2 goto :division
if ope EQU 3 goto :sumar
if ope EQU 4 goto :restar

:multi
set /a tot=%num1%*%num2%
echo Resultado %tot%

:division
set /a tot=%num1%/%num2%
echo Resultado %tot%

:sumar
set /a tot=%num1%+%num2%
echo Resultado %tot%

:restar
set /a tot=%num1%-%num2%
echo Resultado %tot%