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

public class Account_setEnabled_2519320489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2354;
     Object term2476;

    public Account_setEnabled_2519320489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2384 = new HashMap();
        Set<Object> term2498 =  ((Map) term2384).keySet();
        HashSet term2383 = new HashSet((Collection<? extends Object>) term2498);
        Long term2404 = new Long(-2644215923136513282L);
        Integer term2444 = new Integer(-1048298087);
        term2354 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term2458 = newInstance(Class.forName("java.time.Instant"));
        Object term2473 = newInstance(Class.forName("java.time.Instant"));
        setField(term2354, term2354.getClass(), "username", "eVpkWxjuki");
        setField(term2354, term2354.getClass(), "password", "SJiQaLvSKv");
        setBooleanField(term2354, term2354.getClass(), "enabled", true);
        setBooleanField(term2354, term2354.getClass(), "credentialsexpired", false);
        setBooleanField(term2354, term2354.getClass(), "expired", true);
        setBooleanField(term2354, term2354.getClass(), "locked", true);
        setField(term2354, term2354.getClass(), "roles", term2383);
        setField(term2354, term2354.getClass(), "id", term2404);
        setField(term2354, term2354.getClass(), "referenceId", "db6e2c56-b303-4846-ad42-b6a20df3fe1b");
        setField(term2354, term2354.getClass(), "version", term2444);
        setField(term2354, term2354.getClass(), "createdBy", "OJJtVNPyKZ");
        setLongField(term2458, term2458.getClass(), "seconds", 1623687334L);
        setIntField(term2458, term2458.getClass(), "nanos", 907000000);
        setField(term2354, term2354.getClass(), "createdAt", term2458);
        setField(term2354, term2354.getClass(), "updatedBy", "AKNapTAfmD");
        setLongField(term2473, term2473.getClass(), "seconds", 1597517553L);
        setIntField(term2473, term2473.getClass(), "nanos", 85000000);
        setField(term2354, term2354.getClass(), "updatedAt", term2473);
        term2476 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2476;
        callMethod(klass, "setEnabled", argTypes, term2354, args);
    }

};


