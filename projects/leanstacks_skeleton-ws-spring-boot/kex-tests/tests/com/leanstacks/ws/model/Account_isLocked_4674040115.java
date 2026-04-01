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

public class Account_isLocked_4674040115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3341;

    public Account_isLocked_4674040115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3371 = new HashMap();
        Set<Object> term3481 =  ((Map) term3371).keySet();
        HashSet term3370 = new HashSet((Collection<? extends Object>) term3481);
        Long term3389 = new Long(2848819812340321742L);
        Integer term3429 = new Integer(1442160736);
        term3341 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term3443 = newInstance(Class.forName("java.time.Instant"));
        Object term3458 = newInstance(Class.forName("java.time.Instant"));
        setField(term3341, term3341.getClass(), "username", "lFRJFUMVbx");
        setField(term3341, term3341.getClass(), "password", "sZdUNdggUW");
        setBooleanField(term3341, term3341.getClass(), "enabled", true);
        setBooleanField(term3341, term3341.getClass(), "credentialsexpired", true);
        setBooleanField(term3341, term3341.getClass(), "expired", false);
        setBooleanField(term3341, term3341.getClass(), "locked", true);
        setField(term3341, term3341.getClass(), "roles", term3370);
        setField(term3341, term3341.getClass(), "id", term3389);
        setField(term3341, term3341.getClass(), "referenceId", "03c9fdf3-2b56-4daf-9ed3-b2399e56af29");
        setField(term3341, term3341.getClass(), "version", term3429);
        setField(term3341, term3341.getClass(), "createdBy", "tlzpzIjMib");
        setLongField(term3443, term3443.getClass(), "seconds", 1418905725L);
        setIntField(term3443, term3443.getClass(), "nanos", 858000000);
        setField(term3341, term3341.getClass(), "createdAt", term3443);
        setField(term3341, term3341.getClass(), "updatedBy", "AZdLeSugwv");
        setLongField(term3458, term3458.getClass(), "seconds", 1837509436L);
        setIntField(term3458, term3458.getClass(), "nanos", 971000000);
        setField(term3341, term3341.getClass(), "updatedAt", term3458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLocked", argTypes, term3341, args);
    }

};


