package com.cecilireid.springchallenges;

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
import static com.cecilireid.springchallenges.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class CateringJob_getId_12480035460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term630;

    public CateringJob_getId_12480035460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term631 = new Long(2442117782898005296L);
        Class<? extends Object> term738 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term737 = ((Class) term738).getDeclaredField((String) "NOT_STARTED");
        ((Field) term737).setAccessible(true);
        Object enum2 = ((Field) term737).get((Object) null);
        term630 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term630, term630.getClass(), "id", term631);
        setField(term630, term630.getClass(), "customerName", "EGtDIRbSSb");
        setField(term630, term630.getClass(), "phoneNumber", "SzjVpOQTyS");
        setField(term630, term630.getClass(), "email", "MjGYSRKTNF");
        setField(term630, term630.getClass(), "menu", "hRNSzYYIrc");
        setIntField(term630, term630.getClass(), "noOfGuests", 568599855);
        setField(term630, term630.getClass(), "status", enum2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term630, args);
    }

};


