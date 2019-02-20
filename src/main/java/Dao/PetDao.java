package Dao;

import entity.Pet;
import javafx.scene.control.IndexRange;

import java.util.List;

/**
 * Created by dell on 2019/1/23.
 */
public interface PetDao {
    public List<Pet> select();
    public List<Pet> selectall(Integer pinzhong);
    public int insert(Pet pet);
}
