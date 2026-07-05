package com.alkemy.ong.application.service.user;

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
import static com.alkemy.ong.application.service.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class LoginUserUseCaseService_login_18679731720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term947;
     Object term948;

    public LoginUserUseCaseService_login_18679731720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term947 = newInstance(Class.forName("com.alkemy.ong.application.service.user.LoginUserUseCaseService"));
        setField(term947, term947.getClass(), "userRepository", null);
        setField(term947, term947.getClass(), "authenticationManager", null);
        Long term949 = new Long(-2813493605142626659L);
        Long term1012 = new Long(-8885298608300233488L);
        term948 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term1011 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term948, term948.getClass(), "id", term949);
        setField(term948, term948.getClass(), "firstName", "UlajhuVLaP");
        setField(term948, term948.getClass(), "lastName", "gGSMzuGICf");
        setField(term948, term948.getClass(), "email", "hxCBltsObl");
        setField(term948, term948.getClass(), "password", "BndsHwAFMv");
        setField(term948, term948.getClass(), "imageUrl", "GzFkzHGYFt");
        setField(term1011, term1011.getClass(), "id", term1012);
        setField(term1011, term1011.getClass(), "name", "tShwQLRGNe");
        setField(term1011, term1011.getClass(), "description", "LvtrsXUliU");
        setField(term948, term948.getClass(), "role", term1011);
        setField(term948, term948.getClass(), "token", "xLbjWUgOIL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.user.LoginUserUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.User");
        Object[] args = new Object[1];
        args[0] = term948;
        callMethod(klass, "login", argTypes, term947, args);
    }

};


