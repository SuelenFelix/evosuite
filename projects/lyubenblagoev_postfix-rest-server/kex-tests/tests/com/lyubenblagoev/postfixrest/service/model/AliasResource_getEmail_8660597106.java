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

public class AliasResource_getEmail_8660597106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1023;

    public AliasResource_getEmail_8660597106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1024 = new Long(2120084523938730454L);
        term1023 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource"));
        Object term1050 = newInstance(Class.forName("java.util.Date"));
        Object term1052 = newInstance(Class.forName("java.util.Date"));
        setField(term1023, term1023.getClass(), "id", term1024);
        setField(term1023, term1023.getClass(), "name", "wSQxaModmm");
        setField(term1023, term1023.getClass(), "email", "UlajhuVLaP");
        setLongField(term1050, term1050.getClass(), "fastTime", 1745462962080L);
        setField(term1050, term1050.getClass(), "cdate", null);
        setField(term1023, term1023.getClass(), "created", term1050);
        setLongField(term1052, term1052.getClass(), "fastTime", 1349069753960L);
        setField(term1052, term1052.getClass(), "cdate", null);
        setField(term1023, term1023.getClass(), "updated", term1052);
        setBooleanField(term1023, term1023.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term1023, args);
    }

};


