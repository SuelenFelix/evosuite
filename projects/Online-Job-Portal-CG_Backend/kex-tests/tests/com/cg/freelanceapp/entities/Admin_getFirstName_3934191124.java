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

public class Admin_getFirstName_3934191124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19382;

    public Admin_getFirstName_3934191124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19383 = new Long(564179403578347108L);
        term19382 = newInstance(Class.forName("com.cg.freelanceapp.entities.Admin"));
        setField(term19382, term19382.getClass(), "id", term19383);
        setField(term19382, term19382.getClass(), "userName", "itHxInHLQD");
        setField(term19382, term19382.getClass(), "firstName", "YKcZHffhWM");
        setField(term19382, term19382.getClass(), "lastName", "FVvtvTPEiD");
        setField(term19382, term19382.getClass(), "password", "paedcGulXI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Admin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term19382, args);
    }

};


