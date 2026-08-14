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

public class Account_setCredentialsexpired_178059458810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2750;
     Object term2870;

    public Account_setCredentialsexpired_178059458810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2780 = new HashMap();
        Set<Object> term2892 =  ((Map) term2780).keySet();
        HashSet term2779 = new HashSet((Collection<? extends Object>) term2892);
        Long term2798 = new Long(-8658027316505137504L);
        Integer term2838 = new Integer(1324040357);
        term2750 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term2852 = newInstance(Class.forName("java.time.Instant"));
        Object term2867 = newInstance(Class.forName("java.time.Instant"));
        setField(term2750, term2750.getClass(), "username", "wfaXBpWAUH");
        setField(term2750, term2750.getClass(), "password", "VMeAzAHwZj");
        setBooleanField(term2750, term2750.getClass(), "enabled", true);
        setBooleanField(term2750, term2750.getClass(), "credentialsexpired", true);
        setBooleanField(term2750, term2750.getClass(), "expired", true);
        setBooleanField(term2750, term2750.getClass(), "locked", true);
        setField(term2750, term2750.getClass(), "roles", term2779);
        setField(term2750, term2750.getClass(), "id", term2798);
        setField(term2750, term2750.getClass(), "referenceId", "0a0d2203-655e-41df-8a4a-d25be197ff7b");
        setField(term2750, term2750.getClass(), "version", term2838);
        setField(term2750, term2750.getClass(), "createdBy", "HHmNoYxIGj");
        setLongField(term2852, term2852.getClass(), "seconds", 1379077835L);
        setIntField(term2852, term2852.getClass(), "nanos", 909000000);
        setField(term2750, term2750.getClass(), "createdAt", term2852);
        setField(term2750, term2750.getClass(), "updatedBy", "PtirvZmsGt");
        setLongField(term2867, term2867.getClass(), "seconds", 1491501240L);
        setIntField(term2867, term2867.getClass(), "nanos", 125000000);
        setField(term2750, term2750.getClass(), "updatedAt", term2867);
        term2870 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2870;
        callMethod(klass, "setCredentialsexpired", argTypes, term2750, args);
    }

};


