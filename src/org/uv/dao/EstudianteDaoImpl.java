/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uv.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.uv.model.Estudiante;
import org.uv.util.ConexionDB;

/**
 *
 * @author jahazielBH
 */
public class EstudianteDaoImpl implements IEstudianteDao<Estudiante> {

    ConexionDB con;
    private ResultSet rs;
    private PreparedStatement ps;
    boolean res;
    Estudiante estudiante;
    List<Estudiante> estudiantes;

    /**
     *
     * @param pojo
     * @return
     */
    @Override
    public boolean add(Estudiante pojo) {
        String query = "INSERT INTO estudiantes (id,nombre,apellidopat,apellidomat,genero,edad,matricula,nomcarrera) VALUES (?,?,?,?,?,?,?,?)";
        try {
            con = ConexionDB.getInstace();
            ps = con.getConnection().prepareStatement(query);
            ps.setLong(1, pojo.getId());
            ps.setString(2, pojo.getNombre());
            ps.setString(3, pojo.getApellidopat());
            ps.setString(4, pojo.getApellidomat());
            ps.setString(5, pojo.getSexo());
            ps.setInt(6, pojo.getEdad());
            ps.setString(7, pojo.getMatricula());
            ps.setString(8, pojo.getNomCarrera());
            ps.execute();
            res = true;
            return res;
        } catch (SQLException e) {
            Logger.getLogger(EstudianteDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            res = false;
            return res;
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(EstudianteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     *
     * @param pojo
     * @return
     */
    @Override
    public boolean update(Estudiante pojo) {
        String query = "UPDATE estudiantes SET nombre=?, apellidopat=?, apellidomat=?, genero=?, edad=?, matricula=?, nomcarrera=? WHERE id=?";
        try {
            con = ConexionDB.getInstace();
            ps = con.getConnection().prepareStatement(query);
            ps.setString(1, pojo.getNombre());
            ps.setString(2, pojo.getApellidopat());
            ps.setString(3, pojo.getApellidomat());
            ps.setString(4, pojo.getSexo());
            ps.setInt(5, pojo.getEdad());
            ps.setString(6, pojo.getMatricula());
            ps.setString(7, pojo.getNomCarrera());
            ps.setLong(8, pojo.getId());
            ps.execute();
            res = true;
            return res;
        } catch (SQLException e) {
            Logger.getLogger(EstudianteDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            res = false;
            return res;
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(EstudianteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public boolean delete(Long id) {
        String query = "DELETE FROM estudiantes WHERE id=?";
        try {
            con = ConexionDB.getInstace();
            ps = con.getConnection().prepareStatement(query);
            ps.setLong(1, id);
            ps.execute();
            res = true;
            return res;
        } catch (SQLException e) {
            Logger.getLogger(EstudianteDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            res = false;
            return res;
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(EstudianteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Estudiante getById(Long id) {
        String query = "SELECT * FROM estudiantes WHERE id =?";
        try {
            con = ConexionDB.getInstace();
            ps = con.getConnection().prepareStatement(query);
            ps.setLong(1, id);
            estudiante = new Estudiante();
            rs = ps.executeQuery();
            res = false;
            while (rs.next()) {
                res = true;
                estudiante.setId(rs.getLong(1));
                estudiante.setNombre(rs.getString(2));
                estudiante.setApellidopat(rs.getString(3));
                estudiante.setApellidomat(rs.getString(4));
                estudiante.setSexo(rs.getString(5));
                estudiante.setEdad(rs.getInt(6));
                estudiante.setMatricula(rs.getString(7));
                estudiante.setNomCarrera(rs.getString(8));
            }
            if (res == true) {
                return estudiante;
            } else {
                return null;
            }
        } catch (SQLException e) {
            Logger.getLogger(EstudianteDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            return null;
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(EstudianteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     *
     * @return
     */
    @Override
    public List<Estudiante> getAll() {
        String query = "SELECT * FROM estudiantes ORDER BY id";
        try {
            con = ConexionDB.getInstace();
            ps = con.getConnection().prepareStatement(query);
            estudiantes = new ArrayList();
            rs = ps.executeQuery();
            res = false;
            while (rs.next()) {
                estudiante = new Estudiante();
                estudiante.setId(rs.getLong(1));
                estudiante.setNombre(rs.getString(2));
                estudiante.setApellidopat(rs.getString(3));
                estudiante.setApellidomat(rs.getString(4));
                estudiante.setSexo(rs.getString(5));
                estudiante.setEdad(rs.getInt(6));
                estudiante.setMatricula(rs.getString(7));
                estudiante.setNomCarrera(rs.getString(8));
                estudiantes.add(estudiante);
            }
            return estudiantes;
        } catch (SQLException e) {
            Logger.getLogger(EstudianteDaoImpl.class.getName()).log(Level.SEVERE, null, e);
            return null;
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(EstudianteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
