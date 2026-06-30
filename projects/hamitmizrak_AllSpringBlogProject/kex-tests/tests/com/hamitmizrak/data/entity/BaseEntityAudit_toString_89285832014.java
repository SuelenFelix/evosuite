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

public class BaseEntityAudit_toString_89285832014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term850;

    public BaseEntityAudit_toString_89285832014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term851 = new Long(-5476826692763582090L);
        term850 = newInstance(Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit"));
        Object term865 = newInstance(Class.forName("java.util.Date"));
        Object term879 = newInstance(Class.forName("java.util.Date"));
        setField(term850, term850.getClass(), "id", term851);
        setField(term850, term850.getClass(), "createdBy", "kuTXqwMtDB");
        setLongField(term865, term865.getClass(), "fastTime", 1329640267573L);
        setField(term865, term865.getClass(), "cdate", null);
        setField(term850, term850.getClass(), "createdDate", term865);
        setField(term850, term850.getClass(), "updateBy", "Ghbwtircqb");
        setLongField(term879, term879.getClass(), "fastTime", 1334853104718L);
        setField(term879, term879.getClass(), "cdate", null);
        setField(term850, term850.getClass(), "updateDate", term879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.data.entity.BaseEntityAudit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term850, args);
    }

};


