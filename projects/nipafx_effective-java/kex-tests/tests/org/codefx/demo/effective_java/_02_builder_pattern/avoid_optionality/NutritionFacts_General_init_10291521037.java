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

public class NutritionFacts_General_init_10291521037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public NutritionFacts_General_init_10291521037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_General");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFact");
        argTypes[1] = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFact");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


