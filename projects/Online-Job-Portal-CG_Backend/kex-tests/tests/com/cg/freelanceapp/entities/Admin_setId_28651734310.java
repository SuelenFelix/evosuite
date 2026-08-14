package com.cg.freelanceapp.entities;

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
import static com.cg.freelanceapp.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Admin_setId_28651734310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19860;
     Object term19911;

    public Admin_setId_28651734310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19861 = new Long(90919700177074161L);
        term19860 = newInstance(Class.forName("com.cg.freelanceapp.entities.Admin"));
        setField(term19860, term19860.getClass(), "id", term19861);
        setField(term19860, term19860.getClass(), "userName", "JhIjEseRRP");
        setField(term19860, term19860.getClass(), "firstName", "qlzeNoUsis");
        setField(term19860, term19860.getClass(), "lastName", "yzmxcgrHQF");
        setField(term19860, term19860.getClass(), "password", "XCCRJOWaYi");
        term19911 = new Long(-6590532407494439408L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Admin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term19911;
        callMethod(klass, "setId", argTypes, term19860, args);
    }

};


