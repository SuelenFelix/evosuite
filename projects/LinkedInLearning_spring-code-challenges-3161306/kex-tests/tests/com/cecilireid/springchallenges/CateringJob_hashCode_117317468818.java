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

public class CateringJob_hashCode_117317468818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6257;

    public CateringJob_hashCode_117317468818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6258 = new Long(5127676408959197577L);
        Class<? extends Object> term6362 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term6361 = ((Class) term6362).getDeclaredField((String) "CANCELED");
        ((Field) term6361).setAccessible(true);
        Object enum19 = ((Field) term6361).get((Object) null);
        term6257 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term6257, term6257.getClass(), "id", term6258);
        setField(term6257, term6257.getClass(), "customerName", "KoyGrUJeJW");
        setField(term6257, term6257.getClass(), "phoneNumber", "HqBOwkVqjD");
        setField(term6257, term6257.getClass(), "email", "MAcUBcBckh");
        setField(term6257, term6257.getClass(), "menu", "oVgzLbrsFr");
        setIntField(term6257, term6257.getClass(), "noOfGuests", -1456670397);
        setField(term6257, term6257.getClass(), "status", enum19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6257, args);
    }

};


