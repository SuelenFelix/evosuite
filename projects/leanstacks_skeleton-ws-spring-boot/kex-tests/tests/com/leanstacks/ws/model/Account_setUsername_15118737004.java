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
     Object term1551;

    public Account_setUsername_15118737004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1581 = new HashMap();
        Set<Object> term1690 =  ((Map) term1581).keySet();
        HashSet term1580 = new HashSet((Collection<? extends Object>) term1690);
        Long term1586 = new Long(5262507301787091109L);
        Integer term1626 = new Integer(-73683645);
        term1551 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term1640 = newInstance(Class.forName("java.time.Instant"));
        Object term1655 = newInstance(Class.forName("java.time.Instant"));
        setField(term1551, term1551.getClass(), "username", "HqBOwkVqjD");
        setField(term1551, term1551.getClass(), "password", "MAcUBcBckh");
        setBooleanField(term1551, term1551.getClass(), "enabled", true);
        setBooleanField(term1551, term1551.getClass(), "credentialsexpired", false);
        setBooleanField(term1551, term1551.getClass(), "expired", true);
        setBooleanField(term1551, term1551.getClass(), "locked", true);
        setField(term1551, term1551.getClass(), "roles", term1580);
        setField(term1551, term1551.getClass(), "id", term1586);
        setField(term1551, term1551.getClass(), "referenceId", "6b21b4ac-c9bb-41e6-8bd5-5c9f035fad7e");
        setField(term1551, term1551.getClass(), "version", term1626);
        setField(term1551, term1551.getClass(), "createdBy", "oVgzLbrsFr");
        setLongField(term1640, term1640.getClass(), "seconds", 1603905786L);
        setIntField(term1640, term1640.getClass(), "nanos", 801000000);
        setField(term1551, term1551.getClass(), "createdAt", term1640);
        setField(term1551, term1551.getClass(), "updatedBy", "vQVyKLdtaz");
        setLongField(term1655, term1655.getClass(), "seconds", 1369539267L);
        setIntField(term1655, term1655.getClass(), "nanos", 611000000);
        setField(term1551, term1551.getClass(), "updatedAt", term1655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OWKQODBLzb";
        callMethod(klass, "setUsername", argTypes, term1551, args);
    }

};


