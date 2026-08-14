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

public class DNSEntry_setUts_87354993333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10462;
     Object term10466;

    public DNSEntry_setUts_87354993333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10462 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term10462, term10462.getClass(), "id", null);
        setField(term10462, term10462.getClass(), "name", null);
        setField(term10462, term10462.getClass(), "groupname", null);
        setField(term10462, term10462.getClass(), "type", null);
        setLongField(term10462, term10462.getClass(), "ttl", 0L);
        setField(term10462, term10462.getClass(), "value", null);
        setLongField(term10462, term10462.getClass(), "mts", 0L);
        setLongField(term10462, term10462.getClass(), "uts", 0L);
        term10466 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term10466;
        callMethod(klass, "setUts", argTypes, term10462, args);
    }

};


