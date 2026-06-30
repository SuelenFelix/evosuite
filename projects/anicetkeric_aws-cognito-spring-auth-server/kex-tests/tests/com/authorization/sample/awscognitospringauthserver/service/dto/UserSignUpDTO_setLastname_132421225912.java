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

public class UserSignUpDTO_setLastname_132421225912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1720;

    public UserSignUpDTO_setLastname_132421225912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1794 = new HashMap();
        Set<Object> term1882 =  ((Map) term1794).keySet();
        HashSet term1793 = new HashSet((Collection<? extends Object>) term1882);
        term1720 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO"));
        setField(term1720, term1720.getClass(), "email", "MvRIxilFMJ");
        setField(term1720, term1720.getClass(), "password", "iNwOJRBEjp");
        setField(term1720, term1720.getClass(), "name", "XylxrMBraH");
        setField(term1720, term1720.getClass(), "nationality", "pORebkoRdD");
        setField(term1720, term1720.getClass(), "lastname", "mXGCWJDOqA");
        setField(term1720, term1720.getClass(), "phoneNumber", "dpNsDgfPso");
        setField(term1720, term1720.getClass(), "roles", term1793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDaAnsVTGV";
        callMethod(klass, "setLastname", argTypes, term1720, args);
    }

};


