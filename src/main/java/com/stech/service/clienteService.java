package com.stech.service;
import org.springframework.stereotype.Service;
import java.util.List;


import com.stech.model.clients;
import com.stech.repository.clientRepository;

@Service
public class clienteService {

    private final clientRepository clientRepository;

    public clienteService(clientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<clients> getAllClients() {
        return clientRepository.findAll();
    }
    public clients getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }
    public clients saveClient(clients client) {
        return clientRepository.save(client);
    }
    public clients updateClient(Long id, clients clientDa){
        try{
        if(clientRepository.existsById(id)) {
            clientDa.setId(id);
            return clientRepository.save(clientDa);
        }}catch (Exception e) {
            throw new RuntimeException("Error updating client with id: " + id, e);
        }
        return null;
    }
    public clients deleteClient(Long id){
        try{
        if(clientRepository.existsById(id)){
            clients client = clientRepository.findById(id).orElse(null);
            clientRepository.deleteById(id);
            return client;
        }}catch (Exception e) {
            throw new RuntimeException("Error deleting client with id: " + id, e);
        }
        return null;
    }
}
