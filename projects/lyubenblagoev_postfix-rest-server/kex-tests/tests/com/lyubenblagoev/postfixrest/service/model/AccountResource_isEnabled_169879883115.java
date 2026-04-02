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

public class AccountResource_isEnabled_169879883115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5077;

    public AccountResource_isEnabled_169879883115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5078 = new Long(8802866251294305945L);
        Long term5104 = new Long(4513004407927379358L);
        term5077 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource"));
        Object term5106 = newInstance(Class.forName("java.util.Date"));
        Object term5108 = newInstance(Class.forName("java.util.Date"));
        setField(term5077, term5077.getClass(), "id", term5078);
        setField(term5077, term5077.getClass(), "username", "wzsPSPcRdj");
        setField(term5077, term5077.getClass(), "domain", "kGMQdqJYyB");
        setField(term5077, term5077.getClass(), "domainId", term5104);
        setLongField(term5106, term5106.getClass(), "fastTime", 1618594705278L);
        setField(term5106, term5106.getClass(), "cdate", null);
        setField(term5077, term5077.getClass(), "created", term5106);
        setLongField(term5108, term5108.getClass(), "fastTime", 1584136591305L);
        setField(term5108, term5108.getClass(), "cdate", null);
        setField(term5077, term5077.getClass(), "updated", term5108);
        setBooleanField(term5077, term5077.getClass(), "enabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AccountResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnabled", argTypes, term5077, args);
    }

};


