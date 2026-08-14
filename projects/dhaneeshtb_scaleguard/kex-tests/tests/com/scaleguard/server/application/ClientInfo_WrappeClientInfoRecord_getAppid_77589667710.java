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

public class ClientInfo_WrappeClientInfoRecord_getAppid_77589667710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1797;

    public ClientInfo_WrappeClientInfoRecord_getAppid_77589667710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1797 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term1797, term1797.getClass(), "id", "idgaQsnJpQ");
        setField(term1797, term1797.getClass(), "name", "VgZnGoIFwQ");
        setField(term1797, term1797.getClass(), "description", "jUbSRrkrYZ");
        setField(term1797, term1797.getClass(), "appid", "bWWfajKbEX");
        setField(term1797, term1797.getClass(), "clientid", "cAPeiZHKGJ");
        setField(term1797, term1797.getClass(), "clientsecret", "LvJFtLBaxj");
        setLongField(term1797, term1797.getClass(), "expiry", 2535595959091595249L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAppid", argTypes, term1797, args);
    }

};


