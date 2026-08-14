package com.scaleguard.server.http.cache;

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
import static com.scaleguard.server.http.cache.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProxyResponse_setGroupId_4492874954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4817;

    public ProxyResponse_setGroupId_4492874954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4817 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyResponse"));
        setField(term4817, term4817.getClass(), "id", "qYzsiuXOgS");
        setField(term4817, term4817.getClass(), "groupId", "bxrCBbrrct");
        setField(term4817, term4817.getClass(), "status", "pending");
        setIntField(term4817, term4817.getClass(), "responseCode", 1725571209);
        setField(term4817, term4817.getClass(), "responseBody", "CKWpJaaaxX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UBRmXJmfrt";
        callMethod(klass, "setGroupId", argTypes, term4817, args);
    }

};


