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

public class TransactionalEntity_setUpdatedBy_212086905913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9414;

    public TransactionalEntity_setUpdatedBy_212086905913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9415 = new Long(5671808784468963649L);
        Integer term9455 = new Integer(1141317871);
        term9414 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term9469 = newInstance(Class.forName("java.time.Instant"));
        Object term9484 = newInstance(Class.forName("java.time.Instant"));
        setField(term9414, term9414.getClass(), "id", term9415);
        setField(term9414, term9414.getClass(), "referenceId", "bf61f107-a5a2-4bda-b1d8-13e73bfa86e8");
        setField(term9414, term9414.getClass(), "version", term9455);
        setField(term9414, term9414.getClass(), "createdBy", "lZIgPZPgTu");
        setLongField(term9469, term9469.getClass(), "seconds", 1789681710L);
        setIntField(term9469, term9469.getClass(), "nanos", 192000000);
        setField(term9414, term9414.getClass(), "createdAt", term9469);
        setField(term9414, term9414.getClass(), "updatedBy", "iuCxnHGMoW");
        setLongField(term9484, term9484.getClass(), "seconds", 1786374298L);
        setIntField(term9484, term9484.getClass(), "nanos", 622000000);
        setField(term9414, term9414.getClass(), "updatedAt", term9484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GPSEWEDSTo";
        callMethod(klass, "setUpdatedBy", argTypes, term9414, args);
    }

};


