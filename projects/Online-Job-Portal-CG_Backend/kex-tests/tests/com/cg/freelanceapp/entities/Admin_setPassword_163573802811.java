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

public class Admin_setPassword_163573802811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20065;

    public Admin_setPassword_163573802811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20066 = new Long(3643648387583329737L);
        term20065 = newInstance(Class.forName("com.cg.freelanceapp.entities.Admin"));
        setField(term20065, term20065.getClass(), "id", term20066);
        setField(term20065, term20065.getClass(), "userName", "uinyvocUGz");
        setField(term20065, term20065.getClass(), "firstName", "mhGOBiEPDs");
        setField(term20065, term20065.getClass(), "lastName", "BtaROXxZYZ");
        setField(term20065, term20065.getClass(), "password", "LjyAsUkMpT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Admin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eVYbmAKfrT";
        callMethod(klass, "setPassword", argTypes, term20065, args);
    }

};


