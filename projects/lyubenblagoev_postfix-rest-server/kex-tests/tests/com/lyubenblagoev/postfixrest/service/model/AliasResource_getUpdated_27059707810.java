package com.lyubenblagoev.postfixrest.service.model;

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
import static com.lyubenblagoev.postfixrest.service.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class AliasResource_getUpdated_27059707810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1255;

    public AliasResource_getUpdated_27059707810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1256 = new Long(-6823727938421990489L);
        term1255 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource"));
        Object term1282 = newInstance(Class.forName("java.util.Date"));
        Object term1284 = newInstance(Class.forName("java.util.Date"));
        setField(term1255, term1255.getClass(), "id", term1256);
        setField(term1255, term1255.getClass(), "name", "jDtqGUpnZN");
        setField(term1255, term1255.getClass(), "email", "nGKItKLYNC");
        setLongField(term1282, term1282.getClass(), "fastTime", 1804998087131L);
        setField(term1282, term1282.getClass(), "cdate", null);
        setField(term1255, term1255.getClass(), "created", term1282);
        setLongField(term1284, term1284.getClass(), "fastTime", 1538078916394L);
        setField(term1284, term1284.getClass(), "cdate", null);
        setField(term1255, term1255.getClass(), "updated", term1284);
        setBooleanField(term1255, term1255.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdated", argTypes, term1255, args);
    }

};


