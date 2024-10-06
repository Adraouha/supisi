<!DOCTYPE html>
<html>
<head>
    <title>TP2 - EX2 - Afficher le nom</title>
</head>
<body>

<form method="post" action="">
    Prénom: <input type="text" name="prenom">
    <input type="submit" value="Envoyer">
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $prenom = htmlspecialchars($_POST['prenom']);
    echo "Tu t’appelles " . $prenom;
}
?>

</body>
</html>
