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

public class Admin_getLastName_5862016066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19564;

    public Admin_getLastName_5862016066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19565 = new Long(-2050848614286348518L);
        term19564 = newInstance(Class.forName("com.cg.freelanceapp.entities.Admin"));
        setField(term19564, term19564.getClass(), "id", term19565);
        setField(term19564, term19564.getClass(), "userName", "YRvjJByBZa");
        setField(term19564, term19564.getClass(), "firstName", "yWPHiAqZcQ");
        setField(term19564, term19564.getClass(), "lastName", "IppcpUlrjC");
        setField(term19564, term19564.getClass(), "password", "hxSnnaHCFY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Admin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term19564, args);
    }

};


