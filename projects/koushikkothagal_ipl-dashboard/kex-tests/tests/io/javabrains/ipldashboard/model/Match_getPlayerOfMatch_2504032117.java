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

public class Match_getPlayerOfMatch_2504032117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1649;

    public Match_getPlayerOfMatch_2504032117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1649 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term1663 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term1649, term1649.getClass(), "id", 6811161968424632369L);
        setField(term1649, term1649.getClass(), "city", "KoyGrUJeJW");
        setIntField(term1663, term1663.getClass(), "year", 2017);
        setShortField(term1663, term1663.getClass(), "month", (short) 5);
        setShortField(term1663, term1663.getClass(), "day", (short) 21);
        setField(term1649, term1649.getClass(), "date", term1663);
        setField(term1649, term1649.getClass(), "playerOfMatch", "HqBOwkVqjD");
        setField(term1649, term1649.getClass(), "venue", "MAcUBcBckh");
        setField(term1649, term1649.getClass(), "team1", "oVgzLbrsFr");
        setField(term1649, term1649.getClass(), "team2", "vQVyKLdtaz");
        setField(term1649, term1649.getClass(), "tossWinner", "OWKQODBLzb");
        setField(term1649, term1649.getClass(), "tossDecision", "wGmYcqUkgE");
        setField(term1649, term1649.getClass(), "matchWinner", "idgaQsnJpQ");
        setField(term1649, term1649.getClass(), "result", "VgZnGoIFwQ");
        setField(term1649, term1649.getClass(), "resultMargin", "jUbSRrkrYZ");
        setField(term1649, term1649.getClass(), "umpire1", "bWWfajKbEX");
        setField(term1649, term1649.getClass(), "umpire2", "cAPeiZHKGJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerOfMatch", argTypes, term1649, args);
    }

};


