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

public class Account_setEnabled_2519320488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2365;
     Object term2487;

    public Account_setEnabled_2519320488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2395 = new HashMap();
        Set<Object> term2509 =  ((Map) term2395).keySet();
        HashSet term2394 = new HashSet((Collection<? extends Object>) term2509);
        Long term2415 = new Long(-2644215923136513282L);
        Integer term2455 = new Integer(-1048298087);
        term2365 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term2469 = newInstance(Class.forName("java.time.Instant"));
        Object term2484 = newInstance(Class.forName("java.time.Instant"));
        setField(term2365, term2365.getClass(), "username", "eVpkWxjuki");
        setField(term2365, term2365.getClass(), "password", "SJiQaLvSKv");
        setBooleanField(term2365, term2365.getClass(), "enabled", true);
        setBooleanField(term2365, term2365.getClass(), "credentialsexpired", false);
        setBooleanField(term2365, term2365.getClass(), "expired", true);
        setBooleanField(term2365, term2365.getClass(), "locked", true);
        setField(term2365, term2365.getClass(), "roles", term2394);
        setField(term2365, term2365.getClass(), "id", term2415);
        setField(term2365, term2365.getClass(), "referenceId", "35144441-3b1d-43c7-b5e5-bee703d34277");
        setField(term2365, term2365.getClass(), "version", term2455);
        setField(term2365, term2365.getClass(), "createdBy", "OJJtVNPyKZ");
        setLongField(term2469, term2469.getClass(), "seconds", 1623687334L);
        setIntField(term2469, term2469.getClass(), "nanos", 907000000);
        setField(term2365, term2365.getClass(), "createdAt", term2469);
        setField(term2365, term2365.getClass(), "updatedBy", "AKNapTAfmD");
        setLongField(term2484, term2484.getClass(), "seconds", 1597517553L);
        setIntField(term2484, term2484.getClass(), "nanos", 85000000);
        setField(term2365, term2365.getClass(), "updatedAt", term2484);
        term2487 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2487;
        callMethod(klass, "setEnabled", argTypes, term2365, args);
    }

};


