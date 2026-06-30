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

public class StrayBlock_component4_4433320209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5766;

    public StrayBlock_component4_4433320209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5781 = new ArrayList();
        ((ArrayList) term5781).add((Object)null);
        ((ArrayList) term5781).add((Object)null);
        ((ArrayList) term5781).add((Object)null);
        ((ArrayList) term5781).add((Object)null);
        ((ArrayList) term5781).add((Object)null);
        Class<? extends Object> term5841 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term5840 = ((Class) term5841).getDeclaredField((String) "BOOL");
        ((Field) term5840).setAccessible(true);
        Object enum19 = ((Field) term5840).get((Object) null);
        Class<? extends Object> term6080 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term6079 = ((Class) term6080).getDeclaredField((String) "INT");
        ((Field) term6079).setAccessible(true);
        Object enum20 = ((Field) term6079).get((Object) null);
        ArrayList term5826 = new ArrayList();
        ((ArrayList) term5826).add((Object)null);
        ((ArrayList) term5826).add((Object)null);
        ((ArrayList) term5826).add((Object)null);
        ((ArrayList) term5826).add((Object)null);
        term5766 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock"));
        Object term5767 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term5808 = newInstance(Class.forName("kotlin.Pair"));
        setField(term5767, term5767.getClass(), "name", "NRdvgJlhkX");
        setIntField(term5767, term5767.getClass(), "firstAppearedLine", -1339778481);
        setField(term5767, term5767.getClass(), "paramList", term5781);
        setField(term5767, term5767.getClass(), "returnType", enum19);
        setBooleanField(term5767, term5767.getClass(), "isInferredType", true);
        setBooleanField(term5767, term5767.getClass(), "isInitialValueCalculated", true);
        setBooleanField(term5767, term5767.getClass(), "initializeExpressionPresent", false);
        setField(term5808, term5808.getClass(), "first", null);
        setField(term5808, term5808.getClass(), "second", null);
        setField(term5767, term5767.getClass(), "symbolCoordinates", term5808);
        setField(term5767, term5767.getClass(), "symbolType", enum20);
        setField(term5766, term5766.getClass(), "parentFnSymbol", term5767);
        setBooleanField(term5766, term5766.getClass(), "doesReturnProperly", false);
        setField(term5766, term5766.getClass(), "children", term5826);
        setField(term5766, term5766.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component4", argTypes, term5766, args);
    }

};


