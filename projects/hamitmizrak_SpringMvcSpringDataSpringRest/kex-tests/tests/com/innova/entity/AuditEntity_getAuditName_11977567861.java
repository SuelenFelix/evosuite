package com.innova.entity;

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
import static com.innova.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class AuditEntity_getAuditName_11977567861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term425;

    public AuditEntity_getAuditName_11977567861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term438 = new Long(-5476826692763582090L);
        term425 = newInstance(Class.forName("com.innova.entity.AuditEntity"));
        Object term452 = newInstance(Class.forName("java.util.Date"));
        Object term466 = newInstance(Class.forName("java.util.Date"));
        setField(term425, term425.getClass(), "auditName", "oVcInYnLWB");
        setField(term425, term425.getClass(), "id", term438);
        setField(term425, term425.getClass(), "createdBy", "aJlieCFVtF");
        setLongField(term452, term452.getClass(), "fastTime", 1706078172457L);
        setField(term452, term452.getClass(), "cdate", null);
        setField(term425, term425.getClass(), "createdDate", term452);
        setField(term425, term425.getClass(), "updateBy", "ZiaGIbnzTs");
        setLongField(term466, term466.getClass(), "fastTime", 1863631094992L);
        setField(term466, term466.getClass(), "cdate", null);
        setField(term425, term425.getClass(), "updatedDate", term466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.AuditEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuditName", argTypes, term425, args);
    }

};


