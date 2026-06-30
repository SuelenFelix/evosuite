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

public class BaseEntityAudit_getUpdateBy_14762835584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288;

    public BaseEntityAudit_getUpdateBy_14762835584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term289 = new Long(-8400487765614892086L);
        term288 = newInstance(Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit"));
        Object term303 = newInstance(Class.forName("java.util.Date"));
        Object term317 = newInstance(Class.forName("java.util.Date"));
        setField(term288, term288.getClass(), "id", term289);
        setField(term288, term288.getClass(), "createdBy", "MxlszYVzRf");
        setLongField(term303, term303.getClass(), "fastTime", 1429023851389L);
        setField(term303, term303.getClass(), "cdate", null);
        setField(term288, term288.getClass(), "createdDate", term303);
        setField(term288, term288.getClass(), "updateBy", "LQFpaHEwXR");
        setLongField(term317, term317.getClass(), "fastTime", 1495357463288L);
        setField(term317, term317.getClass(), "cdate", null);
        setField(term288, term288.getClass(), "updateDate", term317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateBy", argTypes, term288, args);
    }

};


