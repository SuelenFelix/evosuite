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

public class Account_isEnabled_6165264787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5930;

    public Account_isEnabled_6165264787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5960 = new HashMap();
        Set<Object> term6062 =  ((Map) term5960).keySet();
        HashSet term5959 = new HashSet((Collection<? extends Object>) term6062);
        Long term5970 = new Long(7994303628307559416L);
        Integer term6010 = new Integer(-1048298087);
        term5930 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term6024 = newInstance(Class.forName("java.time.Instant"));
        Object term6039 = newInstance(Class.forName("java.time.Instant"));
        setField(term5930, term5930.getClass(), "username", "sZdUNdggUW");
        setField(term5930, term5930.getClass(), "password", "OqbwYQfvAe");
        setBooleanField(term5930, term5930.getClass(), "enabled", true);
        setBooleanField(term5930, term5930.getClass(), "credentialsexpired", true);
        setBooleanField(term5930, term5930.getClass(), "expired", false);
        setBooleanField(term5930, term5930.getClass(), "locked", false);
        setField(term5930, term5930.getClass(), "roles", term5959);
        setField(term5930, term5930.getClass(), "id", term5970);
        setField(term5930, term5930.getClass(), "referenceId", "bad9eedb-8bd5-4365-adaa-b351044ff209");
        setField(term5930, term5930.getClass(), "version", term6010);
        setField(term5930, term5930.getClass(), "createdBy", "kGMQdqJYyB");
        setLongField(term6024, term6024.getClass(), "seconds", 1847834235L);
        setIntField(term6024, term6024.getClass(), "nanos", 18000000);
        setField(term5930, term5930.getClass(), "createdAt", term6024);
        setField(term5930, term5930.getClass(), "updatedBy", "XJJNClzHRf");
        setLongField(term6039, term6039.getClass(), "seconds", 1744270719L);
        setIntField(term6039, term6039.getClass(), "nanos", 416000000);
        setField(term5930, term5930.getClass(), "updatedAt", term6039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnabled", argTypes, term5930, args);
    }

};


