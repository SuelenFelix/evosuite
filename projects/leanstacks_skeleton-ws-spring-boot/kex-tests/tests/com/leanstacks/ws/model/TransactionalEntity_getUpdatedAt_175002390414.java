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

public class TransactionalEntity_getUpdatedAt_175002390414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9565;

    public TransactionalEntity_getUpdatedAt_175002390414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9566 = new Long(2297097306706899827L);
        Integer term9606 = new Integer(890669485);
        term9565 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term9620 = newInstance(Class.forName("java.time.Instant"));
        Object term9635 = newInstance(Class.forName("java.time.Instant"));
        setField(term9565, term9565.getClass(), "id", term9566);
        setField(term9565, term9565.getClass(), "referenceId", "ade891a8-d31d-42d3-ae44-c1582bbac962");
        setField(term9565, term9565.getClass(), "version", term9606);
        setField(term9565, term9565.getClass(), "createdBy", "RCOqfVsRHt");
        setLongField(term9620, term9620.getClass(), "seconds", 1710602340L);
        setIntField(term9620, term9620.getClass(), "nanos", 656000000);
        setField(term9565, term9565.getClass(), "createdAt", term9620);
        setField(term9565, term9565.getClass(), "updatedBy", "TSyCeEZPaT");
        setLongField(term9635, term9635.getClass(), "seconds", 1766247544L);
        setIntField(term9635, term9635.getClass(), "nanos", 969000000);
        setField(term9565, term9565.getClass(), "updatedAt", term9635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term9565, args);
    }

};


