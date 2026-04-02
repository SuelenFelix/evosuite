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

public class AccountResource_setDomainId_100539747110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4801;
     Object term4835;

    public AccountResource_setDomainId_100539747110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4802 = new Long(-1214968196781083707L);
        Long term4828 = new Long(-1804015692891701666L);
        term4801 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        Object term4830 = newInstance(Class.forName("java.util.Date"));
        Object term4832 = newInstance(Class.forName("java.util.Date"));
        setField(term4801, term4801.getClass(), "id", term4802);
        setField(term4801, term4801.getClass(), "username", "JppkknKVOw");
        setField(term4801, term4801.getClass(), "domain", "iljANwuEjk");
        setField(term4801, term4801.getClass(), "domainId", term4828);
        setLongField(term4830, term4830.getClass(), "fastTime", 1491181740539L);
        setField(term4830, term4830.getClass(), "cdate", null);
        setField(term4801, term4801.getClass(), "created", term4830);
        setLongField(term4832, term4832.getClass(), "fastTime", 1461996881310L);
        setField(term4832, term4832.getClass(), "cdate", null);
        setField(term4801, term4801.getClass(), "updated", term4832);
        setBooleanField(term4801, term4801.getClass(), "enabled", true);
        term4835 = new Long(-6432617521836576658L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4835;
        callMethod(klass, "setDomainId", argTypes, term4801, args);
    }

};


