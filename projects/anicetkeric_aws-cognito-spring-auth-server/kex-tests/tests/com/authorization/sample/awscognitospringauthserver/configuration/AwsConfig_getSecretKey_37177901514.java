package com.authorization.sample.awscognitospringauthserver.configuration;

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
import static com.authorization.sample.awscognitospringauthserver.configuration.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AwsConfig_getSecretKey_37177901514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1292;

    public AwsConfig_getSecretKey_37177901514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1292 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.configuration.AwsConfig"));
        setField(term1292, term1292.getClass(), "accessKey", null);
        setField(term1292, term1292.getClass(), "secretKey", null);
        setField(term1292, term1292.getClass(), "region", null);
        setField(term1292, term1292.getClass(), "cognito", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.configuration.AwsConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSecretKey", argTypes, term1292, args);
    }

};


