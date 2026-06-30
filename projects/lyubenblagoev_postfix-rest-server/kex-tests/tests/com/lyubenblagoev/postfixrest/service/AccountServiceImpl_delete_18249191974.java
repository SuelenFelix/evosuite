package com.lyubenblagoev.postfixrest.service;

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
import static com.lyubenblagoev.postfixrest.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class AccountServiceImpl_delete_18249191974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2400;

    public AccountServiceImpl_delete_18249191974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2401 = new Long(-7291743527973326814L);
        Long term2427 = new Long(-5963439350418910964L);
        term2400 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        Object term2429 = newInstance(Class.forName("java.util.Date"));
        Object term2431 = newInstance(Class.forName("java.util.Date"));
        setField(term2400, term2400.getClass(), "id", term2401);
        setField(term2400, term2400.getClass(), "username", "TimdotUuNC");
        setField(term2400, term2400.getClass(), "domain", "PkWMRdJcBb");
        setField(term2400, term2400.getClass(), "domainId", term2427);
        setLongField(term2429, term2429.getClass(), "fastTime", 1263744156294L);
        setField(term2429, term2429.getClass(), "cdate", null);
        setField(term2400, term2400.getClass(), "created", term2429);
        setLongField(term2431, term2431.getClass(), "fastTime", 1490956290070L);
        setField(term2431, term2431.getClass(), "cdate", null);
        setField(term2400, term2400.getClass(), "updated", term2431);
        setBooleanField(term2400, term2400.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.AccountServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Object[] args = new Object[1];
        args[0] = term2400;
        callMethod(klass, "delete", argTypes, null, args);
    }

};


