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

public class Account_getRoles_194030137216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7475;

    public Account_getRoles_194030137216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7505 = new HashMap();
        Set<Object> term7609 =  ((Map) term7505).keySet();
        HashSet term7504 = new HashSet((Collection<? extends Object>) term7609);
        Long term7517 = new Long(4949335493504695457L);
        Integer term7557 = new Integer(-505439934);
        term7475 = newInstance(Class.forName("com.leanstacks.ws.model.Account"));
        Object term7571 = newInstance(Class.forName("java.time.Instant"));
        Object term7586 = newInstance(Class.forName("java.time.Instant"));
        setField(term7475, term7475.getClass(), "username", "TweMFhxNdj");
        setField(term7475, term7475.getClass(), "password", "NBrvVzvQHe");
        setBooleanField(term7475, term7475.getClass(), "enabled", true);
        setBooleanField(term7475, term7475.getClass(), "credentialsexpired", false);
        setBooleanField(term7475, term7475.getClass(), "expired", true);
        setBooleanField(term7475, term7475.getClass(), "locked", true);
        setField(term7475, term7475.getClass(), "roles", term7504);
        setField(term7475, term7475.getClass(), "id", term7517);
        setField(term7475, term7475.getClass(), "referenceId", "df02d246-541c-4214-916e-4de368cdc231");
        setField(term7475, term7475.getClass(), "version", term7557);
        setField(term7475, term7475.getClass(), "createdBy", "oPxuZbkYio");
        setLongField(term7571, term7571.getClass(), "seconds", 1401543935L);
        setIntField(term7571, term7571.getClass(), "nanos", 23000000);
        setField(term7475, term7475.getClass(), "createdAt", term7571);
        setField(term7475, term7475.getClass(), "updatedBy", "vKitydDVnM");
        setLongField(term7586, term7586.getClass(), "seconds", 1439706159L);
        setIntField(term7586, term7586.getClass(), "nanos", 917000000);
        setField(term7475, term7475.getClass(), "updatedAt", term7586);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term7475, args);
    }

};


