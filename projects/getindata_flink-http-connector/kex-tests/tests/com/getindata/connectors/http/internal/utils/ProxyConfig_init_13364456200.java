package com.getindata.connectors.http.internal.utils;

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
import static com.getindata.connectors.http.internal.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ProxyConfig_init_13364456200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term815;
     Object term817;
     Object term830;

    public ProxyConfig_init_13364456200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term815 = new Integer(-1087774327);
        term817 = newInstance(Class.forName("java.util.Optional"));
        setField(term817, term817.getClass(), "value", "xOEqzGAmDU");
        term830 = newInstance(Class.forName("java.util.Optional"));
        setField(term830, term830.getClass(), "value", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.ProxyConfig");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.Optional");
        argTypes[3] = Class.forName("java.util.Optional");
        Object[] args = new Object[4];
        args[0] = "RkybSrpybU";
        args[1] = term815;
        args[2] = term817;
        args[3] = term830;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


