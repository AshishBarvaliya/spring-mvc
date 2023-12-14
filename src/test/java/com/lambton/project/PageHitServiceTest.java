package com.lambton.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PageHitServiceTest {

    private final PageHitService pageHitService = new PageHitService();

    @Test
    public void whenIncrementHitCount_thenCorrectCount() {
        long firstHit = pageHitService.incrementAndGet();
        assertEquals(1, firstHit);

        long secondHit = pageHitService.incrementAndGet();
        assertEquals(2, secondHit);
    }
}