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

public class AwsConfig_toString_19704805211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1223;

    public AwsConfig_toString_19704805211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1223 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.configuration.AwsConfig"));
        Object term1260 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.configuration.AwsConfig$Cognito"));
        setField(term1223, term1223.getClass(), "accessKey", "onpbIeEKoi");
        setField(term1223, term1223.getClass(), "secretKey", "YRHGsAkhxb");
        setField(term1223, term1223.getClass(), "region", "ffYhPOzlUs");
        setField(term1260, term1260.getClass(), "userPoolId", null);
        setField(term1260, term1260.getClass(), "appClientId", null);
        setField(term1260, term1260.getClass(), "appClientSecret", null);
        setField(term1223, term1223.getClass(), "cognito", term1260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.configuration.AwsConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1223, args);
    }

};


