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

public class Account_isExpired_26530619812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6697;

    public Account_isExpired_26530619812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6727 = new HashMap();
        Set<Object> term6829 =  ((Map) term6727).keySet();
        HashSet term6726 = new HashSet((Collection<? extends Object>) term6829);
        Long term6737 = new Long(-7291743527973326814L);
        Integer term6777 = new Integer(-112921587);
        term6697 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term6791 = newInstance(Class.forName("java.time.Instant"));
        Object term6806 = newInstance(Class.forName("java.time.Instant"));
        setField(term6697, term6697.getClass(), "username", "TwfWVQGiIj");
        setField(term6697, term6697.getClass(), "password", "gUvcueTURF");
        setBooleanField(term6697, term6697.getClass(), "enabled", true);
        setBooleanField(term6697, term6697.getClass(), "credentialsexpired", false);
        setBooleanField(term6697, term6697.getClass(), "expired", true);
        setBooleanField(term6697, term6697.getClass(), "locked", true);
        setField(term6697, term6697.getClass(), "roles", term6726);
        setField(term6697, term6697.getClass(), "id", term6737);
        setField(term6697, term6697.getClass(), "referenceId", "2071d5d4-87b9-4f28-8f47-794b8f6eaced");
        setField(term6697, term6697.getClass(), "version", term6777);
        setField(term6697, term6697.getClass(), "createdBy", "mfCpTPPQQm");
        setLongField(term6791, term6791.getClass(), "seconds", 1608545223L);
        setIntField(term6791, term6791.getClass(), "nanos", 416000000);
        setField(term6697, term6697.getClass(), "createdAt", term6791);
        setField(term6697, term6697.getClass(), "updatedBy", "OcJCIDNIXA");
        setLongField(term6806, term6806.getClass(), "seconds", 1878650382L);
        setIntField(term6806, term6806.getClass(), "nanos", 291000000);
        setField(term6697, term6697.getClass(), "updatedAt", term6806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isExpired", argTypes, term6697, args);
    }

};


