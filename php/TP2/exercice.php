<!DOCTYPE html>
<html>
<head>
    <title>EXERCICE DU TP2 : Tri de 3 variables</title>
</head>
<body>

<form method="post" action="">
    Variable 1: <input type="number" name="var1" required><br>
    Variable 2: <input type="number" name="var2" required><br>
    Variable 3: <input type="number" name="var3" required><br>
    <input type="submit" value="Trier">
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Récupérer les valeurs des variables
    $var1 = floatval($_POST['var1']);
    $var2 = floatval($_POST['var2']);
    $var3 = floatval($_POST['var3']);

    // Mettre les variables dans un tableau
    $variables = array($var1, $var2, $var3);

    // Trier le tableau
    sort($variables);

    // Afficher les variables triées
    echo "Les variables triées du plus petit au plus grand sont : " . implode(", ", $variables);
}
?>

</body>
</html>
