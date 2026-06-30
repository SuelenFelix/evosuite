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

public class AccountResource_setUsername_4296013476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4541;

    public AccountResource_setUsername_4296013476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4542 = new Long(-7268507582722666254L);
        Long term4568 = new Long(5671808784468963649L);
        term4541 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        Object term4570 = newInstance(Class.forName("java.util.Date"));
        Object term4572 = newInstance(Class.forName("java.util.Date"));
        setField(term4541, term4541.getClass(), "id", term4542);
        setField(term4541, term4541.getClass(), "username", "lihXWlGDxk");
        setField(term4541, term4541.getClass(), "domain", "JmcmxoGhIK");
        setField(term4541, term4541.getClass(), "domainId", term4568);
        setLongField(term4570, term4570.getClass(), "fastTime", 1825608844992L);
        setField(term4570, term4570.getClass(), "cdate", null);
        setField(term4541, term4541.getClass(), "created", term4570);
        setLongField(term4572, term4572.getClass(), "fastTime", 1465782799700L);
        setField(term4572, term4572.getClass(), "cdate", null);
        setField(term4541, term4541.getClass(), "updated", term4572);
        setBooleanField(term4541, term4541.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jXzmYyrnnT";
        callMethod(klass, "setUsername", argTypes, term4541, args);
    }

};


