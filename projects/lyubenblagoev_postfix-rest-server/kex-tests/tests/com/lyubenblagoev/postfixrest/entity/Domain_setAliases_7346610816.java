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
import java.util.LinkedList;

public class Domain_setAliases_7346610816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6505;
     Object term6527;

    public Domain_setAliases_7346610816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6520 = new Long(-2196447813514870436L);
        term6505 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term6518 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term6523 = newInstance(Class.forName("java.util.Date"));
        Object term6525 = newInstance(Class.forName("java.util.Date"));
        setField(term6505, term6505.getClass(), "name", "vZucxbGVyo");
        setIntField(term6518, term6518.getClass(), "modCount", 0);
        setField(term6505, term6505.getClass(), "accounts", term6518);
        setField(term6505, term6505.getClass(), "aliases", term6518);
        setField(term6505, term6505.getClass(), "id", term6520);
        setBooleanField(term6505, term6505.getClass(), "enabled", true);
        setLongField(term6523, term6523.getClass(), "fastTime", 1847979995167L);
        setField(term6523, term6523.getClass(), "cdate", null);
        setField(term6505, term6505.getClass(), "created", term6523);
        setLongField(term6525, term6525.getClass(), "fastTime", 1814838553871L);
        setField(term6525, term6525.getClass(), "cdate", null);
        setField(term6505, term6505.getClass(), "updated", term6525);
        term6527 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term6527;
        callMethod(klass, "setAliases", argTypes, term6505, args);
    }

};


