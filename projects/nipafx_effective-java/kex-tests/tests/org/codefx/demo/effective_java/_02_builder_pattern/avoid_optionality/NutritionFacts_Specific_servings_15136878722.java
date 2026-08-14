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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class NutritionFacts_Specific_servings_15136878722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2409;

    public NutritionFacts_Specific_servings_15136878722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2441 = Class.forName((String) "org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFact$Unit");
        Field term2440 = ((Class) term2441).getDeclaredField((String) "GRAM");
        ((Field) term2440).setAccessible(true);
        Object enum5 = ((Field) term2440).get((Object) null);
        Class<? extends Object> term2895 = Class.forName((String) "org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFact$Unit");
        Field term2894 = ((Class) term2895).getDeclaredField((String) "MILILITER");
        ((Field) term2894).setAccessible(true);
        Object enum6 = ((Field) term2894).get((Object) null);
        HashMap term2435 = new HashMap();
        term2409 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Specific"));
        Object term2410 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts$ServingSize"));
        Object term2420 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts$Servings"));
        setIntField(term2410, term2410.getClass(), "amount", -1955890973);
        setField(term2410, term2410.getClass(), "unit", enum5);
        setField(term2409, term2409.getClass(), "servingSize", term2410);
        setIntField(term2420, term2420.getClass(), "amount", -2038273078);
        setField(term2420, term2420.getClass(), "unit", enum6);
        setField(term2409, term2409.getClass(), "servings", term2420);
        setField(term2409, term2409.getClass(), "nutritionFacts", term2435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Specific");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "servings", argTypes, term2409, args);
    }

};


