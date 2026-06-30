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

public class UserSignUpDTO_getPassword_15077366452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150;

    public UserSignUpDTO_getPassword_15077366452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term224 = new HashMap();
        Set<Object> term298 =  ((Map) term224).keySet();
        HashSet term223 = new HashSet((Collection<? extends Object>) term298);
        term150 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO"));
        setField(term150, term150.getClass(), "email", "uuaPigETmJ");
        setField(term150, term150.getClass(), "password", "MxlszYVzRf");
        setField(term150, term150.getClass(), "name", "LQFpaHEwXR");
        setField(term150, term150.getClass(), "nationality", "oVcInYnLWB");
        setField(term150, term150.getClass(), "lastname", "aJlieCFVtF");
        setField(term150, term150.getClass(), "phoneNumber", "ZiaGIbnzTs");
        setField(term150, term150.getClass(), "roles", term223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term150, args);
    }

};


