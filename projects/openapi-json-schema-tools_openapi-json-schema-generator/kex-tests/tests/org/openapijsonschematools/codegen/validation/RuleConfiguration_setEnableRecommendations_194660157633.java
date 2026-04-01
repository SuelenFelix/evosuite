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

public class RuleConfiguration_setEnableRecommendations_194660157633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6134;
     Object term6143;

    public RuleConfiguration_setEnableRecommendations_194660157633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6134 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration"));
        setBooleanField(term6134, term6134.getClass(), "enableRecommendations", false);
        setBooleanField(term6134, term6134.getClass(), "enableApacheNginxUnderscoreRecommendation", false);
        setBooleanField(term6134, term6134.getClass(), "enableOneOfWithPropertiesRecommendation", false);
        setBooleanField(term6134, term6134.getClass(), "enableUnusedSchemasRecommendation", false);
        setBooleanField(term6134, term6134.getClass(), "enableSchemaTypeRecommendation", false);
        setBooleanField(term6134, term6134.getClass(), "enableNullableAttributeRecommendation", false);
        setBooleanField(term6134, term6134.getClass(), "enableInvalidTypeRecommendation", false);
        setBooleanField(term6134, term6134.getClass(), "enableApiRequestUriWithBodyRecommendation", false);
        term6143 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6143;
        callMethod(klass, "setEnableRecommendations", argTypes, term6134, args);
    }

};


