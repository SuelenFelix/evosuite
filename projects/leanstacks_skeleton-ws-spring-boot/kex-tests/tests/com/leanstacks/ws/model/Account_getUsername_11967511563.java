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

public class Account_getUsername_11967511563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1354;

    public Account_getUsername_11967511563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1384 = new HashMap();
        Set<Object> term1494 =  ((Map) term1384).keySet();
        HashSet term1383 = new HashSet((Collection<? extends Object>) term1494);
        Long term1402 = new Long(-5892135042702373494L);
        Integer term1442 = new Integer(-1179120542);
        term1354 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term1456 = newInstance(Class.forName("java.time.Instant"));
        Object term1471 = newInstance(Class.forName("java.time.Instant"));
        setField(term1354, term1354.getClass(), "username", "UoYtihxVaS");
        setField(term1354, term1354.getClass(), "password", "JDswTTCZHV");
        setBooleanField(term1354, term1354.getClass(), "enabled", true);
        setBooleanField(term1354, term1354.getClass(), "credentialsexpired", false);
        setBooleanField(term1354, term1354.getClass(), "expired", false);
        setBooleanField(term1354, term1354.getClass(), "locked", false);
        setField(term1354, term1354.getClass(), "roles", term1383);
        setField(term1354, term1354.getClass(), "id", term1402);
        setField(term1354, term1354.getClass(), "referenceId", "1a2a7ac3-fe94-4957-9f4f-cd25a38d6595");
        setField(term1354, term1354.getClass(), "version", term1442);
        setField(term1354, term1354.getClass(), "createdBy", "JUmudUmaaV");
        setLongField(term1456, term1456.getClass(), "seconds", 1461996881L);
        setIntField(term1456, term1456.getClass(), "nanos", 310000000);
        setField(term1354, term1354.getClass(), "createdAt", term1456);
        setField(term1354, term1354.getClass(), "updatedBy", "KoyGrUJeJW");
        setLongField(term1471, term1471.getClass(), "seconds", 1818968525L);
        setIntField(term1471, term1471.getClass(), "nanos", 805000000);
        setField(term1354, term1354.getClass(), "updatedAt", term1471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term1354, args);
    }

};


