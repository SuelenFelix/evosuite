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

public class RuleConfiguration_isEnableSchemaTypeRecommendation_19526851349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5905;

    public RuleConfiguration_isEnableSchemaTypeRecommendation_19526851349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5905 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration"));
        setBooleanField(term5905, term5905.getClass(), "enableRecommendations", true);
        setBooleanField(term5905, term5905.getClass(), "enableApacheNginxUnderscoreRecommendation", true);
        setBooleanField(term5905, term5905.getClass(), "enableOneOfWithPropertiesRecommendation", true);
        setBooleanField(term5905, term5905.getClass(), "enableUnusedSchemasRecommendation", true);
        setBooleanField(term5905, term5905.getClass(), "enableSchemaTypeRecommendation", true);
        setBooleanField(term5905, term5905.getClass(), "enableNullableAttributeRecommendation", true);
        setBooleanField(term5905, term5905.getClass(), "enableInvalidTypeRecommendation", true);
        setBooleanField(term5905, term5905.getClass(), "enableApiRequestUriWithBodyRecommendation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnableSchemaTypeRecommendation", argTypes, term5905, args);
    }

};


