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

public class Account_setExpired_62990062814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3148;
     Object term3262;

    public Account_setExpired_62990062814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3178 = new HashMap();
        Set<Object> term3284 =  ((Map) term3178).keySet();
        HashSet term3177 = new HashSet((Collection<? extends Object>) term3284);
        Long term3190 = new Long(50358265865610362L);
        Integer term3230 = new Integer(-478195677);
        term3148 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term3244 = newInstance(Class.forName("java.time.Instant"));
        Object term3259 = newInstance(Class.forName("java.time.Instant"));
        setField(term3148, term3148.getClass(), "username", "DyiXbeYIaN");
        setField(term3148, term3148.getClass(), "password", "VGizxZnyHX");
        setBooleanField(term3148, term3148.getClass(), "enabled", true);
        setBooleanField(term3148, term3148.getClass(), "credentialsexpired", true);
        setBooleanField(term3148, term3148.getClass(), "expired", true);
        setBooleanField(term3148, term3148.getClass(), "locked", true);
        setField(term3148, term3148.getClass(), "roles", term3177);
        setField(term3148, term3148.getClass(), "id", term3190);
        setField(term3148, term3148.getClass(), "referenceId", "17b8f18d-5466-4bcf-86bb-ac626c9aea62");
        setField(term3148, term3148.getClass(), "version", term3230);
        setField(term3148, term3148.getClass(), "createdBy", "kNqaJKIATy");
        setLongField(term3244, term3244.getClass(), "seconds", 1619073156L);
        setIntField(term3244, term3244.getClass(), "nanos", 188000000);
        setField(term3148, term3148.getClass(), "createdAt", term3244);
        setField(term3148, term3148.getClass(), "updatedBy", "vKQukfbJUd");
        setLongField(term3259, term3259.getClass(), "seconds", 1275828301L);
        setIntField(term3259, term3259.getClass(), "nanos", 71000000);
        setField(term3148, term3148.getClass(), "updatedAt", term3259);
        term3262 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3262;
        callMethod(klass, "setExpired", argTypes, term3148, args);
    }

};


