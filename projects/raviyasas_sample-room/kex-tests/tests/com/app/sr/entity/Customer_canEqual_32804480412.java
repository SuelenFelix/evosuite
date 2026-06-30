package com.app.sr.entity;

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
import static com.app.sr.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Customer_canEqual_32804480412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1093;
     Object term1144;

    public Customer_canEqual_32804480412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1094 = new Long(-4325723315152823407L);
        term1093 = newInstance(Class.forName("com.app.sr.entity.Customer"));
        setField(term1093, term1093.getClass(), "id", term1094);
        setField(term1093, term1093.getClass(), "firstName", "xLbjWUgOIL");
        setField(term1093, term1093.getClass(), "lastName", "jDtqGUpnZN");
        setField(term1093, term1093.getClass(), "email", "nGKItKLYNC");
        setField(term1093, term1093.getClass(), "contactNumber", "UiUYnPrcCi");
        term1144 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.app.sr.entity.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1144;
        callMethod(klass, "canEqual", argTypes, term1093, args);
    }

};


