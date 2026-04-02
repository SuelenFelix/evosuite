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

public class Knight_getQuest_7674390209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2885;

    public Knight_getQuest_7674390209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2886 = new Long(8428634514691209827L);
        Class<? extends Object> term2984 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term2983 = ((Class) term2984).getDeclaredField((String) "LADY");
        ((Field) term2983).setAccessible(true);
        Object enum10 = ((Field) term2983).get((Object) null);
        Long term2909 = new Long(-2585684163342970173L);
        HashMap term2925 = new HashMap();
        Set<Object> term3182 =  ((Map) term2925).keySet();
        HashSet term2924 = new HashSet((Collection<? extends Object>) term3182);
        HashMap term2931 = new HashMap();
        Set<Object> term3183 =  ((Map) term2931).keySet();
        HashSet term2930 = new HashSet((Collection<? extends Object>) term3183);
        Long term2937 = new Long(8059786003080744426L);
        HashMap term2978 = new HashMap();
        Set<Object> term3214 =  ((Map) term2978).keySet();
        HashSet term2977 = new HashSet((Collection<? extends Object>) term3214);
        term2885 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        Object term2908 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term2936 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term2885, term2885.getClass(), "id", term2886);
        setField(term2885, term2885.getClass(), "title", enum10);
        setField(term2885, term2885.getClass(), "name", "Ghbwtircqb");
        setField(term2908, term2908.getClass(), "id", term2909);
        setField(term2908, term2908.getClass(), "name", "xrwlQZdwCp");
        setLongField(term2908, term2908.getClass(), "version", 6811161968424632369L);
        setField(term2908, term2908.getClass(), "tasks", term2924);
        setField(term2908, term2908.getClass(), "knights", term2930);
        setField(term2885, term2885.getClass(), "quest", term2908);
        setField(term2936, term2936.getClass(), "id", term2937);
        setField(term2936, term2936.getClass(), "name", "IDCWpPLRkE");
        setField(term2936, term2936.getClass(), "city", "nyiiPDVjAc");
        setField(term2936, term2936.getClass(), "state", "aKnKipADSo");
        setDoubleField(term2936, term2936.getClass(), "latitude", 0.7655020693602768);
        setDoubleField(term2936, term2936.getClass(), "longitude", 0.1374549299694151);
        setField(term2936, term2936.getClass(), "knights", term2977);
        setField(term2885, term2885.getClass(), "castle", term2936);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Knight");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuest", argTypes, term2885, args);
    }

};


