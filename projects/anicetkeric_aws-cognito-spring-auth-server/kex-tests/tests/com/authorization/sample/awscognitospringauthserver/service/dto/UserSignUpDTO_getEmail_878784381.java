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

public class UserSignUpDTO_getEmail_878784381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public UserSignUpDTO_getEmail_878784381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term75 = new HashMap();
        Set<Object> term149 =  ((Map) term75).keySet();
        HashSet term74 = new HashSet((Collection<? extends Object>) term149);
        term1 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO"));
        setField(term1, term1.getClass(), "email", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "password", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "name", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "nationality", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "lastname", "jJCZpVmanW");
        setField(term1, term1.getClass(), "phoneNumber", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "roles", term74);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term1, args);
    }

};


