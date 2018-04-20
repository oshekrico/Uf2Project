package com.company.manager;

import com.company.model.Usuario;

public class ManagerUsuarios {
    Usuario[] usuarios = new Usuario[4];
    public Usuario logeado;

    public void crearUsuario(String nombre, String contraseña){

        Usuario usuario = new Usuario();
        usuario.username = nombre;
        usuario.password = contraseña;

        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i] == null){
                usuarios[i] = usuario;
                break;
            }
        }
    }

    public String verificar(String nombre, String pass){
        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i] != null && nombre.equals(usuarios[i].username) && pass.equals(usuarios[i].password)){
                logeado = usuarios[i];
                return "ok";
            }
        }
        return "nok";
    }
}
