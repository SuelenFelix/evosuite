package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Contact_getPhone_7390736483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10914;

    public Contact_getPhone_7390736483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10915 = new Long(2287785643837657068L);
        term10914 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term10914, term10914.getClass(), "id", term10915);
        setField(term10914, term10914.getClass(), "name", "iSQqMWMRlU");
        setField(term10914, term10914.getClass(), "phone", "djWEnlbOXu");
        setField(term10914, term10914.getClass(), "email", "MvDMzQBWME");
        setField(term10914, term10914.getClass(), "message", "sZyAwmdGVS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Contact");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhone", argTypes, term10914, args);
    }

};


