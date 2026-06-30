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

public class UserSignUpDTO_setNationality_146928903011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1547;

    public UserSignUpDTO_setNationality_146928903011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1621 = new HashMap();
        Set<Object> term1709 =  ((Map) term1621).keySet();
        HashSet term1620 = new HashSet((Collection<? extends Object>) term1709);
        term1547 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO"));
        setField(term1547, term1547.getClass(), "email", "AWRooQKkdW");
        setField(term1547, term1547.getClass(), "password", "vjxIhXHxGR");
        setField(term1547, term1547.getClass(), "name", "QXzGXbEXMu");
        setField(term1547, term1547.getClass(), "nationality", "qxSDVejjiY");
        setField(term1547, term1547.getClass(), "lastname", "xBsXSDjXYK");
        setField(term1547, term1547.getClass(), "phoneNumber", "sEnIVFtZuQ");
        setField(term1547, term1547.getClass(), "roles", term1620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yGtHPyvYiQ";
        callMethod(klass, "setNationality", argTypes, term1547, args);
    }

};


