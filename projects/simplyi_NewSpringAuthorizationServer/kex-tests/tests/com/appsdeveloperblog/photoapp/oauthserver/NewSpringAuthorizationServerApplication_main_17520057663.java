package com.appsdeveloperblog.photoapp.oauthserver;

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
import static com.appsdeveloperblog.photoapp.oauthserver.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NewSpringAuthorizationServerApplication_main_17520057663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112;

    public NewSpringAuthorizationServerApplication_main_17520057663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112 = newInstance(Class.forName("com.appsdeveloperblog.photoapp.oauthserver.NewSpringAuthorizationServerApplication"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.appsdeveloperblog.photoapp.oauthserver.NewSpringAuthorizationServerApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "main", argTypes, term112, args);
    }

};


