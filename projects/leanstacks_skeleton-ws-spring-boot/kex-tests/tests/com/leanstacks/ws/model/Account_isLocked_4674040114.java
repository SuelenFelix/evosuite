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

public class Account_isLocked_4674040114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7079;

    public Account_isLocked_4674040114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7109 = new HashMap();
        Set<Object> term7215 =  ((Map) term7109).keySet();
        HashSet term7108 = new HashSet((Collection<? extends Object>) term7215);
        Long term7123 = new Long(-8652538484981166496L);
        Integer term7163 = new Integer(1063420942);
        term7079 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term7177 = newInstance(Class.forName("java.time.Instant"));
        Object term7192 = newInstance(Class.forName("java.time.Instant"));
        setField(term7079, term7079.getClass(), "username", "UKAReurpHG");
        setField(term7079, term7079.getClass(), "password", "WVRMUmrljA");
        setBooleanField(term7079, term7079.getClass(), "enabled", true);
        setBooleanField(term7079, term7079.getClass(), "credentialsexpired", false);
        setBooleanField(term7079, term7079.getClass(), "expired", true);
        setBooleanField(term7079, term7079.getClass(), "locked", true);
        setField(term7079, term7079.getClass(), "roles", term7108);
        setField(term7079, term7079.getClass(), "id", term7123);
        setField(term7079, term7079.getClass(), "referenceId", "4fdb662b-87db-4a0c-8f1e-a81a1d511e95");
        setField(term7079, term7079.getClass(), "version", term7163);
        setField(term7079, term7079.getClass(), "createdBy", "doQLHkjpNm");
        setLongField(term7177, term7177.getClass(), "seconds", 1335719982L);
        setIntField(term7177, term7177.getClass(), "nanos", 731000000);
        setField(term7079, term7079.getClass(), "createdAt", term7177);
        setField(term7079, term7079.getClass(), "updatedBy", "lCyLIcSuom");
        setLongField(term7192, term7192.getClass(), "seconds", 1337283931L);
        setIntField(term7192, term7192.getClass(), "nanos", 231000000);
        setField(term7079, term7079.getClass(), "updatedAt", term7192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLocked", argTypes, term7079, args);
    }

};


