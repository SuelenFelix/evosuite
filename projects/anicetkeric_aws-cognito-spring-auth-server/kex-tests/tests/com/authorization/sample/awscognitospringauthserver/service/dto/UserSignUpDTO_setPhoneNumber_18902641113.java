package com.authorization.sample.awscognitospringauthserver.service.dto;

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
import static com.authorization.sample.awscognitospringauthserver.service.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UserSignUpDTO_setPhoneNumber_18902641113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1893;

    public UserSignUpDTO_setPhoneNumber_18902641113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1967 = new HashMap();
        Set<Object> term2055 =  ((Map) term1967).keySet();
        HashSet term1966 = new HashSet((Collection<? extends Object>) term2055);
        term1893 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO"));
        setField(term1893, term1893.getClass(), "email", "mLUZFTfjle");
        setField(term1893, term1893.getClass(), "password", "xIeFjkHkOe");
        setField(term1893, term1893.getClass(), "name", "SdCKLMIYnX");
        setField(term1893, term1893.getClass(), "nationality", "OJJtVNPyKZ");
        setField(term1893, term1893.getClass(), "lastname", "AKNapTAfmD");
        setField(term1893, term1893.getClass(), "phoneNumber", "xJgPlLxpgC");
        setField(term1893, term1893.getClass(), "roles", term1966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PznxWXsZME";
        callMethod(klass, "setPhoneNumber", argTypes, term1893, args);
    }

};


