package com.github.nylle.javafixture.specimen;

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
import static com.github.nylle.javafixture.specimen.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class GenericSpecimen_populate_6633734843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2592;
     Object term2666;

    public GenericSpecimen_populate_6633734843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2595 = Class.forName((String) "java.io.UTFDataFormatException");
        HashMap term2624 = new HashMap();
        HashMap term2637 = new HashMap();
        HashMap term2650 = new HashMap();
        HashMap term2661 = new HashMap();
        term2592 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.GenericSpecimen"));
        Object term2593 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term2594 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term2608 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term2609 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term2610 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term2611 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term2612 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2613 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2618 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term2619 = newInstance(Class.forName("java.time.Instant"));
        Object term2622 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term2629 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term2630 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2631 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2636 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term2642 = newInstance(Class.forName("com.github.nylle.javafixture.InstanceFactory"));
        Object term2643 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term2644 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2645 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2655 = newInstance(Class.forName("com.github.nylle.javafixture.PseudoRandom"));
        Object term2656 = newInstance(Class.forName("java.util.Random"));
        Object term2657 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term2594, term2594.getClass(), "genericDeclaration", term2595);
        setField(term2594, term2594.getClass(), "name", "T");
        setField(term2609, term2609.getClass(), "path", null);
        setElement(term2608, 0, term2609);
        setField(term2594, term2594.getClass(), "bounds", term2608);
        setField(term2610, term2610.getClass(), "decl", term2595);
        setField(term2611, term2611.getClass(), "recvr", term2595);
        setField(term2611, term2611.getClass(), "enclosingScope", null);
        setField(term2610, term2610.getClass(), "scope", term2611);
        setField(term2594, term2594.getClass(), "factory", term2610);
        setField(term2593, term2593.getClass(), "type", term2594);
        setField(term2592, term2592.getClass(), "type", term2593);
        setIntField(term2613, term2613.getClass(), "maxCollectionSize", 10);
        setIntField(term2613, term2613.getClass(), "minCollectionSize", 2);
        setIntField(term2613, term2613.getClass(), "streamSize", 3);
        setBooleanField(term2613, term2613.getClass(), "usePositiveNumbersOnly", true);
        setLongField(term2619, term2619.getClass(), "seconds", 1786472234L);
        setIntField(term2619, term2619.getClass(), "nanos", 663562000);
        setField(term2618, term2618.getClass(), "instant", term2619);
        setIntField(term2622, term2622.getClass(), "totalSeconds", 0);
        setField(term2622, term2622.getClass(), "id", null);
        setField(term2618, term2618.getClass(), "zone", term2622);
        setField(term2613, term2613.getClass(), "clock", term2618);
        setField(term2612, term2612.getClass(), "configuration", term2613);
        setField(term2612, term2612.getClass(), "cache", term2624);
        setField(term2592, term2592.getClass(), "context", term2612);
        setIntField(term2631, term2631.getClass(), "maxCollectionSize", 10);
        setIntField(term2631, term2631.getClass(), "minCollectionSize", 2);
        setIntField(term2631, term2631.getClass(), "streamSize", 3);
        setBooleanField(term2631, term2631.getClass(), "usePositiveNumbersOnly", true);
        setField(term2636, term2636.getClass(), "instant", null);
        setField(term2636, term2636.getClass(), "zone", term2622);
        setField(term2631, term2631.getClass(), "clock", term2636);
        setField(term2630, term2630.getClass(), "configuration", term2631);
        setField(term2630, term2630.getClass(), "cache", term2637);
        setField(term2629, term2629.getClass(), "context", term2630);
        setField(term2592, term2592.getClass(), "specimenFactory", term2629);
        setIntField(term2645, term2645.getClass(), "maxCollectionSize", 10);
        setIntField(term2645, term2645.getClass(), "minCollectionSize", 2);
        setIntField(term2645, term2645.getClass(), "streamSize", 3);
        setBooleanField(term2645, term2645.getClass(), "usePositiveNumbersOnly", true);
        setField(term2645, term2645.getClass(), "clock", null);
        setField(term2644, term2644.getClass(), "configuration", term2645);
        setField(term2644, term2644.getClass(), "cache", term2650);
        setField(term2643, term2643.getClass(), "context", term2644);
        setField(term2642, term2642.getClass(), "specimenFactory", term2643);
        setLongField(term2657, term2657.getClass(), "value", 108861444242570L);
        setField(term2656, term2656.getClass(), "seed", term2657);
        setDoubleField(term2656, term2656.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term2656, term2656.getClass(), "haveNextNextGaussian", false);
        setField(term2655, term2655.getClass(), "random", term2656);
        setField(term2642, term2642.getClass(), "random", term2655);
        setField(term2592, term2592.getClass(), "instanceFactory", term2642);
        setField(term2592, term2592.getClass(), "specimens", term2661);
        HashMap term2669 = new HashMap();
        term2666 = newInstance(Class.forName("com.github.nylle.javafixture.CustomizationContext"));
        Object term2667 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term2668 = (Object[]) newArray("java.lang.Object", 0);
        setField(term2667, term2667.getClass(), "elements", term2668);
        setField(term2666, term2666.getClass(), "ignoredFields", term2667);
        setField(term2666, term2666.getClass(), "customFields", term2669);
        setBooleanField(term2666, term2666.getClass(), "useRandomConstructor", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.GenericSpecimen");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        Object[] args = new Object[1];
        args[0] = term2666;
        callMethod(klass, "populate", argTypes, term2592, args);
    }

};


