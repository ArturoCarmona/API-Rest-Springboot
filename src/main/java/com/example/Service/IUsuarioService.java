package com.example.Service;

import java.util.ArrayList;
import com.example.Model.UsuarioModel;

public interface IUsuarioService {
	public ArrayList<UsuarioModel> findAllByAge(Integer age) throws Exception;
}
