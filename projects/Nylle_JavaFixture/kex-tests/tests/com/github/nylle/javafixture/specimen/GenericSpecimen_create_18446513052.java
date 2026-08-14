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

public class GenericSpecimen_create_18446513052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2367;
     Object term2441;
     Object term2450;

    public GenericSpecimen_create_18446513052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2370 = Class.forName((String) "java.nio.channels.NoConnectionPendingException");
        HashMap term2399 = new HashMap();
        HashMap term2412 = new HashMap();
        HashMap term2425 = new HashMap();
        HashMap term2436 = new HashMap();
        term2367 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.GenericSpecimen"));
        Object term2368 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term2369 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term2383 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term2384 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term2385 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term2386 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term2387 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2388 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2393 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term2394 = newInstance(Class.forName("java.time.Instant"));
        Object term2397 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term2404 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term2405 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2406 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2411 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term2417 = newInstance(Class.forName("com.github.nylle.javafixture.InstanceFactory"));
        Object term2418 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term2419 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2420 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2430 = newInstance(Class.forName("com.github.nylle.javafixture.PseudoRandom"));
        Object term2431 = newInstance(Class.forName("java.util.Random"));
        Object term2432 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term2369, term2369.getClass(), "genericDeclaration", term2370);
        setField(term2369, term2369.getClass(), "name", "T");
        setField(term2384, term2384.getClass(), "path", null);
        setElement(term2383, 0, term2384);
        setField(term2369, term2369.getClass(), "bounds", term2383);
        setField(term2385, term2385.getClass(), "decl", term2370);
        setField(term2386, term2386.getClass(), "recvr", term2370);
        setField(term2386, term2386.getClass(), "enclosingScope", null);
        setField(term2385, term2385.getClass(), "scope", term2386);
        setField(term2369, term2369.getClass(), "factory", term2385);
        setField(term2368, term2368.getClass(), "type", term2369);
        setField(term2367, term2367.getClass(), "type", term2368);
        setIntField(term2388, term2388.getClass(), "maxCollectionSize", 10);
        setIntField(term2388, term2388.getClass(), "minCollectionSize", 2);
        setIntField(term2388, term2388.getClass(), "streamSize", 3);
        setBooleanField(term2388, term2388.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term2394, term2394.getClass(), "seconds", 1786472234L);
        setIntField(term2394, term2394.getClass(), "nanos", 578720000);
        setField(term2393, term2393.getClass(), "instant", term2394);
        setIntField(term2397, term2397.getClass(), "totalSeconds", 0);
        setField(term2397, term2397.getClass(), "id", null);
        setField(term2393, term2393.getClass(), "zone", term2397);
        setField(term2388, term2388.getClass(), "clock", term2393);
        setField(term2387, term2387.getClass(), "configuration", term2388);
        setField(term2387, term2387.getClass(), "cache", term2399);
        setField(term2367, term2367.getClass(), "context", term2387);
        setIntField(term2406, term2406.getClass(), "maxCollectionSize", 10);
        setIntField(term2406, term2406.getClass(), "minCollectionSize", 2);
        setIntField(term2406, term2406.getClass(), "streamSize", 3);
        setBooleanField(term2406, term2406.getClass(), "usePositiveNumbersOnly", true);
        setField(term2411, term2411.getClass(), "instant", null);
        setField(term2411, term2411.getClass(), "zone", term2397);
        setField(term2406, term2406.getClass(), "clock", term2411);
        setField(term2405, term2405.getClass(), "configuration", term2406);
        setField(term2405, term2405.getClass(), "cache", term2412);
        setField(term2404, term2404.getClass(), "context", term2405);
        setField(term2367, term2367.getClass(), "specimenFactory", term2404);
        setIntField(term2420, term2420.getClass(), "maxCollectionSize", 10);
        setIntField(term2420, term2420.getClass(), "minCollectionSize", 2);
        setIntField(term2420, term2420.getClass(), "streamSize", 3);
        setBooleanField(term2420, term2420.getClass(), "usePositiveNumbersOnly", true);
        setField(term2420, term2420.getClass(), "clock", null);
        setField(term2419, term2419.getClass(), "configuration", term2420);
        setField(term2419, term2419.getClass(), "cache", term2425);
        setField(term2418, term2418.getClass(), "context", term2419);
        setField(term2417, term2417.getClass(), "specimenFactory", term2418);
        setLongField(term2432, term2432.getClass(), "value", 35430498696854L);
        setField(term2431, term2431.getClass(), "seed", term2432);
        setDoubleField(term2431, term2431.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term2431, term2431.getClass(), "haveNextNextGaussian", false);
        setField(term2430, term2430.getClass(), "random", term2431);
        setField(term2417, term2417.getClass(), "random", term2430);
        setField(term2367, term2367.getClass(), "instanceFactory", term2417);
        setField(term2367, term2367.getClass(), "specimens", term2436);
        HashMap term2444 = new HashMap();
        term2441 = newInstance(Class.forName("com.github.nylle.javafixture.CustomizationContext"));
        Object term2442 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term2443 = (Object[]) newArray("java.lang.Object", 0);
        setField(term2442, term2442.getClass(), "elements", term2443);
        setField(term2441, term2441.getClass(), "ignoredFields", term2442);
        setField(term2441, term2441.getClass(), "customFields", term2444);
        setBooleanField(term2441, term2441.getClass(), "useRandomConstructor", false);
        term2450 = (Object[]) newArray("java.lang.annotation.Annotation", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.GenericSpecimen");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.annotation.Annotation"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2441;
        args[1] = term2450;
        callMethod(klass, "create", argTypes, term2367, args);
    }

};


