package service;

import entity.Pet;

import java.util.List;

/**
 * Created by dell on 2019/1/23.
 */
public interface PetService {
    public List<Pet> select();
    public List<Pet> selectall(Integer pinzhong);
    public int insert(Pet pet);
}
