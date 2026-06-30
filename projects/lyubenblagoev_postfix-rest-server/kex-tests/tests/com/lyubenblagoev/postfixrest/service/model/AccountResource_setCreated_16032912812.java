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

public class AccountResource_setCreated_16032912812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4911;
     Object term4945;

    public AccountResource_setCreated_16032912812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4912 = new Long(7489064039921396098L);
        Long term4938 = new Long(6843866297465638866L);
        term4911 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        Object term4940 = newInstance(Class.forName("java.util.Date"));
        Object term4942 = newInstance(Class.forName("java.util.Date"));
        setField(term4911, term4911.getClass(), "id", term4912);
        setField(term4911, term4911.getClass(), "username", "lFRJFUMVbx");
        setField(term4911, term4911.getClass(), "domain", "sZdUNdggUW");
        setField(term4911, term4911.getClass(), "domainId", term4938);
        setLongField(term4940, term4940.getClass(), "fastTime", 1369539267611L);
        setField(term4940, term4940.getClass(), "cdate", null);
        setField(term4911, term4911.getClass(), "created", term4940);
        setLongField(term4942, term4942.getClass(), "fastTime", 1510275079351L);
        setField(term4942, term4942.getClass(), "cdate", null);
        setField(term4911, term4911.getClass(), "updated", term4942);
        setBooleanField(term4911, term4911.getClass(), "enabled", true);
        term4945 = newInstance(Class.forName("java.util.Date"));
        setLongField(term4945, term4945.getClass(), "fastTime", 1335389252058L);
        setField(term4945, term4945.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term4945;
        callMethod(klass, "setCreated", argTypes, term4911, args);
    }

};


