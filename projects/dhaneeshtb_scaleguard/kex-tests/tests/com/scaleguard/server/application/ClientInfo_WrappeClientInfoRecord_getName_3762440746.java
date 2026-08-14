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

public class ClientInfo_WrappeClientInfoRecord_getName_3762440746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1217;

    public ClientInfo_WrappeClientInfoRecord_getName_3762440746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1217 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term1217, term1217.getClass(), "id", "onpbIeEKoi");
        setField(term1217, term1217.getClass(), "name", "YRHGsAkhxb");
        setField(term1217, term1217.getClass(), "description", "ffYhPOzlUs");
        setField(term1217, term1217.getClass(), "appid", "MLqYREekMl");
        setField(term1217, term1217.getClass(), "clientid", "ytSBIKXogI");
        setField(term1217, term1217.getClass(), "clientsecret", "nHXjMycHlU");
        setLongField(term1217, term1217.getClass(), "expiry", 6967924379644551255L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1217, args);
    }

};


