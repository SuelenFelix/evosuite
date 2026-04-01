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

public class TransactionalEntity_getCreatedAt_167015198710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9024;

    public TransactionalEntity_getCreatedAt_167015198710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9025 = new Long(-4822736661741380518L);
        Integer term9065 = new Integer(-341962980);
        term9024 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term9079 = newInstance(Class.forName("java.time.Instant"));
        Object term9094 = newInstance(Class.forName("java.time.Instant"));
        setField(term9024, term9024.getClass(), "id", term9025);
        setField(term9024, term9024.getClass(), "referenceId", "091a39bc-da4c-4478-9805-1a5fc4e06fc9");
        setField(term9024, term9024.getClass(), "version", term9065);
        setField(term9024, term9024.getClass(), "createdBy", "IBpaxltauX");
        setLongField(term9079, term9079.getClass(), "seconds", 1842782087L);
        setIntField(term9079, term9079.getClass(), "nanos", 58000000);
        setField(term9024, term9024.getClass(), "createdAt", term9079);
        setField(term9024, term9024.getClass(), "updatedBy", "hePqROaplw");
        setLongField(term9094, term9094.getClass(), "seconds", 1629693899L);
        setIntField(term9094, term9094.getClass(), "nanos", 295000000);
        setField(term9024, term9024.getClass(), "updatedAt", term9094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term9024, args);
    }

};


