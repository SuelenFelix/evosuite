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

public class ClientInfoEntry_setExpiry_22920498821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7542;
     Object term7546;

    public ClientInfoEntry_setExpiry_22920498821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7542 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term7542, term7542.getClass(), "id", null);
        setField(term7542, term7542.getClass(), "name", null);
        setField(term7542, term7542.getClass(), "description", null);
        setField(term7542, term7542.getClass(), "appid", null);
        setField(term7542, term7542.getClass(), "clientid", null);
        setLongField(term7542, term7542.getClass(), "expiry", 0L);
        setField(term7542, term7542.getClass(), "clientsecret", null);
        setLongField(term7542, term7542.getClass(), "mts", 0L);
        setLongField(term7542, term7542.getClass(), "uts", 0L);
        term7546 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term7546;
        callMethod(klass, "setExpiry", argTypes, term7542, args);
    }

};


