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

public class StrayBlock_toString_10730978911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7180;

    public StrayBlock_toString_10730978911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7195 = new ArrayList();
        ((ArrayList) term7195).add((Object)null);
        ((ArrayList) term7195).add((Object)null);
        ((ArrayList) term7195).add((Object)null);
        ((ArrayList) term7195).add((Object)null);
        ((ArrayList) term7195).add((Object)null);
        Class<? extends Object> term7259 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term7258 = ((Class) term7259).getDeclaredField((String) "VOID");
        ((Field) term7258).setAccessible(true);
        Object enum24 = ((Field) term7258).get((Object) null);
        Class<? extends Object> term7498 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term7497 = ((Class) term7498).getDeclaredField((String) "FUNCTION");
        ((Field) term7497).setAccessible(true);
        Object enum25 = ((Field) term7497).get((Object) null);
        ArrayList term7244 = new ArrayList();
        ((ArrayList) term7244).add((Object)null);
        ((ArrayList) term7244).add((Object)null);
        ((ArrayList) term7244).add((Object)null);
        ((ArrayList) term7244).add((Object)null);
        ((ArrayList) term7244).add((Object)null);
        ((ArrayList) term7244).add((Object)null);
        term7180 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock"));
        Object term7181 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term7218 = newInstance(Class.forName("kotlin.Pair"));
        setField(term7181, term7181.getClass(), "name", "LQFpaHEwXR");
        setIntField(term7181, term7181.getClass(), "firstAppearedLine", 1134449235);
        setField(term7181, term7181.getClass(), "paramList", term7195);
        setField(term7181, term7181.getClass(), "returnType", enum24);
        setBooleanField(term7181, term7181.getClass(), "isInferredType", true);
        setBooleanField(term7181, term7181.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term7181, term7181.getClass(), "initializeExpressionPresent", false);
        setField(term7218, term7218.getClass(), "first", null);
        setField(term7218, term7218.getClass(), "second", null);
        setField(term7181, term7181.getClass(), "symbolCoordinates", term7218);
        setField(term7181, term7181.getClass(), "symbolType", enum25);
        setField(term7180, term7180.getClass(), "parentFnSymbol", term7181);
        setBooleanField(term7180, term7180.getClass(), "doesReturnProperly", true);
        setField(term7180, term7180.getClass(), "children", term7244);
        setField(term7180, term7180.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7180, args);
    }

};


