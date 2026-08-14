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

public class CateringJob_getNoOfGuests_3009377105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2287;

    public CateringJob_getNoOfGuests_3009377105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2288 = new Long(7411271909051562686L);
        Class<? extends Object> term2395 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term2394 = ((Class) term2395).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term2394).setAccessible(true);
        Object enum7 = ((Field) term2394).get((Object) null);
        term2287 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term2287, term2287.getClass(), "id", term2288);
        setField(term2287, term2287.getClass(), "customerName", "vrQLuWIDJX");
        setField(term2287, term2287.getClass(), "phoneNumber", "flxyYxBRtu");
        setField(term2287, term2287.getClass(), "email", "OclPbYPkcH");
        setField(term2287, term2287.getClass(), "menu", "IoAlmYsBwc");
        setIntField(term2287, term2287.getClass(), "noOfGuests", -616727354);
        setField(term2287, term2287.getClass(), "status", enum7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNoOfGuests", argTypes, term2287, args);
    }

};


