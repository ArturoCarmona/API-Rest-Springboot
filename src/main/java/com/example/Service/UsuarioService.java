package com.example.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Model.UsuarioModel;
import com.example.Repository.IUsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
    IUsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> getUsers(){
        //Casteo para regresarlo como JSON
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel saveUsers(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> getById(Long id){
        return usuarioRepository.findById(id);
    }
    
    public boolean deleteUser(Long id){
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList<UsuarioModel> findAllByAge(Integer age) throws Exception {
        ArrayList<UsuarioModel> usuario = findAllByAge(age);
        return usuario;
    }

}
