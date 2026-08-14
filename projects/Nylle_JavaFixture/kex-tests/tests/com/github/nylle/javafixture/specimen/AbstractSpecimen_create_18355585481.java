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

public class AbstractSpecimen_create_18355585481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36;
     Object term105;
     Object term114;

    public AbstractSpecimen_create_18355585481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39 = Class.forName((String) "java.util.zip.CheckedOutputStream");
        HashMap term68 = new HashMap();
        HashMap term81 = new HashMap();
        HashMap term94 = new HashMap();
        term36 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.AbstractSpecimen"));
        Object term37 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term38 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term52 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term53 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term54 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term55 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term56 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term57 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term62 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term63 = newInstance(Class.forName("java.time.Instant"));
        Object term66 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term73 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term74 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term75 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term80 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term86 = newInstance(Class.forName("com.github.nylle.javafixture.InstanceFactory"));
        Object term87 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term88 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term89 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term99 = newInstance(Class.forName("com.github.nylle.javafixture.PseudoRandom"));
        Object term100 = newInstance(Class.forName("java.util.Random"));
        Object term101 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term38, term38.getClass(), "genericDeclaration", term39);
        setField(term38, term38.getClass(), "name", "T");
        setField(term53, term53.getClass(), "path", null);
        setElement(term52, 0, term53);
        setField(term38, term38.getClass(), "bounds", term52);
        setField(term54, term54.getClass(), "decl", term39);
        setField(term55, term55.getClass(), "recvr", term39);
        setField(term55, term55.getClass(), "enclosingScope", null);
        setField(term54, term54.getClass(), "scope", term55);
        setField(term38, term38.getClass(), "factory", term54);
        setField(term37, term37.getClass(), "type", term38);
        setField(term36, term36.getClass(), "type", term37);
        setIntField(term57, term57.getClass(), "maxCollectionSize", 10);
        setIntField(term57, term57.getClass(), "minCollectionSize", 2);
        setIntField(term57, term57.getClass(), "streamSize", 3);
        setBooleanField(term57, term57.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term63, term63.getClass(), "seconds", 1786472230L);
        setIntField(term63, term63.getClass(), "nanos", 596353000);
        setField(term62, term62.getClass(), "instant", term63);
        setIntField(term66, term66.getClass(), "totalSeconds", 0);
        setField(term66, term66.getClass(), "id", null);
        setField(term62, term62.getClass(), "zone", term66);
        setField(term57, term57.getClass(), "clock", term62);
        setField(term56, term56.getClass(), "configuration", term57);
        setField(term56, term56.getClass(), "cache", term68);
        setField(term36, term36.getClass(), "context", term56);
        setIntField(term75, term75.getClass(), "maxCollectionSize", 10);
        setIntField(term75, term75.getClass(), "minCollectionSize", 2);
        setIntField(term75, term75.getClass(), "streamSize", 3);
        setBooleanField(term75, term75.getClass(), "usePositiveNumbersOnly", false);
        setField(term80, term80.getClass(), "instant", null);
        setField(term80, term80.getClass(), "zone", term66);
        setField(term75, term75.getClass(), "clock", term80);
        setField(term74, term74.getClass(), "configuration", term75);
        setField(term74, term74.getClass(), "cache", term81);
        setField(term73, term73.getClass(), "context", term74);
        setField(term36, term36.getClass(), "specimenFactory", term73);
        setIntField(term89, term89.getClass(), "maxCollectionSize", 10);
        setIntField(term89, term89.getClass(), "minCollectionSize", 2);
        setIntField(term89, term89.getClass(), "streamSize", 3);
        setBooleanField(term89, term89.getClass(), "usePositiveNumbersOnly", true);
        setField(term89, term89.getClass(), "clock", null);
        setField(term88, term88.getClass(), "configuration", term89);
        setField(term88, term88.getClass(), "cache", term94);
        setField(term87, term87.getClass(), "context", term88);
        setField(term86, term86.getClass(), "specimenFactory", term87);
        setLongField(term101, term101.getClass(), "value", 217538983852852L);
        setField(term100, term100.getClass(), "seed", term101);
        setDoubleField(term100, term100.getClass(), "nextNextGaussian", 0.0);
        setBooleanField(term100, term100.getClass(), "haveNextNextGaussian", false);
        setField(term99, term99.getClass(), "random", term100);
        setField(term86, term86.getClass(), "random", term99);
        setField(term36, term36.getClass(), "instanceFactory", term86);
        HashMap term108 = new HashMap();
        term105 = newInstance(Class.forName("com.github.nylle.javafixture.CustomizationContext"));
        Object term106 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term107 = (Object[]) newArray("java.lang.Object", 0);
        setField(term106, term106.getClass(), "elements", term107);
        setField(term105, term105.getClass(), "ignoredFields", term106);
        setField(term105, term105.getClass(), "customFields", term108);
        setBooleanField(term105, term105.getClass(), "useRandomConstructor", true);
        term114 = (Object[]) newArray("java.lang.annotation.Annotation", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.AbstractSpecimen");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.annotation.Annotation"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term105;
        args[1] = term114;
        callMethod(klass, "create", argTypes, term36, args);
    }

};


