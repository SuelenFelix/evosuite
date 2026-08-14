package com.elltor.md.util;

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
import static com.elltor.md.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class MdKiller_MetaData_generateString_7994886465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6675;

    public MdKiller_MetaData_generateString_7994886465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6762 = Class.forName((String) "com.elltor.md.util.MdKiller$MetaData$Type");
        Field term6761 = ((Class) term6762).getDeclaredField((String) "NORMAL");
        ((Field) term6761).setAccessible(true);
        Object enum26 = ((Field) term6761).get((Object) null);
        HashMap term6700 = new HashMap();
        Set<Object> term7001 =  ((Map) term6700).keySet();
        HashSet term6699 = new HashSet((Collection<? extends Object>) term7001);
        HashSet term6710 = new HashSet();
        Object term6708 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Fonts"));
        setField(term6708, term6708.getClass(), "text", "");
        setField(term6708, term6708.getClass(), "styles", term6710);
        HashSet term6713 = new HashSet();
        Object term6711 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Fonts"));
        setField(term6711, term6711.getClass(), "text", "");
        setField(term6711, term6711.getClass(), "styles", term6713);
        HashSet term6716 = new HashSet();
        Object term6714 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Fonts"));
        setField(term6714, term6714.getClass(), "text", "");
        setField(term6714, term6714.getClass(), "styles", term6716);
        HashSet term6719 = new HashSet();
        Object term6717 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Fonts"));
        setField(term6717, term6717.getClass(), "text", "");
        setField(term6717, term6717.getClass(), "styles", term6719);
        HashSet term6722 = new HashSet();
        Object term6720 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Fonts"));
        setField(term6720, term6720.getClass(), "text", "");
        setField(term6720, term6720.getClass(), "styles", term6722);
        ArrayList term6706 = new ArrayList();
        ((ArrayList) term6706).add(term6708);
        ((ArrayList) term6706).add(term6711);
        ((ArrayList) term6706).add(term6714);
        ((ArrayList) term6706).add(term6717);
        ((ArrayList) term6706).add(term6720);
        term6675 = newInstance(Class.forName("com.elltor.md.util.MdKiller$MetaData"));
        Object term6686 = newInstance(Class.forName("com.elltor.md.util.MdKiller$Fonts"));
        setField(term6675, term6675.getClass(), "type", enum26);
        setField(term6686, term6686.getClass(), "text", "ZiaGIbnzTs");
        setField(term6686, term6686.getClass(), "styles", term6699);
        setField(term6675, term6675.getClass(), "text", term6686);
        setField(term6675, term6675.getClass(), "values", term6706);
        setField(term6675, term6675.getClass(), "separator", "xOEqzGAmDU");
        setField(term6675, term6675.getClass(), "valueSeparator", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.elltor.md.util.MdKiller$MetaData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYqFIqCKAV";
        callMethod(klass, "generateString", argTypes, term6675, args);
    }

};


