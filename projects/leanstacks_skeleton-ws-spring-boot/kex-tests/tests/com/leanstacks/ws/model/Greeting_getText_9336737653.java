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

public class Greeting_getText_9336737653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term906;

    public Greeting_getText_9336737653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term919 = new Long(-872011222785455006L);
        Integer term959 = new Integer(597278769);
        term906 = newInstance(Class.forName("com.leanstacks.ws.model.Greeting"));
        Object term973 = newInstance(Class.forName("java.time.Instant"));
        Object term988 = newInstance(Class.forName("java.time.Instant"));
        setField(term906, term906.getClass(), "text", "dWRymuLBtr");
        setField(term906, term906.getClass(), "id", term919);
        setField(term906, term906.getClass(), "referenceId", "6f772ef0-c2ab-4e20-94a9-20190b30c4b4");
        setField(term906, term906.getClass(), "version", term959);
        setField(term906, term906.getClass(), "createdBy", "AijpHYOFuy");
        setLongField(term973, term973.getClass(), "seconds", 1633004775L);
        setIntField(term973, term973.getClass(), "nanos", 487000000);
        setField(term906, term906.getClass(), "createdAt", term973);
        setField(term906, term906.getClass(), "updatedBy", "SbAoxhfrkn");
        setLongField(term988, term988.getClass(), "seconds", 1819191638L);
        setIntField(term988, term988.getClass(), "nanos", 549000000);
        setField(term906, term906.getClass(), "updatedAt", term988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Greeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term906, args);
    }

};


