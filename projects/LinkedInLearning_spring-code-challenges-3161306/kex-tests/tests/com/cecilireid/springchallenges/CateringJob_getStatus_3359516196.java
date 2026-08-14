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

public class CateringJob_getStatus_3359516196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2624;

    public CateringJob_getStatus_3359516196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2625 = new Long(4872422362414183754L);
        Class<? extends Object> term2729 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term2728 = ((Class) term2729).getDeclaredField((String) "CANCELED");
        ((Field) term2728).setAccessible(true);
        Object enum8 = ((Field) term2728).get((Object) null);
        term2624 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term2624, term2624.getClass(), "id", term2625);
        setField(term2624, term2624.getClass(), "customerName", "TEParAifyi");
        setField(term2624, term2624.getClass(), "phoneNumber", "OWDIEULEFu");
        setField(term2624, term2624.getClass(), "email", "dWRymuLBtr");
        setField(term2624, term2624.getClass(), "menu", "AijpHYOFuy");
        setIntField(term2624, term2624.getClass(), "noOfGuests", -1955890973);
        setField(term2624, term2624.getClass(), "status", enum8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term2624, args);
    }

};


