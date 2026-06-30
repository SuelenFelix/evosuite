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

public class Match_getCity_11312889593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543;

    public Match_getCity_11312889593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term543 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term557 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term543, term543.getClass(), "id", -8400487765614892086L);
        setField(term543, term543.getClass(), "city", "BYqFIqCKAV");
        setIntField(term557, term557.getClass(), "year", 2021);
        setShortField(term557, term557.getClass(), "month", (short) 1);
        setShortField(term557, term557.getClass(), "day", (short) 18);
        setField(term543, term543.getClass(), "date", term557);
        setField(term543, term543.getClass(), "playerOfMatch", "vrQLuWIDJX");
        setField(term543, term543.getClass(), "venue", "flxyYxBRtu");
        setField(term543, term543.getClass(), "team1", "OclPbYPkcH");
        setField(term543, term543.getClass(), "team2", "IoAlmYsBwc");
        setField(term543, term543.getClass(), "tossWinner", "TEParAifyi");
        setField(term543, term543.getClass(), "tossDecision", "OWDIEULEFu");
        setField(term543, term543.getClass(), "matchWinner", "dWRymuLBtr");
        setField(term543, term543.getClass(), "result", "AijpHYOFuy");
        setField(term543, term543.getClass(), "resultMargin", "SbAoxhfrkn");
        setField(term543, term543.getClass(), "umpire1", "kuTXqwMtDB");
        setField(term543, term543.getClass(), "umpire2", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Match");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCity", argTypes, term543, args);
    }

};


