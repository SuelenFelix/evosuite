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
     Object term1364;

    public Account_getUsername_11967511563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1394 = new HashMap();
        Set<Object> term1508 =  ((Map) term1394).keySet();
        HashSet term1393 = new HashSet((Collection<? extends Object>) term1508);
        Long term1416 = new Long(-5892135042702373494L);
        Integer term1456 = new Integer(-1179120542);
        term1364 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term1470 = newInstance(Class.forName("java.time.Instant"));
        Object term1485 = newInstance(Class.forName("java.time.Instant"));
        setField(term1364, term1364.getClass(), "username", "UoYtihxVaS");
        setField(term1364, term1364.getClass(), "password", "JDswTTCZHV");
        setBooleanField(term1364, term1364.getClass(), "enabled", true);
        setBooleanField(term1364, term1364.getClass(), "credentialsexpired", false);
        setBooleanField(term1364, term1364.getClass(), "expired", false);
        setBooleanField(term1364, term1364.getClass(), "locked", false);
        setField(term1364, term1364.getClass(), "roles", term1393);
        setField(term1364, term1364.getClass(), "id", term1416);
        setField(term1364, term1364.getClass(), "referenceId", "9ed39833-2640-4823-85e8-ea081c3c5586");
        setField(term1364, term1364.getClass(), "version", term1456);
        setField(term1364, term1364.getClass(), "createdBy", "JUmudUmaaV");
        setLongField(term1470, term1470.getClass(), "seconds", 1461996881L);
        setIntField(term1470, term1470.getClass(), "nanos", 310000000);
        setField(term1364, term1364.getClass(), "createdAt", term1470);
        setField(term1364, term1364.getClass(), "updatedBy", "KoyGrUJeJW");
        setLongField(term1485, term1485.getClass(), "seconds", 1818968525L);
        setIntField(term1485, term1485.getClass(), "nanos", 805000000);
        setField(term1364, term1364.getClass(), "updatedAt", term1485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term1364, args);
    }

};


