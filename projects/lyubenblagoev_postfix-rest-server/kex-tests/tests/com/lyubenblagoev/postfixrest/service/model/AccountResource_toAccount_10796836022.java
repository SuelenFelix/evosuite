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

public class AccountResource_toAccount_10796836022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4291;
     Object term4325;

    public AccountResource_toAccount_10796836022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4292 = new Long(1215116475929634177L);
        Long term4318 = new Long(1597484336218508869L);
        term4291 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        Object term4320 = newInstance(Class.forName("java.util.Date"));
        Object term4322 = newInstance(Class.forName("java.util.Date"));
        setField(term4291, term4291.getClass(), "id", term4292);
        setField(term4291, term4291.getClass(), "username", "XYtryyobou");
        setField(term4291, term4291.getClass(), "domain", "OYbzXylRWW");
        setField(term4291, term4291.getClass(), "domainId", term4318);
        setLongField(term4320, term4320.getClass(), "fastTime", 1263744156294L);
        setField(term4320, term4320.getClass(), "cdate", null);
        setField(term4291, term4291.getClass(), "created", term4320);
        setLongField(term4322, term4322.getClass(), "fastTime", 1490956290070L);
        setField(term4322, term4322.getClass(), "cdate", null);
        setField(term4291, term4291.getClass(), "updated", term4322);
        setBooleanField(term4291, term4291.getClass(), "enabled", true);
        Long term4340 = new Long(-685023850445639859L);
        term4325 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Domain"));
        Object term4338 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term4343 = newInstance(Class.forName("java.util.Date"));
        Object term4345 = newInstance(Class.forName("java.util.Date"));
        setField(term4325, term4325.getClass(), "name", "DSNsTGYXDF");
        setIntField(term4338, term4338.getClass(), "modCount", 0);
        setField(term4325, term4325.getClass(), "accounts", term4338);
        setField(term4325, term4325.getClass(), "aliases", term4338);
        setField(term4325, term4325.getClass(), "id", term4340);
        setBooleanField(term4325, term4325.getClass(), "enabled", true);
        setLongField(term4343, term4343.getClass(), "fastTime", 1285661498273L);
        setField(term4343, term4343.getClass(), "cdate", null);
        setField(term4325, term4325.getClass(), "created", term4343);
        setLongField(term4345, term4345.getClass(), "fastTime", 1643981113575L);
        setField(term4345, term4345.getClass(), "cdate", null);
        setField(term4325, term4325.getClass(), "updated", term4345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        argTypes[1] = Class.forName("com.lyubenblagoev.postfixrest.entity.Domain");
        Object[] args = new Object[2];
        args[0] = term4291;
        args[1] = term4325;
        callMethod(klass, "toAccount", argTypes, null, args);
    }

};


