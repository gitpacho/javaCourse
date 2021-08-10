package bookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBManager implements AutoCloseable {
    private Connection connection;

    public DBManager() throws SQLException {
        connect();
    }

    private void connect() throws SQLException {
        String jdbcurl = "jdbc:sqlite:C:\\Users\\pachi\\OneDrive\\Escritorio\\proyectos java\\BookShop\\Bookshop.db";
        this.connection = DriverManager.getConnection(jdbcurl);
    }

    /**
     * Close the connection to the database if it is still open.
     *
     */
    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
        connection = null;
    }

    /**
     * Return the number of units in stock of the given book.
     *
     * @param book The book object.
     * @return The number of units in stock, or 0 if the book does not exist in the
     *         database.
     * @throws SQLException If somthing fails with the DB.
     */
    public int getStock(Book book) throws SQLException {
        return getStock(book.getId());
    }

    /**
     * Return the number of units in stock of the given book.
     *
     * @param bookId The book identifier in the database.
     * @return The number of units in stock, or 0 if the book does not exist in the
     *         database.
     */
    public int getStock(int bookId) throws SQLException {
        Integer cantidad = 0;
        Statement stmt = connection.createStatement();
        String sql = "SELECT quantity FROM INVENTARY WHERE id_book = " + bookId + ";";
        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next()) {
            cantidad = rs.getInt("quantity");
        }
        return cantidad;
    }

    /**
     * Search book by ISBN.
     *
     * @param isbn The ISBN of the book.
     * @return The Book object, or null if not found.
     * @throws SQLException If somthing fails with the DB.
     */
    public Book searchBook(String isbn) throws SQLException {
        Book b = null;
        Statement stmt = connection.createStatement();
        String sql = "SELECT * FROM BOOK WHERE isbn = " + isbn + ";";
        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next()) {
            try {
                b = new Book();
                b.setId(rs.getInt("id_book"));
                b.setIsbn(rs.getString("isbn"));
                b.setTitle(rs.getString("title"));
                b.setYear(rs.getInt("year_publication"));
            } catch (Exception e) {System.out.println(e.getMessage());};
        }
        return b;
    }

    /**
     * Sell a book.
     *
     * @param book  The book.
     * @param units Number of units that are being sold.
     * @return True if the operation succeeds, or false otherwise (e.g. when the
     *         stock of the book is not big enough).
     * @throws SQLException If somthing fails with the DB.
     */
    public boolean sellBook(Book book, int units) throws SQLException {
        return sellBook(book.getId(), units);
    }

    /**
     * Sell a book.
     *
     * @param book  The book's identifier.
     * @param units Number of units that are being sold.
     * @return True if the operation succeeds, or false otherwise (e.g. when the
     *         stock of the book is not big enough).
     * @throws SQLException If something fails with the DB.
     */
    public boolean sellBook(int id_book, int units) throws SQLException {
        Boolean state = false;
        Statement stmt = connection.createStatement();
        String sql = "SELECT quantity FROM INVENTARY WHERE id_book = " + id_book + ";";
        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next()) {
            Integer cantidad = rs.getInt("quantity");
            if (cantidad >= units) {
                state = true;
                Statement stmt2 = connection.createStatement();
                String sql2 = "UPDATE INVENTARY SET quantity =" + (cantidad - units) + " WHERE id_book = 1;";
                int rows = stmt2.executeUpdate(sql2);
                System.out.println(rows + " rows updated");
            }            
        }
        return state;
    }

    /**
     * Return a list with all the books in the database.
     *
     * @return List with all the books.
     * @throws SQLException If something fails with the DB.
     */
    public List<Book> listBooks() throws SQLException {
        List<Book> lista = new ArrayList<Book>();
        Statement stmt = connection.createStatement();
        String sql = "SELECT * FROM BOOK;";
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            Book b = new Book();
            b.setId(result.getInt("id_book"));
            b.setIsbn(result.getString("isbn"));
            b.setTitle(result.getString("title"));
            b.setYear(result.getInt("year_publication"));
            lista.add(b);
        }
        return lista;
    }
}
