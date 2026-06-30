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

public class AuditEntity_equals_1465743573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term593;
     Object term636;

    public AuditEntity_equals_1465743573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term606 = new Long(-316468845751588286L);
        term593 = newInstance(Class.forName("com.innova.entity.AuditEntity"));
        Object term620 = newInstance(Class.forName("java.util.Date"));
        Object term634 = newInstance(Class.forName("java.util.Date"));
        setField(term593, term593.getClass(), "auditName", "RkybSrpybU");
        setField(term593, term593.getClass(), "id", term606);
        setField(term593, term593.getClass(), "createdBy", "xOEqzGAmDU");
        setLongField(term620, term620.getClass(), "fastTime", 1668569229825L);
        setField(term620, term620.getClass(), "cdate", null);
        setField(term593, term593.getClass(), "createdDate", term620);
        setField(term593, term593.getClass(), "updateBy", "eZFUvlxvGV");
        setLongField(term634, term634.getClass(), "fastTime", 1725122217647L);
        setField(term634, term634.getClass(), "cdate", null);
        setField(term593, term593.getClass(), "updatedDate", term634);
        term636 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.AuditEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term636;
        callMethod(klass, "equals", argTypes, term593, args);
    }

};


