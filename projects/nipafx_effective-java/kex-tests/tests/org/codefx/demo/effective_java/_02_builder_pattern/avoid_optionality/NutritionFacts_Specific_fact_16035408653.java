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

public class NutritionFacts_Specific_fact_16035408653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3363;

    public NutritionFacts_Specific_fact_16035408653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3383 = Class.forName((String) "org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFact$Unit");
        Field term3382 = ((Class) term3383).getDeclaredField((String) "PIECE");
        ((Field) term3382).setAccessible(true);
        Object enum7 = ((Field) term3382).get((Object) null);
        HashMap term3377 = new HashMap();
        term3363 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Specific"));
        Object term3364 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts$ServingSize"));
        Object term3375 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts$Servings"));
        setIntField(term3364, term3364.getClass(), "amount", 1227103734);
        setField(term3364, term3364.getClass(), "unit", enum7);
        setField(term3363, term3363.getClass(), "servingSize", term3364);
        setIntField(term3375, term3375.getClass(), "amount", -1339778481);
        setField(term3375, term3375.getClass(), "unit", enum7);
        setField(term3363, term3363.getClass(), "servings", term3375);
        setField(term3363, term3363.getClass(), "nutritionFacts", term3377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Specific");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "fact", argTypes, term3363, args);
    }

};


