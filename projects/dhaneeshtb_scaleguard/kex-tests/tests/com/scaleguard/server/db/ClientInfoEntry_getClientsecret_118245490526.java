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

public class ClientInfoEntry_getClientsecret_118245490526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7564;

    public ClientInfoEntry_getClientsecret_118245490526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7564 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term7564, term7564.getClass(), "id", null);
        setField(term7564, term7564.getClass(), "name", null);
        setField(term7564, term7564.getClass(), "description", null);
        setField(term7564, term7564.getClass(), "appid", null);
        setField(term7564, term7564.getClass(), "clientid", null);
        setLongField(term7564, term7564.getClass(), "expiry", 0L);
        setField(term7564, term7564.getClass(), "clientsecret", null);
        setLongField(term7564, term7564.getClass(), "mts", 0L);
        setLongField(term7564, term7564.getClass(), "uts", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClientsecret", argTypes, term7564, args);
    }

};


