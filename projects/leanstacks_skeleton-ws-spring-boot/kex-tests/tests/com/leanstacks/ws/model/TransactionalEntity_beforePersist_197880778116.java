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

public class TransactionalEntity_beforePersist_197880778116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9826;

    public TransactionalEntity_beforePersist_197880778116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9827 = new Long(1084801489398441516L);
        Integer term9867 = new Integer(-893623680);
        term9826 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term9881 = newInstance(Class.forName("java.time.Instant"));
        Object term9896 = newInstance(Class.forName("java.time.Instant"));
        setField(term9826, term9826.getClass(), "id", term9827);
        setField(term9826, term9826.getClass(), "referenceId", "5702648d-0de7-4d3e-9137-5d477d92ae1d");
        setField(term9826, term9826.getClass(), "version", term9867);
        setField(term9826, term9826.getClass(), "createdBy", "fzeqPnzpnt");
        setLongField(term9881, term9881.getClass(), "seconds", 1643824174L);
        setIntField(term9881, term9881.getClass(), "nanos", 710000000);
        setField(term9826, term9826.getClass(), "createdAt", term9881);
        setField(term9826, term9826.getClass(), "updatedBy", "RxbhrFBjkO");
        setLongField(term9896, term9896.getClass(), "seconds", 1589287310L);
        setIntField(term9896, term9896.getClass(), "nanos", 419000000);
        setField(term9826, term9826.getClass(), "updatedAt", term9896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beforePersist", argTypes, term9826, args);
    }

};


