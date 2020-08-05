package com.proyecto.ejb;
import com.proyecto.model.Usuario;
import java.util.List;
import javax.ejb.Local;
/**
 *
 * @author isaac
 */
@Local
public interface UsuarioFacadeLocal {

    void create(Usuario usuario);

    void edit(Usuario usuario);

    void remove(Usuario usuario);

    Usuario find(Object id);

    List<Usuario> findAll();

    List<Usuario> findRange(int[] range);

    int count();
    
    Usuario iniciarSesion(Usuario us) throws Exception;
}