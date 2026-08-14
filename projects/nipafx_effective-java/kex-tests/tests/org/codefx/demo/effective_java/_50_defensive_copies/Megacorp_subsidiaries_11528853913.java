package org.codefx.demo.effective_java._50_defensive_copies;

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
import static org.codefx.demo.effective_java._50_defensive_copies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Megacorp_subsidiaries_11528853913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314;

    public Megacorp_subsidiaries_11528853913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term330 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term330, term330.getClass(), "name", "");
        setIntField(term330, term330.getClass(), "revenue", -117576464);
        Object term333 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term333, term333.getClass(), "name", "");
        setIntField(term333, term333.getClass(), "revenue", -1007160944);
        Object term336 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term336, term336.getClass(), "name", "");
        setIntField(term336, term336.getClass(), "revenue", 1135664017);
        Object term339 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term339, term339.getClass(), "name", "");
        setIntField(term339, term339.getClass(), "revenue", 590364439);
        ArrayList term328 = new ArrayList();
        ((ArrayList) term328).add(term330);
        ((ArrayList) term328).add(term333);
        ((ArrayList) term328).add(term336);
        ((ArrayList) term328).add(term339);
        term314 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Megacorp"));
        setField(term314, term314.getClass(), "name", "eZFUvlxvGV");
        setIntField(term314, term314.getClass(), "totalRevenue", -2068769794);
        setField(term314, term314.getClass(), "subsidiaries", term328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Megacorp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "subsidiaries", argTypes, term314, args);
    }

};


