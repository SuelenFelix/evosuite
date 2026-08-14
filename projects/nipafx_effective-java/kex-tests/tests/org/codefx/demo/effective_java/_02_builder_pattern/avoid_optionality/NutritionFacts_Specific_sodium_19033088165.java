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

public class NutritionFacts_Specific_sodium_19033088165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4777;

    public NutritionFacts_Specific_sodium_19033088165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4805 = Class.forName((String) "org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFact$Unit");
        Field term4804 = ((Class) term4805).getDeclaredField((String) "PIECE");
        ((Field) term4804).setAccessible(true);
        Object enum10 = ((Field) term4804).get((Object) null);
        Class<? extends Object> term5262 = Class.forName((String) "org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFact$Unit");
        Field term5261 = ((Class) term5262).getDeclaredField((String) "GRAM");
        ((Field) term5261).setAccessible(true);
        Object enum11 = ((Field) term5261).get((Object) null);
        HashMap term4799 = new HashMap();
        term4777 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Specific"));
        Object term4778 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts$ServingSize"));
        Object term4789 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts$Servings"));
        setIntField(term4778, term4778.getClass(), "amount", 1134449235);
        setField(term4778, term4778.getClass(), "unit", enum10);
        setField(term4777, term4777.getClass(), "servingSize", term4778);
        setIntField(term4789, term4789.getClass(), "amount", -883034806);
        setField(term4789, term4789.getClass(), "unit", enum11);
        setField(term4777, term4777.getClass(), "servings", term4789);
        setField(term4777, term4777.getClass(), "nutritionFacts", term4799);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Specific");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sodium", argTypes, term4777, args);
    }

};


