package service.impl;

import Dao.PetDao;
import Dao.impl.Petimpl;
import entity.Pet;
import service.PetService;

import java.util.List;

/**
 * Created by dell on 2019/1/23.
 */
public class PetServiceImpl implements PetService {
    PetDao am=new Petimpl();
    @Override
    public List<Pet> select() {
        return am.select();
    }

    @Override
    public List<Pet> selectall(Integer pinzhong) {
        return am.selectall(pinzhong);
    }

    @Override
    public int insert(Pet pet) {
        return am.insert(pet);
    }
}
