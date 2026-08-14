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

public class SystemProperty_getMts_1902345349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4544;

    public SystemProperty_getMts_1902345349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4544 = newInstance(Class.forName("com.scaleguard.server.db.SystemProperty"));
        setField(term4544, term4544.getClass(), "id", "kGMQdqJYyB");
        setField(term4544, term4544.getClass(), "name", "XJJNClzHRf");
        setField(term4544, term4544.getClass(), "groupname", "HDaezxQfQR");
        setField(term4544, term4544.getClass(), "value", "iikZEapDlu");
        setLongField(term4544, term4544.getClass(), "mts", -5963439350418910964L);
        setLongField(term4544, term4544.getClass(), "uts", 9013624480170062917L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.SystemProperty");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMts", argTypes, term4544, args);
    }

};


