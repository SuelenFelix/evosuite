package com.todense.viewmodel.ants;

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
import static com.todense.viewmodel.ants.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Integer;

public class LocalSearcher_swap3Edges_11098129065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204;
     Object term205;
     Object term213;
     Object term215;
     Object term217;
     Object term219;

    public LocalSearcher_swap3Edges_11098129065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204 = newInstance(Class.forName("com.todense.viewmodel.ants.LocalSearcher"));
        Integer term207 = new Integer(-1339778481);
        Integer term209 = new Integer(1725571209);
        term205 = new ArrayList();
        ((ArrayList) term205).add(term207);
        ((ArrayList) term205).add(term209);
        term213 = new Integer(-1339778481);
        term215 = new Integer(1725571209);
        term217 = new Integer(-522618178);
        term219 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.ants.LocalSearcher");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term205;
        args[1] = term213;
        args[2] = term215;
        args[3] = term217;
        args[4] = term219;
        callMethod(klass, "swap3Edges", argTypes, term204, args);
    }

};


