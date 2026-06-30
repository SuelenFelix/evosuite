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

public class UserSignUpDTO_getLastname_13844125975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term593;

    public UserSignUpDTO_getLastname_13844125975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term667 = new HashMap();
        Set<Object> term735 =  ((Map) term667).keySet();
        HashSet term666 = new HashSet((Collection<? extends Object>) term735);
        term593 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO"));
        setField(term593, term593.getClass(), "email", "wSQxaModmm");
        setField(term593, term593.getClass(), "password", "UlajhuVLaP");
        setField(term593, term593.getClass(), "name", "gGSMzuGICf");
        setField(term593, term593.getClass(), "nationality", "hxCBltsObl");
        setField(term593, term593.getClass(), "lastname", "BndsHwAFMv");
        setField(term593, term593.getClass(), "phoneNumber", "GzFkzHGYFt");
        setField(term593, term593.getClass(), "roles", term666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastname", argTypes, term593, args);
    }

};


