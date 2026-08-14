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

public class SystemProperty_getGroupname_13163502815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4136;

    public SystemProperty_getGroupname_13163502815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4136 = newInstance(Class.forName("com.scaleguard.server.db.SystemProperty"));
        setField(term4136, term4136.getClass(), "id", "igCAtimmYB");
        setField(term4136, term4136.getClass(), "name", "DyiXbeYIaN");
        setField(term4136, term4136.getClass(), "groupname", "VGizxZnyHX");
        setField(term4136, term4136.getClass(), "value", "kVEZMHmRtR");
        setLongField(term4136, term4136.getClass(), "mts", 305759998609888272L);
        setLongField(term4136, term4136.getClass(), "uts", -8654565919063661957L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.SystemProperty");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroupname", argTypes, term4136, args);
    }

};


