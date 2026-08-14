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

public class RuleConfiguration_setEnableNullableAttributeRecommendation_170736740610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5914;
     Object term5923;

    public RuleConfiguration_setEnableNullableAttributeRecommendation_170736740610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5914 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration"));
        setBooleanField(term5914, term5914.getClass(), "enableRecommendations", true);
        setBooleanField(term5914, term5914.getClass(), "enableApacheNginxUnderscoreRecommendation", true);
        setBooleanField(term5914, term5914.getClass(), "enableOneOfWithPropertiesRecommendation", true);
        setBooleanField(term5914, term5914.getClass(), "enableUnusedSchemasRecommendation", true);
        setBooleanField(term5914, term5914.getClass(), "enableSchemaTypeRecommendation", true);
        setBooleanField(term5914, term5914.getClass(), "enableNullableAttributeRecommendation", true);
        setBooleanField(term5914, term5914.getClass(), "enableInvalidTypeRecommendation", true);
        setBooleanField(term5914, term5914.getClass(), "enableApiRequestUriWithBodyRecommendation", true);
        term5923 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5923;
        callMethod(klass, "setEnableNullableAttributeRecommendation", argTypes, term5914, args);
    }

};


