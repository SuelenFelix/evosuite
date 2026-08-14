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

public class ClientInfoEntry_setMts_157040395335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7600;
     Object term7604;

    public ClientInfoEntry_setMts_157040395335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7600 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term7600, term7600.getClass(), "id", null);
        setField(term7600, term7600.getClass(), "name", null);
        setField(term7600, term7600.getClass(), "description", null);
        setField(term7600, term7600.getClass(), "appid", null);
        setField(term7600, term7600.getClass(), "clientid", null);
        setLongField(term7600, term7600.getClass(), "expiry", 0L);
        setField(term7600, term7600.getClass(), "clientsecret", null);
        setLongField(term7600, term7600.getClass(), "mts", 0L);
        setLongField(term7600, term7600.getClass(), "uts", 0L);
        term7604 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term7604;
        callMethod(klass, "setMts", argTypes, term7600, args);
    }

};


