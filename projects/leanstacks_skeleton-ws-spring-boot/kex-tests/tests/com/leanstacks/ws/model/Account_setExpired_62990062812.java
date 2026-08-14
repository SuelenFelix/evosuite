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

public class Account_setExpired_62990062812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3152;
     Object term3266;

    public Account_setExpired_62990062812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3182 = new HashMap();
        Set<Object> term3288 =  ((Map) term3182).keySet();
        HashSet term3181 = new HashSet((Collection<? extends Object>) term3288);
        Long term3194 = new Long(50358265865610362L);
        Integer term3234 = new Integer(-478195677);
        term3152 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term3248 = newInstance(Class.forName("java.time.Instant"));
        Object term3263 = newInstance(Class.forName("java.time.Instant"));
        setField(term3152, term3152.getClass(), "username", "DyiXbeYIaN");
        setField(term3152, term3152.getClass(), "password", "VGizxZnyHX");
        setBooleanField(term3152, term3152.getClass(), "enabled", true);
        setBooleanField(term3152, term3152.getClass(), "credentialsexpired", true);
        setBooleanField(term3152, term3152.getClass(), "expired", true);
        setBooleanField(term3152, term3152.getClass(), "locked", true);
        setField(term3152, term3152.getClass(), "roles", term3181);
        setField(term3152, term3152.getClass(), "id", term3194);
        setField(term3152, term3152.getClass(), "referenceId", "7a523b68-1001-42a6-a073-ea88e0db1fcd");
        setField(term3152, term3152.getClass(), "version", term3234);
        setField(term3152, term3152.getClass(), "createdBy", "kNqaJKIATy");
        setLongField(term3248, term3248.getClass(), "seconds", 1619073156L);
        setIntField(term3248, term3248.getClass(), "nanos", 188000000);
        setField(term3152, term3152.getClass(), "createdAt", term3248);
        setField(term3152, term3152.getClass(), "updatedBy", "vKQukfbJUd");
        setLongField(term3263, term3263.getClass(), "seconds", 1275828301L);
        setIntField(term3263, term3263.getClass(), "nanos", 71000000);
        setField(term3152, term3152.getClass(), "updatedAt", term3263);
        term3266 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3266;
        callMethod(klass, "setExpired", argTypes, term3152, args);
    }

};


