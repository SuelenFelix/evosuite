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

public class Account_setRoles_123363311017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7666;
     Object term7786;

    public Account_setRoles_123363311017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7696 = new HashMap();
        Set<Object> term7812 =  ((Map) term7696).keySet();
        HashSet term7695 = new HashSet((Collection<? extends Object>) term7812);
        Long term7714 = new Long(7276637106827860087L);
        Integer term7754 = new Integer(-1347665717);
        term7666 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term7768 = newInstance(Class.forName("java.time.Instant"));
        Object term7783 = newInstance(Class.forName("java.time.Instant"));
        setField(term7666, term7666.getClass(), "username", "urCiQnUFBM");
        setField(term7666, term7666.getClass(), "password", "EKjQdtKxAM");
        setBooleanField(term7666, term7666.getClass(), "enabled", true);
        setBooleanField(term7666, term7666.getClass(), "credentialsexpired", false);
        setBooleanField(term7666, term7666.getClass(), "expired", true);
        setBooleanField(term7666, term7666.getClass(), "locked", true);
        setField(term7666, term7666.getClass(), "roles", term7695);
        setField(term7666, term7666.getClass(), "id", term7714);
        setField(term7666, term7666.getClass(), "referenceId", "d2f684fe-5839-4c7e-b8c7-71c4f5ae467f");
        setField(term7666, term7666.getClass(), "version", term7754);
        setField(term7666, term7666.getClass(), "createdBy", "PsqusYmejD");
        setLongField(term7768, term7768.getClass(), "seconds", 1379465144L);
        setIntField(term7768, term7768.getClass(), "nanos", 272000000);
        setField(term7666, term7666.getClass(), "createdAt", term7768);
        setField(term7666, term7666.getClass(), "updatedBy", "NTWMiBEaDF");
        setLongField(term7783, term7783.getClass(), "seconds", 1873152234L);
        setIntField(term7783, term7783.getClass(), "nanos", 138000000);
        setField(term7666, term7666.getClass(), "updatedAt", term7783);
        HashMap term7787 = new HashMap();
        Set<Object> term7869 =  ((Map) term7787).keySet();
        term7786 = new HashSet((Collection<? extends Object>) term7869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term7786;
        callMethod(klass, "setRoles", argTypes, term7666, args);
    }

};


