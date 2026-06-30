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

public class UserSignUpDTO_getNationality_15723398464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446;

    public UserSignUpDTO_getNationality_15723398464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term520 = new HashMap();
        Set<Object> term592 =  ((Map) term520).keySet();
        HashSet term519 = new HashSet((Collection<? extends Object>) term592);
        term446 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO"));
        setField(term446, term446.getClass(), "email", "OWDIEULEFu");
        setField(term446, term446.getClass(), "password", "dWRymuLBtr");
        setField(term446, term446.getClass(), "name", "AijpHYOFuy");
        setField(term446, term446.getClass(), "nationality", "SbAoxhfrkn");
        setField(term446, term446.getClass(), "lastname", "kuTXqwMtDB");
        setField(term446, term446.getClass(), "phoneNumber", "Ghbwtircqb");
        setField(term446, term446.getClass(), "roles", term519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNationality", argTypes, term446, args);
    }

};


