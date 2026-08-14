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

public class MapSpecimen_create_6120557941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term887;
     Object term924;
     Object term933;

    public MapSpecimen_create_6120557941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term890 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$KeyIterator");
        HashMap term919 = new HashMap();
        term887 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.MapSpecimen"));
        Object term888 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term889 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term903 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term904 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term905 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term906 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term907 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term908 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term913 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term914 = newInstance(Class.forName("java.time.Instant"));
        Object term917 = newInstance(Class.forName("java.time.ZoneOffset"));
        setField(term889, term889.getClass(), "genericDeclaration", term890);
        setField(term889, term889.getClass(), "name", "T");
        setField(term904, term904.getClass(), "path", null);
        setElement(term903, 0, term904);
        setField(term889, term889.getClass(), "bounds", term903);
        setField(term905, term905.getClass(), "decl", term890);
        setField(term906, term906.getClass(), "recvr", term890);
        setField(term906, term906.getClass(), "enclosingScope", null);
        setField(term905, term905.getClass(), "scope", term906);
        setField(term889, term889.getClass(), "factory", term905);
        setField(term888, term888.getClass(), "type", term889);
        setField(term887, term887.getClass(), "type", term888);
        setIntField(term908, term908.getClass(), "maxCollectionSize", 10);
        setIntField(term908, term908.getClass(), "minCollectionSize", 2);
        setIntField(term908, term908.getClass(), "streamSize", 3);
        setBooleanField(term908, term908.getClass(), "usePositiveNumbersOnly", true);
        setLongField(term914, term914.getClass(), "seconds", 1786472232L);
        setIntField(term914, term914.getClass(), "nanos", 813218000);
        setField(term913, term913.getClass(), "instant", term914);
        setIntField(term917, term917.getClass(), "totalSeconds", 0);
        setField(term917, term917.getClass(), "id", null);
        setField(term913, term913.getClass(), "zone", term917);
        setField(term908, term908.getClass(), "clock", term913);
        setField(term907, term907.getClass(), "configuration", term908);
        setField(term907, term907.getClass(), "cache", term919);
        setField(term887, term887.getClass(), "context", term907);
        setField(term887, term887.getClass(), "keySpecimen", null);
        setField(term887, term887.getClass(), "valueSpecimen", null);
        HashMap term927 = new HashMap();
        term924 = newInstance(Class.forName("com.github.nylle.javafixture.CustomizationContext"));
        Object term925 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term926 = (Object[]) newArray("java.lang.Object", 0);
        setField(term925, term925.getClass(), "elements", term926);
        setField(term924, term924.getClass(), "ignoredFields", term925);
        setField(term924, term924.getClass(), "customFields", term927);
        setBooleanField(term924, term924.getClass(), "useRandomConstructor", true);
        term933 = (Object[]) newArray("java.lang.annotation.Annotation", 6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.MapSpecimen");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.annotation.Annotation"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term924;
        args[1] = term933;
        callMethod(klass, "create", argTypes, term887, args);
    }

};


