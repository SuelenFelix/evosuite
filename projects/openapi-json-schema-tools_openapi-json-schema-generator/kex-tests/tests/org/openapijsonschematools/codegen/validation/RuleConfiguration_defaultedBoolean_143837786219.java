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

public class RuleConfiguration_defaultedBoolean_143837786219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5994;
     Object term6003;

    public RuleConfiguration_defaultedBoolean_143837786219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5994 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration"));
        setBooleanField(term5994, term5994.getClass(), "enableRecommendations", false);
        setBooleanField(term5994, term5994.getClass(), "enableApacheNginxUnderscoreRecommendation", false);
        setBooleanField(term5994, term5994.getClass(), "enableOneOfWithPropertiesRecommendation", false);
        setBooleanField(term5994, term5994.getClass(), "enableUnusedSchemasRecommendation", false);
        setBooleanField(term5994, term5994.getClass(), "enableSchemaTypeRecommendation", false);
        setBooleanField(term5994, term5994.getClass(), "enableNullableAttributeRecommendation", false);
        setBooleanField(term5994, term5994.getClass(), "enableInvalidTypeRecommendation", false);
        setBooleanField(term5994, term5994.getClass(), "enableApiRequestUriWithBodyRecommendation", false);
        term6003 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term6003;
        callMethod(klass, "defaultedBoolean", argTypes, term5994, args);
    }

};


