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

public class ClientInfo_WrappeClientInfoRecord_setDescription_14655525499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1641;

    public ClientInfo_WrappeClientInfoRecord_setDescription_14655525499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1641 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term1641, term1641.getClass(), "id", "KoyGrUJeJW");
        setField(term1641, term1641.getClass(), "name", "HqBOwkVqjD");
        setField(term1641, term1641.getClass(), "description", "MAcUBcBckh");
        setField(term1641, term1641.getClass(), "appid", "oVgzLbrsFr");
        setField(term1641, term1641.getClass(), "clientid", "vQVyKLdtaz");
        setField(term1641, term1641.getClass(), "clientsecret", "OWKQODBLzb");
        setLongField(term1641, term1641.getClass(), "expiry", -4325723315152823407L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wGmYcqUkgE";
        callMethod(klass, "setDescription", argTypes, term1641, args);
    }

};


