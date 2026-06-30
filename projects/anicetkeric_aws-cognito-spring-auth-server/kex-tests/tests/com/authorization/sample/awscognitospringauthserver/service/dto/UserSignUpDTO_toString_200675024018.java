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

public class UserSignUpDTO_toString_200675024018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2659;

    public UserSignUpDTO_toString_200675024018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2733 = new HashMap();
        Set<Object> term2809 =  ((Map) term2733).keySet();
        HashSet term2732 = new HashSet((Collection<? extends Object>) term2809);
        term2659 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO"));
        setField(term2659, term2659.getClass(), "email", "cudZvLMQon");
        setField(term2659, term2659.getClass(), "password", "lihXWlGDxk");
        setField(term2659, term2659.getClass(), "name", "JmcmxoGhIK");
        setField(term2659, term2659.getClass(), "nationality", "jXzmYyrnnT");
        setField(term2659, term2659.getClass(), "lastname", "igCAtimmYB");
        setField(term2659, term2659.getClass(), "phoneNumber", "DyiXbeYIaN");
        setField(term2659, term2659.getClass(), "roles", term2732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2659, args);
    }

};


