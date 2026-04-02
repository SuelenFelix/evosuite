package com.sachett.samosa.samosac.staticchecker.analyzers.blocks;

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
import static com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class StrayBlock_getChildren_16869321844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3255;

    public StrayBlock_getChildren_16869321844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3270 = new ArrayList();
        ((ArrayList) term3270).add((Object)null);
        ((ArrayList) term3270).add((Object)null);
        ((ArrayList) term3270).add((Object)null);
        ((ArrayList) term3270).add((Object)null);
        ((ArrayList) term3270).add((Object)null);
        ((ArrayList) term3270).add((Object)null);
        ((ArrayList) term3270).add((Object)null);
        ((ArrayList) term3270).add((Object)null);
        ((ArrayList) term3270).add((Object)null);
        Class<? extends Object> term3314 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term3313 = ((Class) term3314).getDeclaredField((String) "BOOL");
        ((Field) term3313).setAccessible(true);
        Object enum10 = ((Field) term3313).get((Object) null);
        ArrayList term3299 = new ArrayList();
        ((ArrayList) term3299).add((Object)null);
        ((ArrayList) term3299).add((Object)null);
        ((ArrayList) term3299).add((Object)null);
        term3255 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock"));
        Object term3256 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term3297 = newInstance(Class.forName("kotlin.Pair"));
        setField(term3256, term3256.getClass(), "name", "EGtDIRbSSb");
        setIntField(term3256, term3256.getClass(), "firstAppearedLine", -1922583790);
        setField(term3256, term3256.getClass(), "paramList", term3270);
        setField(term3256, term3256.getClass(), "returnType", enum10);
        setBooleanField(term3256, term3256.getClass(), "isInferredType", true);
        setBooleanField(term3256, term3256.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term3256, term3256.getClass(), "initializeExpressionPresent", false);
        setField(term3297, term3297.getClass(), "first", null);
        setField(term3297, term3297.getClass(), "second", null);
        setField(term3256, term3256.getClass(), "symbolCoordinates", term3297);
        setField(term3256, term3256.getClass(), "symbolType", enum10);
        setField(term3255, term3255.getClass(), "parentFnSymbol", term3256);
        setBooleanField(term3255, term3255.getClass(), "doesReturnProperly", true);
        setField(term3255, term3255.getClass(), "children", term3299);
        setField(term3255, term3255.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChildren", argTypes, term3255, args);
    }

};


