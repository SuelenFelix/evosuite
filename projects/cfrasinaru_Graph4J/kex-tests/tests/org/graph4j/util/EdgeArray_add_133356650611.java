package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class EdgeArray_add_133356650611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62017;
     Object term62064;

    public EdgeArray_add_133356650611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62017 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term62018 = (Object[]) newArray("[I", 7);
        int[] term62019 = (int[]) newIntArray(7);
        int[] term62027 = (int[]) newIntArray(2);
        int[] term62030 = (int[]) newIntArray(9);
        int[] term62040 = (int[]) newIntArray(3);
        int[] term62044 = (int[]) newIntArray(8);
        int[] term62053 = (int[]) newIntArray(2);
        int[] term62056 = (int[]) newIntArray(6);
        setField(term62017, term62017.getClass(), "graph", null);
        setIntElement(term62019, 0, -1940733744);
        setIntElement(term62019, 1, 813004922);
        setIntElement(term62019, 2, 1040865837);
        setIntElement(term62019, 3, -462903820);
        setIntElement(term62019, 4, -1257429974);
        setIntElement(term62019, 5, -1004528891);
        setIntElement(term62019, 6, 851896454);
        setElement(term62018, 0, term62019);
        setIntElement(term62027, 0, -443182574);
        setIntElement(term62027, 1, 970363720);
        setElement(term62018, 1, term62027);
        setIntElement(term62030, 0, 442783372);
        setIntElement(term62030, 1, -433426890);
        setIntElement(term62030, 2, -1310705922);
        setIntElement(term62030, 3, -2051858041);
        setIntElement(term62030, 4, -355516401);
        setIntElement(term62030, 5, 1837235354);
        setIntElement(term62030, 6, 1008836521);
        setIntElement(term62030, 7, 1301805757);
        setIntElement(term62030, 8, -103200853);
        setElement(term62018, 2, term62030);
        setIntElement(term62040, 0, 191523655);
        setIntElement(term62040, 1, -832407103);
        setIntElement(term62040, 2, -114759282);
        setElement(term62018, 3, term62040);
        setIntElement(term62044, 0, -1514675613);
        setIntElement(term62044, 1, -62146428);
        setIntElement(term62044, 2, 1979408142);
        setIntElement(term62044, 3, 244805374);
        setIntElement(term62044, 4, 1475972131);
        setIntElement(term62044, 5, 1397062904);
        setIntElement(term62044, 6, 1176883487);
        setIntElement(term62044, 7, -6078648);
        setElement(term62018, 4, term62044);
        setIntElement(term62053, 0, 709977602);
        setIntElement(term62053, 1, -205363548);
        setElement(term62018, 5, term62053);
        setIntElement(term62056, 0, 221170469);
        setIntElement(term62056, 1, -177915923);
        setIntElement(term62056, 2, 931656903);
        setIntElement(term62056, 3, 1825828626);
        setIntElement(term62056, 4, 807800350);
        setIntElement(term62056, 5, 1099637519);
        setElement(term62018, 6, term62056);
        setField(term62017, term62017.getClass(), "edges", term62018);
        setIntField(term62017, term62017.getClass(), "numEdges", 1826276270);
        Double term62069 = new Double(0.9136597256674437);
        Double term62071 = new Double(0.3741779691002205);
        Double term62073 = new Double(0.5652495059647745);
        Double term62075 = new Double(0.021410850431387685);
        Double term62077 = new Double(0.8397628091272534);
        term62064 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term62068 = (Object[]) newArray("java.lang.Double", 5);
        setBooleanField(term62064, term62064.getClass(), "directed", false);
        setIntField(term62064, term62064.getClass(), "source", 265732302);
        setIntField(term62064, term62064.getClass(), "target", 552831797);
        setElement(term62068, 0, term62069);
        setElement(term62068, 1, term62071);
        setElement(term62068, 2, term62073);
        setElement(term62068, 3, term62075);
        setElement(term62068, 4, term62077);
        setField(term62064, term62064.getClass(), "data", term62068);
        setField(term62064, term62064.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term62064;
        callMethod(klass, "add", argTypes, term62017, args);
    }

};


