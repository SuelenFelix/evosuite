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

public class Asap2FileIterator_next_5130123972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1388;

    public Asap2FileIterator_next_5130123972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1389 = new LinkedList();
        ((LinkedList) term1389).add((Object)null);
        ((LinkedList) term1389).add((Object)null);
        ((LinkedList) term1389).add((Object)null);
        ((LinkedList) term1389).add((Object)null);
        ((LinkedList) term1389).add((Object)null);
        ((LinkedList) term1389).add((Object)null);
        HashMap term1399 = new HashMap();
        Set<Object> term1419 =  ((Map) term1399).keySet();
        HashSet term1398 = new HashSet((Collection<? extends Object>) term1419);
        term1388 = newInstance(Class.forName("net.alenzen.a2l.Asap2FileIterator"));
        setField(term1388, term1388.getClass(), "a2lQueue", term1389);
        setField(term1388, term1388.getClass(), "queued", term1398);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.Asap2FileIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term1388, args);
    }

};


