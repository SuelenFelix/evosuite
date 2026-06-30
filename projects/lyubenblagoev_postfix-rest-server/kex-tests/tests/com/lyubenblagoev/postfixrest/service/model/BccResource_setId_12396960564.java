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

public class BccResource_setId_12396960564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1757;
     Object term1779;

    public BccResource_setId_12396960564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1758 = new Long(-2170847986967241072L);
        Long term1760 = new Long(4044358158040652353L);
        term1757 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource"));
        Object term1775 = newInstance(Class.forName("java.util.Date"));
        Object term1777 = newInstance(Class.forName("java.util.Date"));
        setField(term1757, term1757.getClass(), "id", term1758);
        setField(term1757, term1757.getClass(), "accountId", term1760);
        setField(term1757, term1757.getClass(), "email", "kBdSllIBVz");
        setBooleanField(term1757, term1757.getClass(), "enabled", true);
        setLongField(term1775, term1775.getClass(), "fastTime", 1426018874434L);
        setField(term1775, term1775.getClass(), "cdate", null);
        setField(term1757, term1757.getClass(), "created", term1775);
        setLongField(term1777, term1777.getClass(), "fastTime", 1633004775487L);
        setField(term1777, term1777.getClass(), "cdate", null);
        setField(term1757, term1757.getClass(), "updated", term1777);
        term1779 = new Long(-4443169559037975007L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1779;
        callMethod(klass, "setId", argTypes, term1757, args);
    }

};


