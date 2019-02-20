package Dao.impl;

import Dao.BaseDao;
import Dao.PetDao;
import entity.Pet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2019/1/23.
 */
public class Petimpl extends BaseDao implements PetDao {
    @Override
    public List<Pet> select() {
        List<Pet>list=new ArrayList<>();
        connections();
        String sql="select petname,birthday,petsex from pet";
        try {
            pstmt=conn.prepareStatement(sql);
           rs= pstmt.executeQuery();
           while (rs.next()){
               Pet am=new Pet();
               am.setPetnamee(rs.getString("petname"));
               am.setBirthday(rs.getDate("birthday"));
               am.setPetsex(rs.getInt("petsex"));
               list.add(am);
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Pet> selectall(Integer pinzhong) {
        List<Pet>list=new ArrayList<>();
        connections();
        String sql="select petname,birthday,petsex from pet where petbreed=?";
        try {
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,pinzhong);
            rs= pstmt.executeQuery();
            while (rs.next()){
                Pet am=new Pet();
                am.setPetnamee(rs.getString("petname"));
                am.setBirthday(rs.getDate("birthday"));
                am.setPetsex(rs.getInt("petsex"));
                list.add(am);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int insert(Pet pet) {
        String sql="insert into pet values(null,?,?,?,?,?)";
        Object ps[]={
           pet.getPetnamee(),
                pet.getPetbreed(),
                pet.getPetsex(),
                pet.getBirthday(),
                pet.getDescription()

        };
        return executeUpdate(sql,ps);
    }
}
