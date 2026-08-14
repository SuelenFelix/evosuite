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

public class Account_setUsername_15118737004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1565;

    public Account_setUsername_15118737004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1595 = new HashMap();
        Set<Object> term1704 =  ((Map) term1595).keySet();
        HashSet term1594 = new HashSet((Collection<? extends Object>) term1704);
        Long term1600 = new Long(5262507301787091109L);
        Integer term1640 = new Integer(-73683645);
        term1565 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term1654 = newInstance(Class.forName("java.time.Instant"));
        Object term1669 = newInstance(Class.forName("java.time.Instant"));
        setField(term1565, term1565.getClass(), "username", "HqBOwkVqjD");
        setField(term1565, term1565.getClass(), "password", "MAcUBcBckh");
        setBooleanField(term1565, term1565.getClass(), "enabled", true);
        setBooleanField(term1565, term1565.getClass(), "credentialsexpired", false);
        setBooleanField(term1565, term1565.getClass(), "expired", true);
        setBooleanField(term1565, term1565.getClass(), "locked", true);
        setField(term1565, term1565.getClass(), "roles", term1594);
        setField(term1565, term1565.getClass(), "id", term1600);
        setField(term1565, term1565.getClass(), "referenceId", "bf1b344d-9f6d-49ff-baab-20f10521635a");
        setField(term1565, term1565.getClass(), "version", term1640);
        setField(term1565, term1565.getClass(), "createdBy", "oVgzLbrsFr");
        setLongField(term1654, term1654.getClass(), "seconds", 1603905786L);
        setIntField(term1654, term1654.getClass(), "nanos", 801000000);
        setField(term1565, term1565.getClass(), "createdAt", term1654);
        setField(term1565, term1565.getClass(), "updatedBy", "vQVyKLdtaz");
        setLongField(term1669, term1669.getClass(), "seconds", 1369539267L);
        setIntField(term1669, term1669.getClass(), "nanos", 611000000);
        setField(term1565, term1565.getClass(), "updatedAt", term1669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OWKQODBLzb";
        callMethod(klass, "setUsername", argTypes, term1565, args);
    }

};


