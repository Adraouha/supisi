<?php
// Définir le fuseau horaire par défaut
date_default_timezone_set('Africa/Casablanca');

// Obtenir la date et l'heure actuelles
$date = date('d-m-Y');
$heure = date('H:i:s');

// Afficher la date et l'heure
echo "La date actuelle est : " . $date . "<br>";
echo "L'heure actuelle est : " . $heure;
?>
