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
     Object term1964;

    public Account_setPassword_4566674336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1994 = new HashMap();
        Set<Object> term2114 =  ((Map) term1994).keySet();
        HashSet term1993 = new HashSet((Collection<? extends Object>) term2114);
        Long term2010 = new Long(-6645965768855543712L);
        Integer term2050 = new Integer(-157887805);
        term1964 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term2064 = newInstance(Class.forName("java.time.Instant"));
        Object term2079 = newInstance(Class.forName("java.time.Instant"));
        setField(term1964, term1964.getClass(), "username", "xOcJIiQQDu");
        setField(term1964, term1964.getClass(), "password", "GVizqqzXpy");
        setBooleanField(term1964, term1964.getClass(), "enabled", true);
        setBooleanField(term1964, term1964.getClass(), "credentialsexpired", true);
        setBooleanField(term1964, term1964.getClass(), "expired", false);
        setBooleanField(term1964, term1964.getClass(), "locked", true);
        setField(term1964, term1964.getClass(), "roles", term1993);
        setField(term1964, term1964.getClass(), "id", term2010);
        setField(term1964, term1964.getClass(), "referenceId", "ca5393d3-7fdd-4a96-af18-66d36222a089");
        setField(term1964, term1964.getClass(), "version", term2050);
        setField(term1964, term1964.getClass(), "createdBy", "vjxIhXHxGR");
        setLongField(term2064, term2064.getClass(), "seconds", 1476970157L);
        setIntField(term2064, term2064.getClass(), "nanos", 231000000);
        setField(term1964, term1964.getClass(), "createdAt", term2064);
        setField(term1964, term1964.getClass(), "updatedBy", "QXzGXbEXMu");
        setLongField(term2079, term2079.getClass(), "seconds", 1386180897L);
        setIntField(term2079, term2079.getClass(), "nanos", 453000000);
        setField(term1964, term1964.getClass(), "updatedAt", term2079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qxSDVejjiY";
        callMethod(klass, "setPassword", argTypes, term1964, args);
    }

};


