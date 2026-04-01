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

public class Account_isCredentialsexpired_5893322709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6316;

    public Account_isCredentialsexpired_5893322709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6346 = new HashMap();
        Set<Object> term6446 =  ((Map) term6346).keySet();
        HashSet term6345 = new HashSet((Collection<? extends Object>) term6446);
        Long term6354 = new Long(-5248475803419977214L);
        Integer term6394 = new Integer(-2095575670);
        term6316 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term6408 = newInstance(Class.forName("java.time.Instant"));
        Object term6423 = newInstance(Class.forName("java.time.Instant"));
        setField(term6316, term6316.getClass(), "username", "PCipZnmBOF");
        setField(term6316, term6316.getClass(), "password", "zcorEihhLK");
        setBooleanField(term6316, term6316.getClass(), "enabled", true);
        setBooleanField(term6316, term6316.getClass(), "credentialsexpired", true);
        setBooleanField(term6316, term6316.getClass(), "expired", true);
        setBooleanField(term6316, term6316.getClass(), "locked", true);
        setField(term6316, term6316.getClass(), "roles", term6345);
        setField(term6316, term6316.getClass(), "id", term6354);
        setField(term6316, term6316.getClass(), "referenceId", "9cfdb535-9fdc-4154-9294-67c2616b320a");
        setField(term6316, term6316.getClass(), "version", term6394);
        setField(term6316, term6316.getClass(), "createdBy", "SFqCrhEWLm");
        setLongField(term6408, term6408.getClass(), "seconds", 1697617324L);
        setIntField(term6408, term6408.getClass(), "nanos", 8000000);
        setField(term6316, term6316.getClass(), "createdAt", term6408);
        setField(term6316, term6316.getClass(), "updatedBy", "GZdcJyZntS");
        setLongField(term6423, term6423.getClass(), "seconds", 1684755976L);
        setIntField(term6423, term6423.getClass(), "nanos", 817000000);
        setField(term6316, term6316.getClass(), "updatedAt", term6423);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCredentialsexpired", argTypes, term6316, args);
    }

};


