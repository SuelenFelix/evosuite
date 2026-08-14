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

public class TimeSpecimen_create_15118668071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257;
     Object term299;
     Object term308;

    public TimeSpecimen_create_15118668071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term260 = Class.forName((String) "java.lang.ClassLoaderHelper");
        HashMap term294 = new HashMap();
        term257 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.TimeSpecimen"));
        Object term258 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term259 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term273 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term274 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term275 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term276 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term277 = newInstance(Class.forName("java.util.Random"));
        Object term278 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term282 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term283 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term288 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term289 = newInstance(Class.forName("java.time.Instant"));
        Object term292 = newInstance(Class.forName("java.time.ZoneOffset"));
        setField(term259, term259.getClass(), "genericDeclaration", term260);
        setField(term259, term259.getClass(), "name", "T");
        setField(term274, term274.getClass(), "path", null);
        setElement(term273, 0, term274);
        setField(term259, term259.getClass(), "bounds", term273);
        setField(term275, term275.getClass(), "decl", term260);
        setField(term276, term276.getClass(), "recvr", term260);
        setField(term276, term276.getClass(), "enclosingScope", null);
        setField(term275, term275.getClass(), "scope", term276);
        setField(term259, term259.getClass(), "factory", term275);
        setField(term258, term258.getClass(), "type", term259);
        setField(term257, term257.getClass(), "type", term258);
        setLongField(term278, term278.getClass(), "value", 252938292071703L);
        setField(term277, term277.getClass(), "seed", term278);
        setDoubleField(term277, term277.getClass(), "nextNextGaussian", 0.13238746331190498);
        setBooleanField(term277, term277.getClass(), "haveNextNextGaussian", true);
        setField(term257, term257.getClass(), "random", term277);
        setIntField(term283, term283.getClass(), "maxCollectionSize", 10);
        setIntField(term283, term283.getClass(), "minCollectionSize", 2);
        setIntField(term283, term283.getClass(), "streamSize", 3);
        setBooleanField(term283, term283.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term289, term289.getClass(), "seconds", 1786472231L);
        setIntField(term289, term289.getClass(), "nanos", 848556000);
        setField(term288, term288.getClass(), "instant", term289);
        setIntField(term292, term292.getClass(), "totalSeconds", 0);
        setField(term292, term292.getClass(), "id", null);
        setField(term288, term288.getClass(), "zone", term292);
        setField(term283, term283.getClass(), "clock", term288);
        setField(term282, term282.getClass(), "configuration", term283);
        setField(term282, term282.getClass(), "cache", term294);
        setField(term257, term257.getClass(), "context", term282);
        HashMap term302 = new HashMap();
        term299 = newInstance(Class.forName("com.github.nylle.javafixture.CustomizationContext"));
        Object term300 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term301 = (Object[]) newArray("java.lang.Object", 0);
        setField(term300, term300.getClass(), "elements", term301);
        setField(term299, term299.getClass(), "ignoredFields", term300);
        setField(term299, term299.getClass(), "customFields", term302);
        setBooleanField(term299, term299.getClass(), "useRandomConstructor", true);
        term308 = (Object[]) newArray("java.lang.annotation.Annotation", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.TimeSpecimen");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.annotation.Annotation"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term299;
        args[1] = term308;
        callMethod(klass, "create", argTypes, term257, args);
    }

};


