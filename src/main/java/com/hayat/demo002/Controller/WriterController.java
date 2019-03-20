package com.hayat.demo002.Controller;

import com.hayat.demo002.Model.writer;
import com.hayat.demo002.Service.Interface.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WriterController {

    @Autowired
    private WriterService ws;

    @PostMapping("/writer")
    public writer add(@RequestBody writer writer)
    {
        return ws.save(writer);
    }
    @GetMapping("/writers")
    public Iterable<writer> getall()
    {
        return ws.findAll();
    }
}
