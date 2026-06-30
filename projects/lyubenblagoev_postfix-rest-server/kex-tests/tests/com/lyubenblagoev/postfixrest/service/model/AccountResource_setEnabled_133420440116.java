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
import java.lang.Boolean;

public class AccountResource_setEnabled_133420440116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5131;
     Object term5165;

    public AccountResource_setEnabled_133420440116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5132 = new Long(-7115418542247301000L);
        Long term5158 = new Long(8034714140377562739L);
        term5131 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        Object term5160 = newInstance(Class.forName("java.util.Date"));
        Object term5162 = newInstance(Class.forName("java.util.Date"));
        setField(term5131, term5131.getClass(), "id", term5132);
        setField(term5131, term5131.getClass(), "username", "XJJNClzHRf");
        setField(term5131, term5131.getClass(), "domain", "HDaezxQfQR");
        setField(term5131, term5131.getClass(), "domainId", term5158);
        setLongField(term5160, term5160.getClass(), "fastTime", 1309132342717L);
        setField(term5160, term5160.getClass(), "cdate", null);
        setField(term5131, term5131.getClass(), "created", term5160);
        setLongField(term5162, term5162.getClass(), "fastTime", 1695470381249L);
        setField(term5162, term5162.getClass(), "cdate", null);
        setField(term5131, term5131.getClass(), "updated", term5162);
        setBooleanField(term5131, term5131.getClass(), "enabled", false);
        term5165 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5165;
        callMethod(klass, "setEnabled", argTypes, term5131, args);
    }

};


