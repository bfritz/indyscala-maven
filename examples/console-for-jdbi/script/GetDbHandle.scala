import org.skife.jdbi.v2.DBI
import org.skife.jdbi.v2.Handle

val db_user = "sa"
val db_pass = ""

Class.forName("org.h2.Driver")

val dbi = new DBI("jdbc:h2:~/projects/indyscala/maven/test", db_user, db_pass)
val h = dbi.open

