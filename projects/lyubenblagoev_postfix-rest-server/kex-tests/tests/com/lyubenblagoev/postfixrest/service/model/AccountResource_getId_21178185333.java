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

public class AccountResource_getId_21178185333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4377;

    public AccountResource_getId_21178185333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4378 = new Long(-6950146046121430355L);
        Long term4404 = new Long(1667122142089513324L);
        term4377 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        Object term4406 = newInstance(Class.forName("java.util.Date"));
        Object term4408 = newInstance(Class.forName("java.util.Date"));
        setField(term4377, term4377.getClass(), "id", term4378);
        setField(term4377, term4377.getClass(), "username", "sQvGcVjdEx");
        setField(term4377, term4377.getClass(), "domain", "rLHAoqXgPh");
        setField(term4377, term4377.getClass(), "domainId", term4404);
        setLongField(term4406, term4406.getClass(), "fastTime", 1689428810999L);
        setField(term4406, term4406.getClass(), "cdate", null);
        setField(term4377, term4377.getClass(), "created", term4406);
        setLongField(term4408, term4408.getClass(), "fastTime", 1570714321079L);
        setField(term4408, term4408.getClass(), "cdate", null);
        setField(term4377, term4377.getClass(), "updated", term4408);
        setBooleanField(term4377, term4377.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4377, args);
    }

};


