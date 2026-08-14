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

public class CollectionSpecimen_create_1356516881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2805;
     Object term2861;
     Object term2870;

    public CollectionSpecimen_create_1356516881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2808 = Class.forName((String) "java.util.stream.IntPipeline$7");
        HashMap term2837 = new HashMap();
        HashMap term2850 = new HashMap();
        term2805 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.CollectionSpecimen"));
        Object term2806 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term2807 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term2821 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term2822 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term2823 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term2824 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term2825 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2826 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2831 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term2832 = newInstance(Class.forName("java.time.Instant"));
        Object term2835 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term2842 = newInstance(Class.forName("com.github.nylle.javafixture.InstanceFactory"));
        Object term2843 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term2844 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2845 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2855 = newInstance(Class.forName("com.github.nylle.javafixture.PseudoRandom"));
        Object term2856 = newInstance(Class.forName("java.util.Random"));
        Object term2857 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term2807, term2807.getClass(), "genericDeclaration", term2808);
        setField(term2807, term2807.getClass(), "name", "T");
        setField(term2822, term2822.getClass(), "path", null);
        setElement(term2821, 0, term2822);
        setField(term2807, term2807.getClass(), "bounds", term2821);
        setField(term2823, term2823.getClass(), "decl", term2808);
        setField(term2824, term2824.getClass(), "recvr", term2808);
        setField(term2824, term2824.getClass(), "enclosingScope", null);
        setField(term2823, term2823.getClass(), "scope", term2824);
        setField(term2807, term2807.getClass(), "factory", term2823);
        setField(term2806, term2806.getClass(), "type", term2807);
        setField(term2805, term2805.getClass(), "type", term2806);
        setIntField(term2826, term2826.getClass(), "maxCollectionSize", 10);
        setIntField(term2826, term2826.getClass(), "minCollectionSize", 2);
        setIntField(term2826, term2826.getClass(), "streamSize", 3);
        setBooleanField(term2826, term2826.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term2832, term2832.getClass(), "seconds", 1786472234L);
        setIntField(term2832, term2832.getClass(), "nanos", 947099000);
        setField(term2831, term2831.getClass(), "instant", term2832);
        setIntField(term2835, term2835.getClass(), "totalSeconds", 0);
        setField(term2835, term2835.getClass(), "id", null);
        setField(term2831, term2831.getClass(), "zone", term2835);
        setField(term2826, term2826.getClass(), "clock", term2831);
        setField(term2825, term2825.getClass(), "configuration", term2826);
        setField(term2825, term2825.getClass(), "cache", term2837);
        setField(term2805, term2805.getClass(), "context", term2825);
        setField(term2805, term2805.getClass(), "specimen", null);
        setIntField(term2845, term2845.getClass(), "maxCollectionSize", 10);
        setIntField(term2845, term2845.getClass(), "minCollectionSize", 2);
        setIntField(term2845, term2845.getClass(), "streamSize", 3);
        setBooleanField(term2845, term2845.getClass(), "usePositiveNumbersOnly", true);
        setField(term2845, term2845.getClass(), "clock", null);
        setField(term2844, term2844.getClass(), "configuration", term2845);
        setField(term2844, term2844.getClass(), "cache", term2850);
        setField(term2843, term2843.getClass(), "context", term2844);
        setField(term2842, term2842.getClass(), "specimenFactory", term2843);
        setLongField(term2857, term2857.getClass(), "value", 268537141435587L);
        setField(term2856, term2856.getClass(), "seed", term2857);
        setDoubleField(term2856, term2856.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term2856, term2856.getClass(), "haveNextNextGaussian", false);
        setField(term2855, term2855.getClass(), "random", term2856);
        setField(term2842, term2842.getClass(), "random", term2855);
        setField(term2805, term2805.getClass(), "instanceFactory", term2842);
        HashMap term2864 = new HashMap();
        term2861 = newInstance(Class.forName("com.github.nylle.javafixture.CustomizationContext"));
        Object term2862 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term2863 = (Object[]) newArray("java.lang.Object", 0);
        setField(term2862, term2862.getClass(), "elements", term2863);
        setField(term2861, term2861.getClass(), "ignoredFields", term2862);
        setField(term2861, term2861.getClass(), "customFields", term2864);
        setBooleanField(term2861, term2861.getClass(), "useRandomConstructor", false);
        term2870 = (Object[]) newArray("java.lang.annotation.Annotation", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.CollectionSpecimen");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.annotation.Annotation"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2861;
        args[1] = term2870;
        callMethod(klass, "create", argTypes, term2805, args);
    }

};


