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

public class Account_isExpired_26530619813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2947;

    public Account_isExpired_26530619813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2977 = new HashMap();
        Set<Object> term3091 =  ((Map) term2977).keySet();
        HashSet term2976 = new HashSet((Collection<? extends Object>) term3091);
        Long term2999 = new Long(-7291743527973326814L);
        Integer term3039 = new Integer(1551099402);
        term2947 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term3053 = newInstance(Class.forName("java.time.Instant"));
        Object term3068 = newInstance(Class.forName("java.time.Instant"));
        setField(term2947, term2947.getClass(), "username", "HWkpTmtlrc");
        setField(term2947, term2947.getClass(), "password", "hMmaoREuCK");
        setBooleanField(term2947, term2947.getClass(), "enabled", true);
        setBooleanField(term2947, term2947.getClass(), "credentialsexpired", false);
        setBooleanField(term2947, term2947.getClass(), "expired", false);
        setBooleanField(term2947, term2947.getClass(), "locked", true);
        setField(term2947, term2947.getClass(), "roles", term2976);
        setField(term2947, term2947.getClass(), "id", term2999);
        setField(term2947, term2947.getClass(), "referenceId", "e97a48f4-6cfe-4bbc-8cdf-6eacf2338350");
        setField(term2947, term2947.getClass(), "version", term3039);
        setField(term2947, term2947.getClass(), "createdBy", "jXzmYyrnnT");
        setLongField(term3053, term3053.getClass(), "seconds", 1291742269L);
        setIntField(term3053, term3053.getClass(), "nanos", 425000000);
        setField(term2947, term2947.getClass(), "createdAt", term3053);
        setField(term2947, term2947.getClass(), "updatedBy", "igCAtimmYB");
        setLongField(term3068, term3068.getClass(), "seconds", 1372844831L);
        setIntField(term3068, term3068.getClass(), "nanos", 512000000);
        setField(term2947, term2947.getClass(), "updatedAt", term3068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isExpired", argTypes, term2947, args);
    }

};


