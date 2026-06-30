package com.sachett.samosa.samosac.symbol.symboltable;

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
import static com.sachett.samosa.samosac.symbol.symboltable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.util.ArrayDeque;

public class SymbolTable_lookupBuiltinFunctionMatchingOverload_135976543120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3201;

    public SymbolTable_lookupBuiltinFunctionMatchingOverload_135976543120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3204 = new ArrayList();
        ((ArrayList) term3204).add((Object)null);
        ArrayList term3202 = new ArrayList();
        ((ArrayList) term3202).add(term3204);
        LinkedHashMap term3210 = new LinkedHashMap();
        LinkedHashMap term3269 = new LinkedHashMap();
        Integer term3276 = new Integer(0);
        Integer term3278 = new Integer(0);
        LinkedHashMap term3281 = new LinkedHashMap();
        Integer term3290 = new Integer(0);
        Integer term3292 = new Integer(0);
        ArrayDeque term3295 = new ArrayDeque();
        term3201 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term3275 = newInstance(Class.forName("kotlin.Pair"));
        Object term3280 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3289 = newInstance(Class.forName("kotlin.Pair"));
        setField(term3201, term3201.getClass(), "symbolScope", term3202);
        setField(term3201, term3201.getClass(), "builtinMethods", term3210);
        setField(term3201, term3201.getClass(), "blockScopes", term3269);
        setField(term3275, term3275.getClass(), "first", term3276);
        setField(term3275, term3275.getClass(), "second", term3278);
        setField(term3201, term3201.getClass(), "currentScopeCoordinates", term3275);
        setField(term3280, term3280.getClass(), "prevScopeTable", null);
        setField(term3280, term3280.getClass(), "table", term3281);
        setIntField(term3280, term3280.getClass(), "prevScopeIndex", -1);
        setIntField(term3280, term3280.getClass(), "scopeIndex", 0);
        setField(term3289, term3289.getClass(), "first", term3290);
        setField(term3289, term3289.getClass(), "second", term3292);
        setField(term3280, term3280.getClass(), "recordEntryCoordinates", term3289);
        setField(term3201, term3201.getClass(), "currentSymbolTableRecord", term3280);
        setBooleanField(term3201, term3201.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term3201, term3201.getClass(), "lastCoordinates", term3295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "RkybSrpybU";
        args[1] = "xOEqzGAmDU";
        callMethod(klass, "lookupBuiltinFunctionMatchingOverload", argTypes, term3201, args);
    }

};


