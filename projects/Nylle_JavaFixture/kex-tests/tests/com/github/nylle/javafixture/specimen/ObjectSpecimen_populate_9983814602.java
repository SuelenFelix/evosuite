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

public class ObjectSpecimen_populate_9983814602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term658;
     Object term727;

    public ObjectSpecimen_populate_9983814602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term661 = Class.forName((String) "java.lang.ExceptionInInitializerError");
        HashMap term690 = new HashMap();
        HashMap term703 = new HashMap();
        HashMap term716 = new HashMap();
        term658 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.ObjectSpecimen"));
        Object term659 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term660 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term674 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term675 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term676 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term677 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term678 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term679 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term684 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term685 = newInstance(Class.forName("java.time.Instant"));
        Object term688 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term695 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term696 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term697 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term702 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term708 = newInstance(Class.forName("com.github.nylle.javafixture.InstanceFactory"));
        Object term709 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term710 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term711 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term721 = newInstance(Class.forName("com.github.nylle.javafixture.PseudoRandom"));
        Object term722 = newInstance(Class.forName("java.util.Random"));
        Object term723 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term660, term660.getClass(), "genericDeclaration", term661);
        setField(term660, term660.getClass(), "name", "T");
        setField(term675, term675.getClass(), "path", null);
        setElement(term674, 0, term675);
        setField(term660, term660.getClass(), "bounds", term674);
        setField(term676, term676.getClass(), "decl", term661);
        setField(term677, term677.getClass(), "recvr", term661);
        setField(term677, term677.getClass(), "enclosingScope", null);
        setField(term676, term676.getClass(), "scope", term677);
        setField(term660, term660.getClass(), "factory", term676);
        setField(term659, term659.getClass(), "type", term660);
        setField(term658, term658.getClass(), "type", term659);
        setIntField(term679, term679.getClass(), "maxCollectionSize", 10);
        setIntField(term679, term679.getClass(), "minCollectionSize", 2);
        setIntField(term679, term679.getClass(), "streamSize", 3);
        setBooleanField(term679, term679.getClass(), "usePositiveNumbersOnly", true);
        setLongField(term685, term685.getClass(), "seconds", 1786472232L);
        setIntField(term685, term685.getClass(), "nanos", 360917000);
        setField(term684, term684.getClass(), "instant", term685);
        setIntField(term688, term688.getClass(), "totalSeconds", 0);
        setField(term688, term688.getClass(), "id", null);
        setField(term684, term684.getClass(), "zone", term688);
        setField(term679, term679.getClass(), "clock", term684);
        setField(term678, term678.getClass(), "configuration", term679);
        setField(term678, term678.getClass(), "cache", term690);
        setField(term658, term658.getClass(), "context", term678);
        setIntField(term697, term697.getClass(), "maxCollectionSize", 10);
        setIntField(term697, term697.getClass(), "minCollectionSize", 2);
        setIntField(term697, term697.getClass(), "streamSize", 3);
        setBooleanField(term697, term697.getClass(), "usePositiveNumbersOnly", true);
        setField(term702, term702.getClass(), "instant", null);
        setField(term702, term702.getClass(), "zone", term688);
        setField(term697, term697.getClass(), "clock", term702);
        setField(term696, term696.getClass(), "configuration", term697);
        setField(term696, term696.getClass(), "cache", term703);
        setField(term695, term695.getClass(), "context", term696);
        setField(term658, term658.getClass(), "specimenFactory", term695);
        setIntField(term711, term711.getClass(), "maxCollectionSize", 10);
        setIntField(term711, term711.getClass(), "minCollectionSize", 2);
        setIntField(term711, term711.getClass(), "streamSize", 3);
        setBooleanField(term711, term711.getClass(), "usePositiveNumbersOnly", false);
        setField(term711, term711.getClass(), "clock", null);
        setField(term710, term710.getClass(), "configuration", term711);
        setField(term710, term710.getClass(), "cache", term716);
        setField(term709, term709.getClass(), "context", term710);
        setField(term708, term708.getClass(), "specimenFactory", term709);
        setLongField(term723, term723.getClass(), "value", 123281070463160L);
        setField(term722, term722.getClass(), "seed", term723);
        setDoubleField(term722, term722.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term722, term722.getClass(), "haveNextNextGaussian", false);
        setField(term721, term721.getClass(), "random", term722);
        setField(term708, term708.getClass(), "random", term721);
        setField(term658, term658.getClass(), "instanceFactory", term708);
        HashMap term730 = new HashMap();
        term727 = newInstance(Class.forName("com.github.nylle.javafixture.CustomizationContext"));
        Object term728 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term729 = (Object[]) newArray("java.lang.Object", 0);
        setField(term728, term728.getClass(), "elements", term729);
        setField(term727, term727.getClass(), "ignoredFields", term728);
        setField(term727, term727.getClass(), "customFields", term730);
        setBooleanField(term727, term727.getClass(), "useRandomConstructor", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.ObjectSpecimen");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        Object[] args = new Object[1];
        args[0] = term727;
        callMethod(klass, "populate", argTypes, term658, args);
    }

};


