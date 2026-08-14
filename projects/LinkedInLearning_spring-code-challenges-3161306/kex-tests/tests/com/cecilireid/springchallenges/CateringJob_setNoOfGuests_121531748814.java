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
import java.lang.Integer;

public class CateringJob_setNoOfGuests_121531748814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4688;
     Object term4753;

    public CateringJob_setNoOfGuests_121531748814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4689 = new Long(2535595959091595249L);
        Class<? extends Object> term4796 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term4795 = ((Class) term4796).getDeclaredField((String) "COMPLETED");
        ((Field) term4795).setAccessible(true);
        Object enum14 = ((Field) term4795).get((Object) null);
        term4688 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term4688, term4688.getClass(), "id", term4689);
        setField(term4688, term4688.getClass(), "customerName", "MLqYREekMl");
        setField(term4688, term4688.getClass(), "phoneNumber", "ytSBIKXogI");
        setField(term4688, term4688.getClass(), "email", "nHXjMycHlU");
        setField(term4688, term4688.getClass(), "menu", "ieCtQFdkii");
        setIntField(term4688, term4688.getClass(), "noOfGuests", 1134449235);
        setField(term4688, term4688.getClass(), "status", enum14);
        term4753 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4753;
        callMethod(klass, "setNoOfGuests", argTypes, term4688, args);
    }

};


