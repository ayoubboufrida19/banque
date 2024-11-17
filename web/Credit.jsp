





<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery-3.5.1.slim.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="css/layout.css" />
    <title>Credit Bancaire</title>
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center text-primary">Credit Bancaire</h1>
        <form action="controleurServlet" method="post" class="bg-light p-4 rounded shadow">
            <div class="form-group">
                <label for="montant" class="text-secondary">Montant</label>
                <input type="text" class="form-control" id="montant" name="montant" placeholder="Entrez le montant">
                <small class="form-text text-muted">En DH</small>
            </div>
            <div class="form-group">
                <label for="taux" class="text-secondary">Taux</label>
                <input type="number" class="form-control" id="taux" name="taux" placeholder="Entrez le taux">
                <small class="form-text text-muted">En %</small>
            </div>
            <div class="form-group">
                <label for="duree" class="text-secondary">Durée</label>
                <input type="number" class="form-control" id="duree" name="duree" placeholder="Entrez la durée">
                <small class="form-text text-muted">En mois</small>
            </div>
            <button type="submit" class="btn btn-primary">Calculer</button>
        </form>
    </div>
</body>
</html>
