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

public class TransactionalEntity_getReferenceId_5902469593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4428;

    public TransactionalEntity_getReferenceId_5902469593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4429 = new Long(7247160664318067468L);
        Integer term4469 = new Integer(941650513);
        term4428 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term4483 = newInstance(Class.forName("java.time.Instant"));
        Object term4498 = newInstance(Class.forName("java.time.Instant"));
        setField(term4428, term4428.getClass(), "id", term4429);
        setField(term4428, term4428.getClass(), "referenceId", "5317f8e6-56af-43f4-b8a6-12beafa54aff");
        setField(term4428, term4428.getClass(), "version", term4469);
        setField(term4428, term4428.getClass(), "createdBy", "AHbZyFOmlo");
        setLongField(term4483, term4483.getClass(), "seconds", 1337922977L);
        setIntField(term4483, term4483.getClass(), "nanos", 26000000);
        setField(term4428, term4428.getClass(), "createdAt", term4483);
        setField(term4428, term4428.getClass(), "updatedBy", "TwfWVQGiIj");
        setLongField(term4498, term4498.getClass(), "seconds", 1549838758L);
        setIntField(term4498, term4498.getClass(), "nanos", 444000000);
        setField(term4428, term4428.getClass(), "updatedAt", term4498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReferenceId", argTypes, term4428, args);
    }

};


