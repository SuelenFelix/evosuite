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

public class ClientInfoEntry_getUts_213527636736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7606;

    public ClientInfoEntry_getUts_213527636736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7606 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term7606, term7606.getClass(), "id", null);
        setField(term7606, term7606.getClass(), "name", null);
        setField(term7606, term7606.getClass(), "description", null);
        setField(term7606, term7606.getClass(), "appid", null);
        setField(term7606, term7606.getClass(), "clientid", null);
        setLongField(term7606, term7606.getClass(), "expiry", 0L);
        setField(term7606, term7606.getClass(), "clientsecret", null);
        setLongField(term7606, term7606.getClass(), "mts", 0L);
        setLongField(term7606, term7606.getClass(), "uts", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUts", argTypes, term7606, args);
    }

};


