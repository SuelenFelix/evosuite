package com.hamitmizrak.data.entity;

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
import static com.hamitmizrak.data.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class BaseEntityAudit_setCreatedBy_18500249477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443;

    public BaseEntityAudit_setCreatedBy_18500249477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term444 = new Long(6811161968424632369L);
        term443 = newInstance(Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit"));
        Object term458 = newInstance(Class.forName("java.util.Date"));
        Object term472 = newInstance(Class.forName("java.util.Date"));
        setField(term443, term443.getClass(), "id", term444);
        setField(term443, term443.getClass(), "createdBy", "HyxfbSQYBe");
        setLongField(term458, term458.getClass(), "fastTime", 1745462962080L);
        setField(term458, term458.getClass(), "cdate", null);
        setField(term443, term443.getClass(), "createdDate", term458);
        setField(term443, term443.getClass(), "updateBy", "pCTimMblYc");
        setLongField(term472, term472.getClass(), "fastTime", 1349069753960L);
        setField(term472, term472.getClass(), "cdate", null);
        setField(term443, term443.getClass(), "updateDate", term472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "setCreatedBy", argTypes, term443, args);
    }

};


