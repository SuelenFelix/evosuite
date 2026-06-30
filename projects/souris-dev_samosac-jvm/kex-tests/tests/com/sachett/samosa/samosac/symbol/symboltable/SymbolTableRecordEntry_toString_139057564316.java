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

public class SymbolTableRecordEntry_toString_139057564316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4521;

    public SymbolTableRecordEntry_toString_139057564316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4528 = new HashMap();
        HashMap term4536 = new HashMap();
        HashMap term4545 = new HashMap();
        HashMap term4556 = new HashMap();
        term4521 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4522 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4523 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4524 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4525 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4535 = newInstance(Class.forName("kotlin.Pair"));
        Object term4544 = newInstance(Class.forName("kotlin.Pair"));
        Object term4555 = newInstance(Class.forName("kotlin.Pair"));
        Object term4567 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4525, term4525.getClass(), "prevScopeTable", null);
        setField(term4525, term4525.getClass(), "table", null);
        setIntField(term4525, term4525.getClass(), "prevScopeIndex", 1084849225);
        setIntField(term4525, term4525.getClass(), "scopeIndex", -1702055571);
        setField(term4525, term4525.getClass(), "recordEntryCoordinates", null);
        setField(term4524, term4524.getClass(), "prevScopeTable", term4525);
        setField(term4524, term4524.getClass(), "table", term4528);
        setIntField(term4524, term4524.getClass(), "prevScopeIndex", -944542900);
        setIntField(term4524, term4524.getClass(), "scopeIndex", 2063762142);
        setField(term4535, term4535.getClass(), "first", null);
        setField(term4535, term4535.getClass(), "second", null);
        setField(term4524, term4524.getClass(), "recordEntryCoordinates", term4535);
        setField(term4523, term4523.getClass(), "prevScopeTable", term4524);
        setField(term4523, term4523.getClass(), "table", term4536);
        setIntField(term4523, term4523.getClass(), "prevScopeIndex", 1658391716);
        setIntField(term4523, term4523.getClass(), "scopeIndex", 2143282300);
        setField(term4544, term4544.getClass(), "first", null);
        setField(term4544, term4544.getClass(), "second", null);
        setField(term4523, term4523.getClass(), "recordEntryCoordinates", term4544);
        setField(term4522, term4522.getClass(), "prevScopeTable", term4523);
        setField(term4522, term4522.getClass(), "table", term4545);
        setIntField(term4522, term4522.getClass(), "prevScopeIndex", 1137624258);
        setIntField(term4522, term4522.getClass(), "scopeIndex", 977862393);
        setField(term4555, term4555.getClass(), "first", null);
        setField(term4555, term4555.getClass(), "second", null);
        setField(term4522, term4522.getClass(), "recordEntryCoordinates", term4555);
        setField(term4521, term4521.getClass(), "prevScopeTable", term4522);
        setField(term4521, term4521.getClass(), "table", term4556);
        setIntField(term4521, term4521.getClass(), "prevScopeIndex", 301401782);
        setIntField(term4521, term4521.getClass(), "scopeIndex", 1988605357);
        setField(term4567, term4567.getClass(), "first", null);
        setField(term4567, term4567.getClass(), "second", null);
        setField(term4521, term4521.getClass(), "recordEntryCoordinates", term4567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4521, args);
    }

};


