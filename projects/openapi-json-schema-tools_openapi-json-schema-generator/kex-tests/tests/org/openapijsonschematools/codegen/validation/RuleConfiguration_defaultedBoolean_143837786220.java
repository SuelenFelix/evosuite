package org.openapijsonschematools.codegen.validation;

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
import static org.openapijsonschematools.codegen.validation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class RuleConfiguration_defaultedBoolean_143837786220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6005;
     Object term6014;

    public RuleConfiguration_defaultedBoolean_143837786220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6005 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration"));
        setBooleanField(term6005, term6005.getClass(), "enableRecommendations", false);
        setBooleanField(term6005, term6005.getClass(), "enableApacheNginxUnderscoreRecommendation", false);
        setBooleanField(term6005, term6005.getClass(), "enableOneOfWithPropertiesRecommendation", false);
        setBooleanField(term6005, term6005.getClass(), "enableUnusedSchemasRecommendation", false);
        setBooleanField(term6005, term6005.getClass(), "enableSchemaTypeRecommendation", false);
        setBooleanField(term6005, term6005.getClass(), "enableNullableAttributeRecommendation", false);
        setBooleanField(term6005, term6005.getClass(), "enableInvalidTypeRecommendation", false);
        setBooleanField(term6005, term6005.getClass(), "enableApiRequestUriWithBodyRecommendation", false);
        term6014 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term6014;
        callMethod(klass, "defaultedBoolean", argTypes, term6005, args);
    }

};


