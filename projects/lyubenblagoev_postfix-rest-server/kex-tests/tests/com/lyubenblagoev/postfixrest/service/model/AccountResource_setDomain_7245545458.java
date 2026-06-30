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

public class AccountResource_setDomain_7245545458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4671;

    public AccountResource_setDomain_7245545458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4672 = new Long(1084801489398441516L);
        Long term4698 = new Long(6273754186658578034L);
        term4671 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        Object term4700 = newInstance(Class.forName("java.util.Date"));
        Object term4702 = newInstance(Class.forName("java.util.Date"));
        setField(term4671, term4671.getClass(), "id", term4672);
        setField(term4671, term4671.getClass(), "username", "VGizxZnyHX");
        setField(term4671, term4671.getClass(), "domain", "kVEZMHmRtR");
        setField(term4671, term4671.getClass(), "domainId", term4698);
        setLongField(term4700, term4700.getClass(), "fastTime", 1415426053422L);
        setField(term4700, term4700.getClass(), "cdate", null);
        setField(term4671, term4671.getClass(), "created", term4700);
        setLongField(term4702, term4702.getClass(), "fastTime", 1359786657069L);
        setField(term4702, term4702.getClass(), "cdate", null);
        setField(term4671, term4671.getClass(), "updated", term4702);
        setBooleanField(term4671, term4671.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ekxGuOYIwi";
        callMethod(klass, "setDomain", argTypes, term4671, args);
    }

};


