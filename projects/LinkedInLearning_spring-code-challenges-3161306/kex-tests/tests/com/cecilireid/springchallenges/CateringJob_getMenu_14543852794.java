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

public class CateringJob_getMenu_14543852794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1962;

    public CateringJob_getMenu_14543852794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1963 = new Long(5270370404989704783L);
        Class<? extends Object> term2067 = Class.forName((String) "com.cecilireid.springchallenges.Status");
        Field term2066 = ((Class) term2067).getDeclaredField((String) "CANCELED");
        ((Field) term2066).setAccessible(true);
        Object enum6 = ((Field) term2066).get((Object) null);
        term1962 = newInstance(Class.forName("com.cecilireid.springchallenges.CateringJob"));
        setField(term1962, term1962.getClass(), "id", term1963);
        setField(term1962, term1962.getClass(), "customerName", "RkybSrpybU");
        setField(term1962, term1962.getClass(), "phoneNumber", "xOEqzGAmDU");
        setField(term1962, term1962.getClass(), "email", "eZFUvlxvGV");
        setField(term1962, term1962.getClass(), "menu", "BYqFIqCKAV");
        setIntField(term1962, term1962.getClass(), "noOfGuests", -1922583790);
        setField(term1962, term1962.getClass(), "status", enum6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cecilireid.springchallenges.CateringJob");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMenu", argTypes, term1962, args);
    }

};


