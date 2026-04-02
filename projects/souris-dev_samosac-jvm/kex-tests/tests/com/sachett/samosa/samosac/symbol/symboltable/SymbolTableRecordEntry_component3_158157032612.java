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

public class SymbolTableRecordEntry_component3_158157032612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4242;

    public SymbolTableRecordEntry_component3_158157032612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4249 = new HashMap();
        HashMap term4257 = new HashMap();
        HashMap term4266 = new HashMap();
        HashMap term4277 = new HashMap();
        term4242 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4243 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4244 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4245 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4246 = newInstance(Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry"));
        Object term4256 = newInstance(Class.forName("kotlin.Pair"));
        Object term4265 = newInstance(Class.forName("kotlin.Pair"));
        Object term4276 = newInstance(Class.forName("kotlin.Pair"));
        Object term4288 = newInstance(Class.forName("kotlin.Pair"));
        setField(term4246, term4246.getClass(), "prevScopeTable", null);
        setField(term4246, term4246.getClass(), "table", null);
        setIntField(term4246, term4246.getClass(), "prevScopeIndex", -43417861);
        setIntField(term4246, term4246.getClass(), "scopeIndex", -1533843432);
        setField(term4246, term4246.getClass(), "recordEntryCoordinates", null);
        setField(term4245, term4245.getClass(), "prevScopeTable", term4246);
        setField(term4245, term4245.getClass(), "table", term4249);
        setIntField(term4245, term4245.getClass(), "prevScopeIndex", -123338791);
        setIntField(term4245, term4245.getClass(), "scopeIndex", -1467089634);
        setField(term4256, term4256.getClass(), "first", null);
        setField(term4256, term4256.getClass(), "second", null);
        setField(term4245, term4245.getClass(), "recordEntryCoordinates", term4256);
        setField(term4244, term4244.getClass(), "prevScopeTable", term4245);
        setField(term4244, term4244.getClass(), "table", term4257);
        setIntField(term4244, term4244.getClass(), "prevScopeIndex", 413548937);
        setIntField(term4244, term4244.getClass(), "scopeIndex", 1901317214);
        setField(term4265, term4265.getClass(), "first", null);
        setField(term4265, term4265.getClass(), "second", null);
        setField(term4244, term4244.getClass(), "recordEntryCoordinates", term4265);
        setField(term4243, term4243.getClass(), "prevScopeTable", term4244);
        setField(term4243, term4243.getClass(), "table", term4266);
        setIntField(term4243, term4243.getClass(), "prevScopeIndex", 1166710220);
        setIntField(term4243, term4243.getClass(), "scopeIndex", -1070592289);
        setField(term4276, term4276.getClass(), "first", null);
        setField(term4276, term4276.getClass(), "second", null);
        setField(term4243, term4243.getClass(), "recordEntryCoordinates", term4276);
        setField(term4242, term4242.getClass(), "prevScopeTable", term4243);
        setField(term4242, term4242.getClass(), "table", term4277);
        setIntField(term4242, term4242.getClass(), "prevScopeIndex", -1464172784);
        setIntField(term4242, term4242.getClass(), "scopeIndex", 32185364);
        setField(term4288, term4288.getClass(), "first", null);
        setField(term4288, term4288.getClass(), "second", null);
        setField(term4242, term4242.getClass(), "recordEntryCoordinates", term4288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sachett.samosa.samosac.symbol.symboltable.SymbolTableRecordEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component3", argTypes, term4242, args);
    }

};


