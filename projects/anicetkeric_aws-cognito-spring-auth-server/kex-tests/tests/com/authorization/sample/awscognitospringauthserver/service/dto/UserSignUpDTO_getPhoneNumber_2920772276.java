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

public class UserSignUpDTO_getPhoneNumber_2920772276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term736;

    public UserSignUpDTO_getPhoneNumber_2920772276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term810 = new HashMap();
        Set<Object> term888 =  ((Map) term810).keySet();
        HashSet term809 = new HashSet((Collection<? extends Object>) term888);
        term736 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO"));
        setField(term736, term736.getClass(), "email", "LvtrsXUliU");
        setField(term736, term736.getClass(), "password", "xLbjWUgOIL");
        setField(term736, term736.getClass(), "name", "jDtqGUpnZN");
        setField(term736, term736.getClass(), "nationality", "nGKItKLYNC");
        setField(term736, term736.getClass(), "lastname", "UiUYnPrcCi");
        setField(term736, term736.getClass(), "phoneNumber", "UoYtihxVaS");
        setField(term736, term736.getClass(), "roles", term809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhoneNumber", argTypes, term736, args);
    }

};


