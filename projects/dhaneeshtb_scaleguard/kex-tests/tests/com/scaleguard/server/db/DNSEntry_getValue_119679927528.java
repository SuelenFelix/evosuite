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

public class DNSEntry_getValue_119679927528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10440;

    public DNSEntry_getValue_119679927528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10440 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term10440, term10440.getClass(), "id", null);
        setField(term10440, term10440.getClass(), "name", null);
        setField(term10440, term10440.getClass(), "groupname", null);
        setField(term10440, term10440.getClass(), "type", null);
        setLongField(term10440, term10440.getClass(), "ttl", 0L);
        setField(term10440, term10440.getClass(), "value", null);
        setLongField(term10440, term10440.getClass(), "mts", 0L);
        setLongField(term10440, term10440.getClass(), "uts", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term10440, args);
    }

};


