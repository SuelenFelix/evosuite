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

public class BaseEntity_setId_4890083764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4565;
     Object term4573;

    public BaseEntity_setId_4890083764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4566 = new Long(6545086285386938562L);
        term4565 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity"));
        Object term4569 = newInstance(Class.forName("java.util.Date"));
        Object term4571 = newInstance(Class.forName("java.util.Date"));
        setField(term4565, term4565.getClass(), "id", term4566);
        setBooleanField(term4565, term4565.getClass(), "enabled", false);
        setLongField(term4569, term4569.getClass(), "fastTime", 1395774411330L);
        setField(term4569, term4569.getClass(), "cdate", null);
        setField(term4565, term4565.getClass(), "created", term4569);
        setLongField(term4571, term4571.getClass(), "fastTime", 1464688928833L);
        setField(term4571, term4571.getClass(), "cdate", null);
        setField(term4565, term4565.getClass(), "updated", term4571);
        term4573 = new Long(3951346165629352117L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.BaseEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4573;
        callMethod(klass, "setId", argTypes, term4565, args);
    }

};


