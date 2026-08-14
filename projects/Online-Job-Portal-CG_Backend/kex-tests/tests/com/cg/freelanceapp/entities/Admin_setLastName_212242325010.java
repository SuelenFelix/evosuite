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

public class Admin_setLastName_212242325010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32076;

    public Admin_setLastName_212242325010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32077 = new Long(-3051425144031943154L);
        term32076 = newInstance(Class.forName("com.cg.freelanceapp.entities.Admin"));
        setField(term32076, term32076.getClass(), "id", term32077);
        setField(term32076, term32076.getClass(), "userName", "EEEzvJXKOf");
        setField(term32076, term32076.getClass(), "firstName", "ruYuUKeyoL");
        setField(term32076, term32076.getClass(), "lastName", "qZySZAtlWw");
        setField(term32076, term32076.getClass(), "password", "XDftcuEVIB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Admin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "icQsCgiPfd";
        callMethod(klass, "setLastName", argTypes, term32076, args);
    }

};


