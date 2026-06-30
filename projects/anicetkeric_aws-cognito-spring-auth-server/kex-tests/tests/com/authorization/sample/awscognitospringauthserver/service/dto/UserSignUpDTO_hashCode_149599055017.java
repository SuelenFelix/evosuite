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

public class UserSignUpDTO_hashCode_149599055017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2516;

    public UserSignUpDTO_hashCode_149599055017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2590 = new HashMap();
        Set<Object> term2658 =  ((Map) term2590).keySet();
        HashSet term2589 = new HashSet((Collection<? extends Object>) term2658);
        term2516 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO"));
        setField(term2516, term2516.getClass(), "email", "OYbzXylRWW");
        setField(term2516, term2516.getClass(), "password", "DSNsTGYXDF");
        setField(term2516, term2516.getClass(), "name", "sQvGcVjdEx");
        setField(term2516, term2516.getClass(), "nationality", "rLHAoqXgPh");
        setField(term2516, term2516.getClass(), "lastname", "zUlRdimJtU");
        setField(term2516, term2516.getClass(), "phoneNumber", "vwbEQQNQrx");
        setField(term2516, term2516.getClass(), "roles", term2589);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2516, args);
    }

};


