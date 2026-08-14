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

public class SystemProperty_setId_662029102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3819;

    public SystemProperty_setId_662029102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3819 = newInstance(Class.forName("com.scaleguard.server.db.SystemProperty"));
        setField(term3819, term3819.getClass(), "id", "PapWxkhEWe");
        setField(term3819, term3819.getClass(), "name", "smnHEqRFRx");
        setField(term3819, term3819.getClass(), "groupname", "XYtryyobou");
        setField(term3819, term3819.getClass(), "value", "OYbzXylRWW");
        setLongField(term3819, term3819.getClass(), "mts", 2443640364875054177L);
        setLongField(term3819, term3819.getClass(), "uts", -1610676979013636850L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.SystemProperty");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DSNsTGYXDF";
        callMethod(klass, "setId", argTypes, term3819, args);
    }

};


