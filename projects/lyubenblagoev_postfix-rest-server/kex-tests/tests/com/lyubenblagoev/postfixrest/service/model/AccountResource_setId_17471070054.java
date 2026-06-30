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

public class AccountResource_setId_17471070054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4431;
     Object term4465;

    public AccountResource_setId_17471070054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4432 = new Long(-6342139649364011743L);
        Long term4458 = new Long(-4924950707540628022L);
        term4431 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        Object term4460 = newInstance(Class.forName("java.util.Date"));
        Object term4462 = newInstance(Class.forName("java.util.Date"));
        setField(term4431, term4431.getClass(), "id", term4432);
        setField(term4431, term4431.getClass(), "username", "zUlRdimJtU");
        setField(term4431, term4431.getClass(), "domain", "vwbEQQNQrx");
        setField(term4431, term4431.getClass(), "domainId", term4458);
        setLongField(term4460, term4460.getClass(), "fastTime", 1531331402053L);
        setField(term4460, term4460.getClass(), "cdate", null);
        setField(term4431, term4431.getClass(), "created", term4460);
        setLongField(term4462, term4462.getClass(), "fastTime", 1264037800343L);
        setField(term4462, term4462.getClass(), "cdate", null);
        setField(term4431, term4431.getClass(), "updated", term4462);
        setBooleanField(term4431, term4431.getClass(), "enabled", false);
        term4465 = new Long(-4393710401270724527L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4465;
        callMethod(klass, "setId", argTypes, term4431, args);
    }

};


