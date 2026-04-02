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

public class Admin_getId_1435244155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19473;

    public Admin_getId_1435244155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19474 = new Long(-6293767832755310218L);
        term19473 = newInstance(Class.forName("com.cg.freelanceapp.entities.Admin"));
        setField(term19473, term19473.getClass(), "id", term19474);
        setField(term19473, term19473.getClass(), "userName", "voVkXMJSsx");
        setField(term19473, term19473.getClass(), "firstName", "tOqDchKApH");
        setField(term19473, term19473.getClass(), "lastName", "iqeVuiibgM");
        setField(term19473, term19473.getClass(), "password", "LCPfALdqnP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Admin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term19473, args);
    }

};


