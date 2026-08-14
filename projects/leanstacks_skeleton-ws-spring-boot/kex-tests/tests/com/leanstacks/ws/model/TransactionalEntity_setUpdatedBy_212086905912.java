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

public class TransactionalEntity_setUpdatedBy_212086905912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5652;

    public TransactionalEntity_setUpdatedBy_212086905912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5653 = new Long(1368340889161782793L);
        Integer term5693 = new Integer(-268815336);
        term5652 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term5707 = newInstance(Class.forName("java.time.Instant"));
        Object term5722 = newInstance(Class.forName("java.time.Instant"));
        setField(term5652, term5652.getClass(), "id", term5653);
        setField(term5652, term5652.getClass(), "referenceId", "7993c6cf-ff68-4382-9736-ea1db7de88b7");
        setField(term5652, term5652.getClass(), "version", term5693);
        setField(term5652, term5652.getClass(), "createdBy", "WVRMUmrljA");
        setLongField(term5707, term5707.getClass(), "seconds", 1713532939L);
        setIntField(term5707, term5707.getClass(), "nanos", 227000000);
        setField(term5652, term5652.getClass(), "createdAt", term5707);
        setField(term5652, term5652.getClass(), "updatedBy", "NTlKJDDWlk");
        setLongField(term5722, term5722.getClass(), "seconds", 1263138252L);
        setIntField(term5722, term5722.getClass(), "nanos", 859000000);
        setField(term5652, term5652.getClass(), "updatedAt", term5722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vOuMEpOQAg";
        callMethod(klass, "setUpdatedBy", argTypes, term5652, args);
    }

};


