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

public class TransactionalEntity_setUpdatedAt_153694737815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9694;
     Object term9767;

    public TransactionalEntity_setUpdatedAt_153694737815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9695 = new Long(-900457279156388404L);
        Integer term9735 = new Integer(691577392);
        term9694 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term9749 = newInstance(Class.forName("java.time.Instant"));
        Object term9764 = newInstance(Class.forName("java.time.Instant"));
        setField(term9694, term9694.getClass(), "id", term9695);
        setField(term9694, term9694.getClass(), "referenceId", "ca367ff4-ec6c-4d49-a82e-c8dae1287fd6");
        setField(term9694, term9694.getClass(), "version", term9735);
        setField(term9694, term9694.getClass(), "createdBy", "JeZFtaqkzW");
        setLongField(term9749, term9749.getClass(), "seconds", 1690384147L);
        setIntField(term9749, term9749.getClass(), "nanos", 635000000);
        setField(term9694, term9694.getClass(), "createdAt", term9749);
        setField(term9694, term9694.getClass(), "updatedBy", "vOVuNSCCLe");
        setLongField(term9764, term9764.getClass(), "seconds", 1670332763L);
        setIntField(term9764, term9764.getClass(), "nanos", 507000000);
        setField(term9694, term9694.getClass(), "updatedAt", term9764);
        term9767 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term9767, term9767.getClass(), "seconds", 1667317804L);
        setIntField(term9767, term9767.getClass(), "nanos", 114000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term9767;
        callMethod(klass, "setUpdatedAt", argTypes, term9694, args);
    }

};


