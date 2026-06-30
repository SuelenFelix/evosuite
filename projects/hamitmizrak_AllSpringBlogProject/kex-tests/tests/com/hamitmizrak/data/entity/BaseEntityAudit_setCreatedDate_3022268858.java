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

public class BaseEntityAudit_setCreatedDate_3022268858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516;
     Object term547;

    public BaseEntityAudit_setCreatedDate_3022268858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term517 = new Long(-7237588299778557629L);
        term516 = newInstance(Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit"));
        Object term531 = newInstance(Class.forName("java.util.Date"));
        Object term545 = newInstance(Class.forName("java.util.Date"));
        setField(term516, term516.getClass(), "id", term517);
        setField(term516, term516.getClass(), "createdBy", "RkybSrpybU");
        setLongField(term531, term531.getClass(), "fastTime", 1706078172457L);
        setField(term531, term531.getClass(), "cdate", null);
        setField(term516, term516.getClass(), "createdDate", term531);
        setField(term516, term516.getClass(), "updateBy", "xOEqzGAmDU");
        setLongField(term545, term545.getClass(), "fastTime", 1863631094992L);
        setField(term545, term545.getClass(), "cdate", null);
        setField(term516, term516.getClass(), "updateDate", term545);
        term547 = newInstance(Class.forName("java.util.Date"));
        setLongField(term547, term547.getClass(), "fastTime", 1882638884364L);
        setField(term547, term547.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term547;
        callMethod(klass, "setCreatedDate", argTypes, term516, args);
    }

};


