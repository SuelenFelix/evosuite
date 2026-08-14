package com.automation.xmldoclet.xjc;

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
import static com.automation.xmldoclet.xjc.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class TypeInfo_setWildcard_18146446292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44775;
     Object term44828;

    public TypeInfo_setWildcard_18146446292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44779 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44779, term44779.getClass(), "wildcard", null);
        setField(term44779, term44779.getClass(), "generic", null);
        setField(term44779, term44779.getClass(), "qualified", null);
        setField(term44779, term44779.getClass(), "dimension", null);
        Object term44780 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44780, term44780.getClass(), "wildcard", null);
        setField(term44780, term44780.getClass(), "generic", null);
        setField(term44780, term44780.getClass(), "qualified", null);
        setField(term44780, term44780.getClass(), "dimension", null);
        ArrayList term44777 = new ArrayList();
        ((ArrayList) term44777).add(term44779);
        ((ArrayList) term44777).add(term44779);
        ((ArrayList) term44777).add(term44780);
        Object term44785 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44785, term44785.getClass(), "wildcard", null);
        setField(term44785, term44785.getClass(), "generic", null);
        setField(term44785, term44785.getClass(), "qualified", null);
        setField(term44785, term44785.getClass(), "dimension", null);
        Object term44786 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44786, term44786.getClass(), "wildcard", null);
        setField(term44786, term44786.getClass(), "generic", null);
        setField(term44786, term44786.getClass(), "qualified", null);
        setField(term44786, term44786.getClass(), "dimension", null);
        Object term44787 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44787, term44787.getClass(), "wildcard", null);
        setField(term44787, term44787.getClass(), "generic", null);
        setField(term44787, term44787.getClass(), "qualified", null);
        setField(term44787, term44787.getClass(), "dimension", null);
        Object term44788 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44788, term44788.getClass(), "wildcard", null);
        setField(term44788, term44788.getClass(), "generic", null);
        setField(term44788, term44788.getClass(), "qualified", null);
        setField(term44788, term44788.getClass(), "dimension", null);
        ArrayList term44783 = new ArrayList();
        ((ArrayList) term44783).add(term44785);
        ((ArrayList) term44783).add(term44779);
        ((ArrayList) term44783).add(term44786);
        ((ArrayList) term44783).add(term44787);
        ((ArrayList) term44783).add(term44788);
        Object term44793 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44793, term44793.getClass(), "wildcard", null);
        setField(term44793, term44793.getClass(), "generic", null);
        setField(term44793, term44793.getClass(), "qualified", null);
        setField(term44793, term44793.getClass(), "dimension", null);
        Object term44794 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44794, term44794.getClass(), "wildcard", null);
        setField(term44794, term44794.getClass(), "generic", null);
        setField(term44794, term44794.getClass(), "qualified", null);
        setField(term44794, term44794.getClass(), "dimension", null);
        ArrayList term44797 = new ArrayList();
        ((ArrayList) term44797).add((Object)null);
        ((ArrayList) term44797).add((Object)null);
        ((ArrayList) term44797).add((Object)null);
        ((ArrayList) term44797).add((Object)null);
        ((ArrayList) term44797).add((Object)null);
        ((ArrayList) term44797).add((Object)null);
        ((ArrayList) term44797).add((Object)null);
        ((ArrayList) term44797).add((Object)null);
        Object term44795 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term44796 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term44796, term44796.getClass(), "extendsBound", null);
        setField(term44796, term44796.getClass(), "superBound", null);
        setField(term44795, term44795.getClass(), "wildcard", term44796);
        setField(term44795, term44795.getClass(), "generic", term44797);
        setField(term44795, term44795.getClass(), "qualified", "");
        setField(term44795, term44795.getClass(), "dimension", "");
        ArrayList term44791 = new ArrayList();
        ((ArrayList) term44791).add(term44779);
        ((ArrayList) term44791).add(term44787);
        ((ArrayList) term44791).add(term44793);
        ((ArrayList) term44791).add(term44775);
        ((ArrayList) term44791).add(term44794);
        ((ArrayList) term44791).add(term44795);
        ((ArrayList) term44791).add(term44780);
        ((ArrayList) term44791).add(term44795);
        ((ArrayList) term44791).add(term44795);
        term44775 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term44776 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term44776, term44776.getClass(), "extendsBound", term44777);
        setField(term44776, term44776.getClass(), "superBound", term44783);
        setField(term44775, term44775.getClass(), "wildcard", term44776);
        setField(term44775, term44775.getClass(), "generic", term44791);
        setField(term44775, term44775.getClass(), "qualified", "IbIwVilTPc");
        setField(term44775, term44775.getClass(), "dimension", "nCutEzWJsj");
        ArrayList term44833 = new ArrayList();
        ((ArrayList) term44833).add((Object)null);
        ((ArrayList) term44833).add((Object)null);
        ((ArrayList) term44833).add((Object)null);
        ((ArrayList) term44833).add((Object)null);
        ((ArrayList) term44833).add((Object)null);
        ((ArrayList) term44833).add((Object)null);
        ((ArrayList) term44833).add((Object)null);
        ((ArrayList) term44833).add((Object)null);
        ((ArrayList) term44833).add((Object)null);
        Object term44831 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term44832 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term44832, term44832.getClass(), "extendsBound", null);
        setField(term44832, term44832.getClass(), "superBound", null);
        setField(term44831, term44831.getClass(), "wildcard", term44832);
        setField(term44831, term44831.getClass(), "generic", term44833);
        setField(term44831, term44831.getClass(), "qualified", "");
        setField(term44831, term44831.getClass(), "dimension", "");
        Object term44838 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44838, term44838.getClass(), "wildcard", null);
        setField(term44838, term44838.getClass(), "generic", null);
        setField(term44838, term44838.getClass(), "qualified", null);
        setField(term44838, term44838.getClass(), "dimension", null);
        Object term44839 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44839, term44839.getClass(), "wildcard", null);
        setField(term44839, term44839.getClass(), "generic", null);
        setField(term44839, term44839.getClass(), "qualified", null);
        setField(term44839, term44839.getClass(), "dimension", null);
        ArrayList term44829 = new ArrayList();
        ((ArrayList) term44829).add(term44831);
        ((ArrayList) term44829).add(term44838);
        ((ArrayList) term44829).add(term44839);
        ArrayList term44842 = new ArrayList();
        term44828 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term44828, term44828.getClass(), "extendsBound", term44829);
        setField(term44828, term44828.getClass(), "superBound", term44842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.TypeInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.automation.xmldoclet.xjc.Wildcard");
        Object[] args = new Object[1];
        args[0] = term44828;
        callMethod(klass, "setWildcard", argTypes, term44775, args);
    }

};


