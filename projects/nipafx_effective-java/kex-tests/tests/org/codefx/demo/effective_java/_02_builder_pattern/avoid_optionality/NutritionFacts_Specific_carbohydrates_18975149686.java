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

public class NutritionFacts_Specific_carbohydrates_18975149686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5715;

    public NutritionFacts_Specific_carbohydrates_18975149686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5748 = Class.forName((String) "org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFact$Unit");
        Field term5747 = ((Class) term5748).getDeclaredField((String) "PIECE");
        ((Field) term5747).setAccessible(true);
        Object enum12 = ((Field) term5747).get((Object) null);
        Class<? extends Object> term6205 = Class.forName((String) "org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFact$Unit");
        Field term6204 = ((Class) term6205).getDeclaredField((String) "MILILITER");
        ((Field) term6204).setAccessible(true);
        Object enum13 = ((Field) term6204).get((Object) null);
        HashMap term5742 = new HashMap();
        term5715 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Specific"));
        Object term5716 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts$ServingSize"));
        Object term5727 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts$Servings"));
        setIntField(term5716, term5716.getClass(), "amount", 1585847225);
        setField(term5716, term5716.getClass(), "unit", enum12);
        setField(term5715, term5715.getClass(), "servingSize", term5716);
        setIntField(term5727, term5727.getClass(), "amount", 597278769);
        setField(term5727, term5727.getClass(), "unit", enum13);
        setField(term5715, term5715.getClass(), "servings", term5727);
        setField(term5715, term5715.getClass(), "nutritionFacts", term5742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Specific");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "carbohydrates", argTypes, term5715, args);
    }

};


