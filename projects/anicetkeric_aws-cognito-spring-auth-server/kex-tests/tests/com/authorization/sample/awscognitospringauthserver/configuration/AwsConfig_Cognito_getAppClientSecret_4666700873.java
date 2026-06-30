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

public class AwsConfig_Cognito_getAppClientSecret_4666700873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;

    public AwsConfig_Cognito_getAppClientSecret_4666700873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.configuration.AwsConfig$Cognito"));
        setField(term135, term135.getClass(), "userPoolId", "SzjVpOQTyS");
        setField(term135, term135.getClass(), "appClientId", "MjGYSRKTNF");
        setField(term135, term135.getClass(), "appClientSecret", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.configuration.AwsConfig$Cognito");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAppClientSecret", argTypes, term135, args);
    }

};


