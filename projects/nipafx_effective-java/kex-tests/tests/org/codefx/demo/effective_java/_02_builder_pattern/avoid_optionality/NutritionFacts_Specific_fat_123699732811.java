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

public class NutritionFacts_Specific_fat_123699732811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6676;

    public NutritionFacts_Specific_fat_123699732811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6676 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Specific"));
        setField(term6676, term6676.getClass(), "servingSize", null);
        setField(term6676, term6676.getClass(), "servings", null);
        setField(term6676, term6676.getClass(), "nutritionFacts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Specific");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "fat", argTypes, term6676, args);
    }

};


