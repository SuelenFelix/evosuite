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
import java.lang.Object;

public class AwsConfig_setRegion_12614865627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term927;

    public AwsConfig_setRegion_12614865627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term927 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.configuration.AwsConfig"));
        Object term964 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.configuration.AwsConfig$Cognito"));
        setField(term927, term927.getClass(), "accessKey", "UlajhuVLaP");
        setField(term927, term927.getClass(), "secretKey", "gGSMzuGICf");
        setField(term927, term927.getClass(), "region", "hxCBltsObl");
        setField(term964, term964.getClass(), "userPoolId", null);
        setField(term964, term964.getClass(), "appClientId", null);
        setField(term964, term964.getClass(), "appClientSecret", null);
        setField(term927, term927.getClass(), "cognito", term964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.configuration.AwsConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BndsHwAFMv";
        callMethod(klass, "setRegion", argTypes, term927, args);
    }

};


