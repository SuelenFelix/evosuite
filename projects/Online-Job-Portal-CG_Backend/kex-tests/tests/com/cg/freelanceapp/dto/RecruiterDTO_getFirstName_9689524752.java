package com.cg.freelanceapp.dto;

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
import static com.cg.freelanceapp.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RecruiterDTO_getFirstName_9689524752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16521;

    public RecruiterDTO_getFirstName_9689524752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16521 = newInstance(Class.forName("com.cg.freelanceapp.dto.RecruiterDTO"));
        setField(term16521, term16521.getClass(), "userName", "QgHhxMyKvr");
        setField(term16521, term16521.getClass(), "firstName", "VGiXZZTWRO");
        setField(term16521, term16521.getClass(), "lastName", "MlPtwXnJOJ");
        setField(term16521, term16521.getClass(), "password", "DbfiyFeaTe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.RecruiterDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term16521, args);
    }

};


