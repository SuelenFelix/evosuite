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

public class StrayBlock_hashCode_61806947912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7748;

    public StrayBlock_hashCode_61806947912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7763 = new ArrayList();
        ((ArrayList) term7763).add((Object)null);
        ((ArrayList) term7763).add((Object)null);
        ((ArrayList) term7763).add((Object)null);
        ((ArrayList) term7763).add((Object)null);
        ((ArrayList) term7763).add((Object)null);
        Class<? extends Object> term7831 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term7830 = ((Class) term7831).getDeclaredField((String) "BOOL");
        ((Field) term7830).setAccessible(true);
        Object enum26 = ((Field) term7830).get((Object) null);
        Class<? extends Object> term8070 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term8069 = ((Class) term8070).getDeclaredField((String) "FUNCTION");
        ((Field) term8069).setAccessible(true);
        Object enum27 = ((Field) term8069).get((Object) null);
        ArrayList term7816 = new ArrayList();
        ((ArrayList) term7816).add((Object)null);
        ((ArrayList) term7816).add((Object)null);
        ((ArrayList) term7816).add((Object)null);
        term7748 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock"));
        Object term7749 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term7790 = newInstance(Class.forName("kotlin.Pair"));
        setField(term7749, term7749.getClass(), "name", "oVcInYnLWB");
        setIntField(term7749, term7749.getClass(), "firstAppearedLine", -883034806);
        setField(term7749, term7749.getClass(), "paramList", term7763);
        setField(term7749, term7749.getClass(), "returnType", enum26);
        setBooleanField(term7749, term7749.getClass(), "isInferredType", false);
        setBooleanField(term7749, term7749.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term7749, term7749.getClass(), "initializeExpressionPresent", false);
        setField(term7790, term7790.getClass(), "first", null);
        setField(term7790, term7790.getClass(), "second", null);
        setField(term7749, term7749.getClass(), "symbolCoordinates", term7790);
        setField(term7749, term7749.getClass(), "symbolType", enum27);
        setField(term7748, term7748.getClass(), "parentFnSymbol", term7749);
        setBooleanField(term7748, term7748.getClass(), "doesReturnProperly", false);
        setField(term7748, term7748.getClass(), "children", term7816);
        setField(term7748, term7748.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term7748, args);
    }

};


