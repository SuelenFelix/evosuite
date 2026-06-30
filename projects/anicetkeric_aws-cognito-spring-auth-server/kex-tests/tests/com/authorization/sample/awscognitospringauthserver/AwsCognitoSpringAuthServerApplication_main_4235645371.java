package com.authorization.sample.awscognitospringauthserver;

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
import static com.authorization.sample.awscognitospringauthserver.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AwsCognitoSpringAuthServerApplication_main_4235645371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32384;

    public AwsCognitoSpringAuthServerApplication_main_4235645371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32384 = (Object[]) newArray("java.lang.String", 7);
        setElement(term32384, 0, "bwlLFAfNWx");
        setElement(term32384, 1, "JWodNQzjjV");
        setElement(term32384, 2, "CAgxWjhxNf");
        setElement(term32384, 3, "goAoCMhKBu");
        setElement(term32384, 4, "BWxJSgKHRT");
        setElement(term32384, 5, "AGXoIndFnm");
        setElement(term32384, 6, "mwmFMNEzkK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.AwsCognitoSpringAuthServerApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term32384;
        callMethod(klass, "main", argTypes, null, args);
    }

};


