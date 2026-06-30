package com.oreilly.quest.entities;

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
import static com.oreilly.quest.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Knight_setTitle_5957481986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1869;
     Object enum7;

    public Knight_setTitle_5957481986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1870 = new Long(-8885298608300233488L);
        Class<? extends Object> term1968 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term1967 = ((Class) term1968).getDeclaredField((String) "LORD");
        ((Field) term1967).setAccessible(true);
        enum7 = ((Field) term1967).get((Object) null);
        Long term1893 = new Long(-4325723315152823407L);
        HashMap term1909 = new HashMap();
        Set<Object> term2166 =  ((Map) term1909).keySet();
        HashSet term1908 = new HashSet((Collection<? extends Object>) term2166);
        HashMap term1915 = new HashMap();
        Set<Object> term2167 =  ((Map) term1915).keySet();
        HashSet term1914 = new HashSet((Collection<? extends Object>) term2167);
        Long term1921 = new Long(2535595959091595249L);
        HashMap term1962 = new HashMap();
        Set<Object> term2198 =  ((Map) term1962).keySet();
        HashSet term1961 = new HashSet((Collection<? extends Object>) term2198);
        term1869 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        Object term1892 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term1920 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term1869, term1869.getClass(), "id", term1870);
        setField(term1869, term1869.getClass(), "title", enum7);
        setField(term1869, term1869.getClass(), "name", "pCTimMblYc");
        setField(term1892, term1892.getClass(), "id", term1893);
        setField(term1892, term1892.getClass(), "name", "hNxWaHcfhY");
        setLongField(term1892, term1892.getClass(), "version", 5270370404989704783L);
        setField(term1892, term1892.getClass(), "tasks", term1908);
        setField(term1892, term1892.getClass(), "knights", term1914);
        setField(term1869, term1869.getClass(), "quest", term1892);
        setField(term1920, term1920.getClass(), "id", term1921);
        setField(term1920, term1920.getClass(), "name", "RkybSrpybU");
        setField(term1920, term1920.getClass(), "city", "xOEqzGAmDU");
        setField(term1920, term1920.getClass(), "state", "eZFUvlxvGV");
        setDoubleField(term1920, term1920.getClass(), "latitude", 0.2641345529914265);
        setDoubleField(term1920, term1920.getClass(), "longitude", 0.36923381893433327);
        setField(term1920, term1920.getClass(), "knights", term1961);
        setField(term1869, term1869.getClass(), "castle", term1920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Knight");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.oreilly.quest.entities.Title");
        Object[] args = new Object[1];
        args[0] = enum7;
        callMethod(klass, "setTitle", argTypes, term1869, args);
    }

};


