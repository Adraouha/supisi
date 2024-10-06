<!DOCTYPE html>
<html>
<head>
    <title>TP2 - EX5 : Calculs sur deux nombres</title>
</head>
<body>

<form method="post" action="">
    Nombre 1: <input type="number" name="nombre1" step="any" required>
    Nombre 2: <input type="number" name="nombre2" step="any" required>
    <input type="submit" value="Calculer">
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nombre1 = floatval($_POST['nombre1']);
    $nombre2 = floatval($_POST['nombre2']);

    // Calcul de la somme
    $somme = $nombre1 + $nombre2;
    echo "La somme de $nombre1 et $nombre2 est : " . $somme . "<br>";

    // Calcul de la soustraction du plus grand moins le plus petit
    if ($nombre1 > $nombre2) {
        $soustraction = $nombre1 - $nombre2;
    } else {
        $soustraction = $nombre2 - $nombre1;
    }
    echo "La soustraction du plus grand moins le plus petit est : " . $soustraction . "<br>";

    // Calcul de la division si le deuxième nombre est différent de 0
    if ($nombre2 != 0) {
        $division = $nombre1 / $nombre2;
        echo "La division de $nombre1 par $nombre2 est : " . $division;
    } else {
        echo "La division par zéro n'est pas possible.";
    }
}
?>

</body>
</html>
