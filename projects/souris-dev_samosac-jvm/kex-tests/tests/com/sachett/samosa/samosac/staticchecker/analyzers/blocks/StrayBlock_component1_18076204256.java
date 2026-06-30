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

public class StrayBlock_component1_18076204256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4104;

    public StrayBlock_component1_18076204256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4119 = new ArrayList();
        ((ArrayList) term4119).add((Object)null);
        Class<? extends Object> term4179 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term4178 = ((Class) term4179).getDeclaredField((String) "INT");
        ((Field) term4178).setAccessible(true);
        Object enum13 = ((Field) term4178).get((Object) null);
        Class<? extends Object> term4415 = Class.forName((String) "com.sachett.samosa.samosac.symbol.SymbolType");
        Field term4414 = ((Class) term4415).getDeclaredField((String) "BOOL");
        ((Field) term4414).setAccessible(true);
        Object enum14 = ((Field) term4414).get((Object) null);
        ArrayList term4164 = new ArrayList();
        term4104 = newInstance(Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock"));
        Object term4105 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.FunctionSymbol"));
        Object term4142 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4105, term4105.getClass(), "name", "MjGYSRKTNF");
        setIntField(term4105, term4105.getClass(), "firstAppearedLine", -1955890973);
        setField(term4105, term4105.getClass(), "paramList", term4119);
        setField(term4105, term4105.getClass(), "returnType", enum13);
        setBooleanField(term4105, term4105.getClass(), "isInferredType", false);
        setBooleanField(term4105, term4105.getClass(), "isInitialValueCalculated", false);
        setBooleanField(term4105, term4105.getClass(), "initializeExpressionPresent", false);
        setField(term4142, term4142.getClass(), "first", null);
        setField(term4142, term4142.getClass(), "second", null);
        setField(term4105, term4105.getClass(), "symbolCoordinates", term4142);
        setField(term4105, term4105.getClass(), "symbolType", enum14);
        setField(term4104, term4104.getClass(), "parentFnSymbol", term4105);
        setBooleanField(term4104, term4104.getClass(), "doesReturnProperly", true);
        setField(term4104, term4104.getClass(), "children", term4164);
        setField(term4104, term4104.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.staticchecker.analyzers.blocks.StrayBlock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component1", argTypes, term4104, args);
    }

};


