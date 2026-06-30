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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class Castle_removeKnight_14406535795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7830;
     Object term7877;

    public Castle_removeKnight_14406535795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7831 = new Long(4474998035090263139L);
        HashMap term7872 = new HashMap();
        Set<Object> term8006 =  ((Map) term7872).keySet();
        HashSet term7871 = new HashSet((Collection<? extends Object>) term8006);
        term7830 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term7830, term7830.getClass(), "id", term7831);
        setField(term7830, term7830.getClass(), "name", "xIeFjkHkOe");
        setField(term7830, term7830.getClass(), "city", "SdCKLMIYnX");
        setField(term7830, term7830.getClass(), "state", "OJJtVNPyKZ");
        setDoubleField(term7830, term7830.getClass(), "latitude", 0.9737083944266686);
        setDoubleField(term7830, term7830.getClass(), "longitude", 0.0668892744806211);
        setField(term7830, term7830.getClass(), "knights", term7871);
        Long term7878 = new Long(2848819812340321742L);
        Class<? extends Object> term8008 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term8007 = ((Class) term8008).getDeclaredField((String) "QUEEN");
        ((Field) term8007).setAccessible(true);
        Object enum18 = ((Field) term8007).get((Object) null);
        Long term7902 = new Long(-8876856890348836498L);
        HashMap term7918 = new HashMap();
        Set<Object> term8209 =  ((Map) term7918).keySet();
        HashSet term7917 = new HashSet((Collection<? extends Object>) term8209);
        HashMap term7924 = new HashMap();
        Set<Object> term8210 =  ((Map) term7924).keySet();
        HashSet term7923 = new HashSet((Collection<? extends Object>) term8210);
        Long term7930 = new Long(846579494941632714L);
        HashMap term7971 = new HashMap();
        Set<Object> term8241 =  ((Map) term7971).keySet();
        HashSet term7970 = new HashSet((Collection<? extends Object>) term8241);
        term7877 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        Object term7901 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term7929 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term7877, term7877.getClass(), "id", term7878);
        setField(term7877, term7877.getClass(), "title", enum18);
        setField(term7877, term7877.getClass(), "name", "AKNapTAfmD");
        setField(term7901, term7901.getClass(), "id", term7902);
        setField(term7901, term7901.getClass(), "name", "xJgPlLxpgC");
        setLongField(term7901, term7901.getClass(), "version", 1233889271256172047L);
        setField(term7901, term7901.getClass(), "tasks", term7917);
        setField(term7901, term7901.getClass(), "knights", term7923);
        setField(term7877, term7877.getClass(), "quest", term7901);
        setField(term7929, term7929.getClass(), "id", term7930);
        setField(term7929, term7929.getClass(), "name", "EYtfuJaxiM");
        setField(term7929, term7929.getClass(), "city", "gCWtLVKVVe");
        setField(term7929, term7929.getClass(), "state", "fWKJoSoCwE");
        setDoubleField(term7929, term7929.getClass(), "latitude", 0.3587267442738795);
        setDoubleField(term7929, term7929.getClass(), "longitude", 0.07802449704920456);
        setField(term7929, term7929.getClass(), "knights", term7970);
        setField(term7877, term7877.getClass(), "castle", term7929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.oreilly.quest.entities.Knight");
        Object[] args = new Object[1];
        args[0] = term7877;
        callMethod(klass, "removeKnight", argTypes, term7830, args);
    }

};


