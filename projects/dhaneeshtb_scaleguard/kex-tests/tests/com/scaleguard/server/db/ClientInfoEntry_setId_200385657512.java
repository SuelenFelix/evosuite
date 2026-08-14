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

public class ClientInfoEntry_setId_200385657512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6538;

    public ClientInfoEntry_setId_200385657512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6538 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term6538, term6538.getClass(), "id", "NJhGgctbdj");
        setField(term6538, term6538.getClass(), "name", "MYWYUeLGOp");
        setField(term6538, term6538.getClass(), "description", "tsTGdgQYUL");
        setField(term6538, term6538.getClass(), "appid", "TtGbVmKcnX");
        setField(term6538, term6538.getClass(), "clientid", "GJVkUrCVdD");
        setLongField(term6538, term6538.getClass(), "expiry", 5671808784468963649L);
        setField(term6538, term6538.getClass(), "clientsecret", "zNdorvdUgu");
        setLongField(term6538, term6538.getClass(), "mts", 2297097306706899827L);
        setLongField(term6538, term6538.getClass(), "uts", -900457279156388404L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oPxuZbkYio";
        callMethod(klass, "setId", argTypes, term6538, args);
    }

};


