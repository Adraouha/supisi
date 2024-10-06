<!DOCTYPE html>
<html>
<head>
    <title>TP2 -  EX4 : Calculs sur un nombre</title>
</head>
<body>

<form method="post" action="">
    Nombre: <input type="number" name="nombre" step="any" required>
    <input type="submit" value="Calculer">
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nombre = floatval($_POST['nombre']);
    $carre = $nombre * $nombre;
    $cube = $nombre * $nombre * $nombre;
    $racineCarree = sqrt($nombre);

    echo "Le carré de $nombre est : " . $carre . "<br>";
    echo "Le cube de $nombre est : " . $cube . "<br>";
    echo "La racine carrée de $nombre est : " . $racineCarree;
}
?>

</body>
</html>
