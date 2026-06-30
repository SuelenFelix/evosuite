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
import java.util.ArrayList;
import java.lang.Object;

public class Team_getTotalWins_18648726006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8509;

    public Team_getTotalWins_18648726006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8527 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8530 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8527, term8527.getClass(), "id", -7291743527973326814L);
        setField(term8527, term8527.getClass(), "city", "");
        setIntField(term8530, term8530.getClass(), "year", 2028);
        setShortField(term8530, term8530.getClass(), "month", (short) 9);
        setShortField(term8530, term8530.getClass(), "day", (short) 30);
        setField(term8527, term8527.getClass(), "date", term8530);
        setField(term8527, term8527.getClass(), "playerOfMatch", "");
        setField(term8527, term8527.getClass(), "venue", "");
        setField(term8527, term8527.getClass(), "team1", "");
        setField(term8527, term8527.getClass(), "team2", "");
        setField(term8527, term8527.getClass(), "tossWinner", "");
        setField(term8527, term8527.getClass(), "tossDecision", "");
        setField(term8527, term8527.getClass(), "matchWinner", "");
        setField(term8527, term8527.getClass(), "result", "");
        setField(term8527, term8527.getClass(), "resultMargin", "");
        setField(term8527, term8527.getClass(), "umpire1", "");
        setField(term8527, term8527.getClass(), "umpire2", "");
        Object term8545 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8548 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8545, term8545.getClass(), "id", -5963439350418910964L);
        setField(term8545, term8545.getClass(), "city", "");
        setIntField(term8548, term8548.getClass(), "year", 2026);
        setShortField(term8548, term8548.getClass(), "month", (short) 11);
        setShortField(term8548, term8548.getClass(), "day", (short) 29);
        setField(term8545, term8545.getClass(), "date", term8548);
        setField(term8545, term8545.getClass(), "playerOfMatch", "");
        setField(term8545, term8545.getClass(), "venue", "");
        setField(term8545, term8545.getClass(), "team1", "");
        setField(term8545, term8545.getClass(), "team2", "");
        setField(term8545, term8545.getClass(), "tossWinner", "");
        setField(term8545, term8545.getClass(), "tossDecision", "");
        setField(term8545, term8545.getClass(), "matchWinner", "");
        setField(term8545, term8545.getClass(), "result", "");
        setField(term8545, term8545.getClass(), "resultMargin", "");
        setField(term8545, term8545.getClass(), "umpire1", "");
        setField(term8545, term8545.getClass(), "umpire2", "");
        ArrayList term8525 = new ArrayList();
        ((ArrayList) term8525).add(term8527);
        ((ArrayList) term8525).add(term8545);
        term8509 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Team"));
        setLongField(term8509, term8509.getClass(), "id", 41775768178052008L);
        setField(term8509, term8509.getClass(), "teamName", "pDqgDbJoFw");
        setLongField(term8509, term8509.getClass(), "totalMatches", 6682528376118987775L);
        setLongField(term8509, term8509.getClass(), "totalWins", 682356318767179819L);
        setField(term8509, term8509.getClass(), "matches", term8525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Team");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalWins", argTypes, term8509, args);
    }

};


