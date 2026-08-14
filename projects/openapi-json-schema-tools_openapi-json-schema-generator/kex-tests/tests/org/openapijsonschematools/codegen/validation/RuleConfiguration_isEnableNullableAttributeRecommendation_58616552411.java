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

public class RuleConfiguration_isEnableNullableAttributeRecommendation_58616552411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5925;

    public RuleConfiguration_isEnableNullableAttributeRecommendation_58616552411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5925 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration"));
        setBooleanField(term5925, term5925.getClass(), "enableRecommendations", true);
        setBooleanField(term5925, term5925.getClass(), "enableApacheNginxUnderscoreRecommendation", true);
        setBooleanField(term5925, term5925.getClass(), "enableOneOfWithPropertiesRecommendation", true);
        setBooleanField(term5925, term5925.getClass(), "enableUnusedSchemasRecommendation", true);
        setBooleanField(term5925, term5925.getClass(), "enableSchemaTypeRecommendation", true);
        setBooleanField(term5925, term5925.getClass(), "enableNullableAttributeRecommendation", true);
        setBooleanField(term5925, term5925.getClass(), "enableInvalidTypeRecommendation", true);
        setBooleanField(term5925, term5925.getClass(), "enableApiRequestUriWithBodyRecommendation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnableNullableAttributeRecommendation", argTypes, term5925, args);
    }

};


