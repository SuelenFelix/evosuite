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

public class Account_setPassword_4566674336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1950;

    public Account_setPassword_4566674336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1980 = new HashMap();
        Set<Object> term2098 =  ((Map) term1980).keySet();
        HashSet term1979 = new HashSet((Collection<? extends Object>) term2098);
        Long term1994 = new Long(-6645965768855543712L);
        Integer term2034 = new Integer(-157887805);
        term1950 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term2048 = newInstance(Class.forName("java.time.Instant"));
        Object term2063 = newInstance(Class.forName("java.time.Instant"));
        setField(term1950, term1950.getClass(), "username", "xOcJIiQQDu");
        setField(term1950, term1950.getClass(), "password", "GVizqqzXpy");
        setBooleanField(term1950, term1950.getClass(), "enabled", true);
        setBooleanField(term1950, term1950.getClass(), "credentialsexpired", true);
        setBooleanField(term1950, term1950.getClass(), "expired", false);
        setBooleanField(term1950, term1950.getClass(), "locked", true);
        setField(term1950, term1950.getClass(), "roles", term1979);
        setField(term1950, term1950.getClass(), "id", term1994);
        setField(term1950, term1950.getClass(), "referenceId", "3f554ad0-9e9c-4b37-ac6f-e6f54b95dac5");
        setField(term1950, term1950.getClass(), "version", term2034);
        setField(term1950, term1950.getClass(), "createdBy", "vjxIhXHxGR");
        setLongField(term2048, term2048.getClass(), "seconds", 1476970157L);
        setIntField(term2048, term2048.getClass(), "nanos", 231000000);
        setField(term1950, term1950.getClass(), "createdAt", term2048);
        setField(term1950, term1950.getClass(), "updatedBy", "QXzGXbEXMu");
        setLongField(term2063, term2063.getClass(), "seconds", 1386180897L);
        setIntField(term2063, term2063.getClass(), "nanos", 453000000);
        setField(term1950, term1950.getClass(), "updatedAt", term2063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qxSDVejjiY";
        callMethod(klass, "setPassword", argTypes, term1950, args);
    }

};


