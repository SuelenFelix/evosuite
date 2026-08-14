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

public class ClientInfo_WrappeClientInfoRecord_getDescription_15686033658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1507;

    public ClientInfo_WrappeClientInfoRecord_getDescription_15686033658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1507 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term1507, term1507.getClass(), "id", "TJmVBGfTML");
        setField(term1507, term1507.getClass(), "name", "tPlsykYBqO");
        setField(term1507, term1507.getClass(), "description", "bLPjGVBhlX");
        setField(term1507, term1507.getClass(), "appid", "whBvTVIIlC");
        setField(term1507, term1507.getClass(), "clientid", "IgRJUzaCwW");
        setField(term1507, term1507.getClass(), "clientsecret", "JUmudUmaaV");
        setLongField(term1507, term1507.getClass(), "expiry", -8885298608300233488L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term1507, args);
    }

};


