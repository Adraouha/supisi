<!DOCTYPE html>
<html>
<head>
    <title>TP 2 - EX6 : Calcul de la Mention</title>
</head>
<body>

<form method="post" action="">
    Note: <input type="number" name="note" step="any" required>
    <input type="submit" value="Envoyer">
</form>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $note = floatval($_POST['note']);

    if ($note >= 0 && $note <= 20) {
        if ($note >= 16) {
            $mention = "Très bien";
        } elseif ($note >= 14) {
            $mention = "Bien";
        } elseif ($note >= 12) {
            $mention = "Assez bien";
        } elseif ($note >= 10) {
            $mention = "Passable";
        } else {
            $mention = "Insuffisant";
        }
        echo "Votre note est : " . $note . "<br>";
        echo "Mention : " . $mention;
    } else {
        echo "La note doit être comprise entre 0 et 20.";
    }
}
?>

</body>
</html>
