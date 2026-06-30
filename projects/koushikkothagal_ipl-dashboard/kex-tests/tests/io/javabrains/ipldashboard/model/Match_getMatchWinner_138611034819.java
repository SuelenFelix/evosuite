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

public class Match_getMatchWinner_138611034819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5021;

    public Match_getMatchWinner_138611034819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5021 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term5035 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term5021, term5021.getClass(), "id", -4920224193275732920L);
        setField(term5021, term5021.getClass(), "city", "wKWbJssZuG");
        setIntField(term5035, term5035.getClass(), "year", 2024);
        setShortField(term5035, term5035.getClass(), "month", (short) 8);
        setShortField(term5035, term5035.getClass(), "day", (short) 31);
        setField(term5021, term5021.getClass(), "date", term5035);
        setField(term5021, term5021.getClass(), "playerOfMatch", "NzBMMhkhpT");
        setField(term5021, term5021.getClass(), "venue", "qCpEbQDHdF");
        setField(term5021, term5021.getClass(), "team1", "AHbZyFOmlo");
        setField(term5021, term5021.getClass(), "team2", "TwfWVQGiIj");
        setField(term5021, term5021.getClass(), "tossWinner", "gUvcueTURF");
        setField(term5021, term5021.getClass(), "tossDecision", "EwQBhZjCIT");
        setField(term5021, term5021.getClass(), "matchWinner", "aSkmSwTnEw");
        setField(term5021, term5021.getClass(), "result", "xvkbvaEGYd");
        setField(term5021, term5021.getClass(), "resultMargin", "HBGNxdNURv");
        setField(term5021, term5021.getClass(), "umpire1", "mfCpTPPQQm");
        setField(term5021, term5021.getClass(), "umpire2", "OcJCIDNIXA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatchWinner", argTypes, term5021, args);
    }

};


