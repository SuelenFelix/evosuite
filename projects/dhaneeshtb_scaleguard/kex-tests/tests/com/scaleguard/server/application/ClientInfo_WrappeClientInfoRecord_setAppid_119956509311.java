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

public class ClientInfo_WrappeClientInfoRecord_setAppid_119956509311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1931;

    public ClientInfo_WrappeClientInfoRecord_setAppid_119956509311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1931 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term1931, term1931.getClass(), "id", "PHvxnGHptP");
        setField(term1931, term1931.getClass(), "name", "TimdotUuNC");
        setField(term1931, term1931.getClass(), "description", "PkWMRdJcBb");
        setField(term1931, term1931.getClass(), "appid", "jSpAteRute");
        setField(term1931, term1931.getClass(), "clientid", "swZVeJAxjt");
        setField(term1931, term1931.getClass(), "clientsecret", "xOcJIiQQDu");
        setLongField(term1931, term1931.getClass(), "expiry", -5476826692763582090L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GVizqqzXpy";
        callMethod(klass, "setAppid", argTypes, term1931, args);
    }

};


