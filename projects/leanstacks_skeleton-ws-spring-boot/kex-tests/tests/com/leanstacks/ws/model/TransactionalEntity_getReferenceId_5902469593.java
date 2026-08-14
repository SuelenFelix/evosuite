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
     Object term4442;

    public TransactionalEntity_getReferenceId_5902469593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4443 = new Long(7247160664318067468L);
        Integer term4483 = new Integer(941650513);
        term4442 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term4497 = newInstance(Class.forName("java.time.Instant"));
        Object term4512 = newInstance(Class.forName("java.time.Instant"));
        setField(term4442, term4442.getClass(), "id", term4443);
        setField(term4442, term4442.getClass(), "referenceId", "0a833355-55cf-49d6-aa55-ca73ab11c0f9");
        setField(term4442, term4442.getClass(), "version", term4483);
        setField(term4442, term4442.getClass(), "createdBy", "AHbZyFOmlo");
        setLongField(term4497, term4497.getClass(), "seconds", 1337922977L);
        setIntField(term4497, term4497.getClass(), "nanos", 26000000);
        setField(term4442, term4442.getClass(), "createdAt", term4497);
        setField(term4442, term4442.getClass(), "updatedBy", "TwfWVQGiIj");
        setLongField(term4512, term4512.getClass(), "seconds", 1549838758L);
        setIntField(term4512, term4512.getClass(), "nanos", 444000000);
        setField(term4442, term4442.getClass(), "updatedAt", term4512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReferenceId", argTypes, term4442, args);
    }

};


