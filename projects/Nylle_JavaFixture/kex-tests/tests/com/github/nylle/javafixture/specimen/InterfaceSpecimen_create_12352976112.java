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

public class InterfaceSpecimen_create_12352976112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3388;
     Object term3444;
     Object term3453;

    public InterfaceSpecimen_create_12352976112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3391 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$KeySpliterator");
        HashMap term3420 = new HashMap();
        HashMap term3433 = new HashMap();
        term3388 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.InterfaceSpecimen"));
        Object term3389 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term3390 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term3404 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term3405 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term3406 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term3407 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term3408 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term3409 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term3414 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term3415 = newInstance(Class.forName("java.time.Instant"));
        Object term3418 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term3425 = newInstance(Class.forName("com.github.nylle.javafixture.InstanceFactory"));
        Object term3426 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term3427 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term3428 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term3438 = newInstance(Class.forName("com.github.nylle.javafixture.PseudoRandom"));
        Object term3439 = newInstance(Class.forName("java.util.Random"));
        Object term3440 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term3390, term3390.getClass(), "genericDeclaration", term3391);
        setField(term3390, term3390.getClass(), "name", "T");
        setField(term3405, term3405.getClass(), "path", null);
        setElement(term3404, 0, term3405);
        setField(term3390, term3390.getClass(), "bounds", term3404);
        setField(term3406, term3406.getClass(), "decl", term3391);
        setField(term3407, term3407.getClass(), "recvr", term3391);
        setField(term3407, term3407.getClass(), "enclosingScope", null);
        setField(term3406, term3406.getClass(), "scope", term3407);
        setField(term3390, term3390.getClass(), "factory", term3406);
        setField(term3389, term3389.getClass(), "type", term3390);
        setField(term3388, term3388.getClass(), "type", term3389);
        setIntField(term3409, term3409.getClass(), "maxCollectionSize", 10);
        setIntField(term3409, term3409.getClass(), "minCollectionSize", 2);
        setIntField(term3409, term3409.getClass(), "streamSize", 3);
        setBooleanField(term3409, term3409.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term3415, term3415.getClass(), "seconds", 1786472235L);
        setIntField(term3415, term3415.getClass(), "nanos", 595455000);
        setField(term3414, term3414.getClass(), "instant", term3415);
        setIntField(term3418, term3418.getClass(), "totalSeconds", 0);
        setField(term3418, term3418.getClass(), "id", null);
        setField(term3414, term3414.getClass(), "zone", term3418);
        setField(term3409, term3409.getClass(), "clock", term3414);
        setField(term3408, term3408.getClass(), "configuration", term3409);
        setField(term3408, term3408.getClass(), "cache", term3420);
        setField(term3388, term3388.getClass(), "context", term3408);
        setIntField(term3428, term3428.getClass(), "maxCollectionSize", 10);
        setIntField(term3428, term3428.getClass(), "minCollectionSize", 2);
        setIntField(term3428, term3428.getClass(), "streamSize", 3);
        setBooleanField(term3428, term3428.getClass(), "usePositiveNumbersOnly", true);
        setField(term3428, term3428.getClass(), "clock", null);
        setField(term3427, term3427.getClass(), "configuration", term3428);
        setField(term3427, term3427.getClass(), "cache", term3433);
        setField(term3426, term3426.getClass(), "context", term3427);
        setField(term3425, term3425.getClass(), "specimenFactory", term3426);
        setLongField(term3440, term3440.getClass(), "value", 108201103099893L);
        setField(term3439, term3439.getClass(), "seed", term3440);
        setDoubleField(term3439, term3439.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term3439, term3439.getClass(), "haveNextNextGaussian", false);
        setField(term3438, term3438.getClass(), "random", term3439);
        setField(term3425, term3425.getClass(), "random", term3438);
        setField(term3388, term3388.getClass(), "instanceFactory", term3425);
        HashMap term3447 = new HashMap();
        term3444 = newInstance(Class.forName("com.github.nylle.javafixture.CustomizationContext"));
        Object term3445 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term3446 = (Object[]) newArray("java.lang.Object", 0);
        setField(term3445, term3445.getClass(), "elements", term3446);
        setField(term3444, term3444.getClass(), "ignoredFields", term3445);
        setField(term3444, term3444.getClass(), "customFields", term3447);
        setBooleanField(term3444, term3444.getClass(), "useRandomConstructor", true);
        term3453 = (Object[]) newArray("java.lang.annotation.Annotation", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.InterfaceSpecimen");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.annotation.Annotation"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term3444;
        args[1] = term3453;
        callMethod(klass, "create", argTypes, term3388, args);
    }

};


