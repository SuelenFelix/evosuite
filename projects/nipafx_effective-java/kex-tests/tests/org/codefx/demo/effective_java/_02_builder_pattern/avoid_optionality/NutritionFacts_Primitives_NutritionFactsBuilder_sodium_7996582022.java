package org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality;

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
import static org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class NutritionFacts_Primitives_NutritionFactsBuilder_sodium_7996582022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7390;
     Object term7396;

    public NutritionFacts_Primitives_NutritionFactsBuilder_sodium_7996582022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7390 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Primitives$NutritionFactsBuilder"));
        setIntField(term7390, term7390.getClass(), "servingSize", 1135664017);
        setIntField(term7390, term7390.getClass(), "servings", 590364439);
        setIntField(term7390, term7390.getClass(), "fat", 865208305);
        setIntField(term7390, term7390.getClass(), "sodium", -1275173084);
        setIntField(term7390, term7390.getClass(), "carbohydrates", -244121226);
        term7396 = new Integer(-203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Primitives$NutritionFactsBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7396;
        callMethod(klass, "sodium", argTypes, term7390, args);
    }

};


