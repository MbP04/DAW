SELECT idUsuario, nombre, COUNT(rf.idReaccion)
FROM usuarios
INNER JOIN reaccionesFotos rf ON rf.idUsuario = u.idUsuario
WHERE rf.idTipoReaccion = 1
GROUP BY u.idUsuario
HAVING totalLikes > 2;
