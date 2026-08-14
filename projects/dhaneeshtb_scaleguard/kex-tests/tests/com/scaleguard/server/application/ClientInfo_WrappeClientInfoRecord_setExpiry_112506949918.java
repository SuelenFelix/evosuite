package com.scaleguard.server.application;

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
import static com.scaleguard.server.application.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ClientInfo_WrappeClientInfoRecord_setExpiry_112506949918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2517;
     Object term2519;

    public ClientInfo_WrappeClientInfoRecord_setExpiry_112506949918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2517 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term2517, term2517.getClass(), "id", null);
        setField(term2517, term2517.getClass(), "name", null);
        setField(term2517, term2517.getClass(), "description", null);
        setField(term2517, term2517.getClass(), "appid", null);
        setField(term2517, term2517.getClass(), "clientid", null);
        setField(term2517, term2517.getClass(), "clientsecret", null);
        setLongField(term2517, term2517.getClass(), "expiry", 0L);
        term2519 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2519;
        callMethod(klass, "setExpiry", argTypes, term2517, args);
    }

};


