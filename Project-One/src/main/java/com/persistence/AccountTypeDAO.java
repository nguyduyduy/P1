package com.persistence;

import com.models.Account_Type;
import com.utils.ConnectionManager;
import com.utils.CustomCRUDInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccountTypeDAO implements CustomCRUDInterface<Account_Type> {

    Connection connection;

    public AccountTypeDAO() {

        connection = ConnectionManager.getConnection();
    }


    @Override
    public Integer create(Account_Type account_type) {

        // note that this is a 'create' method
        // however we are inserting into our tables
        try {

            String sql = "INSERT INTO account_type (acc_id, type) VALUES (default, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, account_type.getType());

            pstmt.executeUpdate();

            ResultSet rs = pstmt.getGeneratedKeys();

            rs.next();

            return rs.getInt(1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public Account_Type read(Integer id) {

        try {
            String sql = "SELECT * FROM account_type WHERE acc_id = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);

            pstmt.setInt(1, id);

            Account_Type accountType = new Account_Type();

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                accountType.setAcc_id(rs.getInt("acc_id"));
                accountType.setType(rs.getString("type"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Account_Type update(Account_Type account_type) {

        try {

            String sql = "UPDATE account_type SET type = ? WHERE acc_id = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstmt.setInt(1, account_type.getAcc_id());
            pstmt.setString(1, account_type.getType());

            pstmt.executeUpdate();

            ResultSet rs = pstmt.getGeneratedKeys();

            while (rs.next()) {

                account_type.setType(rs.getString("type"));

            }

            return account_type;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        return null;
    }

    @Override
    public boolean delete(Integer id) {

        try {
            String sql = "DELETE FROM account_type WHERE acc_id = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);

            pstmt.setInt(1, id);

            return pstmt.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
