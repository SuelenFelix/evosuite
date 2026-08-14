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

public class NutritionFacts_Specific_servingSize_17124139421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1451;

    public NutritionFacts_Specific_servingSize_17124139421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1484 = Class.forName((String) "org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFact$Unit");
        Field term1483 = ((Class) term1484).getDeclaredField((String) "MILILITER");
        ((Field) term1483).setAccessible(true);
        Object enum3 = ((Field) term1483).get((Object) null);
        Class<? extends Object> term1953 = Class.forName((String) "org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFact$Unit");
        Field term1952 = ((Class) term1953).getDeclaredField((String) "PIECE");
        ((Field) term1952).setAccessible(true);
        Object enum4 = ((Field) term1952).get((Object) null);
        HashMap term1478 = new HashMap();
        term1451 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Specific"));
        Object term1452 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts$ServingSize"));
        Object term1467 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts$Servings"));
        setIntField(term1452, term1452.getClass(), "amount", -1922583790);
        setField(term1452, term1452.getClass(), "unit", enum3);
        setField(term1451, term1451.getClass(), "servingSize", term1452);
        setIntField(term1467, term1467.getClass(), "amount", -616727354);
        setField(term1467, term1467.getClass(), "unit", enum4);
        setField(term1451, term1451.getClass(), "servings", term1467);
        setField(term1451, term1451.getClass(), "nutritionFacts", term1478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Specific");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "servingSize", argTypes, term1451, args);
    }

};


