<!DOCTYPE html>
<html>
<head>
    <title>TP2 - EX7 : Tarif d'entrée à la piscine</title>
</head>
<body>

<form method="post" action="">
    Âge: <input type="number" name="age" required><br>
    Carte de réduction: <input type="checkbox" name="reduction"><br>
    <input type="submit" value="Calculer le tarif">
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $age = intval($_POST['age']);
    $hasReduction = isset($_POST['reduction']);

    // Déterminer le tarif de base en fonction de l'âge
    if ($age < 18) {
        $tarif = 1;
    } elseif ($age > 65) {
        $tarif = 2;
    } else {
        $tarif = 3;
    }

    // Appliquer la réduction de 20% si la personne a une carte de réduction
    if ($hasReduction) {
        $tarif *= 0.8;
    }

    echo "Le tarif d'entrée à la piscine est : " . number_format($tarif, 2) . "€";
}
?>

</body>
</html>
