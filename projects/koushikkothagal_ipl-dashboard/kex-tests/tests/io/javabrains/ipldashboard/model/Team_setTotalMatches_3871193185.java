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
import java.lang.Long;

public class Team_setTotalMatches_3871193185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8369;
     Object term8497;

    public Team_setTotalMatches_3871193185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8387 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8390 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8387, term8387.getClass(), "id", -8658027316505137504L);
        setField(term8387, term8387.getClass(), "city", "");
        setIntField(term8390, term8390.getClass(), "year", 2027);
        setShortField(term8390, term8390.getClass(), "month", (short) 8);
        setShortField(term8390, term8390.getClass(), "day", (short) 25);
        setField(term8387, term8387.getClass(), "date", term8390);
        setField(term8387, term8387.getClass(), "playerOfMatch", "");
        setField(term8387, term8387.getClass(), "venue", "");
        setField(term8387, term8387.getClass(), "team1", "");
        setField(term8387, term8387.getClass(), "team2", "");
        setField(term8387, term8387.getClass(), "tossWinner", "");
        setField(term8387, term8387.getClass(), "tossDecision", "");
        setField(term8387, term8387.getClass(), "matchWinner", "");
        setField(term8387, term8387.getClass(), "result", "");
        setField(term8387, term8387.getClass(), "resultMargin", "");
        setField(term8387, term8387.getClass(), "umpire1", "");
        setField(term8387, term8387.getClass(), "umpire2", "");
        Object term8405 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8408 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8405, term8405.getClass(), "id", 414749984815662075L);
        setField(term8405, term8405.getClass(), "city", "");
        setIntField(term8408, term8408.getClass(), "year", 2014);
        setShortField(term8408, term8408.getClass(), "month", (short) 5);
        setShortField(term8408, term8408.getClass(), "day", (short) 21);
        setField(term8405, term8405.getClass(), "date", term8408);
        setField(term8405, term8405.getClass(), "playerOfMatch", "");
        setField(term8405, term8405.getClass(), "venue", "");
        setField(term8405, term8405.getClass(), "team1", "");
        setField(term8405, term8405.getClass(), "team2", "");
        setField(term8405, term8405.getClass(), "tossWinner", "");
        setField(term8405, term8405.getClass(), "tossDecision", "");
        setField(term8405, term8405.getClass(), "matchWinner", "");
        setField(term8405, term8405.getClass(), "result", "");
        setField(term8405, term8405.getClass(), "resultMargin", "");
        setField(term8405, term8405.getClass(), "umpire1", "");
        setField(term8405, term8405.getClass(), "umpire2", "");
        Object term8423 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8426 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8423, term8423.getClass(), "id", 463622836963501975L);
        setField(term8423, term8423.getClass(), "city", "");
        setIntField(term8426, term8426.getClass(), "year", 2025);
        setShortField(term8426, term8426.getClass(), "month", (short) 3);
        setShortField(term8426, term8426.getClass(), "day", (short) 8);
        setField(term8423, term8423.getClass(), "date", term8426);
        setField(term8423, term8423.getClass(), "playerOfMatch", "");
        setField(term8423, term8423.getClass(), "venue", "");
        setField(term8423, term8423.getClass(), "team1", "");
        setField(term8423, term8423.getClass(), "team2", "");
        setField(term8423, term8423.getClass(), "tossWinner", "");
        setField(term8423, term8423.getClass(), "tossDecision", "");
        setField(term8423, term8423.getClass(), "matchWinner", "");
        setField(term8423, term8423.getClass(), "result", "");
        setField(term8423, term8423.getClass(), "resultMargin", "");
        setField(term8423, term8423.getClass(), "umpire1", "");
        setField(term8423, term8423.getClass(), "umpire2", "");
        Object term8441 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8444 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8441, term8441.getClass(), "id", 305759998609888272L);
        setField(term8441, term8441.getClass(), "city", "");
        setIntField(term8444, term8444.getClass(), "year", 2025);
        setShortField(term8444, term8444.getClass(), "month", (short) 11);
        setShortField(term8444, term8444.getClass(), "day", (short) 1);
        setField(term8441, term8441.getClass(), "date", term8444);
        setField(term8441, term8441.getClass(), "playerOfMatch", "");
        setField(term8441, term8441.getClass(), "venue", "");
        setField(term8441, term8441.getClass(), "team1", "");
        setField(term8441, term8441.getClass(), "team2", "");
        setField(term8441, term8441.getClass(), "tossWinner", "");
        setField(term8441, term8441.getClass(), "tossDecision", "");
        setField(term8441, term8441.getClass(), "matchWinner", "");
        setField(term8441, term8441.getClass(), "result", "");
        setField(term8441, term8441.getClass(), "resultMargin", "");
        setField(term8441, term8441.getClass(), "umpire1", "");
        setField(term8441, term8441.getClass(), "umpire2", "");
        Object term8459 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8462 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8459, term8459.getClass(), "id", -8654565919063661957L);
        setField(term8459, term8459.getClass(), "city", "");
        setIntField(term8462, term8462.getClass(), "year", 2023);
        setShortField(term8462, term8462.getClass(), "month", (short) 9);
        setShortField(term8462, term8462.getClass(), "day", (short) 22);
        setField(term8459, term8459.getClass(), "date", term8462);
        setField(term8459, term8459.getClass(), "playerOfMatch", "");
        setField(term8459, term8459.getClass(), "venue", "");
        setField(term8459, term8459.getClass(), "team1", "");
        setField(term8459, term8459.getClass(), "team2", "");
        setField(term8459, term8459.getClass(), "tossWinner", "");
        setField(term8459, term8459.getClass(), "tossDecision", "");
        setField(term8459, term8459.getClass(), "matchWinner", "");
        setField(term8459, term8459.getClass(), "result", "");
        setField(term8459, term8459.getClass(), "resultMargin", "");
        setField(term8459, term8459.getClass(), "umpire1", "");
        setField(term8459, term8459.getClass(), "umpire2", "");
        Object term8477 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8480 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8477, term8477.getClass(), "id", -5248475803419977214L);
        setField(term8477, term8477.getClass(), "city", "");
        setIntField(term8480, term8480.getClass(), "year", 2013);
        setShortField(term8480, term8480.getClass(), "month", (short) 3);
        setShortField(term8480, term8480.getClass(), "day", (short) 8);
        setField(term8477, term8477.getClass(), "date", term8480);
        setField(term8477, term8477.getClass(), "playerOfMatch", "");
        setField(term8477, term8477.getClass(), "venue", "");
        setField(term8477, term8477.getClass(), "team1", "");
        setField(term8477, term8477.getClass(), "team2", "");
        setField(term8477, term8477.getClass(), "tossWinner", "");
        setField(term8477, term8477.getClass(), "tossDecision", "");
        setField(term8477, term8477.getClass(), "matchWinner", "");
        setField(term8477, term8477.getClass(), "result", "");
        setField(term8477, term8477.getClass(), "resultMargin", "");
        setField(term8477, term8477.getClass(), "umpire1", "");
        setField(term8477, term8477.getClass(), "umpire2", "");
        ArrayList term8385 = new ArrayList();
        ((ArrayList) term8385).add(term8387);
        ((ArrayList) term8385).add(term8405);
        ((ArrayList) term8385).add(term8423);
        ((ArrayList) term8385).add(term8441);
        ((ArrayList) term8385).add(term8459);
        ((ArrayList) term8385).add(term8477);
        term8369 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Team"));
        setLongField(term8369, term8369.getClass(), "id", 2443640364875054177L);
        setField(term8369, term8369.getClass(), "teamName", "fhZgTouhCC");
        setLongField(term8369, term8369.getClass(), "totalMatches", -1610676979013636850L);
        setLongField(term8369, term8369.getClass(), "totalWins", 2062173786000223358L);
        setField(term8369, term8369.getClass(), "matches", term8385);
        term8497 = new Long(-6723783499250797216L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Team");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term8497;
        callMethod(klass, "setTotalMatches", argTypes, term8369, args);
    }

};


