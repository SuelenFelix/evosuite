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

public class RuleConfiguration_setEnableApacheNginxUnderscoreRecommendation_3789068514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5854;
     Object term5863;

    public RuleConfiguration_setEnableApacheNginxUnderscoreRecommendation_3789068514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5854 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration"));
        setBooleanField(term5854, term5854.getClass(), "enableRecommendations", false);
        setBooleanField(term5854, term5854.getClass(), "enableApacheNginxUnderscoreRecommendation", false);
        setBooleanField(term5854, term5854.getClass(), "enableOneOfWithPropertiesRecommendation", false);
        setBooleanField(term5854, term5854.getClass(), "enableUnusedSchemasRecommendation", false);
        setBooleanField(term5854, term5854.getClass(), "enableSchemaTypeRecommendation", false);
        setBooleanField(term5854, term5854.getClass(), "enableNullableAttributeRecommendation", false);
        setBooleanField(term5854, term5854.getClass(), "enableInvalidTypeRecommendation", false);
        setBooleanField(term5854, term5854.getClass(), "enableApiRequestUriWithBodyRecommendation", false);
        term5863 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5863;
        callMethod(klass, "setEnableApacheNginxUnderscoreRecommendation", argTypes, term5854, args);
    }

};


