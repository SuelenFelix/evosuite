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

public class BaseEntityAudit_setId_8987473946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390;
     Object term421;

    public BaseEntityAudit_setId_8987473946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term391 = new Long(7411271909051562686L);
        term390 = newInstance(Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit"));
        Object term405 = newInstance(Class.forName("java.util.Date"));
        Object term419 = newInstance(Class.forName("java.util.Date"));
        setField(term390, term390.getClass(), "id", term391);
        setField(term390, term390.getClass(), "createdBy", "ZiaGIbnzTs");
        setLongField(term405, term405.getClass(), "fastTime", 1797203628025L);
        setField(term405, term405.getClass(), "cdate", null);
        setField(term390, term390.getClass(), "createdDate", term405);
        setField(term390, term390.getClass(), "updateBy", "tbcdzjIfER");
        setLongField(term419, term419.getClass(), "fastTime", 1589457921030L);
        setField(term419, term419.getClass(), "cdate", null);
        setField(term390, term390.getClass(), "updateDate", term419);
        term421 = new Long(4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term421;
        callMethod(klass, "setId", argTypes, term390, args);
    }

};


