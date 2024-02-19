SELECT COUNT(*)
FROM instagram_low_cost.reaccionesFotos rf
WHERE rf.idFoto = 12
    AND rf.idTipoReaccion = 3
    AND rf.idUsuario = 45;
