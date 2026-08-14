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

public class SpecialSpecimen_create_5757168111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1496;
     Object term1533;
     Object term1542;

    public SpecialSpecimen_create_5757168111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1499 = Class.forName((String) "java.nio.charset.MalformedInputException");
        HashMap term1528 = new HashMap();
        term1496 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.SpecialSpecimen"));
        Object term1497 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term1498 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term1512 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term1513 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term1514 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term1515 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term1516 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term1517 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term1522 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term1523 = newInstance(Class.forName("java.time.Instant"));
        Object term1526 = newInstance(Class.forName("java.time.ZoneOffset"));
        setField(term1498, term1498.getClass(), "genericDeclaration", term1499);
        setField(term1498, term1498.getClass(), "name", "T");
        setField(term1513, term1513.getClass(), "path", null);
        setElement(term1512, 0, term1513);
        setField(term1498, term1498.getClass(), "bounds", term1512);
        setField(term1514, term1514.getClass(), "decl", term1499);
        setField(term1515, term1515.getClass(), "recvr", term1499);
        setField(term1515, term1515.getClass(), "enclosingScope", null);
        setField(term1514, term1514.getClass(), "scope", term1515);
        setField(term1498, term1498.getClass(), "factory", term1514);
        setField(term1497, term1497.getClass(), "type", term1498);
        setField(term1496, term1496.getClass(), "type", term1497);
        setIntField(term1517, term1517.getClass(), "maxCollectionSize", 10);
        setIntField(term1517, term1517.getClass(), "minCollectionSize", 2);
        setIntField(term1517, term1517.getClass(), "streamSize", 3);
        setBooleanField(term1517, term1517.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term1523, term1523.getClass(), "seconds", 1786472233L);
        setIntField(term1523, term1523.getClass(), "nanos", 488309000);
        setField(term1522, term1522.getClass(), "instant", term1523);
        setIntField(term1526, term1526.getClass(), "totalSeconds", 0);
        setField(term1526, term1526.getClass(), "id", null);
        setField(term1522, term1522.getClass(), "zone", term1526);
        setField(term1517, term1517.getClass(), "clock", term1522);
        setField(term1516, term1516.getClass(), "configuration", term1517);
        setField(term1516, term1516.getClass(), "cache", term1528);
        setField(term1496, term1496.getClass(), "context", term1516);
        HashMap term1536 = new HashMap();
        term1533 = newInstance(Class.forName("com.github.nylle.javafixture.CustomizationContext"));
        Object term1534 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term1535 = (Object[]) newArray("java.lang.Object", 0);
        setField(term1534, term1534.getClass(), "elements", term1535);
        setField(term1533, term1533.getClass(), "ignoredFields", term1534);
        setField(term1533, term1533.getClass(), "customFields", term1536);
        setBooleanField(term1533, term1533.getClass(), "useRandomConstructor", true);
        term1542 = (Object[]) newArray("java.lang.annotation.Annotation", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.SpecialSpecimen");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.CustomizationContext");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.annotation.Annotation"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1533;
        args[1] = term1542;
        callMethod(klass, "create", argTypes, term1496, args);
    }

};


