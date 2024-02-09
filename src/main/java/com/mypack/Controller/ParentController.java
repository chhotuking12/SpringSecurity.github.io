package com.mypack.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypack.model.Parent;
import com.mypack.service.ParentService;

@RestController
@RequestMapping("/api/parents")
public class ParentController {
    @Autowired
    private ParentService parentService;

    @GetMapping
    public List<Parent> getAllParents() {
        return parentService.getAllParents();
    }

    @GetMapping("/{id}")
    public Parent getParentById(@PathVariable Long id) {
        return parentService.getParentById(id);
    }

    @PostMapping
    public Parent saveParent(@RequestBody Parent parent) {
        return parentService.saveParent(parent);
    }

    @DeleteMapping("/{id}")
    public void deleteParent(@PathVariable Long id) {
        parentService.deleteParent(id);
    }
}

