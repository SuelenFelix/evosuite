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

public class Account_setLocked_155549062716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3538;
     Object term3645;

    public Account_setLocked_155549062716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3568 = new HashMap();
        Set<Object> term3667 =  ((Map) term3568).keySet();
        HashSet term3567 = new HashSet((Collection<? extends Object>) term3667);
        Long term3573 = new Long(-8876856890348836498L);
        Integer term3613 = new Integer(1114000454);
        term3538 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term3627 = newInstance(Class.forName("java.time.Instant"));
        Object term3642 = newInstance(Class.forName("java.time.Instant"));
        setField(term3538, term3538.getClass(), "username", "RMsXuyzKJV");
        setField(term3538, term3538.getClass(), "password", "FwPbDZcHmB");
        setBooleanField(term3538, term3538.getClass(), "enabled", true);
        setBooleanField(term3538, term3538.getClass(), "credentialsexpired", true);
        setBooleanField(term3538, term3538.getClass(), "expired", true);
        setBooleanField(term3538, term3538.getClass(), "locked", true);
        setField(term3538, term3538.getClass(), "roles", term3567);
        setField(term3538, term3538.getClass(), "id", term3573);
        setField(term3538, term3538.getClass(), "referenceId", "201b76f2-1b62-4baa-8930-876109da04ec");
        setField(term3538, term3538.getClass(), "version", term3613);
        setField(term3538, term3538.getClass(), "createdBy", "hOncybyCAH");
        setLongField(term3627, term3627.getClass(), "seconds", 1732178131L);
        setIntField(term3627, term3627.getClass(), "nanos", 235000000);
        setField(term3538, term3538.getClass(), "createdAt", term3627);
        setField(term3538, term3538.getClass(), "updatedBy", "QduALnDSVo");
        setLongField(term3642, term3642.getClass(), "seconds", 1498615326L);
        setIntField(term3642, term3642.getClass(), "nanos", 814000000);
        setField(term3538, term3538.getClass(), "updatedAt", term3642);
        term3645 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3645;
        callMethod(klass, "setLocked", argTypes, term3538, args);
    }

};


