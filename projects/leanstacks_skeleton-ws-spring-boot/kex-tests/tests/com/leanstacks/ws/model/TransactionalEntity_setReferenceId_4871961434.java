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

public class TransactionalEntity_setReferenceId_4871961434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4557;

    public TransactionalEntity_setReferenceId_4871961434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4558 = new Long(2135754395358000892L);
        Integer term4598 = new Integer(444029505);
        term4557 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term4612 = newInstance(Class.forName("java.time.Instant"));
        Object term4627 = newInstance(Class.forName("java.time.Instant"));
        setField(term4557, term4557.getClass(), "id", term4558);
        setField(term4557, term4557.getClass(), "referenceId", "e18f9a77-d7f4-409f-a129-68b544c1b829");
        setField(term4557, term4557.getClass(), "version", term4598);
        setField(term4557, term4557.getClass(), "createdBy", "gUvcueTURF");
        setLongField(term4612, term4612.getClass(), "seconds", 1889599547L);
        setIntField(term4612, term4612.getClass(), "nanos", 447000000);
        setField(term4557, term4557.getClass(), "createdAt", term4612);
        setField(term4557, term4557.getClass(), "updatedBy", "EwQBhZjCIT");
        setLongField(term4627, term4627.getClass(), "seconds", 1511094598L);
        setIntField(term4627, term4627.getClass(), "nanos", 673000000);
        setField(term4557, term4557.getClass(), "updatedAt", term4627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aSkmSwTnEw";
        callMethod(klass, "setReferenceId", argTypes, term4557, args);
    }

};


