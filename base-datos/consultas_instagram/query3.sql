SELECT count(*)
FROM instagram_low_cost.comentarios,instagram_low_cost.usuarios
where instagram_low_cost.usuarios.idUsuario = instagram_low_cost.comentarios.idUsuario
    and instagram_low_cost.comentarios.idUsuario = 11;
