package com.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypack.model.Parent;
import com.mypack.repository.ParentRepository;

@Service
public class ParentService {
    @Autowired
    private ParentRepository parentRepository;

    public List<Parent> getAllParents() {
        return parentRepository.findAll();
        
    }
    

    public Parent getParentById(Long id) {
        return parentRepository.findById(id).orElse(null);
    }

    public Parent saveParent(Parent parent) {
        return parentRepository.save(parent);
    }

    public void deleteParent(Long id) {
        parentRepository.deleteById(id);
    }
}

