package io.github.guisso.lojinha;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Serviço para operações CRUD sobre entidade Cliente
 *
 * @author Luis Guisso &lt;luis.guisso at ifnmg.edu.br&gt;
 * @see Cliente
 * @version 0.1
 * @since 0.1
 */
@Stateless
public class ClienteService implements ClienteServiceLocal {
    
    @PersistenceContext(unitName = "LojinhaPU")
    private EntityManager em;
    
    /**
     * Realiza operações de inserção e atualização de clientes no DS
     *
     * @param cliente Cliente a ser persistidos
     */
    @Override
    public void salvar(Cliente cliente) {
        em.persist(cliente);
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return em.find(Cliente.class, id);
    }

}
