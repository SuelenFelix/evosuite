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
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.lang.Integer;

public class SymbolTableRecordEntry_copy_193812079915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4383;
     Object term4430;
     Object term4477;
     Object term4512;
     Object term4514;
     Object term4516;

    public SymbolTableRecordEntry_copy_193812079915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4390 = new HashMap();
        HashMap term4398 = new HashMap();
        HashMap term4407 = new HashMap();
        HashMap term4418 = new HashMap();
        term4383 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4384 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4385 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4386 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4387 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4397 = newInstance(Class.forName("kotlin.Pair"));
        Object term4406 = newInstance(Class.forName("kotlin.Pair"));
        Object term4417 = newInstance(Class.forName("kotlin.Pair"));
        Object term4429 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4387, term4387.getClass(), "prevScopeTable", null);
        setField(term4387, term4387.getClass(), "table", null);
        setIntField(term4387, term4387.getClass(), "prevScopeIndex", -288604325);
        setIntField(term4387, term4387.getClass(), "scopeIndex", -1268314569);
        setField(term4387, term4387.getClass(), "recordEntryCoordinates", null);
        setField(term4386, term4386.getClass(), "prevScopeTable", term4387);
        setField(term4386, term4386.getClass(), "table", term4390);
        setIntField(term4386, term4386.getClass(), "prevScopeIndex", 877649659);
        setIntField(term4386, term4386.getClass(), "scopeIndex", -1332748804);
        setField(term4397, term4397.getClass(), "first", null);
        setField(term4397, term4397.getClass(), "second", null);
        setField(term4386, term4386.getClass(), "recordEntryCoordinates", term4397);
        setField(term4385, term4385.getClass(), "prevScopeTable", term4386);
        setField(term4385, term4385.getClass(), "table", term4398);
        setIntField(term4385, term4385.getClass(), "prevScopeIndex", 1774507971);
        setIntField(term4385, term4385.getClass(), "scopeIndex", -1420269858);
        setField(term4406, term4406.getClass(), "first", null);
        setField(term4406, term4406.getClass(), "second", null);
        setField(term4385, term4385.getClass(), "recordEntryCoordinates", term4406);
        setField(term4384, term4384.getClass(), "prevScopeTable", term4385);
        setField(term4384, term4384.getClass(), "table", term4407);
        setIntField(term4384, term4384.getClass(), "prevScopeIndex", -2119545015);
        setIntField(term4384, term4384.getClass(), "scopeIndex", 1272542218);
        setField(term4417, term4417.getClass(), "first", null);
        setField(term4417, term4417.getClass(), "second", null);
        setField(term4384, term4384.getClass(), "recordEntryCoordinates", term4417);
        setField(term4383, term4383.getClass(), "prevScopeTable", term4384);
        setField(term4383, term4383.getClass(), "table", term4418);
        setIntField(term4383, term4383.getClass(), "prevScopeIndex", 1209799204);
        setIntField(term4383, term4383.getClass(), "scopeIndex", 1094107751);
        setField(term4429, term4429.getClass(), "first", null);
        setField(term4429, term4429.getClass(), "second", null);
        setField(term4383, term4383.getClass(), "recordEntryCoordinates", term4429);
        HashMap term4437 = new HashMap();
        HashMap term4445 = new HashMap();
        HashMap term4454 = new HashMap();
        HashMap term4465 = new HashMap();
        term4430 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4431 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4432 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4433 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4434 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4444 = newInstance(Class.forName("kotlin.Pair"));
        Object term4453 = newInstance(Class.forName("kotlin.Pair"));
        Object term4464 = newInstance(Class.forName("kotlin.Pair"));
        Object term4476 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4434, term4434.getClass(), "prevScopeTable", null);
        setField(term4434, term4434.getClass(), "table", null);
        setIntField(term4434, term4434.getClass(), "prevScopeIndex", 1242676024);
        setIntField(term4434, term4434.getClass(), "scopeIndex", -1865023308);
        setField(term4434, term4434.getClass(), "recordEntryCoordinates", null);
        setField(term4433, term4433.getClass(), "prevScopeTable", term4434);
        setField(term4433, term4433.getClass(), "table", term4437);
        setIntField(term4433, term4433.getClass(), "prevScopeIndex", 1698510819);
        setIntField(term4433, term4433.getClass(), "scopeIndex", -1553893255);
        setField(term4444, term4444.getClass(), "first", null);
        setField(term4444, term4444.getClass(), "second", null);
        setField(term4433, term4433.getClass(), "recordEntryCoordinates", term4444);
        setField(term4432, term4432.getClass(), "prevScopeTable", term4433);
        setField(term4432, term4432.getClass(), "table", term4445);
        setIntField(term4432, term4432.getClass(), "prevScopeIndex", 1303442927);
        setIntField(term4432, term4432.getClass(), "scopeIndex", 794568325);
        setField(term4453, term4453.getClass(), "first", null);
        setField(term4453, term4453.getClass(), "second", null);
        setField(term4432, term4432.getClass(), "recordEntryCoordinates", term4453);
        setField(term4431, term4431.getClass(), "prevScopeTable", term4432);
        setField(term4431, term4431.getClass(), "table", term4454);
        setIntField(term4431, term4431.getClass(), "prevScopeIndex", -434468428);
        setIntField(term4431, term4431.getClass(), "scopeIndex", 1559605714);
        setField(term4464, term4464.getClass(), "first", null);
        setField(term4464, term4464.getClass(), "second", null);
        setField(term4431, term4431.getClass(), "recordEntryCoordinates", term4464);
        setField(term4430, term4430.getClass(), "prevScopeTable", term4431);
        setField(term4430, term4430.getClass(), "table", term4465);
        setIntField(term4430, term4430.getClass(), "prevScopeIndex", 1146601902);
        setIntField(term4430, term4430.getClass(), "scopeIndex", -1938881385);
        setField(term4476, term4476.getClass(), "first", null);
        setField(term4476, term4476.getClass(), "second", null);
        setField(term4430, term4430.getClass(), "recordEntryCoordinates", term4476);
        term4477 = new LinkedHashMap();
        term4512 = new Integer(-1629418973);
        term4514 = new Integer(-100825168);
        Integer term4517 = new Integer(1134449235);
        Integer term4519 = new Integer(-883034806);
        term4516 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4516, term4516.getClass(), "first", term4517);
        setField(term4516, term4516.getClass(), "second", term4519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("kotlin.Pair");
        Object[] args = new Object[5];
        args[0] = term4430;
        args[1] = term4477;
        args[2] = term4512;
        args[3] = term4514;
        args[4] = term4516;
        callMethod(klass, "copy", argTypes, term4383, args);
    }

};


