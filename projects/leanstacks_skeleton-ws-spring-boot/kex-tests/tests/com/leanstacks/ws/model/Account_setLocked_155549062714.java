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

public class Account_setLocked_155549062714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3540;
     Object term3647;

    public Account_setLocked_155549062714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3570 = new HashMap();
        Set<Object> term3669 =  ((Map) term3570).keySet();
        HashSet term3569 = new HashSet((Collection<? extends Object>) term3669);
        Long term3575 = new Long(-8876856890348836498L);
        Integer term3615 = new Integer(1114000454);
        term3540 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term3629 = newInstance(Class.forName("java.time.Instant"));
        Object term3644 = newInstance(Class.forName("java.time.Instant"));
        setField(term3540, term3540.getClass(), "username", "RMsXuyzKJV");
        setField(term3540, term3540.getClass(), "password", "FwPbDZcHmB");
        setBooleanField(term3540, term3540.getClass(), "enabled", true);
        setBooleanField(term3540, term3540.getClass(), "credentialsexpired", true);
        setBooleanField(term3540, term3540.getClass(), "expired", true);
        setBooleanField(term3540, term3540.getClass(), "locked", true);
        setField(term3540, term3540.getClass(), "roles", term3569);
        setField(term3540, term3540.getClass(), "id", term3575);
        setField(term3540, term3540.getClass(), "referenceId", "02d23905-d040-41d5-9a08-b6c7af940aa5");
        setField(term3540, term3540.getClass(), "version", term3615);
        setField(term3540, term3540.getClass(), "createdBy", "hOncybyCAH");
        setLongField(term3629, term3629.getClass(), "seconds", 1732178131L);
        setIntField(term3629, term3629.getClass(), "nanos", 235000000);
        setField(term3540, term3540.getClass(), "createdAt", term3629);
        setField(term3540, term3540.getClass(), "updatedBy", "QduALnDSVo");
        setLongField(term3644, term3644.getClass(), "seconds", 1498615326L);
        setIntField(term3644, term3644.getClass(), "nanos", 814000000);
        setField(term3540, term3540.getClass(), "updatedAt", term3644);
        term3647 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3647;
        callMethod(klass, "setLocked", argTypes, term3540, args);
    }

};


