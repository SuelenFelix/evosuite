package com.selimhorri.app.pack;

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
import static com.selimhorri.app.pack.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HrManagementSystemApplication_main_16680293441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5738;

    public HrManagementSystemApplication_main_16680293441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5738 = (Object[]) newArray("java.lang.String", 5);
        setElement(term5738, 0, "yCWSlaOrSv");
        setElement(term5738, 1, "PFpWKxDIRz");
        setElement(term5738, 2, "qePuOCwoCf");
        setElement(term5738, 3, "vJPujDInGq");
        setElement(term5738, 4, "cHZGcMhatT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.HrManagementSystemApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5738;
        callMethod(klass, "main", argTypes, null, args);
    }

};


