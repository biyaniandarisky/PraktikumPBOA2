package jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
/**
 * Nama : Biyani Andarisky Maratia
 * File : MysqlMahasiswaService.java
 * Deskripsi : menyediakan layanan (service/controller) bagi program utama dalam mengelola basisdata
 */

public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    //konstruktor
    public MysqlMahasiswaService(){
        koneksi = MysqlUtility.getConnection();
    }
    
    // membuat objek mahasiswa
    public Mahasiswa makeMhsObject(ResultSet rs){
        Mahasiswa mhs = null;

        try {
            mhs = new Mahasiswa(
                    rs.getInt("id"),
                    rs.getString("nama")
            );
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return mhs;
    }
    
    //menambahkan data mahasiswa
    public void add(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa(nama) VALUES (?)";

        try {
            PreparedStatement stmt = koneksi.prepareStatement(sql);

            stmt.setString(1, mhs.getNama());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    //update data mahasiswa
    public void update(Mahasiswa mhs){
        String sql = "UPDATE mahasiswa SET nama=? WHERE id=?";
        try {
            PreparedStatement stmt = koneksi.prepareStatement(sql);

            stmt.setString(1, mhs.getNama());
            stmt.setInt(2, mhs.getId());

            stmt.executeUpdate();

            System.out.println("Berhasil update");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    //delete data mahasiswa sesuai id
    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id=?";
        try {
            PreparedStatement stmt = koneksi.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.executeUpdate();

            System.out.println("Berhasil delete");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    //ambil mahasiswa sesuai id
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;

        String sql = "SELECT * FROM mahasiswa WHERE id=?";
        try {
            PreparedStatement stmt = koneksi.prepareStatement(sql);

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                mhs = makeMhsObject(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return mhs;
    }
    
    //ambil semua isi tabel mahasiswa
    public List<Mahasiswa> getAll() {

        List<Mahasiswa> listMhs = new ArrayList<>();

        String sql = "SELECT * FROM mahasiswa";
        try {
            PreparedStatement stmt = koneksi.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                listMhs.add(mhs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listMhs;
    }
}
