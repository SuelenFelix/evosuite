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

public class AliasResource_getCreated_20179980578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1149;

    public AliasResource_getCreated_20179980578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1150 = new Long(-5892135042702373494L);
        term1149 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource"));
        Object term1176 = newInstance(Class.forName("java.util.Date"));
        Object term1178 = newInstance(Class.forName("java.util.Date"));
        setField(term1149, term1149.getClass(), "id", term1150);
        setField(term1149, term1149.getClass(), "name", "GzFkzHGYFt");
        setField(term1149, term1149.getClass(), "email", "tShwQLRGNe");
        setLongField(term1176, term1176.getClass(), "fastTime", 1882638884364L);
        setField(term1176, term1176.getClass(), "cdate", null);
        setField(term1149, term1149.getClass(), "created", term1176);
        setLongField(term1178, term1178.getClass(), "fastTime", 1437757323580L);
        setField(term1178, term1178.getClass(), "cdate", null);
        setField(term1149, term1149.getClass(), "updated", term1178);
        setBooleanField(term1149, term1149.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreated", argTypes, term1149, args);
    }

};


