package net.alenzen.a2l;

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
import static net.alenzen.a2l.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Asap2FileIterator_hasNext_6252371431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1366;

    public Asap2FileIterator_hasNext_6252371431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1367 = new LinkedList();
        ((LinkedList) term1367).add((Object)null);
        ((LinkedList) term1367).add((Object)null);
        ((LinkedList) term1367).add((Object)null);
        ((LinkedList) term1367).add((Object)null);
        ((LinkedList) term1367).add((Object)null);
        ((LinkedList) term1367).add((Object)null);
        HashMap term1377 = new HashMap();
        Set<Object> term1387 =  ((Map) term1377).keySet();
        HashSet term1376 = new HashSet((Collection<? extends Object>) term1387);
        term1366 = newInstance(Class.forName("net.alenzen.a2l.Asap2FileIterator"));
        setField(term1366, term1366.getClass(), "a2lQueue", term1367);
        setField(term1366, term1366.getClass(), "queued", term1376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.Asap2FileIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term1366, args);
    }

};


