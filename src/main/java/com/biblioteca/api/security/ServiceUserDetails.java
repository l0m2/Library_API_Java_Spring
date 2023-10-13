package com.biblioteca.api.security;

import com.biblioteca.api.model.FuncionarioModel;
import com.biblioteca.api.repository.FuncionarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServiceUserDetails implements UserDetailsService {
    @Autowired
    FuncionarioRepository funcionarioRepository;

    public ServiceUserDetails(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        FuncionarioModel funcionarioModel = funcionarioRepository.findUser(username).orElseThrow(()->new UsernameNotFoundException("Esse nome nao existe!" +username));
        return new User(funcionarioModel.getNome(), funcionarioModel.getPassword(), true, true, true, true, funcionarioModel.getAuthorities());
    }
}
