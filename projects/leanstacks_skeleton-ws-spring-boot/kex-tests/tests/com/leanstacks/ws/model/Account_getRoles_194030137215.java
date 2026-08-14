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

public class Account_getRoles_194030137215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3726;

    public Account_getRoles_194030137215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3756 = new HashMap();
        Set<Object> term3856 =  ((Map) term3756).keySet();
        HashSet term3755 = new HashSet((Collection<? extends Object>) term3856);
        Long term3764 = new Long(6689117472719450333L);
        Integer term3804 = new Integer(-1772434990);
        term3726 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term3818 = newInstance(Class.forName("java.time.Instant"));
        Object term3833 = newInstance(Class.forName("java.time.Instant"));
        setField(term3726, term3726.getClass(), "username", "izPpKDErnQ");
        setField(term3726, term3726.getClass(), "password", "NnpwZBUTvx");
        setBooleanField(term3726, term3726.getClass(), "enabled", true);
        setBooleanField(term3726, term3726.getClass(), "credentialsexpired", false);
        setBooleanField(term3726, term3726.getClass(), "expired", false);
        setBooleanField(term3726, term3726.getClass(), "locked", true);
        setField(term3726, term3726.getClass(), "roles", term3755);
        setField(term3726, term3726.getClass(), "id", term3764);
        setField(term3726, term3726.getClass(), "referenceId", "08ad2ac8-e82d-418d-8383-23d10cbb0262");
        setField(term3726, term3726.getClass(), "version", term3804);
        setField(term3726, term3726.getClass(), "createdBy", "zcorEihhLK");
        setLongField(term3818, term3818.getClass(), "seconds", 1401543935L);
        setIntField(term3818, term3818.getClass(), "nanos", 23000000);
        setField(term3726, term3726.getClass(), "createdAt", term3818);
        setField(term3726, term3726.getClass(), "updatedBy", "GrqozDKFOk");
        setLongField(term3833, term3833.getClass(), "seconds", 1439706159L);
        setIntField(term3833, term3833.getClass(), "nanos", 917000000);
        setField(term3726, term3726.getClass(), "updatedAt", term3833);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term3726, args);
    }

};


