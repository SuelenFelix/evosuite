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

public class Match_setVenue_175657154310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2481;

    public Match_setVenue_175657154310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2481 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term2495 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term2481, term2481.getClass(), "id", -2813493605142626659L);
        setField(term2481, term2481.getClass(), "city", "eVpkWxjuki");
        setIntField(term2495, term2495.getClass(), "year", 2026);
        setShortField(term2495, term2495.getClass(), "month", (short) 12);
        setShortField(term2495, term2495.getClass(), "day", (short) 13);
        setField(term2481, term2481.getClass(), "date", term2495);
        setField(term2481, term2481.getClass(), "playerOfMatch", "SJiQaLvSKv");
        setField(term2481, term2481.getClass(), "venue", "OEXDRUKcFl");
        setField(term2481, term2481.getClass(), "team1", "RYdKCNNMBR");
        setField(term2481, term2481.getClass(), "team2", "yGtHPyvYiQ");
        setField(term2481, term2481.getClass(), "tossWinner", "MvRIxilFMJ");
        setField(term2481, term2481.getClass(), "tossDecision", "iNwOJRBEjp");
        setField(term2481, term2481.getClass(), "matchWinner", "XylxrMBraH");
        setField(term2481, term2481.getClass(), "result", "pORebkoRdD");
        setField(term2481, term2481.getClass(), "resultMargin", "mXGCWJDOqA");
        setField(term2481, term2481.getClass(), "umpire1", "dpNsDgfPso");
        setField(term2481, term2481.getClass(), "umpire2", "hCWPJQKpdc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WzMEhMXkKx";
        callMethod(klass, "setVenue", argTypes, term2481, args);
    }

};


