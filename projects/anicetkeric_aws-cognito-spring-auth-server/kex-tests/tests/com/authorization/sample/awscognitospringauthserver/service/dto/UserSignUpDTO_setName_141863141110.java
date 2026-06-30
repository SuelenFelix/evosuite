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

public class UserSignUpDTO_setName_141863141110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1382;

    public UserSignUpDTO_setName_141863141110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1456 = new HashMap();
        Set<Object> term1536 =  ((Map) term1456).keySet();
        HashSet term1455 = new HashSet((Collection<? extends Object>) term1536);
        term1382 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO"));
        setField(term1382, term1382.getClass(), "email", "jiKYgYHqIS");
        setField(term1382, term1382.getClass(), "password", "DfISiziTgG");
        setField(term1382, term1382.getClass(), "name", "XqgfKFvPSD");
        setField(term1382, term1382.getClass(), "nationality", "JiVRgTZvKc");
        setField(term1382, term1382.getClass(), "lastname", "XPKmummaqg");
        setField(term1382, term1382.getClass(), "phoneNumber", "BKLfkLiZTH");
        setField(term1382, term1382.getClass(), "roles", term1455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sEccwbJKYE";
        callMethod(klass, "setName", argTypes, term1382, args);
    }

};


