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

public class AccountResource_getUpdated_3941493113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4967;

    public AccountResource_getUpdated_3941493113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4968 = new Long(-4023935540989049732L);
        Long term4994 = new Long(855932984568615096L);
        term4967 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        Object term4996 = newInstance(Class.forName("java.util.Date"));
        Object term4998 = newInstance(Class.forName("java.util.Date"));
        setField(term4967, term4967.getClass(), "id", term4968);
        setField(term4967, term4967.getClass(), "username", "OqbwYQfvAe");
        setField(term4967, term4967.getClass(), "domain", "tRxZafjqIx");
        setField(term4967, term4967.getClass(), "domainId", term4994);
        setLongField(term4996, term4996.getClass(), "fastTime", 1616833468678L);
        setField(term4996, term4996.getClass(), "cdate", null);
        setField(term4967, term4967.getClass(), "created", term4996);
        setLongField(term4998, term4998.getClass(), "fastTime", 1319541754821L);
        setField(term4998, term4998.getClass(), "cdate", null);
        setField(term4967, term4967.getClass(), "updated", term4998);
        setBooleanField(term4967, term4967.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdated", argTypes, term4967, args);
    }

};


