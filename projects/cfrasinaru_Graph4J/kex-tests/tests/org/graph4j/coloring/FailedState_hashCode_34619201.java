package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class FailedState_hashCode_34619201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4477;

    public FailedState_hashCode_34619201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4481 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4483 = (int[]) newIntArray(2);
        int[] term4486 = (int[]) newIntArray(6);
        setIntField(term4481, term4481.getClass(), "vertex", -1791371074);
        setIntElement(term4483, 0, -1151122332);
        setIntElement(term4483, 1, 953387911);
        setField(term4481, term4481.getClass(), "values", term4483);
        setIntElement(term4486, 0, -1550025613);
        setIntElement(term4486, 1, 814617314);
        setIntElement(term4486, 2, -159489307);
        setIntElement(term4486, 3, 1317020952);
        setIntElement(term4486, 4, -742710703);
        setIntElement(term4486, 5, -355505521);
        setField(term4481, term4481.getClass(), "positions", term4486);
        setIntField(term4481, term4481.getClass(), "size", 1227316523);
        Object term4494 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4496 = (int[]) newIntArray(4);
        int[] term4501 = (int[]) newIntArray(0);
        setIntField(term4494, term4494.getClass(), "vertex", -58633039);
        setIntElement(term4496, 0, 448061908);
        setIntElement(term4496, 1, -1268483887);
        setIntElement(term4496, 2, -1929689681);
        setIntElement(term4496, 3, -91240911);
        setField(term4494, term4494.getClass(), "values", term4496);
        setField(term4494, term4494.getClass(), "positions", term4501);
        setIntField(term4494, term4494.getClass(), "size", -321227954);
        Object term4503 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4505 = (int[]) newIntArray(3);
        int[] term4509 = (int[]) newIntArray(4);
        setIntField(term4503, term4503.getClass(), "vertex", 373810833);
        setIntElement(term4505, 0, -215979293);
        setIntElement(term4505, 1, -19567889);
        setIntElement(term4505, 2, 693500318);
        setField(term4503, term4503.getClass(), "values", term4505);
        setIntElement(term4509, 0, 1702404702);
        setIntElement(term4509, 1, 1141592999);
        setIntElement(term4509, 2, 848113442);
        setIntElement(term4509, 3, 793974213);
        setField(term4503, term4503.getClass(), "positions", term4509);
        setIntField(term4503, term4503.getClass(), "size", 722546287);
        Object term4515 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term4517 = (int[]) newIntArray(9);
        int[] term4527 = (int[]) newIntArray(4);
        setIntField(term4515, term4515.getClass(), "vertex", -2060284160);
        setIntElement(term4517, 0, -568450686);
        setIntElement(term4517, 1, 1314660281);
        setIntElement(term4517, 2, -126399768);
        setIntElement(term4517, 3, 318982923);
        setIntElement(term4517, 4, -154210001);
        setIntElement(term4517, 5, 621910137);
        setIntElement(term4517, 6, 241533020);
        setIntElement(term4517, 7, 2081679151);
        setIntElement(term4517, 8, -1030167086);
        setField(term4515, term4515.getClass(), "values", term4517);
        setIntElement(term4527, 0, -434230943);
        setIntElement(term4527, 1, 698633875);
        setIntElement(term4527, 2, 548468113);
        setIntElement(term4527, 3, 1701819905);
        setField(term4515, term4515.getClass(), "positions", term4527);
        setIntField(term4515, term4515.getClass(), "size", 1721418943);
        ArrayList term4479 = new ArrayList();
        ((ArrayList) term4479).add(term4481);
        ((ArrayList) term4479).add(term4494);
        ((ArrayList) term4479).add(term4503);
        ((ArrayList) term4479).add(term4515);
        term4477 = newInstance(Class.forName("org.graph4j.coloring.FailedState"));
        setIntField(term4477, term4477.getClass(), "vertex", -1825382367);
        setField(term4477, term4477.getClass(), "domains", term4479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.FailedState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4477, args);
    }

};


