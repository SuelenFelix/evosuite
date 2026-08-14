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

public class MapSpecimen_createFromInterfaceType_17496997904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1225;

    public MapSpecimen_createFromInterfaceType_17496997904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1228 = Class.forName((String) "java.lang.invoke.InnerClassLambdaMetafactory$ForwardingMethodGenerator");
        HashMap term1257 = new HashMap();
        term1225 = newInstance(Class.forName("com.github.nylle.javafixture.specimen.MapSpecimen"));
        Object term1226 = newInstance(Class.forName("com.github.nylle.javafixture.SpecimenType"));
        Object term1227 = newInstance(Class.forName("sun.reflect.generics.reflectiveObjects.TypeVariableImpl"));
        Object[] term1241 = (Object[]) newArray("sun.reflect.generics.tree.FieldTypeSignature", 1);
        Object term1242 = newInstance(Class.forName("sun.reflect.generics.tree.ClassTypeSignature"));
        Object term1243 = newInstance(Class.forName("sun.reflect.generics.factory.CoreReflectionFactory"));
        Object term1244 = newInstance(Class.forName("sun.reflect.generics.scope.ClassScope"));
        Object term1245 = newInstance(Class.forName("com.github.nylle.javafixture.Context"));
        Object term1246 = newInstance(Class.forName("com.github.nylle.javafixture.Configuration"));
        Object term1251 = newInstance(Class.forName("java.time.Clock$FixedClock"));
        Object term1252 = newInstance(Class.forName("java.time.Instant"));
        Object term1255 = newInstance(Class.forName("java.time.ZoneOffset"));
        setField(term1227, term1227.getClass(), "genericDeclaration", term1228);
        setField(term1227, term1227.getClass(), "name", "T");
        setField(term1242, term1242.getClass(), "path", null);
        setElement(term1241, 0, term1242);
        setField(term1227, term1227.getClass(), "bounds", term1241);
        setField(term1243, term1243.getClass(), "decl", term1228);
        setField(term1244, term1244.getClass(), "recvr", term1228);
        setField(term1244, term1244.getClass(), "enclosingScope", null);
        setField(term1243, term1243.getClass(), "scope", term1244);
        setField(term1227, term1227.getClass(), "factory", term1243);
        setField(term1226, term1226.getClass(), "type", term1227);
        setField(term1225, term1225.getClass(), "type", term1226);
        setIntField(term1246, term1246.getClass(), "maxCollectionSize", 10);
        setIntField(term1246, term1246.getClass(), "minCollectionSize", 2);
        setIntField(term1246, term1246.getClass(), "streamSize", 3);
        setBooleanField(term1246, term1246.getClass(), "usePositiveNumbersOnly", false);
        setLongField(term1252, term1252.getClass(), "seconds", 1786472233L);
        setIntField(term1252, term1252.getClass(), "nanos", 101594000);
        setField(term1251, term1251.getClass(), "instant", term1252);
        setIntField(term1255, term1255.getClass(), "totalSeconds", 0);
        setField(term1255, term1255.getClass(), "id", null);
        setField(term1251, term1251.getClass(), "zone", term1255);
        setField(term1246, term1246.getClass(), "clock", term1251);
        setField(term1245, term1245.getClass(), "configuration", term1246);
        setField(term1245, term1245.getClass(), "cache", term1257);
        setField(term1225, term1225.getClass(), "context", term1245);
        setField(term1225, term1225.getClass(), "keySpecimen", null);
        setField(term1225, term1225.getClass(), "valueSpecimen", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.nylle.javafixture.specimen.MapSpecimen");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createFromInterfaceType", argTypes, term1225, args);
    }

};


