package com.usantatecla.ustumlserver.domain.model.generators;

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
import static com.usantatecla.ustumlserver.domain.model.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class DirectoryTreeGenerator_visit_20093780414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1779;
     Object term1780;

    public DirectoryTreeGenerator_visit_20093780414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1779 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.DirectoryTreeGenerator"));
        ArrayList term1781 = new ArrayList();
        Class<? extends Object> term1885 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term1884 = ((Class) term1885).getDeclaredField((String) "PUBLIC");
        ((Field) term1884).setAccessible(true);
        Object enum4 =  ((Field) term1884).get((Object) null);
        Class<? extends Object> term2225 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term2224 = ((Class) term2225).getDeclaredField((String) "PUBLIC");
        ((Field) term2224).setAccessible(true);
        Object enum5 =  ((Field) term2224).get((Object) null);
        ArrayList term1785 = new ArrayList();
        ((ArrayList) term1785).add(enum4);
        ((ArrayList) term1785).add(enum5);
        ArrayList term1802 = new ArrayList();
        ((ArrayList) term1802).add((Object)null);
        Object term1799 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term1799, term1799.getClass(), "name", "");
        setField(term1799, term1799.getClass(), "type", "");
        setField(term1799, term1799.getClass(), "modifiers", term1802);
        ArrayList term1808 = new ArrayList();
        ((ArrayList) term1808).add((Object)null);
        ((ArrayList) term1808).add((Object)null);
        ((ArrayList) term1808).add((Object)null);
        ((ArrayList) term1808).add((Object)null);
        ((ArrayList) term1808).add((Object)null);
        Object term1805 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term1805, term1805.getClass(), "name", "");
        setField(term1805, term1805.getClass(), "type", "");
        setField(term1805, term1805.getClass(), "modifiers", term1808);
        ArrayList term1814 = new ArrayList();
        ((ArrayList) term1814).add((Object)null);
        ((ArrayList) term1814).add((Object)null);
        ((ArrayList) term1814).add((Object)null);
        ((ArrayList) term1814).add((Object)null);
        ((ArrayList) term1814).add((Object)null);
        Object term1811 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term1811, term1811.getClass(), "name", "");
        setField(term1811, term1811.getClass(), "type", "");
        setField(term1811, term1811.getClass(), "modifiers", term1814);
        ArrayList term1820 = new ArrayList();
        ((ArrayList) term1820).add((Object)null);
        ((ArrayList) term1820).add((Object)null);
        ((ArrayList) term1820).add((Object)null);
        ((ArrayList) term1820).add((Object)null);
        Object term1817 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term1817, term1817.getClass(), "name", "");
        setField(term1817, term1817.getClass(), "type", "");
        setField(term1817, term1817.getClass(), "modifiers", term1820);
        ArrayList term1826 = new ArrayList();
        ((ArrayList) term1826).add((Object)null);
        Object term1823 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term1823, term1823.getClass(), "name", "");
        setField(term1823, term1823.getClass(), "type", "");
        setField(term1823, term1823.getClass(), "modifiers", term1826);
        ArrayList term1832 = new ArrayList();
        ((ArrayList) term1832).add((Object)null);
        ((ArrayList) term1832).add((Object)null);
        Object term1829 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term1829, term1829.getClass(), "name", "");
        setField(term1829, term1829.getClass(), "type", "");
        setField(term1829, term1829.getClass(), "modifiers", term1832);
        ArrayList term1838 = new ArrayList();
        ((ArrayList) term1838).add((Object)null);
        ((ArrayList) term1838).add((Object)null);
        ((ArrayList) term1838).add((Object)null);
        ((ArrayList) term1838).add((Object)null);
        ((ArrayList) term1838).add((Object)null);
        ((ArrayList) term1838).add((Object)null);
        Object term1835 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term1835, term1835.getClass(), "name", "");
        setField(term1835, term1835.getClass(), "type", "");
        setField(term1835, term1835.getClass(), "modifiers", term1838);
        ArrayList term1797 = new ArrayList();
        ((ArrayList) term1797).add(term1799);
        ((ArrayList) term1797).add(term1805);
        ((ArrayList) term1797).add(term1811);
        ((ArrayList) term1797).add(term1817);
        ((ArrayList) term1797).add(term1823);
        ((ArrayList) term1797).add(term1829);
        ((ArrayList) term1797).add(term1835);
        ArrayList term1846 = new ArrayList();
        ((ArrayList) term1846).add((Object)null);
        ArrayList term1851 = new ArrayList();
        ((ArrayList) term1851).add((Object)null);
        ((ArrayList) term1851).add((Object)null);
        Object term1845 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term1845, term1845.getClass(), "parameters", term1846);
        setField(term1845, term1845.getClass(), "name", "");
        setField(term1845, term1845.getClass(), "type", "");
        setField(term1845, term1845.getClass(), "modifiers", term1851);
        ArrayList term1843 = new ArrayList();
        ((ArrayList) term1843).add(term1845);
        ArrayList term1880 = new ArrayList();
        ((ArrayList) term1880).add((Object)null);
        ((ArrayList) term1880).add((Object)null);
        ((ArrayList) term1880).add((Object)null);
        term1780 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum"));
        setField(term1780, term1780.getClass(), "objects", term1781);
        setField(term1780, term1780.getClass(), "modifiers", term1785);
        setField(term1780, term1780.getClass(), "attributes", term1797);
        setField(term1780, term1780.getClass(), "methods", term1843);
        setField(term1780, term1780.getClass(), "id", "tShwQLRGNe");
        setField(term1780, term1780.getClass(), "name", "LvtrsXUliU");
        setField(term1780, term1780.getClass(), "relations", term1880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.DirectoryTreeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum");
        Object[] args = new Object[1];
        args[0] = term1780;
        callMethod(klass, "visit", argTypes, term1779, args);
    }

};


