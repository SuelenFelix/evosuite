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

public class OpenApiSchemaValidations_init_3951549080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17338;

    public OpenApiSchemaValidations_init_3951549080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17338 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration"));
        setBooleanField(term17338, term17338.getClass(), "enableRecommendations", true);
        setBooleanField(term17338, term17338.getClass(), "enableApacheNginxUnderscoreRecommendation", true);
        setBooleanField(term17338, term17338.getClass(), "enableOneOfWithPropertiesRecommendation", true);
        setBooleanField(term17338, term17338.getClass(), "enableUnusedSchemasRecommendation", true);
        setBooleanField(term17338, term17338.getClass(), "enableSchemaTypeRecommendation", true);
        setBooleanField(term17338, term17338.getClass(), "enableNullableAttributeRecommendation", true);
        setBooleanField(term17338, term17338.getClass(), "enableInvalidTypeRecommendation", true);
        setBooleanField(term17338, term17338.getClass(), "enableApiRequestUriWithBodyRecommendation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.OpenApiSchemaValidations");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration");
        Object[] args = new Object[1];
        args[0] = term17338;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


