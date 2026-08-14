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

public class Element_addProperty_104510134712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2935;
     Object term2983;

    public Element_addProperty_104510134712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2936 = new Long(4044358158040652353L);
        ArrayList term2938 = new ArrayList();
        ((ArrayList) term2938).add("OEXDRUKcFl");
        HashMap term2954 = new HashMap();
        term2935 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2935, term2935.getClass(), "id", term2936);
        setField(term2935, term2935.getClass(), "labels", term2938);
        setField(term2935, term2935.getClass(), "properties", term2954);
        setField(term2935, term2935.getClass(), "variable", "RYdKCNNMBR");
        term2983 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = "yGtHPyvYiQ";
        args[1] = term2983;
        callMethod(klass, "addProperty", argTypes, term2935, args);
    }

};


