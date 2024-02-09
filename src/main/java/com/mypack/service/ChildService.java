package com.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypack.model.Child;
import com.mypack.repository.ChildRepository;

@Service
public class ChildService {
    @Autowired
    private ChildRepository childRepository;

    public List<Child> getAllChildren() {
        return childRepository.findAll();
    }

    public Child getChildById(Long id) {
        return childRepository.findById(id).orElse(null);
    }

    public Child saveChild(Child child) {
        return childRepository.save(child);
    }

    public void deleteChild(Long id) {
        childRepository.deleteById(id);
    }
}

