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

public class ClientInfo_WrappeClientInfoRecord_setName_13436324947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1351;

    public ClientInfo_WrappeClientInfoRecord_setName_13436324947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1351 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term1351, term1351.getClass(), "id", "ieCtQFdkii");
        setField(term1351, term1351.getClass(), "name", "dEnhdmILtU");
        setField(term1351, term1351.getClass(), "description", "hoicvmsovO");
        setField(term1351, term1351.getClass(), "appid", "eqJfYWRaEL");
        setField(term1351, term1351.getClass(), "clientid", "fhkbdRViHi");
        setField(term1351, term1351.getClass(), "clientsecret", "uWHnvSvaPl");
        setLongField(term1351, term1351.getClass(), "expiry", -2813493605142626659L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kBdSllIBVz";
        callMethod(klass, "setName", argTypes, term1351, args);
    }

};


