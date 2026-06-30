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

public class BccResource_isEnabled_3906345969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1943;

    public BccResource_isEnabled_3906345969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1944 = new Long(-3838084482494604218L);
        Long term1946 = new Long(3892018155439224435L);
        term1943 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource"));
        Object term1961 = newInstance(Class.forName("java.util.Date"));
        Object term1963 = newInstance(Class.forName("java.util.Date"));
        setField(term1943, term1943.getClass(), "id", term1944);
        setField(term1943, term1943.getClass(), "accountId", term1946);
        setField(term1943, term1943.getClass(), "email", "JUmudUmaaV");
        setBooleanField(term1943, term1943.getClass(), "enabled", false);
        setLongField(term1961, term1961.getClass(), "fastTime", 1802995433545L);
        setField(term1961, term1961.getClass(), "cdate", null);
        setField(term1943, term1943.getClass(), "created", term1961);
        setLongField(term1963, term1963.getClass(), "fastTime", 1843214817357L);
        setField(term1963, term1963.getClass(), "cdate", null);
        setField(term1943, term1943.getClass(), "updated", term1963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnabled", argTypes, term1943, args);
    }

};


