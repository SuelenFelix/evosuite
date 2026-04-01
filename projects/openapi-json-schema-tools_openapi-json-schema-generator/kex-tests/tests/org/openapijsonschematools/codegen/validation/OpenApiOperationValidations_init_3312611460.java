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

public class OpenApiOperationValidations_init_3312611460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16520;

    public OpenApiOperationValidations_init_3312611460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16520 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration"));
        setBooleanField(term16520, term16520.getClass(), "enableRecommendations", true);
        setBooleanField(term16520, term16520.getClass(), "enableApacheNginxUnderscoreRecommendation", true);
        setBooleanField(term16520, term16520.getClass(), "enableOneOfWithPropertiesRecommendation", true);
        setBooleanField(term16520, term16520.getClass(), "enableUnusedSchemasRecommendation", true);
        setBooleanField(term16520, term16520.getClass(), "enableSchemaTypeRecommendation", true);
        setBooleanField(term16520, term16520.getClass(), "enableNullableAttributeRecommendation", true);
        setBooleanField(term16520, term16520.getClass(), "enableInvalidTypeRecommendation", true);
        setBooleanField(term16520, term16520.getClass(), "enableApiRequestUriWithBodyRecommendation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.OpenApiOperationValidations");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration");
        Object[] args = new Object[1];
        args[0] = term16520;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


