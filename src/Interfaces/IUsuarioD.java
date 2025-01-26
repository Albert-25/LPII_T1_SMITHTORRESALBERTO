package Interfaces;

import model.Usuario;
import java.util.List;

public interface IUsuarioDao {
    void create(Usuario usuario);
    Usuario read(int id);
    void update(Usuario usuario);
    void delete(int id);
    List<Usuario> findAll();
}
