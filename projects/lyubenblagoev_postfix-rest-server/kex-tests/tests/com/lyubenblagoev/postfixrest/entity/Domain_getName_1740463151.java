package com.lyubenblagoev.postfixrest.entity;

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
import static com.lyubenblagoev.postfixrest.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class Domain_getName_1740463151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6320;

    public Domain_getName_1740463151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6335 = new Long(-7087265016767824631L);
        term6320 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term6333 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term6338 = newInstance(Class.forName("java.util.Date"));
        Object term6340 = newInstance(Class.forName("java.util.Date"));
        setField(term6320, term6320.getClass(), "name", "UTvXIenLCR");
        setIntField(term6333, term6333.getClass(), "modCount", 0);
        setField(term6320, term6320.getClass(), "accounts", term6333);
        setField(term6320, term6320.getClass(), "aliases", term6333);
        setField(term6320, term6320.getClass(), "id", term6335);
        setBooleanField(term6320, term6320.getClass(), "enabled", false);
        setLongField(term6338, term6338.getClass(), "fastTime", 1325315004601L);
        setField(term6338, term6338.getClass(), "cdate", null);
        setField(term6320, term6320.getClass(), "created", term6338);
        setLongField(term6340, term6340.getClass(), "fastTime", 1755935193908L);
        setField(term6340, term6340.getClass(), "cdate", null);
        setField(term6320, term6320.getClass(), "updated", term6340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Domain");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term6320, args);
    }

};


