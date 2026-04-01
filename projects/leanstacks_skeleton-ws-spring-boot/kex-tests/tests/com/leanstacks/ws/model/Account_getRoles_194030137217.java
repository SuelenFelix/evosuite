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

public class Account_getRoles_194030137217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3724;

    public Account_getRoles_194030137217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3754 = new HashMap();
        Set<Object> term3854 =  ((Map) term3754).keySet();
        HashSet term3753 = new HashSet((Collection<? extends Object>) term3854);
        Long term3762 = new Long(6689117472719450333L);
        Integer term3802 = new Integer(-1772434990);
        term3724 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term3816 = newInstance(Class.forName("java.time.Instant"));
        Object term3831 = newInstance(Class.forName("java.time.Instant"));
        setField(term3724, term3724.getClass(), "username", "izPpKDErnQ");
        setField(term3724, term3724.getClass(), "password", "NnpwZBUTvx");
        setBooleanField(term3724, term3724.getClass(), "enabled", true);
        setBooleanField(term3724, term3724.getClass(), "credentialsexpired", false);
        setBooleanField(term3724, term3724.getClass(), "expired", false);
        setBooleanField(term3724, term3724.getClass(), "locked", true);
        setField(term3724, term3724.getClass(), "roles", term3753);
        setField(term3724, term3724.getClass(), "id", term3762);
        setField(term3724, term3724.getClass(), "referenceId", "aaa06d61-9a29-4d5b-bee7-178a831b6dd9");
        setField(term3724, term3724.getClass(), "version", term3802);
        setField(term3724, term3724.getClass(), "createdBy", "zcorEihhLK");
        setLongField(term3816, term3816.getClass(), "seconds", 1401543935L);
        setIntField(term3816, term3816.getClass(), "nanos", 23000000);
        setField(term3724, term3724.getClass(), "createdAt", term3816);
        setField(term3724, term3724.getClass(), "updatedBy", "GrqozDKFOk");
        setLongField(term3831, term3831.getClass(), "seconds", 1439706159L);
        setIntField(term3831, term3831.getClass(), "nanos", 917000000);
        setField(term3724, term3724.getClass(), "updatedAt", term3831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term3724, args);
    }

};


