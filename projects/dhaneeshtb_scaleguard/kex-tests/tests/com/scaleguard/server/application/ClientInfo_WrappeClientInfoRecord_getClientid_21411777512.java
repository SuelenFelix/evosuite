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

public class ClientInfo_WrappeClientInfoRecord_getClientid_21411777512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2087;

    public ClientInfo_WrappeClientInfoRecord_getClientid_21411777512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2087 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term2087, term2087.getClass(), "id", "JqXGgAhZPl");
        setField(term2087, term2087.getClass(), "name", "jiKYgYHqIS");
        setField(term2087, term2087.getClass(), "description", "DfISiziTgG");
        setField(term2087, term2087.getClass(), "appid", "XqgfKFvPSD");
        setField(term2087, term2087.getClass(), "clientid", "JiVRgTZvKc");
        setField(term2087, term2087.getClass(), "clientsecret", "XPKmummaqg");
        setLongField(term2087, term2087.getClass(), "expiry", -872011222785455006L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClientid", argTypes, term2087, args);
    }

};


