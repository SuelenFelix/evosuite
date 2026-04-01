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

public class RuleConfiguration_setEnableOneOfWithPropertiesRecommendation_104908644525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6054;
     Object term6063;

    public RuleConfiguration_setEnableOneOfWithPropertiesRecommendation_104908644525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6054 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration"));
        setBooleanField(term6054, term6054.getClass(), "enableRecommendations", false);
        setBooleanField(term6054, term6054.getClass(), "enableApacheNginxUnderscoreRecommendation", false);
        setBooleanField(term6054, term6054.getClass(), "enableOneOfWithPropertiesRecommendation", false);
        setBooleanField(term6054, term6054.getClass(), "enableUnusedSchemasRecommendation", false);
        setBooleanField(term6054, term6054.getClass(), "enableSchemaTypeRecommendation", false);
        setBooleanField(term6054, term6054.getClass(), "enableNullableAttributeRecommendation", false);
        setBooleanField(term6054, term6054.getClass(), "enableInvalidTypeRecommendation", false);
        setBooleanField(term6054, term6054.getClass(), "enableApiRequestUriWithBodyRecommendation", false);
        term6063 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6063;
        callMethod(klass, "setEnableOneOfWithPropertiesRecommendation", argTypes, term6054, args);
    }

};


