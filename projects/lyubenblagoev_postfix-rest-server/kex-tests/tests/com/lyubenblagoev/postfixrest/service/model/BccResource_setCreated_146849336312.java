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

public class BccResource_setCreated_146849336312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2041;
     Object term2063;

    public BccResource_setCreated_146849336312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2042 = new Long(2062173786000223358L);
        Long term2044 = new Long(-8658027316505137504L);
        term2041 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource"));
        Object term2059 = newInstance(Class.forName("java.util.Date"));
        Object term2061 = newInstance(Class.forName("java.util.Date"));
        setField(term2041, term2041.getClass(), "id", term2042);
        setField(term2041, term2041.getClass(), "accountId", term2044);
        setField(term2041, term2041.getClass(), "email", "MAcUBcBckh");
        setBooleanField(term2041, term2041.getClass(), "enabled", true);
        setLongField(term2059, term2059.getClass(), "fastTime", 1466008719289L);
        setField(term2059, term2059.getClass(), "cdate", null);
        setField(term2041, term2041.getClass(), "created", term2059);
        setLongField(term2061, term2061.getClass(), "fastTime", 1535838449065L);
        setField(term2061, term2061.getClass(), "cdate", null);
        setField(term2041, term2041.getClass(), "updated", term2061);
        term2063 = newInstance(Class.forName("java.util.Date"));
        setLongField(term2063, term2063.getClass(), "fastTime", 1345923503543L);
        setField(term2063, term2063.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term2063;
        callMethod(klass, "setCreated", argTypes, term2041, args);
    }

};


