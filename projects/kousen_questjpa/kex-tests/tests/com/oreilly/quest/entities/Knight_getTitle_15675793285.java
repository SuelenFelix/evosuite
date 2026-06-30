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

public class Knight_getTitle_15675793285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1539;

    public Knight_getTitle_15675793285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1540 = new Long(-7237588299778557629L);
        Class<? extends Object> term1638 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term1637 = ((Class) term1638).getDeclaredField((String) "KING");
        ((Field) term1637).setAccessible(true);
        Object enum6 = ((Field) term1637).get((Object) null);
        Long term1563 = new Long(6967924379644551255L);
        HashMap term1579 = new HashMap();
        Set<Object> term1836 =  ((Map) term1579).keySet();
        HashSet term1578 = new HashSet((Collection<? extends Object>) term1836);
        HashMap term1585 = new HashMap();
        Set<Object> term1837 =  ((Map) term1585).keySet();
        HashSet term1584 = new HashSet((Collection<? extends Object>) term1837);
        Long term1591 = new Long(-2813493605142626659L);
        HashMap term1632 = new HashMap();
        Set<Object> term1868 =  ((Map) term1632).keySet();
        HashSet term1631 = new HashSet((Collection<? extends Object>) term1868);
        term1539 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        Object term1562 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term1590 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term1539, term1539.getClass(), "id", term1540);
        setField(term1539, term1539.getClass(), "title", enum6);
        setField(term1539, term1539.getClass(), "name", "oVcInYnLWB");
        setField(term1562, term1562.getClass(), "id", term1563);
        setField(term1562, term1562.getClass(), "name", "aJlieCFVtF");
        setLongField(term1562, term1562.getClass(), "version", -8400487765614892086L);
        setField(term1562, term1562.getClass(), "tasks", term1578);
        setField(term1562, term1562.getClass(), "knights", term1584);
        setField(term1539, term1539.getClass(), "quest", term1562);
        setField(term1590, term1590.getClass(), "id", term1591);
        setField(term1590, term1590.getClass(), "name", "ZiaGIbnzTs");
        setField(term1590, term1590.getClass(), "city", "tbcdzjIfER");
        setField(term1590, term1590.getClass(), "state", "HyxfbSQYBe");
        setDoubleField(term1590, term1590.getClass(), "latitude", 0.28570734989730284);
        setDoubleField(term1590, term1590.getClass(), "longitude", 0.40176586625454525);
        setField(term1590, term1590.getClass(), "knights", term1631);
        setField(term1539, term1539.getClass(), "castle", term1590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Knight");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term1539, args);
    }

};


