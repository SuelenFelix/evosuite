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

public class RuleConfiguration_isEnableApiRequestUriWithBodyRecommendation_4664888564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5854;

    public RuleConfiguration_isEnableApiRequestUriWithBodyRecommendation_4664888564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5854 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration"));
        setBooleanField(term5854, term5854.getClass(), "enableRecommendations", true);
        setBooleanField(term5854, term5854.getClass(), "enableApacheNginxUnderscoreRecommendation", true);
        setBooleanField(term5854, term5854.getClass(), "enableOneOfWithPropertiesRecommendation", true);
        setBooleanField(term5854, term5854.getClass(), "enableUnusedSchemasRecommendation", true);
        setBooleanField(term5854, term5854.getClass(), "enableSchemaTypeRecommendation", true);
        setBooleanField(term5854, term5854.getClass(), "enableNullableAttributeRecommendation", true);
        setBooleanField(term5854, term5854.getClass(), "enableInvalidTypeRecommendation", true);
        setBooleanField(term5854, term5854.getClass(), "enableApiRequestUriWithBodyRecommendation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnableApiRequestUriWithBodyRecommendation", argTypes, term5854, args);
    }

};


