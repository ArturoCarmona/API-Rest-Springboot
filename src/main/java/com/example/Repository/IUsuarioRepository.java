package com.example.Repository;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.Model.UsuarioModel;

@Repository
public interface IUsuarioRepository extends CrudRepository<UsuarioModel, Long>{
	public abstract ArrayList<UsuarioModel> findByStatus(Integer status);
    public UsuarioModel findByFirstName(String firstName);
}
