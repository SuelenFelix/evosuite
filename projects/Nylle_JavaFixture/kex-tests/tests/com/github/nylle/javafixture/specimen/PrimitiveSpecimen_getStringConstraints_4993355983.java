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

public class PrimitiveSpecimen_getStringConstraints_4993355983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3792;
     Object term3830;

    public PrimitiveSpecimen_getStringConstraints_4993355983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3795 = Class.forName((String) "java.util.stream.Nodes$ArrayNode");
        term3792 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.PrimitiveSpecimen"));
        Object term3793 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term3794 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term3808 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term3809 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term3810 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term3811 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term3812 = newInstance(Class.forName("com.github.nylle.javafixture.PseudoRandom"));
        Object term3813 = newInstance(Class.forName("java.util.Random"));
        Object term3814 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term3818 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term3823 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term3824 = newInstance(Class.forName("java.time.Instant"));
        Object term3827 = newInstance(Class.forName("java.time.ZoneOffset"));
        setField(term3794, term3794.getClass(), "genericDeclaration", term3795);
        setField(term3794, term3794.getClass(), "name", "T");
        setField(term3809, term3809.getClass(), "path", null);
        setElement(term3808, 0, term3809);
        setField(term3794, term3794.getClass(), "bounds", term3808);
        setField(term3810, term3810.getClass(), "decl", term3795);
        setField(term3811, term3811.getClass(), "recvr", term3795);
        setField(term3811, term3811.getClass(), "enclosingScope", null);
        setField(term3810, term3810.getClass(), "scope", term3811);
        setField(term3794, term3794.getClass(), "factory", term3810);
        setField(term3793, term3793.getClass(), "type", term3794);
        setField(term3792, term3792.getClass(), "type", term3793);
        setLongField(term3814, term3814.getClass(), "value", 64559861948908L);
        setField(term3813, term3813.getClass(), "seed", term3814);
        setDoubleField(term3813, term3813.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term3813, term3813.getClass(), "haveNextNextGaussian", false);
        setField(term3812, term3812.getClass(), "random", term3813);
        setField(term3792, term3792.getClass(), "pseudoRandom", term3812);
        setIntField(term3818, term3818.getClass(), "maxCollectionSize", 10);
        setIntField(term3818, term3818.getClass(), "minCollectionSize", 2);
        setIntField(term3818, term3818.getClass(), "streamSize", 3);
        setBooleanField(term3818, term3818.getClass(), "usePositiveNumbersOnly", true);
        setLongField(term3824, term3824.getClass(), "seconds", 1786472236L);
        setIntField(term3824, term3824.getClass(), "nanos", 705000);
        setField(term3823, term3823.getClass(), "instant", term3824);
        setIntField(term3827, term3827.getClass(), "totalSeconds", 0);
        setField(term3827, term3827.getClass(), "id", "");
        setField(term3823, term3823.getClass(), "zone", term3827);
        setField(term3818, term3818.getClass(), "clock", term3823);
        setField(term3792, term3792.getClass(), "configuration", term3818);
        term3830 = (Object[]) newArray("java.lang.annotation.Annotation", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.PrimitiveSpecimen");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.annotation.Annotation"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3830;
        callMethod(klass, "getStringConstraints", argTypes, term3792, args);
    }

};


