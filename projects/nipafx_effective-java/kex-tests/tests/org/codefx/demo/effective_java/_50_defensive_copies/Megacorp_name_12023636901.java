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

public class Megacorp_name_12023636901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231;

    public Megacorp_name_12023636901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term247 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term247, term247.getClass(), "name", "");
        setIntField(term247, term247.getClass(), "revenue", 1134449235);
        Object term250 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term250, term250.getClass(), "name", "");
        setIntField(term250, term250.getClass(), "revenue", -883034806);
        Object term253 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term253, term253.getClass(), "name", "");
        setIntField(term253, term253.getClass(), "revenue", 1585847225);
        Object term256 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term256, term256.getClass(), "name", "");
        setIntField(term256, term256.getClass(), "revenue", 597278769);
        Object term259 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term259, term259.getClass(), "name", "");
        setIntField(term259, term259.getClass(), "revenue", -1685132342);
        Object term262 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term262, term262.getClass(), "name", "");
        setIntField(term262, term262.getClass(), "revenue", -1456670397);
        Object term265 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term265, term265.getClass(), "name", "");
        setIntField(term265, term265.getClass(), "revenue", 1622346318);
        Object term268 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term268, term268.getClass(), "name", "");
        setIntField(term268, term268.getClass(), "revenue", 1048535127);
        Object term271 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term271, term271.getClass(), "name", "");
        setIntField(term271, term271.getClass(), "revenue", -655067527);
        ArrayList term245 = new ArrayList();
        ((ArrayList) term245).add(term247);
        ((ArrayList) term245).add(term250);
        ((ArrayList) term245).add(term253);
        ((ArrayList) term245).add(term256);
        ((ArrayList) term245).add(term259);
        ((ArrayList) term245).add(term262);
        ((ArrayList) term245).add(term265);
        ((ArrayList) term245).add(term268);
        ((ArrayList) term245).add(term271);
        term231 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Megacorp"));
        setField(term231, term231.getClass(), "name", "MxlszYVzRf");
        setIntField(term231, term231.getClass(), "totalRevenue", -522618178);
        setField(term231, term231.getClass(), "subsidiaries", term245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Megacorp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "name", argTypes, term231, args);
    }

};


