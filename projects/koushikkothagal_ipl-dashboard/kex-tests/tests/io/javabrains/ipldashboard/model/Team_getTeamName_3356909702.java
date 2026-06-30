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

public class Team_getTeamName_3356909702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8113;

    public Team_getTeamName_3356909702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8131 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8134 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8131, term8131.getClass(), "id", -4443169559037975007L);
        setField(term8131, term8131.getClass(), "city", "");
        setIntField(term8134, term8134.getClass(), "year", 2020);
        setShortField(term8134, term8134.getClass(), "month", (short) 7);
        setShortField(term8134, term8134.getClass(), "day", (short) 23);
        setField(term8131, term8131.getClass(), "date", term8134);
        setField(term8131, term8131.getClass(), "playerOfMatch", "");
        setField(term8131, term8131.getClass(), "venue", "");
        setField(term8131, term8131.getClass(), "team1", "");
        setField(term8131, term8131.getClass(), "team2", "");
        setField(term8131, term8131.getClass(), "tossWinner", "");
        setField(term8131, term8131.getClass(), "tossDecision", "");
        setField(term8131, term8131.getClass(), "matchWinner", "");
        setField(term8131, term8131.getClass(), "result", "");
        setField(term8131, term8131.getClass(), "resultMargin", "");
        setField(term8131, term8131.getClass(), "umpire1", "");
        setField(term8131, term8131.getClass(), "umpire2", "");
        Object term8149 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8152 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8149, term8149.getClass(), "id", -3842548265506930260L);
        setField(term8149, term8149.getClass(), "city", "");
        setIntField(term8152, term8152.getClass(), "year", 2016);
        setShortField(term8152, term8152.getClass(), "month", (short) 5);
        setShortField(term8152, term8152.getClass(), "day", (short) 28);
        setField(term8149, term8149.getClass(), "date", term8152);
        setField(term8149, term8149.getClass(), "playerOfMatch", "");
        setField(term8149, term8149.getClass(), "venue", "");
        setField(term8149, term8149.getClass(), "team1", "");
        setField(term8149, term8149.getClass(), "team2", "");
        setField(term8149, term8149.getClass(), "tossWinner", "");
        setField(term8149, term8149.getClass(), "tossDecision", "");
        setField(term8149, term8149.getClass(), "matchWinner", "");
        setField(term8149, term8149.getClass(), "result", "");
        setField(term8149, term8149.getClass(), "resultMargin", "");
        setField(term8149, term8149.getClass(), "umpire1", "");
        setField(term8149, term8149.getClass(), "umpire2", "");
        Object term8167 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term8170 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term8167, term8167.getClass(), "id", -5788180182343976541L);
        setField(term8167, term8167.getClass(), "city", "");
        setIntField(term8170, term8170.getClass(), "year", 2014);
        setShortField(term8170, term8170.getClass(), "month", (short) 7);
        setShortField(term8170, term8170.getClass(), "day", (short) 13);
        setField(term8167, term8167.getClass(), "date", term8170);
        setField(term8167, term8167.getClass(), "playerOfMatch", "");
        setField(term8167, term8167.getClass(), "venue", "");
        setField(term8167, term8167.getClass(), "team1", "");
        setField(term8167, term8167.getClass(), "team2", "");
        setField(term8167, term8167.getClass(), "tossWinner", "");
        setField(term8167, term8167.getClass(), "tossDecision", "");
        setField(term8167, term8167.getClass(), "matchWinner", "");
        setField(term8167, term8167.getClass(), "result", "");
        setField(term8167, term8167.getClass(), "resultMargin", "");
        setField(term8167, term8167.getClass(), "umpire1", "");
        setField(term8167, term8167.getClass(), "umpire2", "");
        ArrayList term8129 = new ArrayList();
        ((ArrayList) term8129).add(term8131);
        ((ArrayList) term8129).add(term8149);
        ((ArrayList) term8129).add(term8167);
        term8113 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Team"));
        setLongField(term8113, term8113.getClass(), "id", -7612550318181586304L);
        setField(term8113, term8113.getClass(), "teamName", "McpzErOcYb");
        setLongField(term8113, term8113.getClass(), "totalMatches", -2170847986967241072L);
        setLongField(term8113, term8113.getClass(), "totalWins", 4044358158040652353L);
        setField(term8113, term8113.getClass(), "matches", term8129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Team");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTeamName", argTypes, term8113, args);
    }

};


