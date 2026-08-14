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

public class ClientInfoEntry_setClientsecret_18811408127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7568;

    public ClientInfoEntry_setClientsecret_18811408127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7568 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term7568, term7568.getClass(), "id", null);
        setField(term7568, term7568.getClass(), "name", null);
        setField(term7568, term7568.getClass(), "description", null);
        setField(term7568, term7568.getClass(), "appid", null);
        setField(term7568, term7568.getClass(), "clientid", null);
        setLongField(term7568, term7568.getClass(), "expiry", 0L);
        setField(term7568, term7568.getClass(), "clientsecret", null);
        setLongField(term7568, term7568.getClass(), "mts", 0L);
        setLongField(term7568, term7568.getClass(), "uts", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setClientsecret", argTypes, term7568, args);
    }

};


