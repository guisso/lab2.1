package io.github.guisso.lojinha;

import javax.ejb.Local;

/**
 *
 * @author Luis Guisso &lt;luis.guisso at ifnmg.edu.br&gt;
 */
@Local
public interface ClienteServiceLocal {

    void salvar(Cliente cliente);

    Cliente buscarPorId(Long id);
    
}
