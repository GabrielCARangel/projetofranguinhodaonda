package FranguinhoDaOnda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;

public class NotaFiscalDAO {

    private Connection conexao;
    boolean status;

    // MÉTODO CONSTRUTOR
    public NotaFiscalDAO() {
        Connection conexao = ConnectionFactory.getConnection();
    }

    // MÉTODO INSERIR
    public boolean inserirNotaFiscal(NotaFiscal notafiscal) {
        String sql = "INSERT INTO NotaFiscal(serie,nnf,dhemi,dhemi,dhsaient,tpnf,indpag,indpres,natop,indfinal,iddest) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, (int) notafiscal.getSerie());
            stmt.setString(2, notafiscal.getNnf());
            stmt.setString(3, notafiscal.getDhemi());
            stmt.setString(4, notafiscal.getDhsaient());
            stmt.setString(5, notafiscal.getTpnf());
            stmt.setString(6, notafiscal.getIndpag());
            stmt.setString(7, notafiscal.getIndpres());
            stmt.setString(8, notafiscal.getNatop());
            stmt.setString(9, notafiscal.getIndfinal());
            stmt.setString(10, notafiscal.getIddest());
            stmt.close();
            status = true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(NotaFiscal.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

}
