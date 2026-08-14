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

public class Greeting_setText_16414169633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1057;

    public Greeting_setText_16414169633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1070 = new Long(-316468845751588286L);
        Integer term1110 = new Integer(-1685132342);
        term1057 = newInstance(Class.forName("com.leanstacks.ws.model.Greeting"));
        Object term1124 = newInstance(Class.forName("java.time.Instant"));
        Object term1139 = newInstance(Class.forName("java.time.Instant"));
        setField(term1057, term1057.getClass(), "text", "kuTXqwMtDB");
        setField(term1057, term1057.getClass(), "id", term1070);
        setField(term1057, term1057.getClass(), "referenceId", "454472a1-65ae-4719-a10e-9880f649e1f2");
        setField(term1057, term1057.getClass(), "version", term1110);
        setField(term1057, term1057.getClass(), "createdBy", "Ghbwtircqb");
        setLongField(term1124, term1124.getClass(), "seconds", 1400691778L);
        setIntField(term1124, term1124.getClass(), "nanos", 698000000);
        setField(term1057, term1057.getClass(), "createdAt", term1124);
        setField(term1057, term1057.getClass(), "updatedBy", "xrwlQZdwCp");
        setLongField(term1139, term1139.getClass(), "seconds", 1741444563L);
        setIntField(term1139, term1139.getClass(), "nanos", 811000000);
        setField(term1057, term1057.getClass(), "updatedAt", term1139);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Greeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDCWpPLRkE";
        callMethod(klass, "setText", argTypes, term1057, args);
    }

};


