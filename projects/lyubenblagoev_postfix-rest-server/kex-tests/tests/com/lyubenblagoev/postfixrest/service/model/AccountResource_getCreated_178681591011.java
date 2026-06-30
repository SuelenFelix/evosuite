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

public class AccountResource_getCreated_178681591011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4857;

    public AccountResource_getCreated_178681591011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4858 = new Long(-2255965562447970862L);
        Long term4884 = new Long(148047808219672941L);
        term4857 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        Object term4886 = newInstance(Class.forName("java.util.Date"));
        Object term4888 = newInstance(Class.forName("java.util.Date"));
        setField(term4857, term4857.getClass(), "id", term4858);
        setField(term4857, term4857.getClass(), "username", "kNqaJKIATy");
        setField(term4857, term4857.getClass(), "domain", "vKQukfbJUd");
        setField(term4857, term4857.getClass(), "domainId", term4884);
        setLongField(term4886, term4886.getClass(), "fastTime", 1818968525805L);
        setField(term4886, term4886.getClass(), "cdate", null);
        setField(term4857, term4857.getClass(), "created", term4886);
        setLongField(term4888, term4888.getClass(), "fastTime", 1603905786801L);
        setField(term4888, term4888.getClass(), "cdate", null);
        setField(term4857, term4857.getClass(), "updated", term4888);
        setBooleanField(term4857, term4857.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreated", argTypes, term4857, args);
    }

};


