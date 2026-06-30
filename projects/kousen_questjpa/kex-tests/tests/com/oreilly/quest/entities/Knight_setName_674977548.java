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

public class Knight_setName_674977548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2533;

    public Knight_setName_674977548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2534 = new Long(5127676408959197577L);
        Class<? extends Object> term2644 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term2643 = ((Class) term2644).getDeclaredField((String) "LADY");
        ((Field) term2643).setAccessible(true);
        Object enum9 = ((Field) term2643).get((Object) null);
        Long term2557 = new Long(-6573104506744284592L);
        HashMap term2573 = new HashMap();
        Set<Object> term2842 =  ((Map) term2573).keySet();
        HashSet term2572 = new HashSet((Collection<? extends Object>) term2842);
        HashMap term2579 = new HashMap();
        Set<Object> term2843 =  ((Map) term2579).keySet();
        HashSet term2578 = new HashSet((Collection<? extends Object>) term2843);
        Long term2585 = new Long(-4920224193275732920L);
        HashMap term2626 = new HashMap();
        Set<Object> term2874 =  ((Map) term2626).keySet();
        HashSet term2625 = new HashSet((Collection<? extends Object>) term2874);
        term2533 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        Object term2556 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term2584 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term2533, term2533.getClass(), "id", term2534);
        setField(term2533, term2533.getClass(), "title", enum9);
        setField(term2533, term2533.getClass(), "name", "TEParAifyi");
        setField(term2556, term2556.getClass(), "id", term2557);
        setField(term2556, term2556.getClass(), "name", "OWDIEULEFu");
        setLongField(term2556, term2556.getClass(), "version", 4872422362414183754L);
        setField(term2556, term2556.getClass(), "tasks", term2572);
        setField(term2556, term2556.getClass(), "knights", term2578);
        setField(term2533, term2533.getClass(), "quest", term2556);
        setField(term2584, term2584.getClass(), "id", term2585);
        setField(term2584, term2584.getClass(), "name", "dWRymuLBtr");
        setField(term2584, term2584.getClass(), "city", "AijpHYOFuy");
        setField(term2584, term2584.getClass(), "state", "SbAoxhfrkn");
        setDoubleField(term2584, term2584.getClass(), "latitude", 0.8474802076607362);
        setDoubleField(term2584, term2584.getClass(), "longitude", 0.5183269973490326);
        setField(term2584, term2584.getClass(), "knights", term2625);
        setField(term2533, term2533.getClass(), "castle", term2584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Knight");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kuTXqwMtDB";
        callMethod(klass, "setName", argTypes, term2533, args);
    }

};


