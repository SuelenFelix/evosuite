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

public class Account_isEnabled_6165264787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2181;

    public Account_isEnabled_6165264787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2211 = new HashMap();
        Set<Object> term2308 =  ((Map) term2211).keySet();
        HashSet term2210 = new HashSet((Collection<? extends Object>) term2308);
        Long term2216 = new Long(4784595517102746672L);
        Integer term2256 = new Integer(1876565163);
        term2181 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term2270 = newInstance(Class.forName("java.time.Instant"));
        Object term2285 = newInstance(Class.forName("java.time.Instant"));
        setField(term2181, term2181.getClass(), "username", "xBsXSDjXYK");
        setField(term2181, term2181.getClass(), "password", "sEnIVFtZuQ");
        setBooleanField(term2181, term2181.getClass(), "enabled", true);
        setBooleanField(term2181, term2181.getClass(), "credentialsexpired", false);
        setBooleanField(term2181, term2181.getClass(), "expired", true);
        setBooleanField(term2181, term2181.getClass(), "locked", false);
        setField(term2181, term2181.getClass(), "roles", term2210);
        setField(term2181, term2181.getClass(), "id", term2216);
        setField(term2181, term2181.getClass(), "referenceId", "540f5df0-219f-43c5-bbb3-1c6fcf703cfc");
        setField(term2181, term2181.getClass(), "version", term2256);
        setField(term2181, term2181.getClass(), "createdBy", "ZVecLZMLHF");
        setLongField(term2270, term2270.getClass(), "seconds", 1546769987L);
        setIntField(term2270, term2270.getClass(), "nanos", 439000000);
        setField(term2181, term2181.getClass(), "createdAt", term2270);
        setField(term2181, term2181.getClass(), "updatedBy", "fztQhjqwdP");
        setLongField(term2285, term2285.getClass(), "seconds", 1851896886L);
        setIntField(term2285, term2285.getClass(), "nanos", 282000000);
        setField(term2181, term2181.getClass(), "updatedAt", term2285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnabled", argTypes, term2181, args);
    }

};


