package src;

import java.sql.Connection;

public class Main {
    public static void main (String[] args) {
            DbInfo db = new DbInfo();
        Connection conn = db.connection_to_db("java-connect-db", "postgres", "axaliparoli");
        //db.createTable(conn,"myTable");
        //db.insert_row(conn,"myTable","","");
        //db.update_name(conn,"myTable","","");
        //db.search_by_name(conn,"myTable","");
        //db.delete_row_by_name(conn,"myTable","");
        //db.delete_row_by_id(conn,"myTable",3);
        //db.read_data(conn,"myTable");
        //db.delete_table(conn,"myTable");
    }
}
