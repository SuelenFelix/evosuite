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
import java.lang.String;
import java.lang.Object;

public class NutritionFacts_Specific_init_17951182350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term502;
     Object term517;
     Object term527;

    public NutritionFacts_Specific_init_17951182350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term529 = Class.forName((String) "org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFact$Unit");
        Field term528 = ((Class) term529).getDeclaredField((String) "MILILITER");
        ((Field) term528).setAccessible(true);
        Object enum1 = ((Field) term528).get((Object) null);
        term502 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts$ServingSize"));
        setIntField(term502, term502.getClass(), "amount", 1484323161);
        setField(term502, term502.getClass(), "unit", enum1);
        Class<? extends Object> term998 = Class.forName((String) "org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFact$Unit");
        Field term997 = ((Class) term998).getDeclaredField((String) "GRAM");
        ((Field) term997).setAccessible(true);
        Object enum2 = ((Field) term997).get((Object) null);
        term517 = newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts$Servings"));
        setIntField(term517, term517.getClass(), "amount", 391863371);
        setField(term517, term517.getClass(), "unit", enum2);
        term527 = (Object[]) newArray("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFact", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts_Specific");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts$ServingSize");
        argTypes[1] = Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFacts$Servings");
        argTypes[2] = Array.newInstance(Class.forName("org.codefx.demo.effective_java._02_builder_pattern.avoid_optionality.NutritionFact"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term502;
        args[1] = term517;
        args[2] = term527;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


