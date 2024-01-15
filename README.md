
BŁAD 1
=======
Jezeli bedzie problem z connection managerem i nie bedzie chcialo sie polaczyc z baza
No suitable driver found for jdbc mysql czy cos podobnego
NALEZY dodac w project structure -> modules -> dodaj plik.jar (connection manager) oraz w project structure -> SDKs (zakladka classpath) -> rowniez connection manager

BŁAD 2
=======
Jak jest problem z connection manager coś tam driver listener
ORA-12514: TNS:listener does not currently know of service requested in connect descriptor
Sprawdz sterownik jdbc czy jest na poprawna wersje oracle

Sprawdz czy url jest mniej wiecej taki
 String url = "jdbc:oracle:thin:@//localhost:1521/serviceName";
 gdzie serviceName to prawdopodobnie xepdb1
 
