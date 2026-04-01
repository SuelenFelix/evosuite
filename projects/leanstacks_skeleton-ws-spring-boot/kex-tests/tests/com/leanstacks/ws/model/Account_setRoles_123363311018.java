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

public class Account_setRoles_123363311018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3911;
     Object term4018;

    public Account_setRoles_123363311018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3941 = new HashMap();
        Set<Object> term4044 =  ((Map) term3941).keySet();
        HashSet term3940 = new HashSet((Collection<? extends Object>) term4044);
        Long term3946 = new Long(5836128569274066678L);
        Integer term3986 = new Integer(-1845499264);
        term3911 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term4000 = newInstance(Class.forName("java.time.Instant"));
        Object term4015 = newInstance(Class.forName("java.time.Instant"));
        setField(term3911, term3911.getClass(), "username", "CFyoseFGLF");
        setField(term3911, term3911.getClass(), "password", "SFqCrhEWLm");
        setBooleanField(term3911, term3911.getClass(), "enabled", true);
        setBooleanField(term3911, term3911.getClass(), "credentialsexpired", true);
        setBooleanField(term3911, term3911.getClass(), "expired", false);
        setBooleanField(term3911, term3911.getClass(), "locked", true);
        setField(term3911, term3911.getClass(), "roles", term3940);
        setField(term3911, term3911.getClass(), "id", term3946);
        setField(term3911, term3911.getClass(), "referenceId", "97814c14-6aa6-449b-882a-de1cfc5335de");
        setField(term3911, term3911.getClass(), "version", term3986);
        setField(term3911, term3911.getClass(), "createdBy", "GZdcJyZntS");
        setLongField(term4000, term4000.getClass(), "seconds", 1293737598L);
        setIntField(term4000, term4000.getClass(), "nanos", 443000000);
        setField(term3911, term3911.getClass(), "createdAt", term4000);
        setField(term3911, term3911.getClass(), "updatedBy", "OIHoJeysUi");
        setLongField(term4015, term4015.getClass(), "seconds", 1818617156L);
        setIntField(term4015, term4015.getClass(), "nanos", 349000000);
        setField(term3911, term3911.getClass(), "updatedAt", term4015);
        HashMap term4019 = new HashMap();
        Set<Object> term4101 =  ((Map) term4019).keySet();
        term4018 = new HashSet((Collection<? extends Object>) term4101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term4018;
        callMethod(klass, "setRoles", argTypes, term3911, args);
    }

};


