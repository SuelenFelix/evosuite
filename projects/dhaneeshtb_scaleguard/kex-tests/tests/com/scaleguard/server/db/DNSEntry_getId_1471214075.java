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

public class DNSEntry_getId_1471214075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8938;

    public DNSEntry_getId_1471214075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8938 = newInstance(Class.forName("com.scaleguard.server.db.DNSEntry"));
        setField(term8938, term8938.getClass(), "id", "KarbTXFmUU");
        setField(term8938, term8938.getClass(), "name", "jiUSjqwSIQ");
        setField(term8938, term8938.getClass(), "groupname", "MgLCedQfoj");
        setField(term8938, term8938.getClass(), "type", "zgKiINdgNu");
        setLongField(term8938, term8938.getClass(), "ttl", 4699157009689333952L);
        setField(term8938, term8938.getClass(), "value", "zLMTXDQHYH");
        setLongField(term8938, term8938.getClass(), "mts", -78240609295693193L);
        setLongField(term8938, term8938.getClass(), "uts", 3090901538358721367L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DNSEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term8938, args);
    }

};


