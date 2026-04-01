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

public class Account_isEnabled_6165264788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2170;

    public Account_isEnabled_6165264788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2200 = new HashMap();
        Set<Object> term2297 =  ((Map) term2200).keySet();
        HashSet term2199 = new HashSet((Collection<? extends Object>) term2297);
        Long term2205 = new Long(4784595517102746672L);
        Integer term2245 = new Integer(1876565163);
        term2170 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term2259 = newInstance(Class.forName("java.time.Instant"));
        Object term2274 = newInstance(Class.forName("java.time.Instant"));
        setField(term2170, term2170.getClass(), "username", "xBsXSDjXYK");
        setField(term2170, term2170.getClass(), "password", "sEnIVFtZuQ");
        setBooleanField(term2170, term2170.getClass(), "enabled", true);
        setBooleanField(term2170, term2170.getClass(), "credentialsexpired", false);
        setBooleanField(term2170, term2170.getClass(), "expired", true);
        setBooleanField(term2170, term2170.getClass(), "locked", false);
        setField(term2170, term2170.getClass(), "roles", term2199);
        setField(term2170, term2170.getClass(), "id", term2205);
        setField(term2170, term2170.getClass(), "referenceId", "7c255728-d99d-4b72-8570-dc62059bc000");
        setField(term2170, term2170.getClass(), "version", term2245);
        setField(term2170, term2170.getClass(), "createdBy", "ZVecLZMLHF");
        setLongField(term2259, term2259.getClass(), "seconds", 1546769987L);
        setIntField(term2259, term2259.getClass(), "nanos", 439000000);
        setField(term2170, term2170.getClass(), "createdAt", term2259);
        setField(term2170, term2170.getClass(), "updatedBy", "fztQhjqwdP");
        setLongField(term2274, term2274.getClass(), "seconds", 1851896886L);
        setIntField(term2274, term2274.getClass(), "nanos", 282000000);
        setField(term2170, term2170.getClass(), "updatedAt", term2274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnabled", argTypes, term2170, args);
    }

};


