package com.aedemirsen.countriesbe.util.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Api {

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Country{
        public static final String BASE_URL = "/country";

        public static final String INSERT_ALL = "/insert_all";

        public static final String COUNTRY_NAMES = "/names";


    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class Cache{
        public static final String BASE_URL = "/cache";

        public static final String EVICT_COUNTRY_NAMES = "/names/evict";


    }

}
