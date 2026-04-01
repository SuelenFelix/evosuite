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

public class Account_isCredentialsexpired_58933227010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2555;

    public Account_isCredentialsexpired_58933227010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2585 = new HashMap();
        Set<Object> term2682 =  ((Map) term2585).keySet();
        HashSet term2584 = new HashSet((Collection<? extends Object>) term2682);
        Long term2590 = new Long(-1468719814009985452L);
        Integer term2630 = new Integer(292681826);
        term2555 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term2644 = newInstance(Class.forName("java.time.Instant"));
        Object term2659 = newInstance(Class.forName("java.time.Instant"));
        setField(term2555, term2555.getClass(), "username", "xJgPlLxpgC");
        setField(term2555, term2555.getClass(), "password", "EYtfuJaxiM");
        setBooleanField(term2555, term2555.getClass(), "enabled", true);
        setBooleanField(term2555, term2555.getClass(), "credentialsexpired", false);
        setBooleanField(term2555, term2555.getClass(), "expired", true);
        setBooleanField(term2555, term2555.getClass(), "locked", true);
        setField(term2555, term2555.getClass(), "roles", term2584);
        setField(term2555, term2555.getClass(), "id", term2590);
        setField(term2555, term2555.getClass(), "referenceId", "e8fcd20e-7d3e-431b-91d7-5b23a201c282");
        setField(term2555, term2555.getClass(), "version", term2630);
        setField(term2555, term2555.getClass(), "createdBy", "gCWtLVKVVe");
        setLongField(term2644, term2644.getClass(), "seconds", 1644421115L);
        setIntField(term2644, term2644.getClass(), "nanos", 303000000);
        setField(term2555, term2555.getClass(), "createdAt", term2644);
        setField(term2555, term2555.getClass(), "updatedBy", "fWKJoSoCwE");
        setLongField(term2659, term2659.getClass(), "seconds", 1840780783L);
        setIntField(term2659, term2659.getClass(), "nanos", 490000000);
        setField(term2555, term2555.getClass(), "updatedAt", term2659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCredentialsexpired", argTypes, term2555, args);
    }

};


