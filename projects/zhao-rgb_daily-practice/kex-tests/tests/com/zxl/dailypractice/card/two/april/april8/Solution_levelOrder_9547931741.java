package com.zxl.dailypractice.card.two.april.april8;

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
import static com.zxl.dailypractice.card.two.april.april8.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Solution_levelOrder_9547931741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public Solution_levelOrder_9547931741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.zxl.dailypractice.card.two.april.april8.Solution"));
        ArrayList term8 = new ArrayList();
        ((ArrayList) term8).add((Object)null);
        ((ArrayList) term8).add((Object)null);
        ((ArrayList) term8).add((Object)null);
        ((ArrayList) term8).add((Object)null);
        Object term6 = newInstance(Class.forName("com.zxl.dailypractice.card.two.april.april8.Node"));
        setIntField(term6, term6.getClass(), "val", 1162663216);
        setField(term6, term6.getClass(), "children", term8);
        ArrayList term13 = new ArrayList();
        ((ArrayList) term13).add((Object)null);
        Object term11 = newInstance(Class.forName("com.zxl.dailypractice.card.two.april.april8.Node"));
        setIntField(term11, term11.getClass(), "val", -1339778481);
        setField(term11, term11.getClass(), "children", term13);
        ArrayList term18 = new ArrayList();
        ((ArrayList) term18).add((Object)null);
        ((ArrayList) term18).add((Object)null);
        ((ArrayList) term18).add((Object)null);
        Object term16 = newInstance(Class.forName("com.zxl.dailypractice.card.two.april.april8.Node"));
        setIntField(term16, term16.getClass(), "val", 1484323161);
        setField(term16, term16.getClass(), "children", term18);
        ArrayList term23 = new ArrayList();
        ((ArrayList) term23).add((Object)null);
        ((ArrayList) term23).add((Object)null);
        Object term21 = newInstance(Class.forName("com.zxl.dailypractice.card.two.april.april8.Node"));
        setIntField(term21, term21.getClass(), "val", -1955890973);
        setField(term21, term21.getClass(), "children", term23);
        ArrayList term28 = new ArrayList();
        ((ArrayList) term28).add((Object)null);
        ((ArrayList) term28).add((Object)null);
        ((ArrayList) term28).add((Object)null);
        ((ArrayList) term28).add((Object)null);
        ((ArrayList) term28).add((Object)null);
        ((ArrayList) term28).add((Object)null);
        Object term26 = newInstance(Class.forName("com.zxl.dailypractice.card.two.april.april8.Node"));
        setIntField(term26, term26.getClass(), "val", -616727354);
        setField(term26, term26.getClass(), "children", term28);
        ArrayList term4 = new ArrayList();
        ((ArrayList) term4).add(term6);
        ((ArrayList) term4).add(term11);
        ((ArrayList) term4).add(term16);
        ((ArrayList) term4).add(term21);
        ((ArrayList) term4).add(term26);
        term2 = newInstance(Class.forName("com.zxl.dailypractice.card.two.april.april8.Node"));
        setIntField(term2, term2.getClass(), "val", 568599855);
        setField(term2, term2.getClass(), "children", term4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.april.april8.Solution");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.card.two.april.april8.Node");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "levelOrder", argTypes, term1, args);
    }

};


