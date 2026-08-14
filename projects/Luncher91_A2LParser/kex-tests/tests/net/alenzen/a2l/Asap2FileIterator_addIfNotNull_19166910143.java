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

public class Asap2FileIterator_addIfNotNull_19166910143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1420;
     Object term1431;

    public Asap2FileIterator_addIfNotNull_19166910143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1420 = new LinkedList();
        ((LinkedList) term1420).add((Object)null);
        ((LinkedList) term1420).add((Object)null);
        ((LinkedList) term1420).add((Object)null);
        ((LinkedList) term1420).add((Object)null);
        ((LinkedList) term1420).add((Object)null);
        ((LinkedList) term1420).add((Object)null);
        ((LinkedList) term1420).add((Object)null);
        ((LinkedList) term1420).add((Object)null);
        term1431 = new LinkedList();
        ((LinkedList) term1431).add((Object)null);
        ((LinkedList) term1431).add((Object)null);
        ((LinkedList) term1431).add((Object)null);
        ((LinkedList) term1431).add((Object)null);
        ((LinkedList) term1431).add((Object)null);
        ((LinkedList) term1431).add((Object)null);
        ((LinkedList) term1431).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.Asap2FileIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term1420;
        args[1] = term1431;
        callMethod(klass, "addIfNotNull", argTypes, null, args);
    }

};


