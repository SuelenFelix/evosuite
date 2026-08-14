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

public class NutritionFacts_Specific_fat_12369973284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3839;

    public NutritionFacts_Specific_fat_12369973284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3867 = Class.forName((String) "org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFact$Unit");
        Field term3866 = ((Class) term3867).getDeclaredField((String) "PIECE");
        ((Field) term3866).setAccessible(true);
        Object enum8 = ((Field) term3866).get((Object) null);
        Class<? extends Object> term4324 = Class.forName((String) "org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFact$Unit");
        Field term4323 = ((Class) term4324).getDeclaredField((String) "GRAM");
        ((Field) term4323).setAccessible(true);
        Object enum9 = ((Field) term4323).get((Object) null);
        HashMap term3861 = new HashMap();
        term3839 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Specific"));
        Object term3840 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts$ServingSize"));
        Object term3851 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts$Servings"));
        setIntField(term3840, term3840.getClass(), "amount", 1725571209);
        setField(term3840, term3840.getClass(), "unit", enum8);
        setField(term3839, term3839.getClass(), "servingSize", term3840);
        setIntField(term3851, term3851.getClass(), "amount", -522618178);
        setField(term3851, term3851.getClass(), "unit", enum9);
        setField(term3839, term3839.getClass(), "servings", term3851);
        setField(term3839, term3839.getClass(), "nutritionFacts", term3861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Specific");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "fat", argTypes, term3839, args);
    }

};


