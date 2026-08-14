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

public class MapSpecimen_createFromConcreteType_12808759173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1100;
     Object term1137;

    public MapSpecimen_createFromConcreteType_12808759173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1103 = Class.forName((String) "java.lang.ref.ReferenceQueue");
        HashMap term1132 = new HashMap();
        term1100 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.MapSpecimen"));
        Object term1101 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term1102 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term1116 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term1117 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term1118 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term1119 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term1120 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term1121 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term1126 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term1127 = newInstance(Class.forName("java.time.Instant"));
        Object term1130 = newInstance(Class.forName("java.time.ZoneOffset"));
        setField(term1102, term1102.getClass(), "genericDeclaration", term1103);
        setField(term1102, term1102.getClass(), "name", "T");
        setField(term1117, term1117.getClass(), "path", null);
        setElement(term1116, 0, term1117);
        setField(term1102, term1102.getClass(), "bounds", term1116);
        setField(term1118, term1118.getClass(), "decl", term1103);
        setField(term1119, term1119.getClass(), "recvr", term1103);
        setField(term1119, term1119.getClass(), "enclosingScope", null);
        setField(term1118, term1118.getClass(), "scope", term1119);
        setField(term1102, term1102.getClass(), "factory", term1118);
        setField(term1101, term1101.getClass(), "type", term1102);
        setField(term1100, term1100.getClass(), "type", term1101);
        setIntField(term1121, term1121.getClass(), "maxCollectionSize", 10);
        setIntField(term1121, term1121.getClass(), "minCollectionSize", 2);
        setIntField(term1121, term1121.getClass(), "streamSize", 3);
        setBooleanField(term1121, term1121.getClass(), "usePositiveNumbersOnly", true);
        setLongField(term1127, term1127.getClass(), "seconds", 1786472232L);
        setIntField(term1127, term1127.getClass(), "nanos", 991580000);
        setField(term1126, term1126.getClass(), "instant", term1127);
        setIntField(term1130, term1130.getClass(), "totalSeconds", 0);
        setField(term1130, term1130.getClass(), "id", null);
        setField(term1126, term1126.getClass(), "zone", term1130);
        setField(term1121, term1121.getClass(), "clock", term1126);
        setField(term1120, term1120.getClass(), "configuration", term1121);
        setField(term1120, term1120.getClass(), "cache", term1132);
        setField(term1100, term1100.getClass(), "context", term1120);
        setField(term1100, term1100.getClass(), "keySpecimen", null);
        setField(term1100, term1100.getClass(), "valueSpecimen", null);
        term1137 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        setField(term1137, term1137.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.MapSpecimen");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.nylle.javafixture.SpecimenType");
        Object[] args = new Object[1];
        args[0] = term1137;
        callMethod(klass, "createFromConcreteType", argTypes, term1100, args);
    }

};


