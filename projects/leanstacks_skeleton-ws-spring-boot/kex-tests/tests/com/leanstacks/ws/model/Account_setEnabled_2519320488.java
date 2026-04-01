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

public class Account_setEnabled_2519320488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6119;
     Object term6237;

    public Account_setEnabled_2519320488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6149 = new HashMap();
        Set<Object> term6259 =  ((Map) term6149).keySet();
        HashSet term6148 = new HashSet((Collection<? extends Object>) term6259);
        Long term6165 = new Long(305759998609888272L);
        Integer term6205 = new Integer(97029295);
        term6119 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term6219 = newInstance(Class.forName("java.time.Instant"));
        Object term6234 = newInstance(Class.forName("java.time.Instant"));
        setField(term6119, term6119.getClass(), "username", "HDaezxQfQR");
        setField(term6119, term6119.getClass(), "password", "iikZEapDlu");
        setBooleanField(term6119, term6119.getClass(), "enabled", true);
        setBooleanField(term6119, term6119.getClass(), "credentialsexpired", true);
        setBooleanField(term6119, term6119.getClass(), "expired", true);
        setBooleanField(term6119, term6119.getClass(), "locked", false);
        setField(term6119, term6119.getClass(), "roles", term6148);
        setField(term6119, term6119.getClass(), "id", term6165);
        setField(term6119, term6119.getClass(), "referenceId", "d6da4b22-4259-4d38-973f-d969071f9b65");
        setField(term6119, term6119.getClass(), "version", term6205);
        setField(term6119, term6119.getClass(), "createdBy", "NnpwZBUTvx");
        setLongField(term6219, term6219.getClass(), "seconds", 1379588514L);
        setIntField(term6219, term6219.getClass(), "nanos", 567000000);
        setField(term6119, term6119.getClass(), "createdAt", term6219);
        setField(term6119, term6119.getClass(), "updatedBy", "tlQSNgTkQX");
        setLongField(term6234, term6234.getClass(), "seconds", 1416359920L);
        setIntField(term6234, term6234.getClass(), "nanos", 111000000);
        setField(term6119, term6119.getClass(), "updatedAt", term6234);
        term6237 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6237;
        callMethod(klass, "setEnabled", argTypes, term6119, args);
    }

};


