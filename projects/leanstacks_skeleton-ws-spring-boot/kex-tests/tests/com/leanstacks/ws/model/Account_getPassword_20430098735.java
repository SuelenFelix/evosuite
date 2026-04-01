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
     Object term1757;

    public Account_getPassword_20430098735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1787 = new HashMap();
        Set<Object> term1893 =  ((Map) term1787).keySet();
        HashSet term1786 = new HashSet((Collection<? extends Object>) term1893);
        Long term1801 = new Long(1439298019805881866L);
        Integer term1841 = new Integer(-469968304);
        term1757 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term1855 = newInstance(Class.forName("java.time.Instant"));
        Object term1870 = newInstance(Class.forName("java.time.Instant"));
        setField(term1757, term1757.getClass(), "username", "wGmYcqUkgE");
        setField(term1757, term1757.getClass(), "password", "idgaQsnJpQ");
        setBooleanField(term1757, term1757.getClass(), "enabled", true);
        setBooleanField(term1757, term1757.getClass(), "credentialsexpired", true);
        setBooleanField(term1757, term1757.getClass(), "expired", true);
        setBooleanField(term1757, term1757.getClass(), "locked", false);
        setField(term1757, term1757.getClass(), "roles", term1786);
        setField(term1757, term1757.getClass(), "id", term1801);
        setField(term1757, term1757.getClass(), "referenceId", "a1e433f5-a1ab-4e94-8fe2-ef1ad7827ad2");
        setField(term1757, term1757.getClass(), "version", term1841);
        setField(term1757, term1757.getClass(), "createdBy", "jSpAteRute");
        setLongField(term1855, term1855.getClass(), "seconds", 1511283614L);
        setIntField(term1855, term1855.getClass(), "nanos", 327000000);
        setField(term1757, term1757.getClass(), "createdAt", term1855);
        setField(term1757, term1757.getClass(), "updatedBy", "swZVeJAxjt");
        setLongField(term1870, term1870.getClass(), "seconds", 1758773264L);
        setIntField(term1870, term1870.getClass(), "nanos", 597000000);
        setField(term1757, term1757.getClass(), "updatedAt", term1870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term1757, args);
    }

};


