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

public class TransactionalEntity_getCreatedBy_20912127147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4968;

    public TransactionalEntity_getCreatedBy_20912127147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4969 = new Long(4949335493504695457L);
        Integer term5009 = new Integer(304775596);
        term4968 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term5023 = newInstance(Class.forName("java.time.Instant"));
        Object term5038 = newInstance(Class.forName("java.time.Instant"));
        setField(term4968, term4968.getClass(), "id", term4969);
        setField(term4968, term4968.getClass(), "referenceId", "6afe4cca-d279-4fc2-a0bd-075c3aa2d3ad");
        setField(term4968, term4968.getClass(), "version", term5009);
        setField(term4968, term4968.getClass(), "createdBy", "XfRABIFVEp");
        setLongField(term5023, term5023.getClass(), "seconds", 1699925062L);
        setIntField(term5023, term5023.getClass(), "nanos", 576000000);
        setField(term4968, term4968.getClass(), "createdAt", term5023);
        setField(term4968, term4968.getClass(), "updatedBy", "MHGKyEnwKc");
        setLongField(term5038, term5038.getClass(), "seconds", 1706636196L);
        setIntField(term5038, term5038.getClass(), "nanos", 274000000);
        setField(term4968, term4968.getClass(), "updatedAt", term5038);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedBy", argTypes, term4968, args);
    }

};


