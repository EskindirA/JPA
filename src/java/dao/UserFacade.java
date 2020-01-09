/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Address;
import entities.User;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Eskindir
 */
@Stateless
public class UserFacade extends AbstractFacade<User> {
    @Inject
    AddressFacade a_facade;
    
    @PersistenceContext(unitName = "shipsRepoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }
    
    public void save(){
        try{
            Address address = new Address();
            address.setCity("Addis Ababa");
            address.setStreet("Semit");
            a_facade.save(address);
            User user = new User();
            user.setAddress(address);
            user.setUsername("Eskindir");
            em.persist(user);
        }catch(Exception s){
            s.printStackTrace();
        }
    }
    
}
