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

public class NutritionFacts_Primitives_NutritionFactsBuilder_fat_3550029501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7382;
     Object term7388;

    public NutritionFacts_Primitives_NutritionFactsBuilder_fat_3550029501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7382 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Primitives$NutritionFactsBuilder"));
        setIntField(term7382, term7382.getClass(), "servingSize", 1048535127);
        setIntField(term7382, term7382.getClass(), "servings", -655067527);
        setIntField(term7382, term7382.getClass(), "fat", -6029667);
        setIntField(term7382, term7382.getClass(), "sodium", -2068769794);
        setIntField(term7382, term7382.getClass(), "carbohydrates", -117576464);
        term7388 = new Integer(-1007160944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Primitives$NutritionFactsBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7388;
        callMethod(klass, "fat", argTypes, term7382, args);
    }

};


