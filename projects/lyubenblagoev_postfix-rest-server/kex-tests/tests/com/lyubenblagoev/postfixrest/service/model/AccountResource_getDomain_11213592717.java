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

public class AccountResource_getDomain_11213592717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4617;

    public AccountResource_getDomain_11213592717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4618 = new Long(2297097306706899827L);
        Long term4644 = new Long(-900457279156388404L);
        term4617 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        Object term4646 = newInstance(Class.forName("java.util.Date"));
        Object term4648 = newInstance(Class.forName("java.util.Date"));
        setField(term4617, term4617.getClass(), "id", term4618);
        setField(term4617, term4617.getClass(), "username", "igCAtimmYB");
        setField(term4617, term4617.getClass(), "domain", "DyiXbeYIaN");
        setField(term4617, term4617.getClass(), "domainId", term4644);
        setLongField(term4646, term4646.getClass(), "fastTime", 1597421765774L);
        setField(term4646, term4646.getClass(), "cdate", null);
        setField(term4617, term4617.getClass(), "created", term4646);
        setLongField(term4648, term4648.getClass(), "fastTime", 1354735325477L);
        setField(term4648, term4648.getClass(), "cdate", null);
        setField(term4617, term4617.getClass(), "updated", term4648);
        setBooleanField(term4617, term4617.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDomain", argTypes, term4617, args);
    }

};


