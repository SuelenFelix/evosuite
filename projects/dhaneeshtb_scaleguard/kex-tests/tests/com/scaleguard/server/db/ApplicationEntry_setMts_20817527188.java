package com.scaleguard.server.db;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.scaleguard.server.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ApplicationEntry_setMts_20817527188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8165;
     Object term8204;

    public ApplicationEntry_setMts_20817527188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8165 = newInstance(Class.forName("com.scaleguard.server.db.ApplicationEntry"));
        setField(term8165, term8165.getClass(), "id", "zsWKWiTFuo");
        setField(term8165, term8165.getClass(), "name", "UPUbwyHQKN");
        setField(term8165, term8165.getClass(), "description", "lgQkrXANyI");
        setLongField(term8165, term8165.getClass(), "mts", -7278883608542636188L);
        setLongField(term8165, term8165.getClass(), "uts", -1539859611880912454L);
        term8204 = new Long(4100236067313034103L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ApplicationEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term8204;
        callMethod(klass, "setMts", argTypes, term8165, args);
    }

};


