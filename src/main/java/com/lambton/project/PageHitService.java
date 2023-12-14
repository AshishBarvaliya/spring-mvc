package com.lambton.project;

import org.springframework.stereotype.Service;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PageHitService {
    private final AtomicLong hitCount = new AtomicLong();

    public long incrementAndGet() {
        return hitCount.incrementAndGet();
    }

    public long getHitCount() {
        return hitCount.get();
    }
}
