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

public class Team_getId_6687726840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7889;

    public Team_getId_6687726840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7907 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term7910 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term7907, term7907.getClass(), "id", 5262507301787091109L);
        setField(term7907, term7907.getClass(), "city", "");
        setIntField(term7910, term7910.getClass(), "year", 2012);
        setShortField(term7910, term7910.getClass(), "month", (short) 4);
        setShortField(term7910, term7910.getClass(), "day", (short) 19);
        setField(term7907, term7907.getClass(), "date", term7910);
        setField(term7907, term7907.getClass(), "playerOfMatch", "");
        setField(term7907, term7907.getClass(), "venue", "");
        setField(term7907, term7907.getClass(), "team1", "");
        setField(term7907, term7907.getClass(), "team2", "");
        setField(term7907, term7907.getClass(), "tossWinner", "");
        setField(term7907, term7907.getClass(), "tossDecision", "");
        setField(term7907, term7907.getClass(), "matchWinner", "");
        setField(term7907, term7907.getClass(), "result", "");
        setField(term7907, term7907.getClass(), "resultMargin", "");
        setField(term7907, term7907.getClass(), "umpire1", "");
        setField(term7907, term7907.getClass(), "umpire2", "");
        Object term7925 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term7928 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term7925, term7925.getClass(), "id", -6823727938421990489L);
        setField(term7925, term7925.getClass(), "city", "");
        setIntField(term7928, term7928.getClass(), "year", 2017);
        setShortField(term7928, term7928.getClass(), "month", (short) 6);
        setShortField(term7928, term7928.getClass(), "day", (short) 7);
        setField(term7925, term7925.getClass(), "date", term7928);
        setField(term7925, term7925.getClass(), "playerOfMatch", "");
        setField(term7925, term7925.getClass(), "venue", "");
        setField(term7925, term7925.getClass(), "team1", "");
        setField(term7925, term7925.getClass(), "team2", "");
        setField(term7925, term7925.getClass(), "tossWinner", "");
        setField(term7925, term7925.getClass(), "tossDecision", "");
        setField(term7925, term7925.getClass(), "matchWinner", "");
        setField(term7925, term7925.getClass(), "result", "");
        setField(term7925, term7925.getClass(), "resultMargin", "");
        setField(term7925, term7925.getClass(), "umpire1", "");
        setField(term7925, term7925.getClass(), "umpire2", "");
        Object term7943 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term7946 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term7943, term7943.getClass(), "id", -484994522244390100L);
        setField(term7943, term7943.getClass(), "city", "");
        setIntField(term7946, term7946.getClass(), "year", 2023);
        setShortField(term7946, term7946.getClass(), "month", (short) 8);
        setShortField(term7946, term7946.getClass(), "day", (short) 12);
        setField(term7943, term7943.getClass(), "date", term7946);
        setField(term7943, term7943.getClass(), "playerOfMatch", "");
        setField(term7943, term7943.getClass(), "venue", "");
        setField(term7943, term7943.getClass(), "team1", "");
        setField(term7943, term7943.getClass(), "team2", "");
        setField(term7943, term7943.getClass(), "tossWinner", "");
        setField(term7943, term7943.getClass(), "tossDecision", "");
        setField(term7943, term7943.getClass(), "matchWinner", "");
        setField(term7943, term7943.getClass(), "result", "");
        setField(term7943, term7943.getClass(), "resultMargin", "");
        setField(term7943, term7943.getClass(), "umpire1", "");
        setField(term7943, term7943.getClass(), "umpire2", "");
        Object term7961 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term7964 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term7961, term7961.getClass(), "id", 1233889271256172047L);
        setField(term7961, term7961.getClass(), "city", "");
        setIntField(term7964, term7964.getClass(), "year", 2015);
        setShortField(term7964, term7964.getClass(), "month", (short) 9);
        setShortField(term7964, term7964.getClass(), "day", (short) 15);
        setField(term7961, term7961.getClass(), "date", term7964);
        setField(term7961, term7961.getClass(), "playerOfMatch", "");
        setField(term7961, term7961.getClass(), "venue", "");
        setField(term7961, term7961.getClass(), "team1", "");
        setField(term7961, term7961.getClass(), "team2", "");
        setField(term7961, term7961.getClass(), "tossWinner", "");
        setField(term7961, term7961.getClass(), "tossDecision", "");
        setField(term7961, term7961.getClass(), "matchWinner", "");
        setField(term7961, term7961.getClass(), "result", "");
        setField(term7961, term7961.getClass(), "resultMargin", "");
        setField(term7961, term7961.getClass(), "umpire1", "");
        setField(term7961, term7961.getClass(), "umpire2", "");
        Object term7979 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Match"));
        Object term7982 = newInstance(Class.forName("java.time.LocalDate"));
        setLongField(term7979, term7979.getClass(), "id", 6617340557564669657L);
        setField(term7979, term7979.getClass(), "city", "");
        setIntField(term7982, term7982.getClass(), "year", 2022);
        setShortField(term7982, term7982.getClass(), "month", (short) 8);
        setShortField(term7982, term7982.getClass(), "day", (short) 8);
        setField(term7979, term7979.getClass(), "date", term7982);
        setField(term7979, term7979.getClass(), "playerOfMatch", "");
        setField(term7979, term7979.getClass(), "venue", "");
        setField(term7979, term7979.getClass(), "team1", "");
        setField(term7979, term7979.getClass(), "team2", "");
        setField(term7979, term7979.getClass(), "tossWinner", "");
        setField(term7979, term7979.getClass(), "tossDecision", "");
        setField(term7979, term7979.getClass(), "matchWinner", "");
        setField(term7979, term7979.getClass(), "result", "");
        setField(term7979, term7979.getClass(), "resultMargin", "");
        setField(term7979, term7979.getClass(), "umpire1", "");
        setField(term7979, term7979.getClass(), "umpire2", "");
        ArrayList term7905 = new ArrayList();
        ((ArrayList) term7905).add(term7907);
        ((ArrayList) term7905).add(term7925);
        ((ArrayList) term7905).add(term7943);
        ((ArrayList) term7905).add(term7961);
        ((ArrayList) term7905).add(term7979);
        term7889 = newInstance(Class.forName("io.javabrains.ipldashboard.model.Team"));
        setLongField(term7889, term7889.getClass(), "id", 2120084523938730454L);
        setField(term7889, term7889.getClass(), "teamName", "IHqvyhMtuM");
        setLongField(term7889, term7889.getClass(), "totalMatches", 6855071767938501807L);
        setLongField(term7889, term7889.getClass(), "totalWins", -5892135042702373494L);
        setField(term7889, term7889.getClass(), "matches", term7905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.javabrains.ipldashboard.model.Team");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term7889, args);
    }

};


