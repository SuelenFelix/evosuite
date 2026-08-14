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

public class Account_isCredentialsexpired_5893322709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2566;

    public Account_isCredentialsexpired_5893322709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2596 = new HashMap();
        Set<Object> term2693 =  ((Map) term2596).keySet();
        HashSet term2595 = new HashSet((Collection<? extends Object>) term2693);
        Long term2601 = new Long(-1468719814009985452L);
        Integer term2641 = new Integer(292681826);
        term2566 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term2655 = newInstance(Class.forName("java.time.Instant"));
        Object term2670 = newInstance(Class.forName("java.time.Instant"));
        setField(term2566, term2566.getClass(), "username", "xJgPlLxpgC");
        setField(term2566, term2566.getClass(), "password", "EYtfuJaxiM");
        setBooleanField(term2566, term2566.getClass(), "enabled", true);
        setBooleanField(term2566, term2566.getClass(), "credentialsexpired", false);
        setBooleanField(term2566, term2566.getClass(), "expired", true);
        setBooleanField(term2566, term2566.getClass(), "locked", true);
        setField(term2566, term2566.getClass(), "roles", term2595);
        setField(term2566, term2566.getClass(), "id", term2601);
        setField(term2566, term2566.getClass(), "referenceId", "49ff690f-1b94-4ec1-acef-fe11185dbb8d");
        setField(term2566, term2566.getClass(), "version", term2641);
        setField(term2566, term2566.getClass(), "createdBy", "gCWtLVKVVe");
        setLongField(term2655, term2655.getClass(), "seconds", 1644421115L);
        setIntField(term2655, term2655.getClass(), "nanos", 303000000);
        setField(term2566, term2566.getClass(), "createdAt", term2655);
        setField(term2566, term2566.getClass(), "updatedBy", "fWKJoSoCwE");
        setLongField(term2670, term2670.getClass(), "seconds", 1840780783L);
        setIntField(term2670, term2670.getClass(), "nanos", 490000000);
        setField(term2566, term2566.getClass(), "updatedAt", term2670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCredentialsexpired", argTypes, term2566, args);
    }

};


