package io.javabrains.ipldashboard.model;

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
import static io.javabrains.ipldashboard.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Match_setDate_7298030996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1375;
     Object term1525;

    public Match_setDate_7298030996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1375 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term1389 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1375, term1375.getClass(), "id", 4872422362414183754L);
        setField(term1375, term1375.getClass(), "city", "dEnhdmILtU");
        setIntField(term1389, term1389.getClass(), "year", 2018);
        setShortField(term1389, term1389.getClass(), "month", (short) 1);
        setShortField(term1389, term1389.getClass(), "day", (short) 13);
        setField(term1375, term1375.getClass(), "date", term1389);
        setField(term1375, term1375.getClass(), "playerOfMatch", "hoicvmsovO");
        setField(term1375, term1375.getClass(), "venue", "eqJfYWRaEL");
        setField(term1375, term1375.getClass(), "team1", "fhkbdRViHi");
        setField(term1375, term1375.getClass(), "team2", "uWHnvSvaPl");
        setField(term1375, term1375.getClass(), "tossWinner", "kBdSllIBVz");
        setField(term1375, term1375.getClass(), "tossDecision", "TJmVBGfTML");
        setField(term1375, term1375.getClass(), "matchWinner", "tPlsykYBqO");
        setField(term1375, term1375.getClass(), "result", "bLPjGVBhlX");
        setField(term1375, term1375.getClass(), "resultMargin", "whBvTVIIlC");
        setField(term1375, term1375.getClass(), "umpire1", "IgRJUzaCwW");
        setField(term1375, term1375.getClass(), "umpire2", "JUmudUmaaV");
        term1525 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1525, term1525.getClass(), "year", 2015);
        setShortField(term1525, term1525.getClass(), "month", (short) 4);
        setShortField(term1525, term1525.getClass(), "day", (short) 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term1525;
        callMethod(klass, "setDate", argTypes, term1375, args);
    }

};


