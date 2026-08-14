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

public class RuleConfiguration_setEnableApacheNginxUnderscoreRecommendation_3789068513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5843;
     Object term5852;

    public RuleConfiguration_setEnableApacheNginxUnderscoreRecommendation_3789068513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5843 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration"));
        setBooleanField(term5843, term5843.getClass(), "enableRecommendations", true);
        setBooleanField(term5843, term5843.getClass(), "enableApacheNginxUnderscoreRecommendation", true);
        setBooleanField(term5843, term5843.getClass(), "enableOneOfWithPropertiesRecommendation", true);
        setBooleanField(term5843, term5843.getClass(), "enableUnusedSchemasRecommendation", true);
        setBooleanField(term5843, term5843.getClass(), "enableSchemaTypeRecommendation", true);
        setBooleanField(term5843, term5843.getClass(), "enableNullableAttributeRecommendation", true);
        setBooleanField(term5843, term5843.getClass(), "enableInvalidTypeRecommendation", true);
        setBooleanField(term5843, term5843.getClass(), "enableApiRequestUriWithBodyRecommendation", true);
        term5852 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.RuleConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5852;
        callMethod(klass, "setEnableApacheNginxUnderscoreRecommendation", argTypes, term5843, args);
    }

};


