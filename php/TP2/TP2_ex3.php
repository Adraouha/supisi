
<!DOCTYPE html>
<html>
<head>
    <title>TP2 - EX3 - Calculer l'âge</title>
</head>
<body>

<form method="post" action="">
    Année de naissance: <input type="number" name="annee_naissance" required>
    <input type="submit" value="Calculer l'âge">
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $annee_naissance = intval($_POST['annee_naissance']);
    $annee_actuelle = date("Y");
    $age = $annee_actuelle - $annee_naissance;
    echo "Vous avez " . $age . " ans.";
}
?>

</body>
</html>
