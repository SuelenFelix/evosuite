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

public class DNSEntry_setTtl_87448018121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10410;
     Object term10414;

    public DNSEntry_setTtl_87448018121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10410 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term10410, term10410.getClass(), "id", null);
        setField(term10410, term10410.getClass(), "name", null);
        setField(term10410, term10410.getClass(), "groupname", null);
        setField(term10410, term10410.getClass(), "type", null);
        setLongField(term10410, term10410.getClass(), "ttl", 0L);
        setField(term10410, term10410.getClass(), "value", null);
        setLongField(term10410, term10410.getClass(), "mts", 0L);
        setLongField(term10410, term10410.getClass(), "uts", 0L);
        term10414 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term10414;
        callMethod(klass, "setTtl", argTypes, term10410, args);
    }

};


