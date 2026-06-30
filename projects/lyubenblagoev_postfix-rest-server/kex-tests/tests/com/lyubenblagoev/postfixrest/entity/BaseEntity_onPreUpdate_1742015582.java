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
import java.lang.Long;
import java.lang.Object;

public class BaseEntity_onPreUpdate_1742015582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4549;

    public BaseEntity_onPreUpdate_1742015582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4550 = new Long(-7830820957252387854L);
        term4549 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity"));
        Object term4553 = newInstance(Class.forName("java.util.Date"));
        Object term4555 = newInstance(Class.forName("java.util.Date"));
        setField(term4549, term4549.getClass(), "id", term4550);
        setBooleanField(term4549, term4549.getClass(), "enabled", true);
        setLongField(term4553, term4553.getClass(), "fastTime", 1753916620991L);
        setField(term4553, term4553.getClass(), "cdate", null);
        setField(term4549, term4549.getClass(), "created", term4553);
        setLongField(term4555, term4555.getClass(), "fastTime", 1807732981441L);
        setField(term4555, term4555.getClass(), "cdate", null);
        setField(term4549, term4549.getClass(), "updated", term4555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "onPreUpdate", argTypes, term4549, args);
    }

};


