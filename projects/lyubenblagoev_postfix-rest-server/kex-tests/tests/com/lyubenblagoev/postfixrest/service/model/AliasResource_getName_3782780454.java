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

public class AliasResource_getName_3782780454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term897;

    public AliasResource_getName_3782780454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term898 = new Long(-4502405999831680926L);
        term897 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource"));
        Object term924 = newInstance(Class.forName("java.util.Date"));
        Object term926 = newInstance(Class.forName("java.util.Date"));
        setField(term897, term897.getClass(), "id", term898);
        setField(term897, term897.getClass(), "name", "Ghbwtircqb");
        setField(term897, term897.getClass(), "email", "xrwlQZdwCp");
        setLongField(term924, term924.getClass(), "fastTime", 1645834034896L);
        setField(term924, term924.getClass(), "cdate", null);
        setField(term897, term897.getClass(), "created", term924);
        setLongField(term926, term926.getClass(), "fastTime", 1500721068023L);
        setField(term926, term926.getClass(), "cdate", null);
        setField(term897, term897.getClass(), "updated", term926);
        setBooleanField(term897, term897.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term897, args);
    }

};


