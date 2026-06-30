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

public class Domain_setName_18939228832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6352;

    public Domain_setName_18939228832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6367 = new Long(-8121348431673567857L);
        term6352 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term6365 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term6370 = newInstance(Class.forName("java.util.Date"));
        Object term6372 = newInstance(Class.forName("java.util.Date"));
        setField(term6352, term6352.getClass(), "name", "PLeKpWaxhQ");
        setIntField(term6365, term6365.getClass(), "modCount", 0);
        setField(term6352, term6352.getClass(), "accounts", term6365);
        setField(term6352, term6352.getClass(), "aliases", term6365);
        setField(term6352, term6352.getClass(), "id", term6367);
        setBooleanField(term6352, term6352.getClass(), "enabled", true);
        setLongField(term6370, term6370.getClass(), "fastTime", 1427783072046L);
        setField(term6370, term6370.getClass(), "cdate", null);
        setField(term6352, term6352.getClass(), "created", term6370);
        setLongField(term6372, term6372.getClass(), "fastTime", 1583368192099L);
        setField(term6372, term6372.getClass(), "cdate", null);
        setField(term6352, term6352.getClass(), "updated", term6372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EBSKhqDdUW";
        callMethod(klass, "setName", argTypes, term6352, args);
    }

};


