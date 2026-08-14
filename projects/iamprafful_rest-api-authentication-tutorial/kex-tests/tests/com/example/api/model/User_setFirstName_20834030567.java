package com.example.api.model;

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
import static com.example.api.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_setFirstName_20834030567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term954;

    public User_setFirstName_20834030567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term954 = newInstance(Class.forName("com.example.api.model.User"));
        setField(term954, term954.getClass(), "userName", "hxCBltsObl");
        setField(term954, term954.getClass(), "firstName", "BndsHwAFMv");
        setField(term954, term954.getClass(), "lastName", "GzFkzHGYFt");
        setField(term954, term954.getClass(), "email", "tShwQLRGNe");
        setField(term954, term954.getClass(), "password", "LvtrsXUliU");
        setField(term954, term954.getClass(), "role", "xLbjWUgOIL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.api.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jDtqGUpnZN";
        callMethod(klass, "setFirstName", argTypes, term954, args);
    }

};


