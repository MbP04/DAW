# 1.Consultas sql

- **Query 1 (Fotos del usuario 36):**
<pre>
    SELECT * FROM instagram_low_cost.fotos f1
    where f1.idUsuario = 36;

</pre>
    
- **Query 2 (Fotos del usuario 36 en el mes de enero de 2024):**
<pre>
    SELECT *
    FROM fotos
    WHERE idUsuario = 36
        AND fechaCreacion BETWEEN '2023-01-01' AND '2023-01-31';
</pre>

- **Query 3 (Comentarios del usuario 36 sobre la foto 12 del usuario 11):**
<pre>
    SELECT count(*)
    FROM instagram_low_cost comentarios,instagram_low_cost.usuarios
    WHERE instagram_low_cost.usuarios.idUsuario = instagram_low_cost.comentarios.idUsuario
        AND instagram_low_cost.comentarios.idUsuario = 11;
</pre>

- **Query 6 (Número de “Me divierte” de la foto número 12 del usuario 45):**
<pre>
    SELECT COUNT(*)
    FROM instagram_low_cost.reaccionesFotos rf
    WHERE rf.idFoto = 12
        AND rf.idTipoReaccion = 3
        AND rf.idUsuario = 45;
</pre>

- **Query 7 (Número de fotos tomadas en la playa ):**
<pre>
    SELECT COUNT(*)
    FROM fotos
    WHERE t LIKE '%playa%';

</pre>

## 1.1 Consultas secundarias sql
- **Query (Numero de fotos de los administradores) :**
<pre>
   SELECT count(*)
    FROM instagram_low_cost.fotos,instagram_low_cost.usuarios
    WHERE instagram_low_cost.usuarios.idUsuario = instagram_low_cost.fotos.idUsuario
        AND instagram_low_cost.usuarios.idRol = 3;
</pre>

- **Query (Numero de comentarios del usuario 11) :**
<pre>
    SELECT count(*)
    FROM instagram_low_cost.comentarios,instagram_low_cost.usuarios
    WHERE instagram_low_cost.usuarios.idUsuario = instagram_low_cost.comentarios.idUsuario
        and instagram_low_cost.comentarios.idUsuario = 11;
</pre>

- **Query (Fotos del usuario 36 en el mes de enero de 2024 con nombre y url):**
<pre>
    SELECT count(*)
    FROM instagram_low_cost.comentarios,instagram_low_cost.usuarios
    WHERE instagram_low_cost.usuarios.idUsuario = instagram_low_cost.comentarios.idUsuario
        and instagram_low_cost.comentarios.idUsuario = 11;
</pre>