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

public class Element_setLabel_7693673705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2107;

    public Element_setLabel_7693673705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2108 = new Long(4178434741742309755L);
        ArrayList term2110 = new ArrayList();
        HashMap term2114 = new HashMap();
        term2107 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2107, term2107.getClass(), "id", term2108);
        setField(term2107, term2107.getClass(), "labels", term2110);
        setField(term2107, term2107.getClass(), "properties", term2114);
        setField(term2107, term2107.getClass(), "variable", "OWKQODBLzb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wGmYcqUkgE";
        callMethod(klass, "setLabel", argTypes, term2107, args);
    }

};


