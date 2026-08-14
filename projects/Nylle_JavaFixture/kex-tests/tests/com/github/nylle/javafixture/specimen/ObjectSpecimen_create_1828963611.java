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

public class ObjectSpecimen_create_1828963611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429;
     Object term498;
     Object term507;

    public ObjectSpecimen_create_1828963611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term432 = Class.forName((String) "java.lang.invoke.AbstractConstantGroup$AsIterator");
        HashMap term461 = new HashMap();
        HashMap term474 = new HashMap();
        HashMap term487 = new HashMap();
        term429 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.ObjectSpecimen"));
        Object term430 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term431 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term445 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term446 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term447 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term448 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term449 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term450 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term455 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term456 = newInstance(Class.forName("java.time.Instant"));
        Object term459 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term466 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term467 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term468 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term473 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term479 = newInstance(Class.forName("com.github.nylle.javafixture.InstanceFactory"));
        Object term480 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term481 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term482 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term492 = newInstance(Class.forName("com.github.nylle.javafixture.PseudoRandom"));
        Object term493 = newInstance(Class.forName("java.util.Random"));
        Object term494 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term431, term431.getClass(), "genericDeclaration", term432);
        setField(term431, term431.getClass(), "name", "T");
        setField(term446, term446.getClass(), "path", null);
        setElement(term445, 0, term446);
        setField(term431, term431.getClass(), "bounds", term445);
        setField(term447, term447.getClass(), "decl", term432);
        setField(term448, term448.getClass(), "recvr", term432);
        setField(term448, term448.getClass(), "enclosingScope", null);
        setField(term447, term447.getClass(), "scope", term448);
        setField(term431, term431.getClass(), "factory", term447);
        setField(term430, term430.getClass(), "type", term431);
        setField(term429, term429.getClass(), "type", term430);
        setIntField(term450, term450.getClass(), "maxCollectionSize", 10);
        setIntField(term450, term450.getClass(), "minCollectionSize", 2);
        setIntField(term450, term450.getClass(), "streamSize", 3);
        setBooleanField(term450, term450.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term456, term456.getClass(), "seconds", 1786472232L);
        setIntField(term456, term456.getClass(), "nanos", 257598000);
        setField(term455, term455.getClass(), "instant", term456);
        setIntField(term459, term459.getClass(), "totalSeconds", 0);
        setField(term459, term459.getClass(), "id", null);
        setField(term455, term455.getClass(), "zone", term459);
        setField(term450, term450.getClass(), "clock", term455);
        setField(term449, term449.getClass(), "configuration", term450);
        setField(term449, term449.getClass(), "cache", term461);
        setField(term429, term429.getClass(), "context", term449);
        setIntField(term468, term468.getClass(), "maxCollectionSize", 10);
        setIntField(term468, term468.getClass(), "minCollectionSize", 2);
        setIntField(term468, term468.getClass(), "streamSize", 3);
        setBooleanField(term468, term468.getClass(), "usePositiveNumbersOnly", true);
        setField(term473, term473.getClass(), "instant", null);
        setField(term473, term473.getClass(), "zone", term459);
        setField(term468, term468.getClass(), "clock", term473);
        setField(term467, term467.getClass(), "configuration", term468);
        setField(term467, term467.getClass(), "cache", term474);
        setField(term466, term466.getClass(), "context", term467);
        setField(term429, term429.getClass(), "specimenFactory", term466);
        setIntField(term482, term482.getClass(), "maxCollectionSize", 10);
        setIntField(term482, term482.getClass(), "minCollectionSize", 2);
        setIntField(term482, term482.getClass(), "streamSize", 3);
        setBooleanField(term482, term482.getClass(), "usePositiveNumbersOnly", false);
        setField(term482, term482.getClass(), "clock", null);
        setField(term481, term481.getClass(), "configuration", term482);
        setField(term481, term481.getClass(), "cache", term487);
        setField(term480, term480.getClass(), "context", term481);
        setField(term479, term479.getClass(), "specimenFactory", term480);
        setLongField(term494, term494.getClass(), "value", 197076286705622L);
        setField(term493, term493.getClass(), "seed", term494);
        setDoubleField(term493, term493.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term493, term493.getClass(), "haveNextNextGaussian", false);
        setField(term492, term492.getClass(), "random", term493);
        setField(term479, term479.getClass(), "random", term492);
        setField(term429, term429.getClass(), "instanceFactory", term479);
        HashMap term501 = new HashMap();
        term498 = newInstance(Class.forName("com.github.nylle.javafixture.CustomizationContext"));
        Object term499 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term500 = (Object[]) newArray("java.lang.Object", 0);
        setField(term499, term499.getClass(), "elements", term500);
        setField(term498, term498.getClass(), "ignoredFields", term499);
        setField(term498, term498.getClass(), "customFields", term501);
        setBooleanField(term498, term498.getClass(), "useRandomConstructor", false);
        term507 = (Object[]) newArray("java.lang.annotation.Annotation", 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.ObjectSpecimen");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.annotation.Annotation"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term498;
        args[1] = term507;
        callMethod(klass, "create", argTypes, term429, args);
    }

};


