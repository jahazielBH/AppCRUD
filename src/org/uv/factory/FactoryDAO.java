/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uv.factory;

import org.uv.dao.EstudianteDaoImpl;
import org.uv.dao.IEstudianteDao;

/**
 *
 * @author jacielpc
 */
public class FactoryDAO {
    public enum TypeDAO {
        ESTUDIANTE
    }
    
    public static IEstudianteDao createDao(TypeDAO t) {
        IEstudianteDao idao = null;
        switch (t) {
            case ESTUDIANTE:
                idao = new EstudianteDaoImpl();
                break;
        }
        return idao;
    }
}
