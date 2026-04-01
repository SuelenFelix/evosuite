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
     Object term5638;

    public TransactionalEntity_setUpdatedBy_212086905912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5639 = new Long(1368340889161782793L);
        Integer term5679 = new Integer(-268815336);
        term5638 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term5693 = newInstance(Class.forName("java.time.Instant"));
        Object term5708 = newInstance(Class.forName("java.time.Instant"));
        setField(term5638, term5638.getClass(), "id", term5639);
        setField(term5638, term5638.getClass(), "referenceId", "e73cae73-3814-4f47-ba98-b03fea1f1dd8");
        setField(term5638, term5638.getClass(), "version", term5679);
        setField(term5638, term5638.getClass(), "createdBy", "WVRMUmrljA");
        setLongField(term5693, term5693.getClass(), "seconds", 1713532939L);
        setIntField(term5693, term5693.getClass(), "nanos", 227000000);
        setField(term5638, term5638.getClass(), "createdAt", term5693);
        setField(term5638, term5638.getClass(), "updatedBy", "NTlKJDDWlk");
        setLongField(term5708, term5708.getClass(), "seconds", 1263138252L);
        setIntField(term5708, term5708.getClass(), "nanos", 859000000);
        setField(term5638, term5638.getClass(), "updatedAt", term5708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vOuMEpOQAg";
        callMethod(klass, "setUpdatedBy", argTypes, term5638, args);
    }

};


