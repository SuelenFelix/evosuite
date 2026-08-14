package org.s1ck.gdl.model;

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
import static org.s1ck.gdl.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Element_setProperties_46009268211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2732;
     Object term2828;

    public Element_setProperties_46009268211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2733 = new Long(-2170847986967241072L);
        ArrayList term2735 = new ArrayList();
        ((ArrayList) term2735).add("vjxIhXHxGR");
        ((ArrayList) term2735).add("QXzGXbEXMu");
        ((ArrayList) term2735).add("qxSDVejjiY");
        ((ArrayList) term2735).add("xBsXSDjXYK");
        ((ArrayList) term2735).add("sEnIVFtZuQ");
        ((ArrayList) term2735).add("ZVecLZMLHF");
        HashMap term2811 = new HashMap();
        term2732 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2732, term2732.getClass(), "id", term2733);
        setField(term2732, term2732.getClass(), "labels", term2735);
        setField(term2732, term2732.getClass(), "properties", term2811);
        setField(term2732, term2732.getClass(), "variable", "fztQhjqwdP");
        term2828 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term2828;
        callMethod(klass, "setProperties", argTypes, term2732, args);
    }

};


