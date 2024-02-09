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

import com.mypack.model.Child;
import com.mypack.service.ChildService;

@RestController
@RequestMapping("/api/children")
public class ChildController {
    @Autowired
    private ChildService childService;

    @GetMapping
    public List<Child> getAllChildren() {
        return childService.getAllChildren();
    }

    @GetMapping("/{id}")
    public Child getChildById(@PathVariable Long id) {
        return childService.getChildById(id);
    }

    @PostMapping
    public Child saveChild(@RequestBody Child child) {
        return childService.saveChild(child);
    }

    @DeleteMapping("/{id}")
    public void deleteChild(@PathVariable Long id) {
        childService.deleteChild(id);
    }
}

