package com.truong.springDT.controller;

import com.truong.springDT.domain.Link;
import com.truong.springDT.repository.LinkRepositoy;
import net.bytebuddy.dynamic.DynamicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Links")
public class LinkController {
    private LinkRepositoy linkRepositoy;

    @Autowired
    public LinkController(LinkRepositoy linkRepositoy){
        this.linkRepositoy=linkRepositoy;
    }

    // list
    @GetMapping("/")
    public List<Link> list() {
        return linkRepositoy.findAll();
    }

    // CRUD
    @PostMapping("/creates")
    public Link create(@ModelAttribute Link link) {
        return linkRepositoy.save(link);
    }
    @GetMapping("/{id}")
    public Optional<Link> read(@PathVariable Long id) {
        return linkRepositoy.findById(id);
    }
    @PutMapping("/{id}")
    public Link update(@PathVariable long id, @ModelAttribute Link link) {
        return linkRepositoy.save(link);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        linkRepositoy.deleteById(id);
    }
}
