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

public class Element_addProperty_104510134711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2702;
     Object term2750;

    public Element_addProperty_104510134711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2703 = new Long(-2170847986967241072L);
        ArrayList term2705 = new ArrayList();
        ((ArrayList) term2705).add("AWRooQKkdW");
        HashMap term2721 = new HashMap();
        term2702 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2702, term2702.getClass(), "id", term2703);
        setField(term2702, term2702.getClass(), "labels", term2705);
        setField(term2702, term2702.getClass(), "properties", term2721);
        setField(term2702, term2702.getClass(), "variable", "vjxIhXHxGR");
        term2750 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "QXzGXbEXMu";
        args[1] = term2750;
        callMethod(klass, "addProperty", argTypes, term2702, args);
    }

};


