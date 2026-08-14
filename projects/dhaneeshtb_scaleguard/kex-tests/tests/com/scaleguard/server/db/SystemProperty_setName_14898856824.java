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

public class SystemProperty_setName_14898856824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4023;

    public SystemProperty_setName_14898856824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4023 = newInstance(Class.forName("com.scaleguard.server.db.SystemProperty"));
        setField(term4023, term4023.getClass(), "id", "xtftXXMbem");
        setField(term4023, term4023.getClass(), "name", "cudZvLMQon");
        setField(term4023, term4023.getClass(), "groupname", "lihXWlGDxk");
        setField(term4023, term4023.getClass(), "value", "JmcmxoGhIK");
        setLongField(term4023, term4023.getClass(), "mts", 414749984815662075L);
        setLongField(term4023, term4023.getClass(), "uts", 463622836963501975L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.SystemProperty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jXzmYyrnnT";
        callMethod(klass, "setName", argTypes, term4023, args);
    }

};


