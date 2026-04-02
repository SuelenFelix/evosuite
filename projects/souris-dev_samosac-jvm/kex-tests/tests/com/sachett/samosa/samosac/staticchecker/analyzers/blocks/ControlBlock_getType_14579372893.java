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

public class ControlBlock_getType_14579372893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11788;

    public ControlBlock_getType_14579372893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11803 = new ArrayList();
        ((ArrayList) term11803).add((Object)null);
        ((ArrayList) term11803).add((Object)null);
        ((ArrayList) term11803).add((Object)null);
        ((ArrayList) term11803).add((Object)null);
        ((ArrayList) term11803).add((Object)null);
        Class<? extends Object> term11878 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term11877 = ((Class) term11878).getDeclaredField((String) "BOOL");
        ((Field) term11877).setAccessible(true);
        Object enum39 = ((Field) term11877).get((Object) null);
        Class<? extends Object> term12117 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term12116 = ((Class) term12117).getDeclaredField((String) "FUNCTION");
        ((Field) term12116).setAccessible(true);
        Object enum40 = ((Field) term12116).get((Object) null);
        Class<? extends Object> term12368 = Class.forName((String) "com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlockType");
        Field term12367 = ((Class) term12368).getDeclaredField((String) "IF");
        ((Field) term12367).setAccessible(true);
        Object enum41 = ((Field) term12367).get((Object) null);
        ArrayList term11862 = new ArrayList();
        ((ArrayList) term11862).add((Object)null);
        ((ArrayList) term11862).add((Object)null);
        ((ArrayList) term11862).add((Object)null);
        ((ArrayList) term11862).add((Object)null);
        ((ArrayList) term11862).add((Object)null);
        term11788 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock"));
        Object term11789 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term11830 = newInstance(Class.forName("kotlin.Pair"));
        setField(term11789, term11789.getClass(), "name", "pCTimMblYc");
        setIntField(term11789, term11789.getClass(), "firstAppearedLine", 1622346318);
        setField(term11789, term11789.getClass(), "paramList", term11803);
        setField(term11789, term11789.getClass(), "returnType", enum39);
        setBooleanField(term11789, term11789.getClass(), "isInferredType", false);
        setBooleanField(term11789, term11789.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term11789, term11789.getClass(), "initializeExpressionPresent", true);
        setField(term11830, term11830.getClass(), "first", null);
        setField(term11830, term11830.getClass(), "second", null);
        setField(term11789, term11789.getClass(), "symbolCoordinates", term11830);
        setField(term11789, term11789.getClass(), "symbolType", enum40);
        setField(term11788, term11788.getClass(), "parentFnSymbol", term11789);
        setField(term11788, term11788.getClass(), "parent", null);
        setField(term11788, term11788.getClass(), "type", enum41);
        setBooleanField(term11788, term11788.getClass(), "doesReturnComputed", false);
        setField(term11788, term11788.getClass(), "children", term11862);
        setBooleanField(term11788, term11788.getClass(), "doesReturnProperly", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.ControlBlock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term11788, args);
    }

};


