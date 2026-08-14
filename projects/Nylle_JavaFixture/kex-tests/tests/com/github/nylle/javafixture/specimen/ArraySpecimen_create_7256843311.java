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

public class ArraySpecimen_create_7256843311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2172;
     Object term2222;
     Object term2231;

    public ArraySpecimen_create_7256843311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2175 = Class.forName((String) "java.lang.invoke.VarHandleFloats");
        HashMap term2204 = new HashMap();
        HashMap term2217 = new HashMap();
        term2172 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.ArraySpecimen"));
        Object term2173 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term2174 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term2188 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term2189 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term2190 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term2191 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term2192 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2193 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2198 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term2199 = newInstance(Class.forName("java.time.Instant"));
        Object term2202 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term2209 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenFactory"));
        Object term2210 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term2211 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term2216 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        setField(term2174, term2174.getClass(), "genericDeclaration", term2175);
        setField(term2174, term2174.getClass(), "name", "T");
        setField(term2189, term2189.getClass(), "path", null);
        setElement(term2188, 0, term2189);
        setField(term2174, term2174.getClass(), "bounds", term2188);
        setField(term2190, term2190.getClass(), "decl", term2175);
        setField(term2191, term2191.getClass(), "recvr", term2175);
        setField(term2191, term2191.getClass(), "enclosingScope", null);
        setField(term2190, term2190.getClass(), "scope", term2191);
        setField(term2174, term2174.getClass(), "factory", term2190);
        setField(term2173, term2173.getClass(), "type", term2174);
        setField(term2172, term2172.getClass(), "type", term2173);
        setIntField(term2193, term2193.getClass(), "maxCollectionSize", 10);
        setIntField(term2193, term2193.getClass(), "minCollectionSize", 2);
        setIntField(term2193, term2193.getClass(), "streamSize", 3);
        setBooleanField(term2193, term2193.getClass(), "usePositiveNumbersOnly", true);
        setLongField(term2199, term2199.getClass(), "seconds", 1786472234L);
        setIntField(term2199, term2199.getClass(), "nanos", 244498000);
        setField(term2198, term2198.getClass(), "instant", term2199);
        setIntField(term2202, term2202.getClass(), "totalSeconds", 0);
        setField(term2202, term2202.getClass(), "id", null);
        setField(term2198, term2198.getClass(), "zone", term2202);
        setField(term2193, term2193.getClass(), "clock", term2198);
        setField(term2192, term2192.getClass(), "configuration", term2193);
        setField(term2192, term2192.getClass(), "cache", term2204);
        setField(term2172, term2172.getClass(), "context", term2192);
        setIntField(term2211, term2211.getClass(), "maxCollectionSize", 10);
        setIntField(term2211, term2211.getClass(), "minCollectionSize", 2);
        setIntField(term2211, term2211.getClass(), "streamSize", 3);
        setBooleanField(term2211, term2211.getClass(), "usePositiveNumbersOnly", true);
        setField(term2216, term2216.getClass(), "instant", null);
        setField(term2216, term2216.getClass(), "zone", term2202);
        setField(term2211, term2211.getClass(), "clock", term2216);
        setField(term2210, term2210.getClass(), "configuration", term2211);
        setField(term2210, term2210.getClass(), "cache", term2217);
        setField(term2209, term2209.getClass(), "context", term2210);
        setField(term2172, term2172.getClass(), "specimenFactory", term2209);
        HashMap term2225 = new HashMap();
        term2222 = newInstance(Class.forName("com.github.nylle.javafixture.CustomizationContext"));
        Object term2223 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term2224 = (Object[]) newArray("java.lang.Object", 0);
        setField(term2223, term2223.getClass(), "elements", term2224);
        setField(term2222, term2222.getClass(), "ignoredFields", term2223);
        setField(term2222, term2222.getClass(), "customFields", term2225);
        setBooleanField(term2222, term2222.getClass(), "useRandomConstructor", true);
        term2231 = (Object[]) newArray("java.lang.annotation.Annotation", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.ArraySpecimen");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.annotation.Annotation"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2222;
        args[1] = term2231;
        callMethod(klass, "create", argTypes, term2172, args);
    }

};


