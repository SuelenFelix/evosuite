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

public class RuleConfiguration_isEnableUnusedSchemasRecommendation_119077493316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5974;

    public RuleConfiguration_isEnableUnusedSchemasRecommendation_119077493316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5974 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration"));
        setBooleanField(term5974, term5974.getClass(), "enableRecommendations", true);
        setBooleanField(term5974, term5974.getClass(), "enableApacheNginxUnderscoreRecommendation", true);
        setBooleanField(term5974, term5974.getClass(), "enableOneOfWithPropertiesRecommendation", true);
        setBooleanField(term5974, term5974.getClass(), "enableUnusedSchemasRecommendation", true);
        setBooleanField(term5974, term5974.getClass(), "enableSchemaTypeRecommendation", true);
        setBooleanField(term5974, term5974.getClass(), "enableNullableAttributeRecommendation", true);
        setBooleanField(term5974, term5974.getClass(), "enableInvalidTypeRecommendation", true);
        setBooleanField(term5974, term5974.getClass(), "enableApiRequestUriWithBodyRecommendation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnableUnusedSchemasRecommendation", argTypes, term5974, args);
    }

};


