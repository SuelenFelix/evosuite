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

public class NutritionFacts_General_servings_6188948829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7373;

    public NutritionFacts_General_servings_6188948829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7373 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_General"));
        setField(term7373, term7373.getClass(), "servingSize", null);
        setField(term7373, term7373.getClass(), "servings", null);
        setField(term7373, term7373.getClass(), "nutritionFacts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_General");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "servings", argTypes, term7373, args);
    }

};


