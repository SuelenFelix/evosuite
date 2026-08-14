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

public class NutritionFacts_Primitives_carbohydrates_81581677011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7510;

    public NutritionFacts_Primitives_carbohydrates_81581677011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7510 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Primitives"));
        setIntField(term7510, term7510.getClass(), "servingSize", 0);
        setIntField(term7510, term7510.getClass(), "servings", 0);
        setIntField(term7510, term7510.getClass(), "fat", 0);
        setIntField(term7510, term7510.getClass(), "sodium", 0);
        setIntField(term7510, term7510.getClass(), "carbohydrates", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Primitives");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "carbohydrates", argTypes, term7510, args);
    }

};


