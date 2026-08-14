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

public class Element_getProperties_14053141210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2654;

    public Element_getProperties_14053141210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2655 = new Long(-7612550318181586304L);
        ArrayList term2657 = new ArrayList();
        ((ArrayList) term2657).add("SPpkrGcPRr");
        ((ArrayList) term2657).add("sEccwbJKYE");
        HashMap term2685 = new HashMap();
        term2654 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2654, term2654.getClass(), "id", term2655);
        setField(term2654, term2654.getClass(), "labels", term2657);
        setField(term2654, term2654.getClass(), "properties", term2685);
        setField(term2654, term2654.getClass(), "variable", "AWRooQKkdW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProperties", argTypes, term2654, args);
    }

};


