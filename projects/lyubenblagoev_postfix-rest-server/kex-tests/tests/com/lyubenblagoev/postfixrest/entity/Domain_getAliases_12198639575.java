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

public class Domain_getAliases_12198639575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6473;

    public Domain_getAliases_12198639575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6488 = new Long(3831842879355381917L);
        term6473 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term6486 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term6491 = newInstance(Class.forName("java.util.Date"));
        Object term6493 = newInstance(Class.forName("java.util.Date"));
        setField(term6473, term6473.getClass(), "name", "yGWXZDjnPS");
        setIntField(term6486, term6486.getClass(), "modCount", 0);
        setField(term6473, term6473.getClass(), "accounts", term6486);
        setField(term6473, term6473.getClass(), "aliases", term6486);
        setField(term6473, term6473.getClass(), "id", term6488);
        setBooleanField(term6473, term6473.getClass(), "enabled", true);
        setLongField(term6491, term6491.getClass(), "fastTime", 1827376724573L);
        setField(term6491, term6491.getClass(), "cdate", null);
        setField(term6473, term6473.getClass(), "created", term6491);
        setLongField(term6493, term6493.getClass(), "fastTime", 1861056214307L);
        setField(term6493, term6493.getClass(), "cdate", null);
        setField(term6473, term6473.getClass(), "updated", term6493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Domain");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAliases", argTypes, term6473, args);
    }

};


