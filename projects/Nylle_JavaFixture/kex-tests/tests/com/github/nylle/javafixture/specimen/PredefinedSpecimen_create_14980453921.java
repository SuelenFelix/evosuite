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
import java.util.HashMap;
import java.lang.String;

public class PredefinedSpecimen_create_14980453921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1954;
     Object term1991;
     Object term2000;

    public PredefinedSpecimen_create_14980453921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1967 = new HashMap();
        Class<? extends Object> term1974 = Class.forName((String) "java.lang.LiveStackFrameInfo$PrimitiveSlot32");
        term1954 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.PredefinedSpecimen"));
        Object term1955 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term1956 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term1961 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term1962 = newInstance(Class.forName("java.time.Instant"));
        Object term1965 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1972 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term1973 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term1987 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term1988 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term1989 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term1990 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        setIntField(term1956, term1956.getClass(), "maxCollectionSize", 10);
        setIntField(term1956, term1956.getClass(), "minCollectionSize", 2);
        setIntField(term1956, term1956.getClass(), "streamSize", 3);
        setBooleanField(term1956, term1956.getClass(), "usePositiveNumbersOnly", true);
        setLongField(term1962, term1962.getClass(), "seconds", 1786472234L);
        setIntField(term1962, term1962.getClass(), "nanos", 17053000);
        setField(term1961, term1961.getClass(), "instant", term1962);
        setIntField(term1965, term1965.getClass(), "totalSeconds", 0);
        setField(term1965, term1965.getClass(), "id", null);
        setField(term1961, term1961.getClass(), "zone", term1965);
        setField(term1956, term1956.getClass(), "clock", term1961);
        setField(term1955, term1955.getClass(), "configuration", term1956);
        setField(term1955, term1955.getClass(), "cache", term1967);
        setField(term1954, term1954.getClass(), "context", term1955);
        setField(term1973, term1973.getClass(), "genericDeclaration", term1974);
        setField(term1973, term1973.getClass(), "name", "T");
        setField(term1988, term1988.getClass(), "path", null);
        setElement(term1987, 0, term1988);
        setField(term1973, term1973.getClass(), "bounds", term1987);
        setField(term1989, term1989.getClass(), "decl", term1974);
        setField(term1990, term1990.getClass(), "recvr", term1974);
        setField(term1990, term1990.getClass(), "enclosingScope", null);
        setField(term1989, term1989.getClass(), "scope", term1990);
        setField(term1973, term1973.getClass(), "factory", term1989);
        setField(term1972, term1972.getClass(), "type", term1973);
        setField(term1954, term1954.getClass(), "type", term1972);
        HashMap term1994 = new HashMap();
        term1991 = newInstance(Class.forName("com.github.nylle.javafixture.CustomizationContext"));
        Object term1992 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term1993 = (Object[]) newArray("java.lang.Object", 0);
        setField(term1992, term1992.getClass(), "elements", term1993);
        setField(term1991, term1991.getClass(), "ignoredFields", term1992);
        setField(term1991, term1991.getClass(), "customFields", term1994);
        setBooleanField(term1991, term1991.getClass(), "useRandomConstructor", true);
        term2000 = (Object[]) newArray("java.lang.annotation.Annotation", 6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.PredefinedSpecimen");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.annotation.Annotation"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1991;
        args[1] = term2000;
        callMethod(klass, "create", argTypes, term1954, args);
    }

};


