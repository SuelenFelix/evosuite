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

public class AccountResource_getDomainId_7106226559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4747;

    public AccountResource_getDomainId_7106226559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4748 = new Long(3620247240684476031L);
        Long term4774 = new Long(8313800941204938919L);
        term4747 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        Object term4776 = newInstance(Class.forName("java.util.Date"));
        Object term4778 = newInstance(Class.forName("java.util.Date"));
        setField(term4747, term4747.getClass(), "id", term4748);
        setField(term4747, term4747.getClass(), "username", "RbVQXSpxXy");
        setField(term4747, term4747.getClass(), "domain", "YpJbIgJWWv");
        setField(term4747, term4747.getClass(), "domainId", term4774);
        setLongField(term4776, term4776.getClass(), "fastTime", 1589746751309L);
        setField(term4776, term4776.getClass(), "cdate", null);
        setField(term4747, term4747.getClass(), "created", term4776);
        setLongField(term4778, term4778.getClass(), "fastTime", 1291280367982L);
        setField(term4778, term4778.getClass(), "cdate", null);
        setField(term4747, term4747.getClass(), "updated", term4778);
        setBooleanField(term4747, term4747.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDomainId", argTypes, term4747, args);
    }

};


