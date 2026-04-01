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

public class Account_setLocked_155549062715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7272;
     Object term7396;

    public Account_setLocked_155549062715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7302 = new HashMap();
        Set<Object> term7418 =  ((Map) term7302).keySet();
        HashSet term7301 = new HashSet((Collection<? extends Object>) term7418);
        Long term7324 = new Long(3133860696238261492L);
        Integer term7364 = new Integer(1442160736);
        term7272 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term7378 = newInstance(Class.forName("java.time.Instant"));
        Object term7393 = newInstance(Class.forName("java.time.Instant"));
        setField(term7272, term7272.getClass(), "username", "CGOpQSZZwI");
        setField(term7272, term7272.getClass(), "password", "ypEdrstygY");
        setBooleanField(term7272, term7272.getClass(), "enabled", true);
        setBooleanField(term7272, term7272.getClass(), "credentialsexpired", true);
        setBooleanField(term7272, term7272.getClass(), "expired", true);
        setBooleanField(term7272, term7272.getClass(), "locked", false);
        setField(term7272, term7272.getClass(), "roles", term7301);
        setField(term7272, term7272.getClass(), "id", term7324);
        setField(term7272, term7272.getClass(), "referenceId", "bb507606-bbc2-4abc-ad56-713f18767025");
        setField(term7272, term7272.getClass(), "version", term7364);
        setField(term7272, term7272.getClass(), "createdBy", "OcfNzHYdki");
        setLongField(term7378, term7378.getClass(), "seconds", 1387754061L);
        setIntField(term7378, term7378.getClass(), "nanos", 454000000);
        setField(term7272, term7272.getClass(), "createdAt", term7378);
        setField(term7272, term7272.getClass(), "updatedBy", "uPuCVuZYOI");
        setLongField(term7393, term7393.getClass(), "seconds", 1368680124L);
        setIntField(term7393, term7393.getClass(), "nanos", 141000000);
        setField(term7272, term7272.getClass(), "updatedAt", term7393);
        term7396 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7396;
        callMethod(klass, "setLocked", argTypes, term7272, args);
    }

};


