package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class WeightedSpanningTreeIterator_Part_init_7866628000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2343;

    public WeightedSpanningTreeIterator_Part_init_7866628000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2351 = new Double(0.7556333590365407);
        Double term2353 = new Double(0.989587731021552);
        Double term2355 = new Double(0.7437704061893722);
        Double term2357 = new Double(0.8101332136663211);
        Double term2359 = new Double(0.4183851447671385);
        Double term2361 = new Double(0.1530493698346701);
        Double term2363 = new Double(0.4358033545982626);
        Double term2365 = new Double(0.6157985985337833);
        Double term2372 = new Double(0.5597408162966153);
        Double term2374 = new Double(0.41169015583506396);
        Double term2376 = new Double(0.7573851506992271);
        Double term2378 = new Double(0.20772463054672885);
        Double term2380 = new Double(0.8809303317546562);
        Double term2382 = new Double(0.1618147788159342);
        Double term2384 = new Double(0.406335810791266);
        Double term2386 = new Double(0.9329152993716182);
        Double term2393 = new Double(0.19249622994976234);
        Double term2395 = new Double(0.05354858372784854);
        Double term2397 = new Double(0.7450220526761285);
        Double term2399 = new Double(0.559634969030494);
        Double term2401 = new Double(0.41495700567487526);
        Double term2403 = new Double(0.19574188145979576);
        Double term2405 = new Double(0.8076260805596375);
        Double term2412 = new Double(0.08630361157958077);
        Double term2414 = new Double(0.22217511003992507);
        Double term2416 = new Double(0.16960229618566558);
        Double term2418 = new Double(0.5681156724199693);
        Double term2420 = new Double(0.31903537908513446);
        Double term2422 = new Double(0.11933076829589284);
        Double term2424 = new Double(0.2662471534242947);
        term2343 = newInstance(Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator"));
        Object[] term2345 = (Object[]) newArray("org.graph4j.Edge", 4);
        Object term2346 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term2350 = (Object[]) newArray("java.lang.Double", 8);
        Object term2367 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term2371 = (Object[]) newArray("java.lang.Double", 8);
        Object term2388 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term2392 = (Object[]) newArray("java.lang.Double", 7);
        Object term2407 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term2411 = (Object[]) newArray("java.lang.Double", 7);
        setField(term2343, term2343.getClass(), "graph", null);
        setIntField(term2343, term2343.getClass(), "numVertices", 1543091617);
        setBooleanField(term2346, term2346.getClass(), "directed", true);
        setIntField(term2346, term2346.getClass(), "source", -763166094);
        setIntField(term2346, term2346.getClass(), "target", -222941705);
        setElement(term2350, 0, term2351);
        setElement(term2350, 1, term2353);
        setElement(term2350, 2, term2355);
        setElement(term2350, 3, term2357);
        setElement(term2350, 4, term2359);
        setElement(term2350, 5, term2361);
        setElement(term2350, 6, term2363);
        setElement(term2350, 7, term2365);
        setField(term2346, term2346.getClass(), "data", term2350);
        setField(term2346, term2346.getClass(), "label", null);
        setElement(term2345, 0, term2346);
        setBooleanField(term2367, term2367.getClass(), "directed", false);
        setIntField(term2367, term2367.getClass(), "source", 291864719);
        setIntField(term2367, term2367.getClass(), "target", -1549607466);
        setElement(term2371, 0, term2372);
        setElement(term2371, 1, term2374);
        setElement(term2371, 2, term2376);
        setElement(term2371, 3, term2378);
        setElement(term2371, 4, term2380);
        setElement(term2371, 5, term2382);
        setElement(term2371, 6, term2384);
        setElement(term2371, 7, term2386);
        setField(term2367, term2367.getClass(), "data", term2371);
        setField(term2367, term2367.getClass(), "label", null);
        setElement(term2345, 1, term2367);
        setBooleanField(term2388, term2388.getClass(), "directed", true);
        setIntField(term2388, term2388.getClass(), "source", 853609788);
        setIntField(term2388, term2388.getClass(), "target", -197820800);
        setElement(term2392, 0, term2393);
        setElement(term2392, 1, term2395);
        setElement(term2392, 2, term2397);
        setElement(term2392, 3, term2399);
        setElement(term2392, 4, term2401);
        setElement(term2392, 5, term2403);
        setElement(term2392, 6, term2405);
        setField(term2388, term2388.getClass(), "data", term2392);
        setField(term2388, term2388.getClass(), "label", null);
        setElement(term2345, 2, term2388);
        setBooleanField(term2407, term2407.getClass(), "directed", true);
        setIntField(term2407, term2407.getClass(), "source", 723812297);
        setIntField(term2407, term2407.getClass(), "target", 1639448749);
        setElement(term2411, 0, term2412);
        setElement(term2411, 1, term2414);
        setElement(term2411, 2, term2416);
        setElement(term2411, 3, term2418);
        setElement(term2411, 4, term2420);
        setElement(term2411, 5, term2422);
        setElement(term2411, 6, term2424);
        setField(term2407, term2407.getClass(), "data", term2411);
        setField(term2407, term2407.getClass(), "label", null);
        setElement(term2345, 3, term2407);
        setField(term2343, term2343.getClass(), "edges", term2345);
        setField(term2343, term2343.getClass(), "queue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator$Part");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.spanning.WeightedSpanningTreeIterator");
        Object[] args = new Object[1];
        args[0] = term2343;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


