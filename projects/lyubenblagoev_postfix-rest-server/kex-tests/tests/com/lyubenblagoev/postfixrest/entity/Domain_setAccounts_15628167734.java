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

public class Domain_setAccounts_15628167734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6438;
     Object term6460;

    public Domain_setAccounts_15628167734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6453 = new Long(-4475453924678388077L);
        term6438 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term6451 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term6456 = newInstance(Class.forName("java.util.Date"));
        Object term6458 = newInstance(Class.forName("java.util.Date"));
        setField(term6438, term6438.getClass(), "name", "rtifrlITwl");
        setIntField(term6451, term6451.getClass(), "modCount", 0);
        setField(term6438, term6438.getClass(), "accounts", term6451);
        setField(term6438, term6438.getClass(), "aliases", term6451);
        setField(term6438, term6438.getClass(), "id", term6453);
        setBooleanField(term6438, term6438.getClass(), "enabled", true);
        setLongField(term6456, term6456.getClass(), "fastTime", 1346432374327L);
        setField(term6456, term6456.getClass(), "cdate", null);
        setField(term6438, term6438.getClass(), "created", term6456);
        setLongField(term6458, term6458.getClass(), "fastTime", 1554118074450L);
        setField(term6458, term6458.getClass(), "cdate", null);
        setField(term6438, term6438.getClass(), "updated", term6458);
        term6460 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term6460;
        callMethod(klass, "setAccounts", argTypes, term6438, args);
    }

};


