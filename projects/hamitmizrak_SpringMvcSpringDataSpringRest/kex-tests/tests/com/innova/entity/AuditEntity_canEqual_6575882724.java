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

public class AuditEntity_canEqual_6575882724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term667;
     Object term710;

    public AuditEntity_canEqual_6575882724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term680 = new Long(5127676408959197577L);
        term667 = newInstance(Class.forName("com.innova.entity.AuditEntity"));
        Object term694 = newInstance(Class.forName("java.util.Date"));
        Object term708 = newInstance(Class.forName("java.util.Date"));
        setField(term667, term667.getClass(), "auditName", "BYqFIqCKAV");
        setField(term667, term667.getClass(), "id", term680);
        setField(term667, term667.getClass(), "createdBy", "vrQLuWIDJX");
        setLongField(term694, term694.getClass(), "fastTime", 1550698994689L);
        setField(term694, term694.getClass(), "cdate", null);
        setField(term667, term667.getClass(), "createdDate", term694);
        setField(term667, term667.getClass(), "updateBy", "flxyYxBRtu");
        setLongField(term708, term708.getClass(), "fastTime", 1804998087131L);
        setField(term708, term708.getClass(), "cdate", null);
        setField(term667, term667.getClass(), "updatedDate", term708);
        term710 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.AuditEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term710;
        callMethod(klass, "canEqual", argTypes, term667, args);
    }

};


