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
import java.lang.Long;

public class RecruiterListDTO_setUserName_5119072024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3220;

    public RecruiterListDTO_setUserName_5119072024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3221 = new Long(-6573104506744284592L);
        term3220 = newInstance(Class.forName("com.cg.freelanceapp.dto.RecruiterListDTO"));
        setField(term3220, term3220.getClass(), "id", term3221);
        setField(term3220, term3220.getClass(), "userName", "yVMkkQhvmN");
        setField(term3220, term3220.getClass(), "firstName", "mvrkADEgpp");
        setField(term3220, term3220.getClass(), "lastName", "pXOkjyeIRb");
        setField(term3220, term3220.getClass(), "password", "GgZWSjxjyE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.RecruiterListDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EeBVbzjcCI";
        callMethod(klass, "setUserName", argTypes, term3220, args);
    }

};


