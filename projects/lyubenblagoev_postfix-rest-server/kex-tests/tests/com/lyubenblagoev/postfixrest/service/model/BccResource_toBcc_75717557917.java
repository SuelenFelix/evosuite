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

public class BccResource_toBcc_75717557917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2143;

    public BccResource_toBcc_75717557917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2143 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource"));
        setField(term2143, term2143.getClass(), "id", null);
        setField(term2143, term2143.getClass(), "accountId", null);
        setField(term2143, term2143.getClass(), "email", null);
        setBooleanField(term2143, term2143.getClass(), "enabled", false);
        setField(term2143, term2143.getClass(), "created", null);
        setField(term2143, term2143.getClass(), "updated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        argTypes[1] = Class.forName("com.lyubenblagoev.postfixrest.entity.Account");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "toBcc", argTypes, term2143, args);
    }

};


