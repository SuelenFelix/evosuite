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

public class AuditEntity_toString_11060207226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term814;

    public AuditEntity_toString_11060207226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term827 = new Long(-4920224193275732920L);
        term814 = newInstance(Class.forName("com.innova.entity.AuditEntity"));
        Object term841 = newInstance(Class.forName("java.util.Date"));
        Object term855 = newInstance(Class.forName("java.util.Date"));
        setField(term814, term814.getClass(), "auditName", "OWDIEULEFu");
        setField(term814, term814.getClass(), "id", term827);
        setField(term814, term814.getClass(), "createdBy", "dWRymuLBtr");
        setLongField(term841, term841.getClass(), "fastTime", 1347400561385L);
        setField(term841, term841.getClass(), "cdate", null);
        setField(term814, term814.getClass(), "createdDate", term841);
        setField(term814, term814.getClass(), "updateBy", "AijpHYOFuy");
        setLongField(term855, term855.getClass(), "fastTime", 1502158153899L);
        setField(term855, term855.getClass(), "cdate", null);
        setField(term814, term814.getClass(), "updatedDate", term855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.AuditEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term814, args);
    }

};


