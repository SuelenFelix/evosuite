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

public class Account_setExpired_62990062813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6886;
     Object term7000;

    public Account_setExpired_62990062813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6916 = new HashMap();
        Set<Object> term7022 =  ((Map) term6916).keySet();
        HashSet term6915 = new HashSet((Collection<? extends Object>) term7022);
        Long term6928 = new Long(50358265865610362L);
        Integer term6968 = new Integer(1540719661);
        term6886 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term6982 = newInstance(Class.forName("java.time.Instant"));
        Object term6997 = newInstance(Class.forName("java.time.Instant"));
        setField(term6886, term6886.getClass(), "username", "XfRABIFVEp");
        setField(term6886, term6886.getClass(), "password", "MHGKyEnwKc");
        setBooleanField(term6886, term6886.getClass(), "enabled", true);
        setBooleanField(term6886, term6886.getClass(), "credentialsexpired", true);
        setBooleanField(term6886, term6886.getClass(), "expired", true);
        setBooleanField(term6886, term6886.getClass(), "locked", true);
        setField(term6886, term6886.getClass(), "roles", term6915);
        setField(term6886, term6886.getClass(), "id", term6928);
        setField(term6886, term6886.getClass(), "referenceId", "0cbf5d9d-6ad1-4e95-be67-ba8ff81044f4");
        setField(term6886, term6886.getClass(), "version", term6968);
        setField(term6886, term6886.getClass(), "createdBy", "PqtVXXZMqK");
        setLongField(term6982, term6982.getClass(), "seconds", 1554543387L);
        setIntField(term6982, term6982.getClass(), "nanos", 782000000);
        setField(term6886, term6886.getClass(), "createdAt", term6982);
        setField(term6886, term6886.getClass(), "updatedBy", "rYbtIDVdnd");
        setLongField(term6997, term6997.getClass(), "seconds", 1813469018L);
        setIntField(term6997, term6997.getClass(), "nanos", 389000000);
        setField(term6886, term6886.getClass(), "updatedAt", term6997);
        term7000 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7000;
        callMethod(klass, "setExpired", argTypes, term6886, args);
    }

};


