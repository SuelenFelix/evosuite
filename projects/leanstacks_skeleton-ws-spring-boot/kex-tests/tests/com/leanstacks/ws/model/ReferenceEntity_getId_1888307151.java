package com.leanstacks.ws.model;

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
import static com.leanstacks.ws.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class ReferenceEntity_getId_1888307151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ReferenceEntity_getId_1888307151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Integer term28 = new Integer(568599855);
        term1 = newInstance(Class.forName("com.leanstacks.ws.model.ReferenceEntity"));
        Object term30 = newInstance(Class.forName("java.time.Instant"));
        Object term33 = newInstance(Class.forName("java.time.Instant"));
        Object term36 = newInstance(Class.forName("java.time.Instant"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "code", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "label", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "ordinal", term28);
        setLongField(term30, term30.getClass(), "seconds", 1345871412L);
        setIntField(term30, term30.getClass(), "nanos", 244000000);
        setField(term1, term1.getClass(), "effectiveAt", term30);
        setLongField(term33, term33.getClass(), "seconds", 1480438351L);
        setIntField(term33, term33.getClass(), "nanos", 369000000);
        setField(term1, term1.getClass(), "expiresAt", term33);
        setLongField(term36, term36.getClass(), "seconds", 1610940182L);
        setIntField(term36, term36.getClass(), "nanos", 830000000);
        setField(term1, term1.getClass(), "createdAt", term36);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.ReferenceEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


