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

public class AuditEntity_hashCode_5952610325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741;

    public AuditEntity_hashCode_5952610325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term754 = new Long(-6573104506744284592L);
        term741 = newInstance(Class.forName("com.innova.entity.AuditEntity"));
        Object term768 = newInstance(Class.forName("java.util.Date"));
        Object term782 = newInstance(Class.forName("java.util.Date"));
        setField(term741, term741.getClass(), "auditName", "OclPbYPkcH");
        setField(term741, term741.getClass(), "id", term754);
        setField(term741, term741.getClass(), "createdBy", "IoAlmYsBwc");
        setLongField(term768, term768.getClass(), "fastTime", 1538078916394L);
        setField(term768, term768.getClass(), "cdate", null);
        setField(term741, term741.getClass(), "createdDate", term768);
        setField(term741, term741.getClass(), "updateBy", "TEParAifyi");
        setLongField(term782, term782.getClass(), "fastTime", 1744090065937L);
        setField(term782, term782.getClass(), "cdate", null);
        setField(term741, term741.getClass(), "updatedDate", term782);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.AuditEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term741, args);
    }

};


