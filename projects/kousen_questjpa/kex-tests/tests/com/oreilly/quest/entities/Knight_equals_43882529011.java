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

public class Knight_equals_43882529011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3589;
     Object term3688;

    public Knight_equals_43882529011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3590 = new Long(-4502405999831680926L);
        Class<? extends Object> term3690 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term3689 = ((Class) term3690).getDeclaredField((String) "QUEEN");
        ((Field) term3689).setAccessible(true);
        Object enum12 = ((Field) term3689).get((Object) null);
        Long term3614 = new Long(1967728129628047933L);
        HashMap term3630 = new HashMap();
        Set<Object> term3891 =  ((Map) term3630).keySet();
        HashSet term3629 = new HashSet((Collection<? extends Object>) term3891);
        HashMap term3636 = new HashMap();
        Set<Object> term3892 =  ((Map) term3636).keySet();
        HashSet term3635 = new HashSet((Collection<? extends Object>) term3892);
        Long term3642 = new Long(2120084523938730454L);
        HashMap term3683 = new HashMap();
        Set<Object> term3923 =  ((Map) term3683).keySet();
        HashSet term3682 = new HashSet((Collection<? extends Object>) term3923);
        term3589 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        Object term3613 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term3641 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term3589, term3589.getClass(), "id", term3590);
        setField(term3589, term3589.getClass(), "title", enum12);
        setField(term3589, term3589.getClass(), "name", "tShwQLRGNe");
        setField(term3613, term3613.getClass(), "id", term3614);
        setField(term3613, term3613.getClass(), "name", "LvtrsXUliU");
        setLongField(term3613, term3613.getClass(), "version", -2813493605142626659L);
        setField(term3613, term3613.getClass(), "tasks", term3629);
        setField(term3613, term3613.getClass(), "knights", term3635);
        setField(term3589, term3589.getClass(), "quest", term3613);
        setField(term3641, term3641.getClass(), "id", term3642);
        setField(term3641, term3641.getClass(), "name", "xLbjWUgOIL");
        setField(term3641, term3641.getClass(), "city", "jDtqGUpnZN");
        setField(term3641, term3641.getClass(), "state", "nGKItKLYNC");
        setDoubleField(term3641, term3641.getClass(), "latitude", 0.9828442029246764);
        setDoubleField(term3641, term3641.getClass(), "longitude", 0.2779719046761513);
        setField(term3641, term3641.getClass(), "knights", term3682);
        setField(term3589, term3589.getClass(), "castle", term3641);
        term3688 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Knight");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3688;
        callMethod(klass, "equals", argTypes, term3589, args);
    }

};


