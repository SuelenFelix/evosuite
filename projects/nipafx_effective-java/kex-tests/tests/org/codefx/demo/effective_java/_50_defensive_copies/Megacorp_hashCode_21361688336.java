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

public class Megacorp_hashCode_21361688336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term450;

    public Megacorp_hashCode_21361688336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term466 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term466, term466.getClass(), "name", "");
        setIntField(term466, term466.getClass(), "revenue", -1530420153);
        Object term469 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term469, term469.getClass(), "name", "");
        setIntField(term469, term469.getClass(), "revenue", -469968304);
        Object term472 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term472, term472.getClass(), "name", "");
        setIntField(term472, term472.getClass(), "revenue", -1145578966);
        Object term475 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term475, term475.getClass(), "name", "");
        setIntField(term475, term475.getClass(), "revenue", 679763016);
        Object term478 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term478, term478.getClass(), "name", "");
        setIntField(term478, term478.getClass(), "revenue", 1962444399);
        Object term481 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term481, term481.getClass(), "name", "");
        setIntField(term481, term481.getClass(), "revenue", 767834723);
        Object term484 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term484, term484.getClass(), "name", "");
        setIntField(term484, term484.getClass(), "revenue", -602026508);
        Object term487 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term487, term487.getClass(), "name", "");
        setIntField(term487, term487.getClass(), "revenue", -157887805);
        Object term490 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Subsidiary"));
        setField(term490, term490.getClass(), "name", "");
        setIntField(term490, term490.getClass(), "revenue", 1876565163);
        ArrayList term464 = new ArrayList();
        ((ArrayList) term464).add(term466);
        ((ArrayList) term464).add(term469);
        ((ArrayList) term464).add(term472);
        ((ArrayList) term464).add(term475);
        ((ArrayList) term464).add(term478);
        ((ArrayList) term464).add(term481);
        ((ArrayList) term464).add(term484);
        ((ArrayList) term464).add(term487);
        ((ArrayList) term464).add(term490);
        term450 = newInstance(Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Megacorp"));
        setField(term450, term450.getClass(), "name", "xrwlQZdwCp");
        setIntField(term450, term450.getClass(), "totalRevenue", -1087774327);
        setField(term450, term450.getClass(), "subsidiaries", term464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._50_defensive_copies.Megacorp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term450, args);
    }

};


