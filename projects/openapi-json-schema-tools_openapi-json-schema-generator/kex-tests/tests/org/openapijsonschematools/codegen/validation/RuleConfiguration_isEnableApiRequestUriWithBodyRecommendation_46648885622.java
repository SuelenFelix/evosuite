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

public class RuleConfiguration_isEnableApiRequestUriWithBodyRecommendation_46648885622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6025;

    public RuleConfiguration_isEnableApiRequestUriWithBodyRecommendation_46648885622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6025 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration"));
        setBooleanField(term6025, term6025.getClass(), "enableRecommendations", false);
        setBooleanField(term6025, term6025.getClass(), "enableApacheNginxUnderscoreRecommendation", false);
        setBooleanField(term6025, term6025.getClass(), "enableOneOfWithPropertiesRecommendation", false);
        setBooleanField(term6025, term6025.getClass(), "enableUnusedSchemasRecommendation", false);
        setBooleanField(term6025, term6025.getClass(), "enableSchemaTypeRecommendation", false);
        setBooleanField(term6025, term6025.getClass(), "enableNullableAttributeRecommendation", false);
        setBooleanField(term6025, term6025.getClass(), "enableInvalidTypeRecommendation", false);
        setBooleanField(term6025, term6025.getClass(), "enableApiRequestUriWithBodyRecommendation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnableApiRequestUriWithBodyRecommendation", argTypes, term6025, args);
    }

};


