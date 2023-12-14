package com.lambton.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PageHitController {

    @Autowired
    private PageHitService pageHitService;

    @GetMapping("/api/hits")
    public long getHits() {
        return pageHitService.incrementAndGet();
    }
}
