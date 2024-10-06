<!DOCTYPE html>
<html>
<head>
    <title>TP2 - EX8 : Catégorie d'un enfant</title>
</head>
<body>

<form method="post" action="">
    Âge de l'enfant: <input type="number" name="age" required>
    <input type="submit" value="Afficher la catégorie">
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $age = intval($_POST['age']);
    $categorie = "";

    // Déterminer la catégorie en fonction de l'âge
    if ($age >= 6 && $age <= 7) {
        $categorie = "Poussin";
    } elseif ($age >= 8 && $age <= 9) {
        $categorie = "Pupille";
    } elseif ($age >= 10 && $age <= 11) {
        $categorie = "Minime";
    } elseif ($age >= 12 && $age <= 14) {
        $categorie = "Cadet";
    } else {
        $categorie = "Ce n’est pas un enfant";
    }

    echo "La catégorie de l'enfant est : " . $categorie;
}
?>

</body>
</html>
