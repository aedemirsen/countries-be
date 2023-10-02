package com.aedemirsen.countriesbe.service.impl;

import com.aedemirsen.countriesbe.service.interfaces.ICacheService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Slf4j
@Component
@RequiredArgsConstructor
public class CacheService implements ICacheService {

    private final CacheManager cacheManager;

    @Override
    public void evictCacheValues(String cacheName) {
        Objects.requireNonNull(cacheManager.getCache(cacheName)).clear();
        log.info("All values evicted for cache {}", cacheName);
    }
}
