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

public class BccResource_getUpdated_126874930413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2075;

    public BccResource_getUpdated_126874930413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2076 = new Long(414749984815662075L);
        Long term2078 = new Long(463622836963501975L);
        term2075 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource"));
        Object term2093 = newInstance(Class.forName("java.util.Date"));
        Object term2095 = newInstance(Class.forName("java.util.Date"));
        setField(term2075, term2075.getClass(), "id", term2076);
        setField(term2075, term2075.getClass(), "accountId", term2078);
        setField(term2075, term2075.getClass(), "email", "oVgzLbrsFr");
        setBooleanField(term2075, term2075.getClass(), "enabled", true);
        setLongField(term2093, term2093.getClass(), "fastTime", 1838357779277L);
        setField(term2093, term2093.getClass(), "cdate", null);
        setField(term2075, term2075.getClass(), "created", term2093);
        setLongField(term2095, term2095.getClass(), "fastTime", 1332871705432L);
        setField(term2095, term2095.getClass(), "cdate", null);
        setField(term2075, term2075.getClass(), "updated", term2095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdated", argTypes, term2075, args);
    }

};


