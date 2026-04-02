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

public class AliasResource_setCreated_708530199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1201;
     Object term1233;

    public AliasResource_setCreated_708530199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1202 = new Long(5262507301787091109L);
        term1201 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource"));
        Object term1228 = newInstance(Class.forName("java.util.Date"));
        Object term1230 = newInstance(Class.forName("java.util.Date"));
        setField(term1201, term1201.getClass(), "id", term1202);
        setField(term1201, term1201.getClass(), "name", "LvtrsXUliU");
        setField(term1201, term1201.getClass(), "email", "xLbjWUgOIL");
        setLongField(term1228, term1228.getClass(), "fastTime", 1668569229825L);
        setField(term1228, term1228.getClass(), "cdate", null);
        setField(term1201, term1201.getClass(), "created", term1228);
        setLongField(term1230, term1230.getClass(), "fastTime", 1725122217647L);
        setField(term1230, term1230.getClass(), "cdate", null);
        setField(term1201, term1201.getClass(), "updated", term1230);
        setBooleanField(term1201, term1201.getClass(), "enabled", true);
        term1233 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1233, term1233.getClass(), "fastTime", 1550698994689L);
        setField(term1233, term1233.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AliasResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term1233;
        callMethod(klass, "setCreated", argTypes, term1201, args);
    }

};


