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

public class Greeting_getText_9336737652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4622;

    public Greeting_getText_9336737652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4635 = new Long(2120084523938730454L);
        Integer term4675 = new Integer(-2068769794);
        term4622 = newInstance(Class.forName("com.leanstacks.ws.model.Greeting"));
        Object term4689 = newInstance(Class.forName("java.time.Instant"));
        Object term4704 = newInstance(Class.forName("java.time.Instant"));
        setField(term4622, term4622.getClass(), "text", "RYdKCNNMBR");
        setField(term4622, term4622.getClass(), "id", term4635);
        setField(term4622, term4622.getClass(), "referenceId", "d0e079ed-5d23-4685-8ffd-4a51d9ca9570");
        setField(term4622, term4622.getClass(), "version", term4675);
        setField(term4622, term4622.getClass(), "createdBy", "yGtHPyvYiQ");
        setLongField(term4689, term4689.getClass(), "seconds", 1466008719L);
        setIntField(term4689, term4689.getClass(), "nanos", 289000000);
        setField(term4622, term4622.getClass(), "createdAt", term4689);
        setField(term4622, term4622.getClass(), "updatedBy", "MvRIxilFMJ");
        setLongField(term4704, term4704.getClass(), "seconds", 1535838449L);
        setIntField(term4704, term4704.getClass(), "nanos", 65000000);
        setField(term4622, term4622.getClass(), "updatedAt", term4704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Greeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term4622, args);
    }

};


