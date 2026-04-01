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

public class OpenApiParameterValidations_init_11752694040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1179;

    public OpenApiParameterValidations_init_11752694040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1179 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration"));
        setBooleanField(term1179, term1179.getClass(), "enableRecommendations", true);
        setBooleanField(term1179, term1179.getClass(), "enableApacheNginxUnderscoreRecommendation", true);
        setBooleanField(term1179, term1179.getClass(), "enableOneOfWithPropertiesRecommendation", true);
        setBooleanField(term1179, term1179.getClass(), "enableUnusedSchemasRecommendation", true);
        setBooleanField(term1179, term1179.getClass(), "enableSchemaTypeRecommendation", true);
        setBooleanField(term1179, term1179.getClass(), "enableNullableAttributeRecommendation", true);
        setBooleanField(term1179, term1179.getClass(), "enableInvalidTypeRecommendation", true);
        setBooleanField(term1179, term1179.getClass(), "enableApiRequestUriWithBodyRecommendation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.OpenApiParameterValidations");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration");
        Object[] args = new Object[1];
        args[0] = term1179;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


