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

public class DNSEntry_getType_7655454401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8458;

    public DNSEntry_getType_7655454401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8458 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term8458, term8458.getClass(), "id", "llRfwANcVF");
        setField(term8458, term8458.getClass(), "name", "sUEeHQTWkA");
        setField(term8458, term8458.getClass(), "groupname", "BDIRCxAWLA");
        setField(term8458, term8458.getClass(), "type", "eOJfbiZLnb");
        setLongField(term8458, term8458.getClass(), "ttl", 5219030281405653303L);
        setField(term8458, term8458.getClass(), "value", "nKZKnxWYCK");
        setLongField(term8458, term8458.getClass(), "mts", -8471550651709805183L);
        setLongField(term8458, term8458.getClass(), "uts", -948292411727204525L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term8458, args);
    }

};


