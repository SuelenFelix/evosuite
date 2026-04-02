package com.sachett.samosa.samosac.codegen.expressions;

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
import static com.sachett.samosa.samosac.codegen.expressions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.util.ArrayDeque;

public class IExprCodegen_doIdentifierCodegen_4049978720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term111;
     Object term139;

    public IExprCodegen_doIdentifierCodegen_4049978720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16 = new ArrayList();
        ((ArrayList) term16).add((Object)null);
        ArrayList term14 = new ArrayList();
        ((ArrayList) term14).add(term16);
        LinkedHashMap term22 = new LinkedHashMap();
        LinkedHashMap term81 = new LinkedHashMap();
        Integer term88 = new Integer(0);
        Integer term90 = new Integer(0);
        LinkedHashMap term93 = new LinkedHashMap();
        Integer term102 = new Integer(0);
        Integer term104 = new Integer(0);
        ArrayDeque term107 = new ArrayDeque();
        term13 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable"));
        Object term87 = newInstance(Class.forName("kotlin.Pair"));
        Object term92 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term101 = newInstance(Class.forName("kotlin.Pair"));
        setField(term13, term13.getClass(), "symbolScope", term14);
        setField(term13, term13.getClass(), "builtinMethods", term22);
        setField(term13, term13.getClass(), "blockScopes", term81);
        setField(term87, term87.getClass(), "first", term88);
        setField(term87, term87.getClass(), "second", term90);
        setField(term13, term13.getClass(), "currentScopeCoordinates", term87);
        setField(term92, term92.getClass(), "prevScopeTable", null);
        setField(term92, term92.getClass(), "table", term93);
        setIntField(term92, term92.getClass(), "prevScopeIndex", -1);
        setIntField(term92, term92.getClass(), "scopeIndex", 0);
        setField(term101, term101.getClass(), "first", term102);
        setField(term101, term101.getClass(), "second", term104);
        setField(term92, term92.getClass(), "recordEntryCoordinates", term101);
        setField(term13, term13.getClass(), "currentSymbolTableRecord", term92);
        setBooleanField(term13, term13.getClass(), "createNewScopeEntryOnIncrement", true);
        setField(term13, term13.getClass(), "lastCoordinates", term107);
        term111 = newInstance(Class.forName("org.objectweb.asm.Type"));
        setIntField(term111, term111.getClass(), "sort", 1162663216);
        setField(term111, term111.getClass(), "valueBuffer", "sjlJAEtRrb");
        setIntField(term111, term111.getClass(), "valueBegin", 1484323161);
        setIntField(term111, term111.getClass(), "valueEnd", 391863371);
        term139 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.codegen.expressions.IExprCodegen");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTable");
        argTypes[2] = Class.forName("org.objectweb.asm.Type");
        argTypes[3] = Class.forName("com.sachett.samosa.samosac.codegen.function.FunctionGenerationContext");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = "PAEBtnZtTD";
        args[1] = term13;
        args[2] = term111;
        args[3] = null;
        args[4] = "MuLcgQHgqz";
        args[5] = term139;
        callMethod(klass, "doIdentifierCodegen", argTypes, null, args);
    }

};


