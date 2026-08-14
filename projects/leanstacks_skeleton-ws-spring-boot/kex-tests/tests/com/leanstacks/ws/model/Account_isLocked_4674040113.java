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

public class Account_isLocked_4674040113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3345;

    public Account_isLocked_4674040113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3375 = new HashMap();
        Set<Object> term3483 =  ((Map) term3375).keySet();
        HashSet term3374 = new HashSet((Collection<? extends Object>) term3483);
        Long term3391 = new Long(2848819812340321742L);
        Integer term3431 = new Integer(1442160736);
        term3345 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term3445 = newInstance(Class.forName("java.time.Instant"));
        Object term3460 = newInstance(Class.forName("java.time.Instant"));
        setField(term3345, term3345.getClass(), "username", "lFRJFUMVbx");
        setField(term3345, term3345.getClass(), "password", "sZdUNdggUW");
        setBooleanField(term3345, term3345.getClass(), "enabled", true);
        setBooleanField(term3345, term3345.getClass(), "credentialsexpired", true);
        setBooleanField(term3345, term3345.getClass(), "expired", false);
        setBooleanField(term3345, term3345.getClass(), "locked", true);
        setField(term3345, term3345.getClass(), "roles", term3374);
        setField(term3345, term3345.getClass(), "id", term3391);
        setField(term3345, term3345.getClass(), "referenceId", "f6efa909-e802-4fe4-9bd8-f80704f60225");
        setField(term3345, term3345.getClass(), "version", term3431);
        setField(term3345, term3345.getClass(), "createdBy", "tlzpzIjMib");
        setLongField(term3445, term3445.getClass(), "seconds", 1418905725L);
        setIntField(term3445, term3445.getClass(), "nanos", 858000000);
        setField(term3345, term3345.getClass(), "createdAt", term3445);
        setField(term3345, term3345.getClass(), "updatedBy", "AZdLeSugwv");
        setLongField(term3460, term3460.getClass(), "seconds", 1837509436L);
        setIntField(term3460, term3460.getClass(), "nanos", 971000000);
        setField(term3345, term3345.getClass(), "updatedAt", term3460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLocked", argTypes, term3345, args);
    }

};


