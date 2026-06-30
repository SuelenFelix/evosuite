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

public class BaseEntityAudit_canEqual_163849998212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term747;
     Object term778;

    public BaseEntityAudit_canEqual_163849998212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term748 = new Long(-4325723315152823407L);
        term747 = newInstance(Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit"));
        Object term762 = newInstance(Class.forName("java.util.Date"));
        Object term776 = newInstance(Class.forName("java.util.Date"));
        setField(term747, term747.getClass(), "id", term748);
        setField(term747, term747.getClass(), "createdBy", "OWDIEULEFu");
        setLongField(term762, term762.getClass(), "fastTime", 1347400561385L);
        setField(term762, term762.getClass(), "cdate", null);
        setField(term747, term747.getClass(), "createdDate", term762);
        setField(term747, term747.getClass(), "updateBy", "dWRymuLBtr");
        setLongField(term776, term776.getClass(), "fastTime", 1502158153899L);
        setField(term776, term776.getClass(), "cdate", null);
        setField(term747, term747.getClass(), "updateDate", term776);
        term778 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term778;
        callMethod(klass, "canEqual", argTypes, term747, args);
    }

};


