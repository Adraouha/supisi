<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>TP 1 - EX4</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>
</head>
<body>
    
</body>
</html>

<?php

$nom_produit = "pc portable hp i7";
$prix = 5500;
$quantite = 3;
$montant_HT = $prix * $quantite;
$TVA = "20%";
$montant_TTC =$montant_HT*1.2;

echo "<h1>LA FACTURE DE : " .$nom_produit ."</h1>";
echo "::::::::::::::::::::::::::::::";
echo "<br>La quantité : " .$quantite ;
echo "<br>Le prix unitaire : " .$prix ." DH";
echo "<br>::::::::::::::::::::::::::::::";
echo "<br> le montant HT est  .$montant_HT DH";
echo "<br>Le taux de TVA : .$TVA.";
echo "<br>__________________________________";
echo "<br> Le montant TTC : <b>" .$montant_TTC ."</b>DH";

?>