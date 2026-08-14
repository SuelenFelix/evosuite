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

public class Account_setRoles_123363311016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3913;
     Object term4020;

    public Account_setRoles_123363311016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3943 = new HashMap();
        Set<Object> term4046 =  ((Map) term3943).keySet();
        HashSet term3942 = new HashSet((Collection<? extends Object>) term4046);
        Long term3948 = new Long(5836128569274066678L);
        Integer term3988 = new Integer(-1845499264);
        term3913 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term4002 = newInstance(Class.forName("java.time.Instant"));
        Object term4017 = newInstance(Class.forName("java.time.Instant"));
        setField(term3913, term3913.getClass(), "username", "CFyoseFGLF");
        setField(term3913, term3913.getClass(), "password", "SFqCrhEWLm");
        setBooleanField(term3913, term3913.getClass(), "enabled", true);
        setBooleanField(term3913, term3913.getClass(), "credentialsexpired", true);
        setBooleanField(term3913, term3913.getClass(), "expired", false);
        setBooleanField(term3913, term3913.getClass(), "locked", true);
        setField(term3913, term3913.getClass(), "roles", term3942);
        setField(term3913, term3913.getClass(), "id", term3948);
        setField(term3913, term3913.getClass(), "referenceId", "1451fa2b-5c3a-482b-8c84-661c6284984e");
        setField(term3913, term3913.getClass(), "version", term3988);
        setField(term3913, term3913.getClass(), "createdBy", "GZdcJyZntS");
        setLongField(term4002, term4002.getClass(), "seconds", 1293737598L);
        setIntField(term4002, term4002.getClass(), "nanos", 443000000);
        setField(term3913, term3913.getClass(), "createdAt", term4002);
        setField(term3913, term3913.getClass(), "updatedBy", "OIHoJeysUi");
        setLongField(term4017, term4017.getClass(), "seconds", 1818617156L);
        setIntField(term4017, term4017.getClass(), "nanos", 349000000);
        setField(term3913, term3913.getClass(), "updatedAt", term4017);
        HashMap term4021 = new HashMap();
        Set<Object> term4103 =  ((Map) term4021).keySet();
        term4020 = new HashSet((Collection<? extends Object>) term4103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term4020;
        callMethod(klass, "setRoles", argTypes, term3913, args);
    }

};


