package com.example.web_shop.entity;

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
import static com.example.web_shop.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class User_setPassword_8914064499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4016;

    public User_setPassword_8914064499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4016 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term4115 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4116 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4118 = (int[]) newIntArray(5);
        setLongField(term4016, term4016.getClass(), "id", -5248475803419977214L);
        setField(term4016, term4016.getClass(), "username", "RbVQXSpxXy");
        setField(term4016, term4016.getClass(), "email", "YpJbIgJWWv");
        setField(term4016, term4016.getClass(), "password", "JppkknKVOw");
        setField(term4016, term4016.getClass(), "confirmPassword", "iljANwuEjk");
        setField(term4016, term4016.getClass(), "firstName", "kNqaJKIATy");
        setField(term4016, term4016.getClass(), "lastName", "vKQukfbJUd");
        setIntField(term4016, term4016.getClass(), "age", 1227103734);
        setField(term4016, term4016.getClass(), "city", "lFRJFUMVbx");
        setField(term4016, term4016.getClass(), "gender", "sZdUNdggUW");
        setIntField(term4116, term4116.getClass(), "signum", 1);
        setIntElement(term4118, 0, 1965699107);
        setIntElement(term4118, 1, 276112590);
        setIntElement(term4118, 2, 1355446503);
        setIntElement(term4118, 3, 1278820088);
        setIntElement(term4118, 4, -472848849);
        setField(term4116, term4116.getClass(), "mag", term4118);
        setIntField(term4116, term4116.getClass(), "bitCountPlusOne", 0);
        setIntField(term4116, term4116.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4116, term4116.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4116, term4116.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4115, term4115.getClass(), "intVal", term4116);
        setIntField(term4115, term4115.getClass(), "scale", 49);
        setIntField(term4115, term4115.getClass(), "precision", 0);
        setField(term4115, term4115.getClass(), "stringCache", null);
        setLongField(term4115, term4115.getClass(), "intCompact", -9223372036854775808L);
        setField(term4016, term4016.getClass(), "balance", term4115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OqbwYQfvAe";
        callMethod(klass, "setPassword", argTypes, term4016, args);
    }

};


