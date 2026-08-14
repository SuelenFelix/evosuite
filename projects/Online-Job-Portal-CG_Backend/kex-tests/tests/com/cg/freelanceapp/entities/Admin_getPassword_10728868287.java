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

public class Admin_getPassword_10728868287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31779;

    public Admin_getPassword_10728868287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31780 = new Long(-4507951494272939003L);
        term31779 = newInstance(Class.forName("com.cg.freelanceapp.entities.Admin"));
        setField(term31779, term31779.getClass(), "id", term31780);
        setField(term31779, term31779.getClass(), "userName", "hSyCiiwQkz");
        setField(term31779, term31779.getClass(), "firstName", "fkEwbIayDt");
        setField(term31779, term31779.getClass(), "lastName", "vltEBcsvel");
        setField(term31779, term31779.getClass(), "password", "hoJeCkpqsd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Admin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term31779, args);
    }

};


