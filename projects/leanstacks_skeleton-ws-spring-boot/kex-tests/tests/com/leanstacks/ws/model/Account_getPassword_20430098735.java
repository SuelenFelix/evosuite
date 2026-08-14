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

public class Account_getPassword_20430098735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1771;

    public Account_getPassword_20430098735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1801 = new HashMap();
        Set<Object> term1907 =  ((Map) term1801).keySet();
        HashSet term1800 = new HashSet((Collection<? extends Object>) term1907);
        Long term1815 = new Long(1439298019805881866L);
        Integer term1855 = new Integer(-469968304);
        term1771 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term1869 = newInstance(Class.forName("java.time.Instant"));
        Object term1884 = newInstance(Class.forName("java.time.Instant"));
        setField(term1771, term1771.getClass(), "username", "wGmYcqUkgE");
        setField(term1771, term1771.getClass(), "password", "idgaQsnJpQ");
        setBooleanField(term1771, term1771.getClass(), "enabled", true);
        setBooleanField(term1771, term1771.getClass(), "credentialsexpired", true);
        setBooleanField(term1771, term1771.getClass(), "expired", true);
        setBooleanField(term1771, term1771.getClass(), "locked", false);
        setField(term1771, term1771.getClass(), "roles", term1800);
        setField(term1771, term1771.getClass(), "id", term1815);
        setField(term1771, term1771.getClass(), "referenceId", "467f3cf9-3b34-4ae6-9702-50aaa21867d4");
        setField(term1771, term1771.getClass(), "version", term1855);
        setField(term1771, term1771.getClass(), "createdBy", "jSpAteRute");
        setLongField(term1869, term1869.getClass(), "seconds", 1511283614L);
        setIntField(term1869, term1869.getClass(), "nanos", 327000000);
        setField(term1771, term1771.getClass(), "createdAt", term1869);
        setField(term1771, term1771.getClass(), "updatedBy", "swZVeJAxjt");
        setLongField(term1884, term1884.getClass(), "seconds", 1758773264L);
        setIntField(term1884, term1884.getClass(), "nanos", 597000000);
        setField(term1771, term1771.getClass(), "updatedAt", term1884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term1771, args);
    }

};


