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

public class Contact_getName_5372675592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10823;

    public Contact_getName_5372675592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10824 = new Long(-8993073054427011802L);
        term10823 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term10823, term10823.getClass(), "id", term10824);
        setField(term10823, term10823.getClass(), "name", "YMmtjELJuB");
        setField(term10823, term10823.getClass(), "phone", "FzyIShiOmb");
        setField(term10823, term10823.getClass(), "email", "PEUfeJaZTk");
        setField(term10823, term10823.getClass(), "message", "AIvyeIdskz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Contact");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term10823, args);
    }

};


