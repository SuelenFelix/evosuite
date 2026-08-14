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

public class DNSEntry_getName_57151665724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10424;

    public DNSEntry_getName_57151665724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10424 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term10424, term10424.getClass(), "id", null);
        setField(term10424, term10424.getClass(), "name", null);
        setField(term10424, term10424.getClass(), "groupname", null);
        setField(term10424, term10424.getClass(), "type", null);
        setLongField(term10424, term10424.getClass(), "ttl", 0L);
        setField(term10424, term10424.getClass(), "value", null);
        setLongField(term10424, term10424.getClass(), "mts", 0L);
        setLongField(term10424, term10424.getClass(), "uts", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term10424, args);
    }

};


