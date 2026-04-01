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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;

public class Account_setCredentialsexpired_178059458811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2739;
     Object term2861;

    public Account_setCredentialsexpired_178059458811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2769 = new HashMap();
        Set<Object> term2883 =  ((Map) term2769).keySet();
        HashSet term2768 = new HashSet((Collection<? extends Object>) term2883);
        Long term2789 = new Long(-8658027316505137504L);
        Integer term2829 = new Integer(1324040357);
        term2739 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term2843 = newInstance(Class.forName("java.time.Instant"));
        Object term2858 = newInstance(Class.forName("java.time.Instant"));
        setField(term2739, term2739.getClass(), "username", "wfaXBpWAUH");
        setField(term2739, term2739.getClass(), "password", "VMeAzAHwZj");
        setBooleanField(term2739, term2739.getClass(), "enabled", true);
        setBooleanField(term2739, term2739.getClass(), "credentialsexpired", true);
        setBooleanField(term2739, term2739.getClass(), "expired", true);
        setBooleanField(term2739, term2739.getClass(), "locked", true);
        setField(term2739, term2739.getClass(), "roles", term2768);
        setField(term2739, term2739.getClass(), "id", term2789);
        setField(term2739, term2739.getClass(), "referenceId", "c028fe10-d1ca-4c51-a96e-7d7cbcc7199f");
        setField(term2739, term2739.getClass(), "version", term2829);
        setField(term2739, term2739.getClass(), "createdBy", "HHmNoYxIGj");
        setLongField(term2843, term2843.getClass(), "seconds", 1379077835L);
        setIntField(term2843, term2843.getClass(), "nanos", 909000000);
        setField(term2739, term2739.getClass(), "createdAt", term2843);
        setField(term2739, term2739.getClass(), "updatedBy", "PtirvZmsGt");
        setLongField(term2858, term2858.getClass(), "seconds", 1491501240L);
        setIntField(term2858, term2858.getClass(), "nanos", 125000000);
        setField(term2739, term2739.getClass(), "updatedAt", term2858);
        term2861 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2861;
        callMethod(klass, "setCredentialsexpired", argTypes, term2739, args);
    }

};


