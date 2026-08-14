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

public class TransactionalEntity_setUpdatedAt_153694737814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5932;
     Object term6005;

    public TransactionalEntity_setUpdatedAt_153694737814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5933 = new Long(2354625302846375590L);
        Integer term5973 = new Integer(-663691365);
        term5932 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term5987 = newInstance(Class.forName("java.time.Instant"));
        Object term6002 = newInstance(Class.forName("java.time.Instant"));
        setField(term5932, term5932.getClass(), "id", term5933);
        setField(term5932, term5932.getClass(), "referenceId", "c61133df-aa3b-4292-8bbd-68e081e17869");
        setField(term5932, term5932.getClass(), "version", term5973);
        setField(term5932, term5932.getClass(), "createdBy", "bxrCBbrrct");
        setLongField(term5987, term5987.getClass(), "seconds", 1502420909L);
        setIntField(term5987, term5987.getClass(), "nanos", 766000000);
        setField(term5932, term5932.getClass(), "createdAt", term5987);
        setField(term5932, term5932.getClass(), "updatedBy", "CKWpJaaaxX");
        setLongField(term6002, term6002.getClass(), "seconds", 1685492640L);
        setIntField(term6002, term6002.getClass(), "nanos", 220000000);
        setField(term5932, term5932.getClass(), "updatedAt", term6002);
        term6005 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term6005, term6005.getClass(), "seconds", 1654457238L);
        setIntField(term6005, term6005.getClass(), "nanos", 681000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term6005;
        callMethod(klass, "setUpdatedAt", argTypes, term5932, args);
    }

};


