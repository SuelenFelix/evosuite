package com.leanstacks.ws.service;

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
import static com.leanstacks.ws.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class GreetingServiceBean_create_18600611702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462;

    public GreetingServiceBean_create_18600611702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term475 = new Long(5270370404989704783L);
        Integer term515 = new Integer(391863371);
        term462 = newInstance(Class.forName("com.leanstacks.ws.model.Greeting"));
        Object term529 = newInstance(Class.forName("java.time.Instant"));
        Object term544 = newInstance(Class.forName("java.time.Instant"));
        setField(term462, term462.getClass(), "text", "RMFIsYGgne");
        setField(term462, term462.getClass(), "id", term475);
        setField(term462, term462.getClass(), "referenceId", "fcce1cd9-f364-43ad-9f9d-98ab0cef77e1");
        setField(term462, term462.getClass(), "version", term515);
        setField(term462, term462.getClass(), "createdBy", "NRdvgJlhkX");
        setLongField(term529, term529.getClass(), "seconds", 1429023851L);
        setIntField(term529, term529.getClass(), "nanos", 389000000);
        setField(term462, term462.getClass(), "createdAt", term529);
        setField(term462, term462.getClass(), "updatedBy", "uuaPigETmJ");
        setLongField(term544, term544.getClass(), "seconds", 1495357463L);
        setIntField(term544, term544.getClass(), "nanos", 288000000);
        setField(term462, term462.getClass(), "updatedAt", term544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.service.GreetingServiceBean");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.leanstacks.ws.model.Greeting");
        Object[] args = new Object[1];
        args[0] = term462;
        callMethod(klass, "create", argTypes, null, args);
    }

};


