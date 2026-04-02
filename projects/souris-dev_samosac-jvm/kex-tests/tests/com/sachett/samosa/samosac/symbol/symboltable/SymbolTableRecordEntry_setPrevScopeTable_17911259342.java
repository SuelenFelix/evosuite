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

public class SymbolTableRecordEntry_setPrevScopeTable_17911259342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3716;
     Object term3763;

    public SymbolTableRecordEntry_setPrevScopeTable_17911259342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3723 = new HashMap();
        HashMap term3731 = new HashMap();
        HashMap term3740 = new HashMap();
        HashMap term3751 = new HashMap();
        term3716 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3717 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3718 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3719 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3720 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3730 = newInstance(Class.forName("kotlin.Pair"));
        Object term3739 = newInstance(Class.forName("kotlin.Pair"));
        Object term3750 = newInstance(Class.forName("kotlin.Pair"));
        Object term3762 = newInstance(Class.forName("kotlin.Pair"));
        setField(term3720, term3720.getClass(), "prevScopeTable", null);
        setField(term3720, term3720.getClass(), "table", null);
        setIntField(term3720, term3720.getClass(), "prevScopeIndex", 1324040357);
        setIntField(term3720, term3720.getClass(), "scopeIndex", -1588772968);
        setField(term3720, term3720.getClass(), "recordEntryCoordinates", null);
        setField(term3719, term3719.getClass(), "prevScopeTable", term3720);
        setField(term3719, term3719.getClass(), "table", term3723);
        setIntField(term3719, term3719.getClass(), "prevScopeIndex", -93135961);
        setIntField(term3719, term3719.getClass(), "scopeIndex", -112921587);
        setField(term3730, term3730.getClass(), "first", null);
        setField(term3730, term3730.getClass(), "second", null);
        setField(term3719, term3719.getClass(), "recordEntryCoordinates", term3730);
        setField(term3718, term3718.getClass(), "prevScopeTable", term3719);
        setField(term3718, term3718.getClass(), "table", term3731);
        setIntField(term3718, term3718.getClass(), "prevScopeIndex", 933028652);
        setIntField(term3718, term3718.getClass(), "scopeIndex", 287287233);
        setField(term3739, term3739.getClass(), "first", null);
        setField(term3739, term3739.getClass(), "second", null);
        setField(term3718, term3718.getClass(), "recordEntryCoordinates", term3739);
        setField(term3717, term3717.getClass(), "prevScopeTable", term3718);
        setField(term3717, term3717.getClass(), "table", term3740);
        setIntField(term3717, term3717.getClass(), "prevScopeIndex", 962840079);
        setIntField(term3717, term3717.getClass(), "scopeIndex", 1540719661);
        setField(term3750, term3750.getClass(), "first", null);
        setField(term3750, term3750.getClass(), "second", null);
        setField(term3717, term3717.getClass(), "recordEntryCoordinates", term3750);
        setField(term3716, term3716.getClass(), "prevScopeTable", term3717);
        setField(term3716, term3716.getClass(), "table", term3751);
        setIntField(term3716, term3716.getClass(), "prevScopeIndex", 1265463001);
        setIntField(term3716, term3716.getClass(), "scopeIndex", 335112684);
        setField(term3762, term3762.getClass(), "first", null);
        setField(term3762, term3762.getClass(), "second", null);
        setField(term3716, term3716.getClass(), "recordEntryCoordinates", term3762);
        HashMap term3770 = new HashMap();
        HashMap term3778 = new HashMap();
        HashMap term3787 = new HashMap();
        HashMap term3798 = new HashMap();
        term3763 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3764 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3765 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3766 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3767 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term3777 = newInstance(Class.forName("kotlin.Pair"));
        Object term3786 = newInstance(Class.forName("kotlin.Pair"));
        Object term3797 = newInstance(Class.forName("kotlin.Pair"));
        Object term3809 = newInstance(Class.forName("kotlin.Pair"));
        setField(term3767, term3767.getClass(), "prevScopeTable", null);
        setField(term3767, term3767.getClass(), "table", null);
        setIntField(term3767, term3767.getClass(), "prevScopeIndex", 1090617576);
        setIntField(term3767, term3767.getClass(), "scopeIndex", -1547384488);
        setField(term3767, term3767.getClass(), "recordEntryCoordinates", null);
        setField(term3766, term3766.getClass(), "prevScopeTable", term3767);
        setField(term3766, term3766.getClass(), "table", term3770);
        setIntField(term3766, term3766.getClass(), "prevScopeIndex", 1442160736);
        setIntField(term3766, term3766.getClass(), "scopeIndex", 1114000454);
        setField(term3777, term3777.getClass(), "first", null);
        setField(term3777, term3777.getClass(), "second", null);
        setField(term3766, term3766.getClass(), "recordEntryCoordinates", term3777);
        setField(term3765, term3765.getClass(), "prevScopeTable", term3766);
        setField(term3765, term3765.getClass(), "table", term3778);
        setIntField(term3765, term3765.getClass(), "prevScopeIndex", -556405712);
        setIntField(term3765, term3765.getClass(), "scopeIndex", -1772434990);
        setField(term3786, term3786.getClass(), "first", null);
        setField(term3786, term3786.getClass(), "second", null);
        setField(term3765, term3765.getClass(), "recordEntryCoordinates", term3786);
        setField(term3764, term3764.getClass(), "prevScopeTable", term3765);
        setField(term3764, term3764.getClass(), "table", term3787);
        setIntField(term3764, term3764.getClass(), "prevScopeIndex", -1845499264);
        setIntField(term3764, term3764.getClass(), "scopeIndex", -505439934);
        setField(term3797, term3797.getClass(), "first", null);
        setField(term3797, term3797.getClass(), "second", null);
        setField(term3764, term3764.getClass(), "recordEntryCoordinates", term3797);
        setField(term3763, term3763.getClass(), "prevScopeTable", term3764);
        setField(term3763, term3763.getClass(), "table", term3798);
        setIntField(term3763, term3763.getClass(), "prevScopeIndex", -344842608);
        setIntField(term3763, term3763.getClass(), "scopeIndex", 941650513);
        setField(term3809, term3809.getClass(), "first", null);
        setField(term3809, term3809.getClass(), "second", null);
        setField(term3763, term3763.getClass(), "recordEntryCoordinates", term3809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Object[] args = new Object[1];
        args[0] = term3763;
        callMethod(klass, "setPrevScopeTable", argTypes, term3716, args);
    }

};


