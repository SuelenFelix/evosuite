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

public class Castle_addToKnights_5959113524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7422;
     Object term7469;

    public Castle_addToKnights_5959113524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7423 = new Long(-1983291584002806658L);
        HashMap term7464 = new HashMap();
        Set<Object> term7597 =  ((Map) term7464).keySet();
        HashSet term7463 = new HashSet((Collection<? extends Object>) term7597);
        term7422 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term7422, term7422.getClass(), "id", term7423);
        setField(term7422, term7422.getClass(), "name", "dpNsDgfPso");
        setField(term7422, term7422.getClass(), "city", "hCWPJQKpdc");
        setField(term7422, term7422.getClass(), "state", "WzMEhMXkKx");
        setDoubleField(term7422, term7422.getClass(), "latitude", 0.37161417339133307);
        setDoubleField(term7422, term7422.getClass(), "longitude", 0.6805867182029153);
        setField(term7422, term7422.getClass(), "knights", term7463);
        Long term7470 = new Long(5946780097489996391L);
        Class<? extends Object> term7599 = Class.forName((String) "com.oreilly.quest.entities.Title");
        Field term7598 = ((Class) term7599).getDeclaredField((String) "LADY");
        ((Field) term7598).setAccessible(true);
        Object enum17 = ((Field) term7598).get((Object) null);
        Long term7493 = new Long(-8652538484981166496L);
        HashMap term7509 = new HashMap();
        Set<Object> term7797 =  ((Map) term7509).keySet();
        HashSet term7508 = new HashSet((Collection<? extends Object>) term7797);
        HashMap term7515 = new HashMap();
        Set<Object> term7798 =  ((Map) term7515).keySet();
        HashSet term7514 = new HashSet((Collection<? extends Object>) term7798);
        Long term7521 = new Long(2701184207686293431L);
        HashMap term7562 = new HashMap();
        Set<Object> term7829 =  ((Map) term7562).keySet();
        HashSet term7561 = new HashSet((Collection<? extends Object>) term7829);
        term7469 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        Object term7492 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        Object term7520 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term7469, term7469.getClass(), "id", term7470);
        setField(term7469, term7469.getClass(), "title", enum17);
        setField(term7469, term7469.getClass(), "name", "XOiDvlDhdc");
        setField(term7492, term7492.getClass(), "id", term7493);
        setField(term7492, term7492.getClass(), "name", "AdxvLJhNLe");
        setLongField(term7492, term7492.getClass(), "version", -484994522244390100L);
        setField(term7492, term7492.getClass(), "tasks", term7508);
        setField(term7492, term7492.getClass(), "knights", term7514);
        setField(term7469, term7469.getClass(), "quest", term7492);
        setField(term7520, term7520.getClass(), "id", term7521);
        setField(term7520, term7520.getClass(), "name", "lHfTrWKMPk");
        setField(term7520, term7520.getClass(), "city", "JDaAnsVTGV");
        setField(term7520, term7520.getClass(), "state", "mLUZFTfjle");
        setDoubleField(term7520, term7520.getClass(), "latitude", 0.2852810965221698);
        setDoubleField(term7520, term7520.getClass(), "longitude", 0.6300849762307866);
        setField(term7520, term7520.getClass(), "knights", term7561);
        setField(term7469, term7469.getClass(), "castle", term7520);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.oreilly.quest.entities.Knight");
        Object[] args = new Object[1];
        args[0] = term7469;
        callMethod(klass, "addToKnights", argTypes, term7422, args);
    }

};


