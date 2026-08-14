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

public class Account_isExpired_26530619811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2949;

    public Account_isExpired_26530619811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2979 = new HashMap();
        Set<Object> term3095 =  ((Map) term2979).keySet();
        HashSet term2978 = new HashSet((Collection<? extends Object>) term3095);
        Long term3003 = new Long(-7291743527973326814L);
        Integer term3043 = new Integer(1551099402);
        term2949 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term3057 = newInstance(Class.forName("java.time.Instant"));
        Object term3072 = newInstance(Class.forName("java.time.Instant"));
        setField(term2949, term2949.getClass(), "username", "HWkpTmtlrc");
        setField(term2949, term2949.getClass(), "password", "hMmaoREuCK");
        setBooleanField(term2949, term2949.getClass(), "enabled", true);
        setBooleanField(term2949, term2949.getClass(), "credentialsexpired", false);
        setBooleanField(term2949, term2949.getClass(), "expired", false);
        setBooleanField(term2949, term2949.getClass(), "locked", true);
        setField(term2949, term2949.getClass(), "roles", term2978);
        setField(term2949, term2949.getClass(), "id", term3003);
        setField(term2949, term2949.getClass(), "referenceId", "cb43de08-9b7e-448f-9cf0-a3ead96e0d54");
        setField(term2949, term2949.getClass(), "version", term3043);
        setField(term2949, term2949.getClass(), "createdBy", "jXzmYyrnnT");
        setLongField(term3057, term3057.getClass(), "seconds", 1291742269L);
        setIntField(term3057, term3057.getClass(), "nanos", 425000000);
        setField(term2949, term2949.getClass(), "createdAt", term3057);
        setField(term2949, term2949.getClass(), "updatedBy", "igCAtimmYB");
        setLongField(term3072, term3072.getClass(), "seconds", 1372844831L);
        setIntField(term3072, term3072.getClass(), "nanos", 512000000);
        setField(term2949, term2949.getClass(), "updatedAt", term3072);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isExpired", argTypes, term2949, args);
    }

};


