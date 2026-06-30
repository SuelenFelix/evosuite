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

public class AccountResource_getUsername_20159437875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4487;

    public AccountResource_getUsername_20159437875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4488 = new Long(-4822736661741380518L);
        Long term4514 = new Long(-5386201758403679145L);
        term4487 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        Object term4516 = newInstance(Class.forName("java.util.Date"));
        Object term4518 = newInstance(Class.forName("java.util.Date"));
        setField(term4487, term4487.getClass(), "id", term4488);
        setField(term4487, term4487.getClass(), "username", "xtftXXMbem");
        setField(term4487, term4487.getClass(), "domain", "cudZvLMQon");
        setField(term4487, term4487.getClass(), "domainId", term4514);
        setLongField(term4516, term4516.getClass(), "fastTime", 1450865259896L);
        setField(term4516, term4516.getClass(), "cdate", null);
        setField(term4487, term4487.getClass(), "created", term4516);
        setLongField(term4518, term4518.getClass(), "fastTime", 1467783054847L);
        setField(term4518, term4518.getClass(), "cdate", null);
        setField(term4487, term4487.getClass(), "updated", term4518);
        setBooleanField(term4487, term4487.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term4487, args);
    }

};


