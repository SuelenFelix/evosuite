package com.getindata.connectors.http.internal.status;

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
import static com.getindata.connectors.http.internal.status.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TypeStatusCodeChecker_canEqual_17020448553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term956;
     Object term958;

    public TypeStatusCodeChecker_canEqual_17020448553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term956 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.TypeStatusCodeChecker"));
        setIntField(term956, term956.getClass(), "httpTypeCode", -1339778481);
        term958 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.TypeStatusCodeChecker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term958;
        callMethod(klass, "canEqual", argTypes, term956, args);
    }

};


