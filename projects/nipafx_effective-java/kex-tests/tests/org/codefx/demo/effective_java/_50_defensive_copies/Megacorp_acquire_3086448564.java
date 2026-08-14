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

public class Megacorp_acquire_3086448564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354;
     Object term387;

    public Megacorp_acquire_3086448564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term370 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term370, term370.getClass(), "name", "");
        setIntField(term370, term370.getClass(), "revenue", -1275173084);
        Object term373 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term373, term373.getClass(), "name", "");
        setIntField(term373, term373.getClass(), "revenue", -244121226);
        Object term376 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term376, term376.getClass(), "name", "");
        setIntField(term376, term376.getClass(), "revenue", -203030934);
        Object term379 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term379, term379.getClass(), "name", "");
        setIntField(term379, term379.getClass(), "revenue", -1179120542);
        Object term382 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term382, term382.getClass(), "name", "");
        setIntField(term382, term382.getClass(), "revenue", -73683645);
        ArrayList term368 = new ArrayList();
        ((ArrayList) term368).add(term370);
        ((ArrayList) term368).add(term373);
        ((ArrayList) term368).add(term376);
        ((ArrayList) term368).add(term379);
        ((ArrayList) term368).add(term382);
        term354 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Megacorp"));
        setField(term354, term354.getClass(), "name", "IoAlmYsBwc");
        setIntField(term354, term354.getClass(), "totalRevenue", 865208305);
        setField(term354, term354.getClass(), "subsidiaries", term368);
        term387 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term387, term387.getClass(), "name", "kuTXqwMtDB");
        setIntField(term387, term387.getClass(), "revenue", -226514366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Megacorp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary");
        Object[] args = new Object[1];
        args[0] = term387;
        callMethod(klass, "acquire", argTypes, term354, args);
    }

};


