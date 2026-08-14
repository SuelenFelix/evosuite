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

public class SpecialSpecimen_createBigDecimal_9267261785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1816;

    public SpecialSpecimen_createBigDecimal_9267261785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1819 = Class.forName((String) "java.io.OutputStreamWriter");
        HashMap term1848 = new HashMap();
        term1816 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.SpecialSpecimen"));
        Object term1817 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term1818 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term1832 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term1833 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term1834 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term1835 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term1836 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term1837 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term1842 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term1843 = newInstance(Class.forName("java.time.Instant"));
        Object term1846 = newInstance(Class.forName("java.time.ZoneOffset"));
        setField(term1818, term1818.getClass(), "genericDeclaration", term1819);
        setField(term1818, term1818.getClass(), "name", "T");
        setField(term1833, term1833.getClass(), "path", null);
        setElement(term1832, 0, term1833);
        setField(term1818, term1818.getClass(), "bounds", term1832);
        setField(term1834, term1834.getClass(), "decl", term1819);
        setField(term1835, term1835.getClass(), "recvr", term1819);
        setField(term1835, term1835.getClass(), "enclosingScope", null);
        setField(term1834, term1834.getClass(), "scope", term1835);
        setField(term1818, term1818.getClass(), "factory", term1834);
        setField(term1817, term1817.getClass(), "type", term1818);
        setField(term1816, term1816.getClass(), "type", term1817);
        setIntField(term1837, term1837.getClass(), "maxCollectionSize", 10);
        setIntField(term1837, term1837.getClass(), "minCollectionSize", 2);
        setIntField(term1837, term1837.getClass(), "streamSize", 3);
        setBooleanField(term1837, term1837.getClass(), "usePositiveNumbersOnly", true);
        setLongField(term1843, term1843.getClass(), "seconds", 1786472233L);
        setIntField(term1843, term1843.getClass(), "nanos", 779703000);
        setField(term1842, term1842.getClass(), "instant", term1843);
        setIntField(term1846, term1846.getClass(), "totalSeconds", 0);
        setField(term1846, term1846.getClass(), "id", null);
        setField(term1842, term1842.getClass(), "zone", term1846);
        setField(term1837, term1837.getClass(), "clock", term1842);
        setField(term1836, term1836.getClass(), "configuration", term1837);
        setField(term1836, term1836.getClass(), "cache", term1848);
        setField(term1816, term1816.getClass(), "context", term1836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.SpecialSpecimen");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createBigDecimal", argTypes, term1816, args);
    }

};


