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

public class ClientInfoEntry_setAppid_20954296046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5656;

    public ClientInfoEntry_setAppid_20954296046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5656 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term5656, term5656.getClass(), "id", "rYbtIDVdnd");
        setField(term5656, term5656.getClass(), "name", "UKAReurpHG");
        setField(term5656, term5656.getClass(), "description", "WVRMUmrljA");
        setField(term5656, term5656.getClass(), "appid", "NTlKJDDWlk");
        setField(term5656, term5656.getClass(), "clientid", "vOuMEpOQAg");
        setLongField(term5656, term5656.getClass(), "expiry", -8033714905181142681L);
        setField(term5656, term5656.getClass(), "clientsecret", "SIODFGaQhr");
        setLongField(term5656, term5656.getClass(), "mts", -9040825890007374809L);
        setLongField(term5656, term5656.getClass(), "uts", 1368340889161782793L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qYzsiuXOgS";
        callMethod(klass, "setAppid", argTypes, term5656, args);
    }

};


