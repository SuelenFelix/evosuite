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

public class Match_getVenue_21147273379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2211;

    public Match_getVenue_21147273379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2211 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term2225 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term2211, term2211.getClass(), "id", 6967924379644551255L);
        setField(term2211, term2211.getClass(), "city", "XPKmummaqg");
        setIntField(term2225, term2225.getClass(), "year", 2017);
        setShortField(term2225, term2225.getClass(), "month", (short) 7);
        setShortField(term2225, term2225.getClass(), "day", (short) 22);
        setField(term2211, term2211.getClass(), "date", term2225);
        setField(term2211, term2211.getClass(), "playerOfMatch", "BKLfkLiZTH");
        setField(term2211, term2211.getClass(), "venue", "SPpkrGcPRr");
        setField(term2211, term2211.getClass(), "team1", "sEccwbJKYE");
        setField(term2211, term2211.getClass(), "team2", "AWRooQKkdW");
        setField(term2211, term2211.getClass(), "tossWinner", "vjxIhXHxGR");
        setField(term2211, term2211.getClass(), "tossDecision", "QXzGXbEXMu");
        setField(term2211, term2211.getClass(), "matchWinner", "qxSDVejjiY");
        setField(term2211, term2211.getClass(), "result", "xBsXSDjXYK");
        setField(term2211, term2211.getClass(), "resultMargin", "sEnIVFtZuQ");
        setField(term2211, term2211.getClass(), "umpire1", "ZVecLZMLHF");
        setField(term2211, term2211.getClass(), "umpire2", "fztQhjqwdP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVenue", argTypes, term2211, args);
    }

};


