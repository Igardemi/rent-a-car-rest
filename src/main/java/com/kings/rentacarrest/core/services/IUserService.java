package com.kings.rentacarrest.core.services;

import com.kings.rentacarrest.core.exception.DefaultException;
import com.kings.rentacarrest.persistence.entity.User;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public interface IUserService {
    /**
     *
     * @return devuelve una lista de entidades user de la base de datos
     */
    public List<User> findAllUser();

    /**
     *
     * @param id tipo Long referencian al valor id de la entidad a localizar.
     * @return devuelve una entidad user.
     * @throws DefaultException "entity not found" si no encuentra una entidad user en la bd con ese id.
     */
    public User findUserById(final Long id) throws DefaultException;

    /**
     *
     * @param id representa identificador de la Entidad que se quiere eliminar.
     * @return devuelve true si se ha podido borrar la Entidad seleccionada.
     * @throws DefaultException "entity not found" si no encuentra una entidad en la bd con ese id.
     */
    public boolean deleteUser(final Long id) throws DefaultException;

    /**
     *
     * @param user recibe una Entidad para crear o actualizar
     */
    public void updateUser(User user) throws DefaultException;
}
